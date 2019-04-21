package com.itqf.controller;
import com.itqf.dto.PortalIndexDTO;
import com.itqf.service.PortalIndexService;
import com.itqf.utils.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisCluster;
import javax.annotation.Resource;
import javax.xml.ws.handler.PortInfo;
import java.util.List;

@RestController
public class GroundController {

    //注入JedisCluster
    @Resource
    private JedisCluster jedisCluster;//applicationContext-redis.xml中定义

    private JedisClientCluster jedisClientCluster = new JedisClientCluster();//工具类  tt-common

    @Resource
    private PortalIndexService portalIndexService;

    @RequestMapping("/findAll")
    public List<PortalIndexDTO> find(){
        jedisClientCluster.setJedisCluster(jedisCluster);
        //场地信息dq_grouds，场地的图片dq_albums  场地实体：dq_entities
        List<PortalIndexDTO> list = null;
        String json  = jedisClientCluster.get(SysConstant.ALL_GROUNDS_REDIS_KEY);
        if (json==null){
            //第一次访问
            Lg.log("走数据库");
            list = portalIndexService.findAll();
            //把查询出来的值 存储到redis中
            //把list转json字符串
            json = JsonUtils.objectToJson(list);
            jedisClientCluster.set(SysConstant.ALL_GROUNDS_REDIS_KEY,json);
            jedisClientCluster.expire(SysConstant.ALL_GROUNDS_REDIS_KEY,5*60*60*24);
        }else{
            Lg.log("走redis");
            //第2,3,……，n次都是从redis中取
            //把json转化为对象
            list = JsonUtils.jsonToList(json,PortalIndexDTO.class);
        }


        return list;
    }

    @RequestMapping("/findById")
    public PortalIndexDTO findById(Integer id){
        jedisClientCluster.setJedisCluster(jedisCluster);
        PortalIndexDTO portalIndexDTO = null;
        // 假如键为：ONE_GROUNDS_REDIS_KEY（没有+ID），不唯一，每次返回第一次存的值
        //解决 第一种：+id,使键唯一
        String json = jedisClientCluster.get(SysConstant.ONE_GROUNDS_REDIS_KEY+"_"+id);
        if (json==null){
            //第一次访问这个方法
            Lg.log("走数据库！");
           portalIndexDTO =  portalIndexService.findById(id);
           json = JsonUtils.objectToJson(portalIndexDTO);
           //查询出来的数据存储到redis服务中
           jedisClientCluster.set(SysConstant.ONE_GROUNDS_REDIS_KEY+"_"+id,json);
            jedisClientCluster.expire(SysConstant.ONE_GROUNDS_REDIS_KEY+"_"+id,5*60*60*24);

        }else{
            //第2,3,……，n次
            Lg.log("走redis缓存");
            portalIndexDTO = JsonUtils.jsonToPojo(json,PortalIndexDTO.class);
        }

        return  portalIndexDTO;
    }
    /**
     * redis同步问题
     * 如果删除库,则删除redis缓存中的数据
     *
     */
    @RequestMapping("/delRedis")
    @ResponseBody
    public ResultDTO delRedis(String key){
        jedisClientCluster.setJedisCluster(jedisCluster);
        jedisClientCluster.del(key);
        return ResultDTO.ok();
    }
}



