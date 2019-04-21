package com.itqf.mapper;

import com.itqf.pojo.DqMessages;
import com.itqf.pojo.DqMessagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqMessagesMapper {
    int countByExample(DqMessagesExample example);

    int deleteByExample(DqMessagesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqMessages record);

    int insertSelective(DqMessages record);

    List<DqMessages> selectByExample(DqMessagesExample example);

    DqMessages selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqMessages record, @Param("example") DqMessagesExample example);

    int updateByExample(@Param("record") DqMessages record, @Param("example") DqMessagesExample example);

    int updateByPrimaryKeySelective(DqMessages record);

    int updateByPrimaryKey(DqMessages record);
}