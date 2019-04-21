package com.itqf.mapper;

import com.itqf.pojo.DqTopics;
import com.itqf.pojo.DqTopicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqTopicsMapper {
    int countByExample(DqTopicsExample example);

    int deleteByExample(DqTopicsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqTopics record);

    int insertSelective(DqTopics record);

    List<DqTopics> selectByExample(DqTopicsExample example);

    DqTopics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqTopics record, @Param("example") DqTopicsExample example);

    int updateByExample(@Param("record") DqTopics record, @Param("example") DqTopicsExample example);

    int updateByPrimaryKeySelective(DqTopics record);

    int updateByPrimaryKey(DqTopics record);
}