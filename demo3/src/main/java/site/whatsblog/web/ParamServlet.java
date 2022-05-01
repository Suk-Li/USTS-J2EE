package site.whatsblog.web; /**
 * <strong>
 * description : ${Description}
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 12:32</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ParamServlet", value = "/ParamServlet")
public class ParamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<head>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h3>姓名："+username+"</h3><p>");
        pw.println("<h3>年龄："+age+"</h3><p>");
        pw.println("</body>");
        pw.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
