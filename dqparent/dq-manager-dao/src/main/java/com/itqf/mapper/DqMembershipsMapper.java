package com.itqf.mapper;

import com.itqf.pojo.DqMemberships;
import com.itqf.pojo.DqMembershipsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqMembershipsMapper {
    int countByExample(DqMembershipsExample example);

    int deleteByExample(DqMembershipsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqMemberships record);

    int insertSelective(DqMemberships record);

    List<DqMemberships> selectByExample(DqMembershipsExample example);

    DqMemberships selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqMemberships record, @Param("example") DqMembershipsExample example);

    int updateByExample(@Param("record") DqMemberships record, @Param("example") DqMembershipsExample example);

    int updateByPrimaryKeySelective(DqMemberships record);

    int updateByPrimaryKey(DqMemberships record);
}