
<%--
  User: Suk-Lees
  Date: 2022/5/1
  Time: 10:24
  Site: https://www.whatsblog.site
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ page import="site.whatsblog.pojo.UserInfo" %>
<%@ page import="java.util.Arrays" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<%
    try {
        String s = (String) request.getSession().getAttribute("loginStatus");
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
        if (s.equals("true") && userInfo!=null){
            out.println("<h1>用户信息</h1>");
            out.println("<p>用户名："+userInfo.getName()+"</p>");
            out.println("<p>性别："+userInfo.isGender()+"</p>");
            out.println("<p>年龄："+userInfo.getAge()+"</p>");
            out.println("<p>籍贯："+userInfo.getProvince()+"</p>");
            out.println("<p>选修课："+ Arrays.toString(userInfo.getCourse()) +"</p>");
            out.println("<p>自我介绍："+ userInfo.getIntroduction()+"</p>");
        }else{
            out.print("<script>alert('请先登录！');window.location.href='index.jsp';</script>");
        }
    } catch (Exception e) {
        out.print("<script>alert('请先登录！');window.location.href='index.jsp';</script>");
    }
%>
</body>
</html>
