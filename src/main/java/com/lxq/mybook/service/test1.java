package com.lxq.mybook.service;

import com.alibaba.fastjson.JSONObject;
import com.lxq.mybook.dao.BookMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program：mybook
 * @author: lvxueqing
 * @create: 2023/10/30 19:47
 */
public class test1 {

    public static void main(String[] args) throws IOException {

// 读取MyBatis配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 打开一个SqlSession
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            // 获取UserMapper实例
            BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
            // 调用getUserById方法查询用户
            List<JSONObject> list= bookMapper.searchBook();
            System.out.println(list);
        }

}

}
