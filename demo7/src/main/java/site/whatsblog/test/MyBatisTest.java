package site.whatsblog.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import site.whatsblog.mapper.UserMapper;
import site.whatsblog.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 16:53</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
public class MyBatisTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = factory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserById(11);
        System.out.println(user);
    }
}
