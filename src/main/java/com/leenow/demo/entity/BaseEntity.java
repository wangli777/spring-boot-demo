package com.leenow.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: 11517 WangLi
 * @date: 20/8/2 22:00
 * @description:
 */
@Data
public abstract class BaseEntity {
    /**
     * Id主键
     */
    private Long id;
    /**
     * 版本
     */
    private Long version;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
