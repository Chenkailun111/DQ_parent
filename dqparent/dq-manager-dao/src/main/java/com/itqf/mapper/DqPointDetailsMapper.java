package com.itqf.mapper;

import com.itqf.pojo.DqPointDetails;
import com.itqf.pojo.DqPointDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqPointDetailsMapper {
    int countByExample(DqPointDetailsExample example);

    int deleteByExample(DqPointDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqPointDetails record);

    int insertSelective(DqPointDetails record);

    List<DqPointDetails> selectByExample(DqPointDetailsExample example);

    DqPointDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqPointDetails record, @Param("example") DqPointDetailsExample example);

    int updateByExample(@Param("record") DqPointDetails record, @Param("example") DqPointDetailsExample example);

    int updateByPrimaryKeySelective(DqPointDetails record);

    int updateByPrimaryKey(DqPointDetails record);
}