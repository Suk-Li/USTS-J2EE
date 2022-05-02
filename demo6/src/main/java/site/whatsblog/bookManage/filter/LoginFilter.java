package site.whatsblog.bookManage.filter; /**
 * <strong>
 * description : ${Description}
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 20:41</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter", urlPatterns = "*.do")
public class LoginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        if (httpRequest.getSession().getAttribute("user") == null
                && httpRequest.getRequestURI().contains("LoginServlet")
                && httpRequest.getRequestURI().contains("RegisterServlet")
                && httpRequest.getRequestURI().contains("LoginOutServlet")) {
            response.getWriter().write("<script>alert('请先登录');window.location.href='/login.jsp'</script>");
        } else {
            chain.doFilter(request, response);
        }
    }
}
