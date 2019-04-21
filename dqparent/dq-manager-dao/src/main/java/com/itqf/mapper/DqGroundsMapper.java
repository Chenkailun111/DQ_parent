package com.itqf.mapper;

import com.itqf.pojo.DqGrounds;
import com.itqf.pojo.DqGroundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqGroundsMapper {
    int countByExample(DqGroundsExample example);

    int deleteByExample(DqGroundsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqGrounds record);

    int insertSelective(DqGrounds record);

    List<DqGrounds> selectByExampleWithBLOBs(DqGroundsExample example);

    List<DqGrounds> selectByExample(DqGroundsExample example);

    DqGrounds selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqGrounds record, @Param("example") DqGroundsExample example);

    int updateByExampleWithBLOBs(@Param("record") DqGrounds record, @Param("example") DqGroundsExample example);

    int updateByExample(@Param("record") DqGrounds record, @Param("example") DqGroundsExample example);

    int updateByPrimaryKeySelective(DqGrounds record);

    int updateByPrimaryKeyWithBLOBs(DqGrounds record);

    int updateByPrimaryKey(DqGrounds record);
}