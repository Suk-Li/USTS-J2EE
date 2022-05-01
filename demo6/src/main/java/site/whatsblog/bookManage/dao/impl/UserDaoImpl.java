package site.whatsblog.bookManage.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import site.whatsblog.bookManage.dao.UserDao;
import site.whatsblog.bookManage.pojo.User;
import site.whatsblog.bookManage.util.JDBCUtils;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 21:16</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
@Repository
public class UserDaoImpl implements UserDao {
//    @Autowired
//    private Connection connection = JDBCUtils.getConnection();
    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        User user = null;
        try {
            Connection connection = JDBCUtils.getDataSource().getConnection();
            PreparedStatement statement = connection.prepareStatement("select * from users where username = ? and password = ?");
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public int insertUser(User user) {
        int i = 0;
        try {
            Connection connection = JDBCUtils.getDataSource().getConnection();
            PreparedStatement statement = connection.prepareStatement("insert into users(username,password) values(?,?)");
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            i = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return i;
    }
}
