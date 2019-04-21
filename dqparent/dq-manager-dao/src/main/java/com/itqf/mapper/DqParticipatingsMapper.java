package com.itqf.mapper;

import com.itqf.pojo.DqParticipatings;
import com.itqf.pojo.DqParticipatingsExample;
import com.itqf.pojo.DqParticipatingsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqParticipatingsMapper {
    int countByExample(DqParticipatingsExample example);

    int deleteByExample(DqParticipatingsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqParticipatingsWithBLOBs record);

    int insertSelective(DqParticipatingsWithBLOBs record);

    List<DqParticipatingsWithBLOBs> selectByExampleWithBLOBs(DqParticipatingsExample example);

    List<DqParticipatings> selectByExample(DqParticipatingsExample example);

    DqParticipatingsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqParticipatingsWithBLOBs record, @Param("example") DqParticipatingsExample example);

    int updateByExampleWithBLOBs(@Param("record") DqParticipatingsWithBLOBs record, @Param("example") DqParticipatingsExample example);

    int updateByExample(@Param("record") DqParticipatings record, @Param("example") DqParticipatingsExample example);

    int updateByPrimaryKeySelective(DqParticipatingsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DqParticipatingsWithBLOBs record);

    int updateByPrimaryKey(DqParticipatings record);
}