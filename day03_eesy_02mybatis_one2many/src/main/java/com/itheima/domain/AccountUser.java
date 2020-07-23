package com.itheima.domain;

import java.io.Serializable;

/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/7/23 20:13
 */
public class AccountUser extends Account implements Serializable {
    private String username;

    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AccountUser{" +
                super.toString()+
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
