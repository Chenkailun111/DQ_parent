package com.itqf.mapper;

import com.itqf.pojo.DqAlbums;
import com.itqf.pojo.DqAlbumsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqAlbumsMapper {
    int countByExample(DqAlbumsExample example);

    int deleteByExample(DqAlbumsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqAlbums record);

    int insertSelective(DqAlbums record);

    List<DqAlbums> selectByExample(DqAlbumsExample example);

    DqAlbums selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqAlbums record, @Param("example") DqAlbumsExample example);

    int updateByExample(@Param("record") DqAlbums record, @Param("example") DqAlbumsExample example);

    int updateByPrimaryKeySelective(DqAlbums record);

    int updateByPrimaryKey(DqAlbums record);
}