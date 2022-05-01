<%--
  User: Suk-Lees
  Date: 2022/5/1
  Time: 14:08
  Site: https://www.whatsblog.site
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>登录</h1>
<form action="LoginServlet" method="post">
    <label>用户名：</label>
    <input type="text" name="username"/><br/>
    <label>密码：</label>
    <input type="password" name="password"/><br/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
