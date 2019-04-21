package com.itqf.service.impl;

import com.itqf.dto.PortalIndexDTO;
import com.itqf.mapper.DqAlbumsMapper;
import com.itqf.mapper.DqEntitiesMapper;
import com.itqf.mapper.DqGroundsMapper;
import com.itqf.pojo.DqAlbums;
import com.itqf.pojo.DqAlbumsExample;
import com.itqf.pojo.DqEntities;
import com.itqf.pojo.DqGrounds;
import com.itqf.service.PortalIndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class PortalIndexServiceImpl implements PortalIndexService {

    @Resource
    private DqGroundsMapper dqGroundsMapper;
    @Resource
    private DqEntitiesMapper dqEntitiesMapper;
    @Resource
    private DqAlbumsMapper dqAlbumsMapper;

    @Override
    public List<PortalIndexDTO> findAll() {

        List<PortalIndexDTO> list = new ArrayList<>();
        List<DqGrounds> grounds  = dqGroundsMapper.selectByExample(null);
        //查询该场地对应的图片和实体（场地来源）信息
        for (DqGrounds ground : grounds) {
            PortalIndexDTO dto = new PortalIndexDTO();
            //封装场地数据
            dto.setId(ground.getId());
            dto.setName(ground.getName());
            dto.setDescription(ground.getDescription());
            //来自哪个场地
            DqEntities entities = dqEntitiesMapper.selectByPrimaryKey(ground.getDepotEntryId());
            dto.setOwnType(entities.getOwnType());
            //相册，通过外键关联关系
            DqAlbumsExample ex  = new DqAlbumsExample();
            ex.createCriteria().andSourceIdEqualTo(ground.getId());
            List<DqAlbums> dqAlbums = dqAlbumsMapper.selectByExample(ex);
            if (dqAlbums!=null&&dqAlbums.size()>0){
                DqAlbums albums =dqAlbums .get(0);
                dto.setPictureUrl(albums.getPictureUrl());
            }
            list.add(dto);
        }
        return list;
    }

    @Override
    public PortalIndexDTO findById(Integer id) {
        PortalIndexDTO dto = new PortalIndexDTO();
        DqGrounds ground = dqGroundsMapper.selectByPrimaryKey(id);
        dto.setId(ground.getId());
        dto.setName(ground.getName());
        dto.setDescription(ground.getDescription());
        //来源
        DqEntities entities = dqEntitiesMapper.selectByPrimaryKey(ground.getDepotEntryId());
        dto.setOwnType(entities.getOwnType());
        //相册
        DqAlbumsExample ex  = new DqAlbumsExample();
        ex.createCriteria().andSourceIdEqualTo(ground.getId());
        List<DqAlbums> dqAlbums = dqAlbumsMapper.selectByExample(ex);
        if (dqAlbums!=null&&dqAlbums.size()>0){
            DqAlbums albums =dqAlbums .get(0);
            dto.setPictureUrl(albums.getPictureUrl());
        }
        return dto;
    }
}
