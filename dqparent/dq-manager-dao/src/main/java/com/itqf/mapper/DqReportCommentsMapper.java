package com.itqf.mapper;

import com.itqf.pojo.DqReportComments;
import com.itqf.pojo.DqReportCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqReportCommentsMapper {
    int countByExample(DqReportCommentsExample example);

    int deleteByExample(DqReportCommentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqReportComments record);

    int insertSelective(DqReportComments record);

    List<DqReportComments> selectByExample(DqReportCommentsExample example);

    DqReportComments selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqReportComments record, @Param("example") DqReportCommentsExample example);

    int updateByExample(@Param("record") DqReportComments record, @Param("example") DqReportCommentsExample example);

    int updateByPrimaryKeySelective(DqReportComments record);

    int updateByPrimaryKey(DqReportComments record);
}