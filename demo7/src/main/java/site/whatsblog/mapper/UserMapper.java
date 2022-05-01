package site.whatsblog.mapper;

import site.whatsblog.pojo.User;

import java.util.List;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 16:43</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
public interface UserMapper {
    /**
     * 插入用户
     *
     * @param user 用户
     * @return 插入的行数
     */
    public int insert(User user);

    /**
     * 根据用户id查找用户
     *
     * @param id 用户id
     * @return 用户
     */
    public User findUserById(int id);

    /**
     * 更新用户
     *
     * @param user 用户
     * @return 更新的行数
     */
    public int updateUser(User user);

    /**
     * 删除用户
     *
     * @param id 用户id
     * @return 删除的行数
     */
    public int deleteUser(int id);

    /**
     * 查找所有用户
     *
     * @return 用户列表
     */
    public List<User> findAllUser();
}
