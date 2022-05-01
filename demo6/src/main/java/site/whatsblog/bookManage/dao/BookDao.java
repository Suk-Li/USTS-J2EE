package site.whatsblog.bookManage.dao;

import site.whatsblog.bookManage.pojo.Book;

import java.sql.SQLException;
import java.util.List;

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
public interface BookDao {
    /**
     * 查询所有图书
     * @return 图书列表
     */
    public List<Book> getAllBook();

    /**
     * 根据id查询图书
     * @param id 图书id
     * @return  图书
     */
    public Book getBookById(int id);

    /**
     * 添加图书
     * @param book 图书
     * @return 添加成功返回1，失败返回0
     */
    public int addBook(Book book);

    /**
     * 更新图书
     * @param book 图书
     * @return 更新成功返回1，失败返回0
     */
    public int updateBook(Book book);

    /**
     * 删除图书
     * @param id 图书id
     * @return 删除成功返回1，失败返回0
     */
    public int deleteBook(int id);
}
