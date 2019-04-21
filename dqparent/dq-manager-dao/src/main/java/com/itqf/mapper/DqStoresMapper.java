package com.itqf.mapper;

import com.itqf.pojo.DqStores;
import com.itqf.pojo.DqStoresExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqStoresMapper {
    int countByExample(DqStoresExample example);

    int deleteByExample(DqStoresExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqStores record);

    int insertSelective(DqStores record);

    List<DqStores> selectByExample(DqStoresExample example);

    DqStores selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqStores record, @Param("example") DqStoresExample example);

    int updateByExample(@Param("record") DqStores record, @Param("example") DqStoresExample example);

    int updateByPrimaryKeySelective(DqStores record);

    int updateByPrimaryKey(DqStores record);
}