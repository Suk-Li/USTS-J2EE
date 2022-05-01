<%@ page import="site.whatsblog.pojo.User" %>
<%@ page import="java.io.IOException" %><%--
  User: Suk-Lees
  Date: 2022/5/1
  Time: 12:54
  Site: https://www.whatsblog.site
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>欢迎</title>
</head>
<body>
    <h1>欢迎使用</h1>
    <%
        try {
            User user = (User) session.getAttribute("user");
            out.println("<h2>欢迎您，" + user.getUsername() + "</h2>");
            out.println("<h3>上次登录时间："+user.getLoginDate()+"</h3>");
        } catch (IOException e) {

        }
    %>
</body>
</html>
