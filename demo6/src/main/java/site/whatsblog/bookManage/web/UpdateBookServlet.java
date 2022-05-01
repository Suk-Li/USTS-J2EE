package site.whatsblog.bookManage.web; /**
 * <strong>
 * description : ${Description}
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 21:39</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import site.whatsblog.bookManage.pojo.Book;
import site.whatsblog.bookManage.service.BookService;
import site.whatsblog.bookManage.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@WebServlet(name = "UpdateBookServlet", value = "/UpdateBookServlet.do")
public class UpdateBookServlet extends HttpServlet {
    @Autowired
    private BookService bookService = new BookServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int bookId = Integer.parseInt(request.getParameter("bookId"));
        String bookName = request.getParameter("bookName");
        String author = request.getParameter("author");
        String isbn = request.getParameter("isbn");
        int bookNum = Integer.parseInt(request.getParameter("bookNum"));
        Book book = new Book(bookId,bookName, author, isbn, bookNum);
        int i = bookService.updateBook(book);
        if (i == 1) {
            response.sendRedirect("FindAllBookServlet.do");
        }else{
            response.getWriter().write("修改失败");
        }
    }
}
