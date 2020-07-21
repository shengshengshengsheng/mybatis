package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/7/17 12:26
 */
public class MybatisTest {
    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;
    @Before
    public void init() throws Exception{
        //1.读取配置文件  绝对路径：d:/xxx/xxx.xml  相对路径：src/java/main/xxx.xml
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //此处创建工厂mybatis--使用构建者模式-把对象的创建细节封装起来，使使用者直接调用方法即可拿到对象
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession--使用的是工厂模式-解耦，降低程序之间的耦合关系
        sqlSession = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象--使用的是代理模式-不改变源码的基础上对已有方法进行增强
        userDao= sqlSession.getMapper(IUserDao.class);
    }

    @After
    public void destroy() throws IOException {
        //6.释放资源
        if(sqlSession!=null){
            //提交事务
            sqlSession.commit();
            sqlSession.close();
        }
        if(in!=null){
            in.close();
        }
    }
    @Test
    public void testFindAll() {
        //5.使用代理对象执行方法
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testSave() {
        //5.使用代理对象执行方法
        User user = new User(new Date(),"name","address","男");
        userDao.saveUser(user);
    }

    @Test
    public void testUpdate() {
        //5.使用代理对象执行方法
        User user = new User(1,new Date(),"name","address","男");
        userDao.updateUser(user);
    }

    @Test
    public void testDelete(){
        userDao.deleteUser(1);
    }
}
