package com.itqf.pojo;

import java.util.Date;

public class DqGrounds {
    private Integer id;

    private Integer depotEntryId;

    private String name;

    private Date createdAt;

    private Date updatedAt;

    private String description;

    //添加扩展字段
    private String createdExt;
    private String updatedExt;

    public String getCreatedExt() {
        return createdExt;
    }

    public void setCreatedExt(String createdExt) {
        this.createdExt = createdExt;
    }

    public String getUpdatedExt() {
        return updatedExt;
    }

    public void setUpdatedExt(String updateExt) {
        this.updatedExt = updateExt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepotEntryId() {
        return depotEntryId;
    }

    public void setDepotEntryId(Integer depotEntryId) {
        this.depotEntryId = depotEntryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}