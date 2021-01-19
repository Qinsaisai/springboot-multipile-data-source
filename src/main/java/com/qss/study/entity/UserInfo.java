package com.qss.study.entity;

import lombok.Data;

@Data
public class UserInfo {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 手机
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
}
