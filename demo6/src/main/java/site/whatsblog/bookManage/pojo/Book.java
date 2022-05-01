package site.whatsblog.bookManage.pojo;

/**
 * <strong>
 * description : 图书类
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 20:36</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private String isbn;
    private int bookNum;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", bookNum=" + bookNum +
                '}';
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    public Book() {
    }

    public Book(String bookName, String author, String isbn, int bookNum) {
        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
        this.bookNum = bookNum;
    }

    public Book(int bookId, String bookName, String author, String isbn, int bookNum) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
        this.bookNum = bookNum;
    }
}
