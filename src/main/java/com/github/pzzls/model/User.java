package com.github.pzzls.model;

/**
 * Copyright (C) 2017 mosl, Inc.
 * <p>内容摘要： </p>
 * <p>其他说明： </p>
 *
 * @author <a> href="mailto:moshenglei@icloud.com">mosl</a>
 * @since 2017/2/16 下午3:55
 */
public class User {

    private int id;
    private String userName;
    private String password;
    private String salt;
    private int locked;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }
}
