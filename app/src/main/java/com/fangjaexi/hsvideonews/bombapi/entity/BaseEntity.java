package com.fangjaexi.hsvideonews.bombapi.entity;

import java.util.Date;

/**
 * Bomb数据库中的通用字段
 * 作者：fangjaexi on 2016/8/18 0012 10:18
 * 邮箱：fangjaexi@163.com
 */
public abstract class BaseEntity {

    // 唯一Id，由Bomb自动生成
    private String objectId;

    // 创建时间，由Bomb自动生成
    private Date createdAt;

    // 修改时间，由Bomb自动生成
    private Date updatedAt;

    public String getObjectId() {
        return objectId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
