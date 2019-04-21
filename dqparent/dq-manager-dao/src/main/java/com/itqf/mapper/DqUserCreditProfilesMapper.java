package com.itqf.mapper;

import com.itqf.pojo.DqUserCreditProfiles;
import com.itqf.pojo.DqUserCreditProfilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqUserCreditProfilesMapper {
    int countByExample(DqUserCreditProfilesExample example);

    int deleteByExample(DqUserCreditProfilesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqUserCreditProfiles record);

    int insertSelective(DqUserCreditProfiles record);

    List<DqUserCreditProfiles> selectByExample(DqUserCreditProfilesExample example);

    DqUserCreditProfiles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqUserCreditProfiles record, @Param("example") DqUserCreditProfilesExample example);

    int updateByExample(@Param("record") DqUserCreditProfiles record, @Param("example") DqUserCreditProfilesExample example);

    int updateByPrimaryKeySelective(DqUserCreditProfiles record);

    int updateByPrimaryKey(DqUserCreditProfiles record);
}