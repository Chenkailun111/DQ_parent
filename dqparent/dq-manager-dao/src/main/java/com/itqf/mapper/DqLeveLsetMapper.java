package com.itqf.mapper;

import com.itqf.pojo.DqLeveLset;
import com.itqf.pojo.DqLeveLsetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqLeveLsetMapper {
    int countByExample(DqLeveLsetExample example);

    int deleteByExample(DqLeveLsetExample example);

    int deleteByPrimaryKey(Integer setid);

    int insert(DqLeveLset record);

    int insertSelective(DqLeveLset record);

    List<DqLeveLset> selectByExample(DqLeveLsetExample example);

    DqLeveLset selectByPrimaryKey(Integer setid);

    int updateByExampleSelective(@Param("record") DqLeveLset record, @Param("example") DqLeveLsetExample example);

    int updateByExample(@Param("record") DqLeveLset record, @Param("example") DqLeveLsetExample example);

    int updateByPrimaryKeySelective(DqLeveLset record);

    int updateByPrimaryKey(DqLeveLset record);
}