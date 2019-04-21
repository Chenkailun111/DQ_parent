package com.itqf.mapper;

import com.itqf.pojo.DqOnlineRecords;
import com.itqf.pojo.DqOnlineRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqOnlineRecordsMapper {
    int countByExample(DqOnlineRecordsExample example);

    int deleteByExample(DqOnlineRecordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqOnlineRecords record);

    int insertSelective(DqOnlineRecords record);

    List<DqOnlineRecords> selectByExample(DqOnlineRecordsExample example);

    DqOnlineRecords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqOnlineRecords record, @Param("example") DqOnlineRecordsExample example);

    int updateByExample(@Param("record") DqOnlineRecords record, @Param("example") DqOnlineRecordsExample example);

    int updateByPrimaryKeySelective(DqOnlineRecords record);

    int updateByPrimaryKey(DqOnlineRecords record);
}