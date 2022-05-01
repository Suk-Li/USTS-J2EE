package site.whatsblog.web; /**
 * <strong>
 * description : ${Description}
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 12:21</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", value = "/HelloServlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Hello World!</h3>");
        out.println("<h3>Created By HelloServlet!</h3>");
        out.println("</body>");
        out.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
