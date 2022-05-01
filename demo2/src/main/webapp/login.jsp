<%@ page import="site.whatsblog.pojo.UserInfo" %>
<%@ page import="java.io.IOException" %><%--
  User: Suk-Lees
  Date: 2022/5/1
  Time: 10:23
  Site: https://www.whatsblog.site
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Login</h1>
<h6>没有用户？点击<a href="register.jsp">注册</a></h6>
<form action="login.jsp" method="post">
    <label>Username:</label>
    <input type="text" name="username"/>
    <br/>
    <label>Password:</label>
    <input type="password" name="password"/>
    <br/>
    <input type="submit" value="Login"/>
</form>
<%
    try {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
        if (userInfo!=null && userInfo.getName().equals(username) && userInfo.getPassword().equals(password)) {
            session.setAttribute("loginStatus", "true");
            response.sendRedirect("user_info.jsp");
        } else {
            session.setAttribute("loginStatus", "false");
            out.println("Login Failed!");
            response.sendRedirect("fail.jsp");
        }
    } catch (Exception ignored) {
    }
%>
</body>
</html>
