package com.itqf.mapper;

import com.itqf.pojo.DqUserSkillProfiles;
import com.itqf.pojo.DqUserSkillProfilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqUserSkillProfilesMapper {
    int countByExample(DqUserSkillProfilesExample example);

    int deleteByExample(DqUserSkillProfilesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqUserSkillProfiles record);

    int insertSelective(DqUserSkillProfiles record);

    List<DqUserSkillProfiles> selectByExample(DqUserSkillProfilesExample example);

    DqUserSkillProfiles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqUserSkillProfiles record, @Param("example") DqUserSkillProfilesExample example);

    int updateByExample(@Param("record") DqUserSkillProfiles record, @Param("example") DqUserSkillProfilesExample example);

    int updateByPrimaryKeySelective(DqUserSkillProfiles record);

    int updateByPrimaryKey(DqUserSkillProfiles record);
}