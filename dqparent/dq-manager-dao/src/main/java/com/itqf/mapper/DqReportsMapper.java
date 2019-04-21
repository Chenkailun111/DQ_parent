package com.itqf.mapper;

import com.itqf.pojo.DqReports;
import com.itqf.pojo.DqReportsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqReportsMapper {
    int countByExample(DqReportsExample example);

    int deleteByExample(DqReportsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqReports record);

    int insertSelective(DqReports record);

    List<DqReports> selectByExampleWithBLOBs(DqReportsExample example);

    List<DqReports> selectByExample(DqReportsExample example);

    DqReports selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqReports record, @Param("example") DqReportsExample example);

    int updateByExampleWithBLOBs(@Param("record") DqReports record, @Param("example") DqReportsExample example);

    int updateByExample(@Param("record") DqReports record, @Param("example") DqReportsExample example);

    int updateByPrimaryKeySelective(DqReports record);

    int updateByPrimaryKeyWithBLOBs(DqReports record);

    int updateByPrimaryKey(DqReports record);
}