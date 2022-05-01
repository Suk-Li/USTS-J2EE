package site.whatsblog.dao.impl;

import site.whatsblog.dao.UserDao;
import site.whatsblog.pojo.User;
import site.whatsblog.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 14:13</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
public class UserDaoImpl implements UserDao {

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        Connection connection = JDBCUtils.getConnection();
        User user = null;
        try {
            PreparedStatement statement = connection.prepareStatement("select * from users where username = ? and password = ?");
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public int insertUser(User user) {
        Connection connection = JDBCUtils.getConnection();
        int result = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into users(username, password) values(?, ?)");
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            result = preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
