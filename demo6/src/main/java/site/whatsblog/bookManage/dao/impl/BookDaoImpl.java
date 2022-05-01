package site.whatsblog.bookManage.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import site.whatsblog.bookManage.dao.BookDao;
import site.whatsblog.bookManage.pojo.Book;
import site.whatsblog.bookManage.util.JDBCUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 21:06</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public List<Book> getAllBook() {
        List<Book> books = null;
        try {
            Connection connection = JDBCUtils.getDataSource().getConnection();
            PreparedStatement statement = connection.prepareStatement("select * from book");
            ResultSet resultSet = statement.executeQuery();
            books = new ArrayList<>();
            while (resultSet.next()){
                Book book = new Book();
                book.setBookId(resultSet.getInt("book_id"));
                book.setBookName(resultSet.getString("book_name"));
                book.setAuthor(resultSet.getString("author"));
                book.setIsbn(resultSet.getString("isbn"));
                book.setBookNum(resultSet.getInt("book_num"));
                books.add(book);
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return books;
    }

    @Override
    public Book getBookById(int id) {
        Book book = null;
        try {
            Connection connection = JDBCUtils.getDataSource().getConnection();
            PreparedStatement statement = connection.prepareStatement("select * from book where book_id = ?");
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            book = new Book();
            while (resultSet.next()){
                book.setBookId(resultSet.getInt("book_id"));
                book.setBookName(resultSet.getString("book_name"));
                book.setAuthor(resultSet.getString("author"));
                book.setIsbn(resultSet.getString("isbn"));
                book.setBookNum(resultSet.getInt("book_num"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return book;
    }

    @Override
    public int addBook(Book book) {
        int i = 0;
        try {
            Connection connection = JDBCUtils.getDataSource().getConnection();
            PreparedStatement statement = connection.prepareStatement("insert into book(book_name,author,isbn,book_num) values(?,?,?,?)");
            statement.setString(1,book.getBookName());
            statement.setString(2,book.getAuthor());
            statement.setString(3,book.getIsbn());
            statement.setInt(4,book.getBookNum());
            i = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return i;
    }

    @Override
    public int updateBook(Book book) {
        int i = 0;
        try {
            Connection connection = JDBCUtils.getDataSource().getConnection();
            PreparedStatement statement = connection.prepareStatement("update book set book_name = ?,author = ?,isbn = ?,book_num = ? where book_id = ?");
            statement.setString(1,book.getBookName());
            statement.setString(2,book.getAuthor());
            statement.setString(3,book.getIsbn());
            statement.setInt(4,book.getBookNum());
            statement.setInt(5,book.getBookId());
            i = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return i;
    }

    @Override
    public int deleteBook(int id) {
        int i = 0;
        try {
            Connection connection = JDBCUtils.getDataSource().getConnection();
            PreparedStatement statement = connection.prepareStatement("delete from book where book_id = ?");
            statement.setInt(1,id);
            i = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return i;
    }
}
