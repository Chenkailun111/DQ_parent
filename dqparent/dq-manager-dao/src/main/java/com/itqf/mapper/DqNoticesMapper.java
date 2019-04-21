package com.itqf.mapper;

import com.itqf.pojo.DqNotices;
import com.itqf.pojo.DqNoticesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqNoticesMapper {
    int countByExample(DqNoticesExample example);

    int deleteByExample(DqNoticesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqNotices record);

    int insertSelective(DqNotices record);

    List<DqNotices> selectByExampleWithBLOBs(DqNoticesExample example);

    List<DqNotices> selectByExample(DqNoticesExample example);

    DqNotices selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqNotices record, @Param("example") DqNoticesExample example);

    int updateByExampleWithBLOBs(@Param("record") DqNotices record, @Param("example") DqNoticesExample example);

    int updateByExample(@Param("record") DqNotices record, @Param("example") DqNoticesExample example);

    int updateByPrimaryKeySelective(DqNotices record);

    int updateByPrimaryKeyWithBLOBs(DqNotices record);

    int updateByPrimaryKey(DqNotices record);
}