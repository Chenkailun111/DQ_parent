package com.itqf.mapper;

import com.itqf.pojo.DqActivities;
import com.itqf.pojo.DqActivitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqActivitiesMapper {
    int countByExample(DqActivitiesExample example);

    int deleteByExample(DqActivitiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqActivities record);

    int insertSelective(DqActivities record);

    List<DqActivities> selectByExampleWithBLOBs(DqActivitiesExample example);

    List<DqActivities> selectByExample(DqActivitiesExample example);

    DqActivities selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqActivities record, @Param("example") DqActivitiesExample example);

    int updateByExampleWithBLOBs(@Param("record") DqActivities record, @Param("example") DqActivitiesExample example);

    int updateByExample(@Param("record") DqActivities record, @Param("example") DqActivitiesExample example);

    int updateByPrimaryKeySelective(DqActivities record);

    int updateByPrimaryKeyWithBLOBs(DqActivities record);

    int updateByPrimaryKey(DqActivities record);
}