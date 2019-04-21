package com.itqf.mapper;

import com.itqf.pojo.DqCommercialEntities;
import com.itqf.pojo.DqCommercialEntitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqCommercialEntitiesMapper {
    int countByExample(DqCommercialEntitiesExample example);

    int deleteByExample(DqCommercialEntitiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqCommercialEntities record);

    int insertSelective(DqCommercialEntities record);

    List<DqCommercialEntities> selectByExample(DqCommercialEntitiesExample example);

    DqCommercialEntities selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqCommercialEntities record, @Param("example") DqCommercialEntitiesExample example);

    int updateByExample(@Param("record") DqCommercialEntities record, @Param("example") DqCommercialEntitiesExample example);

    int updateByPrimaryKeySelective(DqCommercialEntities record);

    int updateByPrimaryKey(DqCommercialEntities record);
}