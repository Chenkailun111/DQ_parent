package com.itqf.mapper;

import com.itqf.pojo.DqGamePoints;
import com.itqf.pojo.DqGamePointsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqGamePointsMapper {
    int countByExample(DqGamePointsExample example);

    int deleteByExample(DqGamePointsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqGamePoints record);

    int insertSelective(DqGamePoints record);

    List<DqGamePoints> selectByExample(DqGamePointsExample example);

    DqGamePoints selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqGamePoints record, @Param("example") DqGamePointsExample example);

    int updateByExample(@Param("record") DqGamePoints record, @Param("example") DqGamePointsExample example);

    int updateByPrimaryKeySelective(DqGamePoints record);

    int updateByPrimaryKey(DqGamePoints record);
}