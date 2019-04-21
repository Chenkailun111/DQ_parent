package com.itqf.mapper;

import com.itqf.pojo.DqOrders;
import com.itqf.pojo.DqOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqOrdersMapper {
    int countByExample(DqOrdersExample example);

    int deleteByExample(DqOrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqOrders record);

    int insertSelective(DqOrders record);

    List<DqOrders> selectByExampleWithBLOBs(DqOrdersExample example);

    List<DqOrders> selectByExample(DqOrdersExample example);

    DqOrders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqOrders record, @Param("example") DqOrdersExample example);

    int updateByExampleWithBLOBs(@Param("record") DqOrders record, @Param("example") DqOrdersExample example);

    int updateByExample(@Param("record") DqOrders record, @Param("example") DqOrdersExample example);

    int updateByPrimaryKeySelective(DqOrders record);

    int updateByPrimaryKeyWithBLOBs(DqOrders record);

    int updateByPrimaryKey(DqOrders record);
}