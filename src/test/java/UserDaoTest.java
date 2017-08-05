import com.feng.dao.UserDao;
import com.feng.dao.impl.UserDaoImpl;
import com.feng.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Calendar;
import java.util.List;


public class UserDaoTest {
    private UserDao userDao;

    @Before
    public void setUp() throws Exception {
        // 读取配置文件
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

    @Test
    public void testGetById() {
        User user = userDao.queryUserById(1L);
        System.out.println(user);
    }

    @Test
    public void testGetAll() {
        List<User> list = userDao.queryUserAll();
        System.out.println(list);
    }

    @Test
    public void testAdd() {
        Calendar birthday = Calendar.getInstance();
        User user = new User(null, "张三", "123", "zhangsan", 20, 1,
                birthday.getTime(), null, null);
        userDao.insertUser(user);
    }

    @Test
    public void testUpdate() {
        Calendar birthday = Calendar.getInstance();
        User user = new User(1L, "张三2", "123", "zhangsan", 20, 1,
                birthday.getTime(), null, null);
        userDao.updateUser(user);
    }

    @Test
    public void testDelete() {
        userDao.deleteUserById(8L);
    }
}
