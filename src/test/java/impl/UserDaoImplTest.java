package impl;

import com.feng.dao.UserDao;
import com.feng.dao.impl.UserDaoImpl;
import com.feng.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.InputStream;

/** 
* UserDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>08/03/2017</pre> 
* @version 1.0 
*/ 
public class UserDaoImplTest {
    private UserDao userDao;
@Before
public void before() throws Exception {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    // 根据配置文件中的信息，构建SqlSessionFactory
    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
    // 打印查看是否获取到了session工厂
    System.out.println(factory);

    // 从工厂中获取SQLSession
    SqlSession sqlSession = factory.openSession(true);
    userDao = new UserDaoImpl(sqlSession);
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: queryUserById(Long id) 
* 
*/ 
@Test
public void testQueryUserById() throws Exception { 
//TODO: Test goes here...
        User user = userDao.queryUserById(1L);
        System.out.println(user);

} 

/** 
* 
* Method: queryUserAll() 
* 
*/ 
@Test
public void testQueryUserAll() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: insertUser(com.feng.domain.User user) 
* 
*/ 
@Test
public void testInsertUser() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: updateUser(com.feng.domain.User user) 
* 
*/ 
@Test
public void testUpdateUser() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: deleteUserById(Long id) 
* 
*/ 
@Test
public void testDeleteUserById() throws Exception { 
//TODO: Test goes here... 
} 


} 
