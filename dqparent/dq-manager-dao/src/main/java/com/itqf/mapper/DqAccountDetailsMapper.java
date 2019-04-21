package com.itqf.mapper;

import com.itqf.pojo.DqAccountDetails;
import com.itqf.pojo.DqAccountDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqAccountDetailsMapper {
    int countByExample(DqAccountDetailsExample example);

    int deleteByExample(DqAccountDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqAccountDetails record);

    int insertSelective(DqAccountDetails record);

    List<DqAccountDetails> selectByExample(DqAccountDetailsExample example);

    DqAccountDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqAccountDetails record, @Param("example") DqAccountDetailsExample example);

    int updateByExample(@Param("record") DqAccountDetails record, @Param("example") DqAccountDetailsExample example);

    int updateByPrimaryKeySelective(DqAccountDetails record);

    int updateByPrimaryKey(DqAccountDetails record);
}