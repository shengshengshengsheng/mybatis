package com.itheima.mybatis.sqlsession;

/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/7/21 8:43
 */
public interface SqlSessionFactory {
    /**
     * 用于打开一个新的SqlSession对象
     * @return
     */
    SqlSession openSession();
}
