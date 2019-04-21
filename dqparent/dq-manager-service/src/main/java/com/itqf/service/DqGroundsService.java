package com.itqf.service;

import com.itqf.pojo.DqGrounds;
import com.itqf.utils.DataGridResult;
import com.itqf.utils.ResultDTO;

import java.util.List;

public interface DqGroundsService {

    public List   <DqGrounds> findAll();

    public DataGridResult findGrouds(int page,int rows);

    public ResultDTO addGrounds(DqGrounds dqGrounds,String images);

    public ResultDTO deleteGrounds(List<Integer> ids);


}
