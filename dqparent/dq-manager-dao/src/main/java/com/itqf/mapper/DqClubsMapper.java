package com.itqf.mapper;

import com.itqf.pojo.DqClubs;
import com.itqf.pojo.DqClubsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqClubsMapper {
    int countByExample(DqClubsExample example);

    int deleteByExample(DqClubsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqClubs record);

    int insertSelective(DqClubs record);

    List<DqClubs> selectByExampleWithBLOBs(DqClubsExample example);

    List<DqClubs> selectByExample(DqClubsExample example);

    DqClubs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqClubs record, @Param("example") DqClubsExample example);

    int updateByExampleWithBLOBs(@Param("record") DqClubs record, @Param("example") DqClubsExample example);

    int updateByExample(@Param("record") DqClubs record, @Param("example") DqClubsExample example);

    int updateByPrimaryKeySelective(DqClubs record);

    int updateByPrimaryKeyWithBLOBs(DqClubs record);

    int updateByPrimaryKey(DqClubs record);
}