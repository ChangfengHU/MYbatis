package com.feng;

/**
 * Created by Administrator on 2017/8/3 0003.
 */

import com.feng.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


public class Test1 {
    @org.junit.Test
    public void mybatis_test() throws IOException {
        // 读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 根据配置文件中的信息，构建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        // 打印查看是否获取到了session工厂
        System.out.println(factory);
        SqlSession sqlSession = factory.openSession();
        User user = sqlSession.selectOne("UserMapper.queryUserById", 1);
        System.out.println(user);
        
    }
}
