package com.itheima.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/7/17 9:06
 */
public class User implements Serializable {
    private Integer id;

    private Date birthday;

    private String username;

    private String address;

    private String sex;

    List<Account> accountList;

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public User() {
    }

    public User(Date birthday, String username, String address, String sex) {
        this.birthday = birthday;
        this.username = username;
        this.address = address;
        this.sex = sex;
    }

    public User(Integer id, Date birthday, String username, String address, String sex) {
        this.id = id;
        this.birthday = birthday;
        this.username = username;
        this.address = address;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", birthday=" + birthday +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", accountList=" + accountList +
                '}';
    }
}
