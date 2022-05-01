package site.whatsblog.web; /**
 * <strong>
 * description : ${Description}
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 12:28</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "GetUsernameServlet", value = "/GetUsernameServlet")
public class GetUsernameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        if (username == null) {
            username = "请输入用户名";
        }
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Show User</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello ," + username + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
