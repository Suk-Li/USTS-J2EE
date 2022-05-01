package site.whatsblog.web; /**
 * <strong>
 * description : ${Description}
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 12:26</p>
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

@WebServlet(name = "ShowDateServlet", value = "/ShowDateServlet")
public class ShowDateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Show Date</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Today is " + sdf.format(new Date()) + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
