package site.whatsblog.dao;

import site.whatsblog.pojo.User;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 14:09</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
public interface UserDao {
    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return 登录成功返回用户信息，失败返回null
     */
    User findUserByUsernameAndPassword(String username, String password);

    /**
     * 添加用户
     * @param user 用户
     * @return 添加成功返回1，失败返回0
     */
    int insertUser(User user);
}
