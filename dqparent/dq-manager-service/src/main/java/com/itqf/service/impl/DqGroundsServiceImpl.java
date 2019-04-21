package com.itqf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itqf.mapper.DqAlbumsMapper;
import com.itqf.mapper.DqGroundsMapper;
import com.itqf.pojo.DqAlbums;
import com.itqf.pojo.DqGrounds;
import com.itqf.pojo.DqGroundsExample;
import com.itqf.service.DqGroundsService;
import com.itqf.utils.DataGridResult;
import com.itqf.utils.ResultDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class DqGroundsServiceImpl implements DqGroundsService {

    @Resource
    private DqGroundsMapper dqGroundsMapper;

    @Resource
    private DqAlbumsMapper dqAlbumsMapper;

    @Override
    public List<DqGrounds> findAll() {
        return dqGroundsMapper.selectByExample(null);
    }

    @Override
    public DataGridResult findGrouds(int page, int rows) {
        PageHelper.startPage(page,rows);
        List<DqGrounds> list = dqGroundsMapper.selectByExample(null);
        PageInfo<DqGrounds> info = new PageInfo(list);
        DataGridResult result = new DataGridResult();
        result.setRows(info.getList());
        result.setTotal(info.getTotal());
        return result;
    }

    @Override
    public ResultDTO addGrounds(DqGrounds dqGrounds,String images) {
        Date date   = new Date();
        dqGrounds.setCreatedAt(date);
        dqGrounds.setUpdatedAt(date);

        int i  = dqGroundsMapper.insert(dqGrounds);

        //保存当前场地到的图片到图片表：dq_albums
        DqAlbums albums =  new DqAlbums();
        albums.setSourceId(dqGrounds.getId());
        albums.setCreatedAt(date);
        albums.setUpdatedAt(date);
        albums.setPictureUrl(images);
        albums.setDescription(dqGrounds.getName()+"的图片");
        albums.setName(dqGrounds.getName());

        dqAlbumsMapper.insert(albums);

        if (i>0){
            return ResultDTO.ok();
        }
        return null;
    }

    @Override
    public ResultDTO deleteGrounds(List<Integer> ids) {
        DqGroundsExample example = new DqGroundsExample();
        example.createCriteria().andIdIn(ids);
        int i = dqGroundsMapper.deleteByExample(example);
        if (i>0){
            return ResultDTO.ok();
        }
        return null;
    }
}
