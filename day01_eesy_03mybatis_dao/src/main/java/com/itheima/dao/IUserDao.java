package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户持久层接口
 * @author xuqiangsheng
 */
public interface IUserDao {
    /**
     * 查询所有
     * @return 用户的集合
     */
    @Select("select * from user")
    List<User> findAll();
}
