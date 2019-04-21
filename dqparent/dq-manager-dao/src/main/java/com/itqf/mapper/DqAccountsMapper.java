package com.itqf.mapper;

import com.itqf.pojo.DqAccounts;
import com.itqf.pojo.DqAccountsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DqAccountsMapper {
    int countByExample(DqAccountsExample example);

    int deleteByExample(DqAccountsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DqAccounts record);

    int insertSelective(DqAccounts record);

    List<DqAccounts> selectByExample(DqAccountsExample example);

    DqAccounts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DqAccounts record, @Param("example") DqAccountsExample example);

    int updateByExample(@Param("record") DqAccounts record, @Param("example") DqAccountsExample example);

    int updateByPrimaryKeySelective(DqAccounts record);

    int updateByPrimaryKey(DqAccounts record);
}