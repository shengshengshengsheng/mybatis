package com.itheima.dao.impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/7/22 8:58
 */
public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    public List<User> findAll() {
        //1.根据factory获取sqlsession对象
        SqlSession session = factory.openSession();
        //2.调用session中的方法，实现查询列表
        List<User> userList = session.selectList("com.itheima.dao.IUserDao.findAll");
        //3.释放资源
        session.close();
        return userList;
    }

    public void saveUser(User user) {
        //1.根据factory获取sqlsession对象
        SqlSession session = factory.openSession();
        //2.调用session中的方法，实现保存
        session.insert("com.itheima.dao.IUserDao.saveUser",user);
        session.commit();
        session.close();
    }

    public void updateUser(User user) {
        //1.根据factory获取sqlsession对象
        SqlSession session = factory.openSession();
        //2.调用session中的方法，实现更新
        session.update("com.itheima.dao.IUserDao.updateUser",user);
        session.commit();
        session.close();
    }

    public void deleteUser(Integer userId) {
        //1.根据factory获取sqlsession对象
        SqlSession session = factory.openSession();
        //2.调用session中的方法，实现删除
        session.delete("com.itheima.dao.IUserDao.deleteUser",userId);
        session.commit();
        session.close();
    }

    public User findById(Integer id) {
        //1.根据factory获取sqlsession对象
        SqlSession session = factory.openSession();
        //2.调用session中的方法，实现查询列表
        User user = session.selectOne("com.itheima.dao.IUserDao.findById",id);
        //3.释放资源
        session.close();
        return user;
    }

    public List<User> findByName(String userName) {
        //1.根据factory获取sqlsession对象
        SqlSession session = factory.openSession();
        //2.调用session中的方法，实现查询列表
        List<User> userList = session.selectList("com.itheima.dao.IUserDao.findByName",userName);
        //3.释放资源
        session.close();
        return userList;
    }

    public Integer findTotal() {
        //1.根据factory获取sqlsession对象
        SqlSession session = factory.openSession();
        //2.调用session中的方法，实现查询列表
        Integer count = session.selectOne("com.itheima.dao.IUserDao.findTotal");
        //3.释放资源
        session.close();
        return count;
    }
}
