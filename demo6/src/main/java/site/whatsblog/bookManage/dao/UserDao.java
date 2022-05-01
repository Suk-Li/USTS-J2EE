package site.whatsblog.bookManage.dao;

import site.whatsblog.bookManage.pojo.User;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 20:37</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
public interface UserDao {
    /**
     * 根据用户名和面膜查询用户
     * @param username 用户名
     * @param password 密码
     * @return 用户
     */
    User findUserByUsernameAndPassword(String username, String password);

    /**
     * 插入用户
     * @param user 用户
     * @return 受影响的行数
     */
    int insertUser(User user);
}
