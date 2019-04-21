package com.itqf.mapper;

import com.itqf.pojo.DqEquipments;
import com.itqf.pojo.DqEquipmentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqEquipmentsMapper {
    int countByExample(DqEquipmentsExample example);

    int deleteByExample(DqEquipmentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqEquipments record);

    int insertSelective(DqEquipments record);

    List<DqEquipments> selectByExample(DqEquipmentsExample example);

    DqEquipments selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqEquipments record, @Param("example") DqEquipmentsExample example);

    int updateByExample(@Param("record") DqEquipments record, @Param("example") DqEquipmentsExample example);

    int updateByPrimaryKeySelective(DqEquipments record);

    int updateByPrimaryKey(DqEquipments record);
}