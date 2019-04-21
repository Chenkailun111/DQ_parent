package com.itqf.mapper;

import com.itqf.pojo.DqPosts;
import com.itqf.pojo.DqPostsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqPostsMapper {
    int countByExample(DqPostsExample example);

    int deleteByExample(DqPostsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqPosts record);

    int insertSelective(DqPosts record);

    List<DqPosts> selectByExampleWithBLOBs(DqPostsExample example);

    List<DqPosts> selectByExample(DqPostsExample example);

    DqPosts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqPosts record, @Param("example") DqPostsExample example);

    int updateByExampleWithBLOBs(@Param("record") DqPosts record, @Param("example") DqPostsExample example);

    int updateByExample(@Param("record") DqPosts record, @Param("example") DqPostsExample example);

    int updateByPrimaryKeySelective(DqPosts record);

    int updateByPrimaryKeyWithBLOBs(DqPosts record);

    int updateByPrimaryKey(DqPosts record);
}