package com.itqf.mapper;

import com.itqf.pojo.DqDepotEntities;
import com.itqf.pojo.DqDepotEntitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqDepotEntitiesMapper {
    int countByExample(DqDepotEntitiesExample example);

    int deleteByExample(DqDepotEntitiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqDepotEntities record);

    int insertSelective(DqDepotEntities record);

    List<DqDepotEntities> selectByExample(DqDepotEntitiesExample example);

    DqDepotEntities selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqDepotEntities record, @Param("example") DqDepotEntitiesExample example);

    int updateByExample(@Param("record") DqDepotEntities record, @Param("example") DqDepotEntitiesExample example);

    int updateByPrimaryKeySelective(DqDepotEntities record);

    int updateByPrimaryKey(DqDepotEntities record);
}