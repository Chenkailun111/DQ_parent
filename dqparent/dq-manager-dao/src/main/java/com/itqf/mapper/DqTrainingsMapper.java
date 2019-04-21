package com.itqf.mapper;

import com.itqf.pojo.DqTrainings;
import com.itqf.pojo.DqTrainingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqTrainingsMapper {
    int countByExample(DqTrainingsExample example);

    int deleteByExample(DqTrainingsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqTrainings record);

    int insertSelective(DqTrainings record);

    List<DqTrainings> selectByExample(DqTrainingsExample example);

    DqTrainings selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqTrainings record, @Param("example") DqTrainingsExample example);

    int updateByExample(@Param("record") DqTrainings record, @Param("example") DqTrainingsExample example);

    int updateByPrimaryKeySelective(DqTrainings record);

    int updateByPrimaryKey(DqTrainings record);
}