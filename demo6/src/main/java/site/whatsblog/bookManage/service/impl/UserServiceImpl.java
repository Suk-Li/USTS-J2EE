package site.whatsblog.bookManage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.whatsblog.bookManage.dao.UserDao;
import site.whatsblog.bookManage.dao.impl.UserDaoImpl;
import site.whatsblog.bookManage.pojo.User;
import site.whatsblog.bookManage.service.UserService;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 21:22</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        return userDao.findUserByUsernameAndPassword(username,password);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }
}
