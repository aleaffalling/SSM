package com.aLeaf.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    private Integer u_id;

    @NotNull(message = "不能为空")
    @Size(min = 2, max = 16,message = "用户名长度是2-10之间")
    private String u_name;

    private Integer u_sex;

    private String u_password;

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public Integer getU_sex() {
        return u_sex;
    }

    public void setU_sex(Integer u_sex) {
        this.u_sex = u_sex;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }
}