package com.itqf.mapper;

import com.itqf.pojo.DqBanks;
import com.itqf.pojo.DqBanksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqBanksMapper {
    int countByExample(DqBanksExample example);

    int deleteByExample(DqBanksExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqBanks record);

    int insertSelective(DqBanks record);

    List<DqBanks> selectByExample(DqBanksExample example);

    DqBanks selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqBanks record, @Param("example") DqBanksExample example);

    int updateByExample(@Param("record") DqBanks record, @Param("example") DqBanksExample example);

    int updateByPrimaryKeySelective(DqBanks record);

    int updateByPrimaryKey(DqBanks record);
}