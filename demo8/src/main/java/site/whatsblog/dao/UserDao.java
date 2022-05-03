package site.whatsblog.dao;

import org.apache.ibatis.annotations.Mapper;
import site.whatsblog.pojo.User;

import java.util.List;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/5/3 18:52</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Mapper
public interface UserDao {
    /**
     * 查询所有用户
     * @return 用户列表
     */
    List<User> selectAll();

    /**
     * 根据用户id查询用户
     * @param id 用户id
     * @return 用户
     */
    User selectById(int id);


    /**
     * 根据用户名查询用户
     * @param name 用户名
     * @return 用户
     */
    User selectByName(String name);
    /**
     * 根据用户名和密码查询用户
     * @param username
     * @param password
     * @return
     */
    User selectByUsernameAndPassword(String username, String password);

    /**
     * 插入用户
     * @param user 用户
     * @return 插入的行数
     */
    int insert(User user);

    /**
     * 更新用户
     * @param user 用户
     * @return  更新的行数
     */
    int update(User user);

    /**
     * 删除用户
     * @param id 用户id
     * @return 删除的行数
     */
    int delete(int id);
}
