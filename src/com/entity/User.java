package com.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String msg;

    public User(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
