package site.whatsblog.web; /**
 * <strong>
 * description : ${Description}
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 14:18</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */

import site.whatsblog.pojo.User;
import site.whatsblog.service.UserService;
import site.whatsblog.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserService userService = new UserServiceImpl();
        int i = userService.insertUser(new User(username, password));
        if (i == 1) {
            request.setAttribute("info", "注册成功，请<a href='/login.jsp'>登录</a>");
        }else{
            request.setAttribute("info", "注册失败，请<a href='/register.jsp'>重新注册</a>");
        }
        request.getRequestDispatcher("/info.jsp").forward(request, response);
    }
}
