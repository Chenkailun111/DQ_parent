package com.itqf.mapper;

import com.itqf.pojo.DqEntities;
import com.itqf.pojo.DqEntitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqEntitiesMapper {
    int countByExample(DqEntitiesExample example);

    int deleteByExample(DqEntitiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqEntities record);

    int insertSelective(DqEntities record);

    List<DqEntities> selectByExample(DqEntitiesExample example);

    DqEntities selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqEntities record, @Param("example") DqEntitiesExample example);

    int updateByExample(@Param("record") DqEntities record, @Param("example") DqEntitiesExample example);

    int updateByPrimaryKeySelective(DqEntities record);

    int updateByPrimaryKey(DqEntities record);
}