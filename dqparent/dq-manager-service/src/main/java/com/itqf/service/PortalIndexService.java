package com.itqf.service;

import com.itqf.dto.PortalIndexDTO;

import java.util.List;

public interface PortalIndexService {

    public List<PortalIndexDTO> findAll();

    public PortalIndexDTO findById(Integer id);
}
