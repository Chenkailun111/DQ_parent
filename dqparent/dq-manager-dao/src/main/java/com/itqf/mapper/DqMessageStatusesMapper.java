package com.itqf.mapper;

import com.itqf.pojo.DqMessageStatuses;
import com.itqf.pojo.DqMessageStatusesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqMessageStatusesMapper {
    int countByExample(DqMessageStatusesExample example);

    int deleteByExample(DqMessageStatusesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqMessageStatuses record);

    int insertSelective(DqMessageStatuses record);

    List<DqMessageStatuses> selectByExample(DqMessageStatusesExample example);

    DqMessageStatuses selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqMessageStatuses record, @Param("example") DqMessageStatusesExample example);

    int updateByExample(@Param("record") DqMessageStatuses record, @Param("example") DqMessageStatusesExample example);

    int updateByPrimaryKeySelective(DqMessageStatuses record);

    int updateByPrimaryKey(DqMessageStatuses record);
}