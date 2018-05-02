package com.jingyuan.huanan;

import com.jingyuan.huanan.dao.UserDao;
import com.jingyuan.huanan.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        String resource = "com/jingyuan/huanan/mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserDao userDao =  sqlSession.getMapper(UserDao.class);
            User user = userDao.selectUser(980625);
            System.out.println(user.getNickName());
            User user2 = userDao.selectUser(888960);
            System.out.println(user2.getNickName());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
