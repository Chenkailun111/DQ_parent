package com.itqf.mapper;

import com.itqf.pojo.DqUsers;
import com.itqf.pojo.DqUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqUsersMapper {
    int countByExample(DqUsersExample example);

    int deleteByExample(DqUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqUsers record);

    int insertSelective(DqUsers record);

    List<DqUsers> selectByExample(DqUsersExample example);

    DqUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqUsers record, @Param("example") DqUsersExample example);

    int updateByExample(@Param("record") DqUsers record, @Param("example") DqUsersExample example);

    int updateByPrimaryKeySelective(DqUsers record);

    int updateByPrimaryKey(DqUsers record);
}