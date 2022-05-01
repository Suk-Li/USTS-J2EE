package site.whatsblog.service.impl;

import site.whatsblog.dao.UserDao;
import site.whatsblog.dao.impl.UserDaoImpl;
import site.whatsblog.pojo.User;
import site.whatsblog.service.UserService;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 14:17</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();
    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        return userDao.findUserByUsernameAndPassword(username, password);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }
}
