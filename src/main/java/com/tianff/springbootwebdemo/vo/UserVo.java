package com.tianff.springbootwebdemo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserVo {

    @JsonProperty("userId")
    private int id;

    private String name;

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
}
