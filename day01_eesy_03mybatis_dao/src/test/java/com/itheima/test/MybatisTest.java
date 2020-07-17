package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import com.itheima.impl.UserDaoImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/7/17 12:26
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件  绝对路径：d:/xxx/xxx.xml  相对路径：src/java/main/xxx.xml
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //此处创建工厂mybatis--使用构建者模式-把对象的创建细节封装起来，使使用者直接调用方法即可拿到对象
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产dao对象
        IUserDao userDao = new UserDaoImpl(factory);
        //5.使用代理对象执行方法
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
        in.close();
    }
}
