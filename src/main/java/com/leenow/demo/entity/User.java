package com.leenow.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: WangLi
 * @date: 20/8/2 21:58
 * @description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class User extends BaseEntity{
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 邮箱
     */
    private String email;
}
