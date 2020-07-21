package com.itheima.impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/7/17 13:02
 */
public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory=factory;
    }

    public List<User> findAll() {
        //使用工厂创建session对象
        SqlSession session = factory.openSession();
        //使用session执行查询所有的方法
        List<User> userList = session.selectList("com.itheima.dao.IUserDao.findAll");
        session.close();
        //3.返回查询结果
        return userList;
    }
}
