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
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import site.whatsblog.bookManage.pojo.Book;
import site.whatsblog.bookManage.service.BookService;
import site.whatsblog.bookManage.service.UserService;
import site.whatsblog.bookManage.service.impl.BookServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@Controller
@WebServlet(name = "AddBookServlet", value = "/AddBookServlet.do")
public class AddBookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookName = request.getParameter("bookName");
        String author = request.getParameter("author");
        String isbn = request.getParameter("isbn");
        int bookNum = Integer.parseInt(request.getParameter("bookNum"));
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        BookService bookService = (BookService) webApplicationContext.getBean("bookServiceImpl");
        Book book = new Book(bookName, author, isbn, bookNum);
        int i = bookService.addBook(book);
        if (i == 1) {
            response.sendRedirect("FindAllBookServlet.do");
        }else{
            response.getWriter().write("添加失败");
        }
    }
}
