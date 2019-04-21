package com.itqf.service.impl;

import com.itqf.mapper.DqUsersMapper;
import com.itqf.pojo.DqUsers;
import com.itqf.pojo.DqUsersExample;
import com.itqf.service.DqUsersService;
import com.itqf.utils.JsonUtils;
import com.itqf.utils.ResultDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DqUserServiceImpl implements DqUsersService {

    //注入dao
    @Resource
    private DqUsersMapper dqUsersMapper;

    @Override
    public ResultDTO login(String username, String password) {
        DqUsersExample example = new DqUsersExample();
        example.createCriteria().andNameEqualTo(username);

       List<DqUsers> list = dqUsersMapper.selectByExample(example);
       if (list!=null&&list.size()>0){
           DqUsers users = list.get(0);
           if (users.getHashedPassword().equals(password)){
               users.setHashedPassword(null);//为了安全
               String json  = JsonUtils.objectToJson(users);
               return ResultDTO.ok(json);
           }
       }
        return null;
    }
}
