package com.itqf.mapper;

import com.itqf.pojo.DqCostDetails;
import com.itqf.pojo.DqCostDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqCostDetailsMapper {
    int countByExample(DqCostDetailsExample example);

    int deleteByExample(DqCostDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqCostDetails record);

    int insertSelective(DqCostDetails record);

    List<DqCostDetails> selectByExample(DqCostDetailsExample example);

    DqCostDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqCostDetails record, @Param("example") DqCostDetailsExample example);

    int updateByExample(@Param("record") DqCostDetails record, @Param("example") DqCostDetailsExample example);

    int updateByPrimaryKeySelective(DqCostDetails record);

    int updateByPrimaryKey(DqCostDetails record);
}