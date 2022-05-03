package site.whatsblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.whatsblog.dao.UserDao;
import site.whatsblog.pojo.User;
import site.whatsblog.service.UserService;

import java.util.List;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/5/3 19:04</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public User selectById(int id) {
        return userDao.selectById(id);
    }

    @Override
    public User selectByName(String name) {
        return userDao.selectByName(name);
    }

    @Override
    public User selectByUsernameAndPassword(String username, String password) {
        return userDao.selectByUsernameAndPassword(username,password);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int delete(int id) {
        return userDao.delete(id);
    }
}
