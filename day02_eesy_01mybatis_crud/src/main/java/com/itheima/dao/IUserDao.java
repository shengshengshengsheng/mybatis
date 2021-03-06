package com.itheima.dao;

import com.itheima.domain.User;

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
    List<User> findAll();

    /**
     * 保存方法
     * @param user
     */
    void saveUser(User user);

    /**
     * 更新方法
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除方法
     * @param userId
     */
    void deleteUser(Integer userId);

    User findById(Integer id);

    List<User> findByName(String userName);

    Integer findTotal();

    User findByQueryVo(QueryVo vo);
}
