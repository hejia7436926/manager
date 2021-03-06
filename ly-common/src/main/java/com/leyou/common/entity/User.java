package com.leyou.common.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 用户表
 */
public class User implements Serializable {
    private static final long serialVersionUID = 6920915829026193852L;
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码 加密存储
     */
    private String password;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 创建时间
     */
    private Date created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}