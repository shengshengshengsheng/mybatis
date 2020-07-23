package com.itheima.dao;

import com.itheima.domain.User;
import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.List;

/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/7/22 8:25
 */
public class QueryVo {
    private User user;

    private List<Integer> ids ;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
