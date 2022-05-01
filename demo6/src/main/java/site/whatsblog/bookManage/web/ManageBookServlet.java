package site.whatsblog.bookManage.web; /**
 * <strong>
 * description : ${Description}
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 20:40</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */

import site.whatsblog.bookManage.pojo.Book;
import site.whatsblog.bookManage.service.BookService;
import site.whatsblog.bookManage.service.impl.BookServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ManageBookServlet", value = "/ManageBookServlet.do")
public class ManageBookServlet extends HttpServlet {
    private BookService bookService= new BookServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        if ("2".equals(type)) {
            //更新
            int bookId = Integer.parseInt(request.getParameter("bookId"));
            Book book = bookService.getBookById(bookId);
            request.setAttribute("book", book);
            request.getRequestDispatcher("updateBook.jsp").forward(request, response);
        }else{
            //删除
            int bookId = Integer.parseInt(request.getParameter("bookId"));
            bookService.deleteBook(bookId);
            response.sendRedirect("FindAllBookServlet.do");
        }
    }
}
