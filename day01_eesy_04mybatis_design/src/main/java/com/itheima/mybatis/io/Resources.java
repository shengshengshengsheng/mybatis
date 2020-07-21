package com.itheima.mybatis.io;

import java.io.InputStream;

/**
 * description:使用类加载器读取配置文件的类
 *
 * @author xuqiangsheng
 * @date 2020/7/21 8:39
 */
public class Resources {
    /**
     * 根据传入的参数获取一个字节输入流
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath) {
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
