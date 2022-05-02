package site.whatsblog.bookManage.web; /**
 * <strong>
 * description : ${Description}
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 20:38</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import site.whatsblog.bookManage.pojo.User;
import site.whatsblog.bookManage.service.UserService;
import site.whatsblog.bookManage.service.impl.UserServiceImpl;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
@Controller
@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        UserService userService = (UserService) webApplicationContext.getBean("userServiceImpl");
        User user = userService.findUserByUsernameAndPassword(username, password);
        response.setContentType("text/html;charset=utf-8");
        if (user!=null){
            request.getSession().setAttribute("user", user);
            response.sendRedirect("FindAllBookServlet.do");
        }else{
            response.getWriter().write("<script>alert('用户名或密码错误！');window.location.href='login.jsp'</script>");
        }
    }
}
