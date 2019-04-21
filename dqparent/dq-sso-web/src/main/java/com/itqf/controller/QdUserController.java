package com.itqf.controller;
import com.itqf.service.DqUsersService;
import com.itqf.utils.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisCluster;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@RestController
public class QdUserController {
    @Resource
    private JedisCluster jedisCluster;
    private JedisClientCluster clientCluster = new JedisClientCluster();
    /**
     * 注入service
     */
    @Resource
    private DqUsersService dqUsersService;
    /**
     * 测试跨域
     * @param username
     * @param password
     * @param callback
     * @return
     */
    @RequestMapping("/login")
    public String login(String username,String password,String callback){
        if ("admin".equals(username)){
            //return   ResultDTO.ok();
            //使用java代码拼接js代码
            String json = JsonUtils.objectToJson(new ResultDTO(null));
            return callback+"("+json+")";//拼接的js代码
         // JQuery18391839({status:200,msg:"ok"});
            //$("$dg").datagrid({});
        }
        return  null;
    }

    @RequestMapping("/doLogin")
    public  ResultDTO doLogin(String username, String password, HttpServletRequest request, HttpServletResponse response){
         ResultDTO  dto = dqUsersService.login(username,password);
         //如果用户登录成功，把用户信息存储到redis服务中
          if (dto!=null&&dto.getStatus()==200){
              clientCluster.setJedisCluster(jedisCluster);
              //生成token 令牌
              String token = UUID.randomUUID().toString();
              //将登陆的用户信息（一般只有用户名和其他信息，没有密码信息），出于安全考虑
              clientCluster.set(token,dto.getData()+"");
              clientCluster.expire(token,1800);//过期时间
              //把token存储到客户端中
              CookieUtils.setCookie(request,response,SysConstant.DQ_TOKEN,token,60*60*24*30,true);
              return dto;
          }
          return  ResultDTO.error("登录失败");
    }

    /**
     *   前端接受到cookie的值，判断这个键在redis中是否存在
     */
    @RequestMapping("checkToken/{token}")
    public String checkToken(@PathVariable ("token")String token,String callback){
        String json = clientCluster.get(token);//用户信息,一般来说只有用户名
        if (json!=null){//登录状态有效（没有过期）
            //封装成js代码
            ResultDTO dto = new ResultDTO();
            dto.setData(json);
            dto.setStatus(200);
            return callback+"("+JsonUtils.objectToJson(dto)+")";
            // JQuery18391839({status:200,msg:"ok"});
            //$("$dg").datagrid({});
        }
        //过期了
        return callback+"("+JsonUtils.objectToJson(ResultDTO.error("登录过期"))+")";
    }
}
