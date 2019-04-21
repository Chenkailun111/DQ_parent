package com.itqf.service.impl;

import com.itqf.mapper.DqEntitiesMapper;
import com.itqf.pojo.DqEntities;
import com.itqf.service.DqEntitiesService;
import com.itqf.utils.TreeNodeDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class DqEntitiesServiceImpl  implements DqEntitiesService {
    //注入mapper
    @Resource
    private DqEntitiesMapper dqEntitiesMapper;

    @Override
    public List<TreeNodeDTO> findAll() {
        List<DqEntities> list = dqEntitiesMapper.selectByExample(null);
       // List<DqEntities>--->  List<DqEntities>
        List<TreeNodeDTO> treeNodeDTOS = new ArrayList<>();
        for (DqEntities dqEntities : list) {
            TreeNodeDTO treeNodeDTO =  new TreeNodeDTO();
            treeNodeDTO.setId(dqEntities.getId());
            treeNodeDTO.setText(dqEntities.getOwnType());
            //treeNodeDTO.setState(""); 默认open

            treeNodeDTOS.add(treeNodeDTO);
        }

        return treeNodeDTOS;
    }
}
