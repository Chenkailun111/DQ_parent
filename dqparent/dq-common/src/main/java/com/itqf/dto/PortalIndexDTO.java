package com.itqf.dto;

/**
 * data transfer Object
 * 数据转化对象
 */
public class PortalIndexDTO {

    //场馆信息有关
    private int id;
    private String name;
    private String description;

    //来源，什么场地
    private String ownType;
    //相册
    private String pictureUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnType() {
        return ownType;
    }

    public void setOwnType(String ownType) {
        this.ownType = ownType;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
