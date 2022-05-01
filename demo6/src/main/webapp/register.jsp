<%--
  User: Suk-Lees
  Date: 2022/5/1
  Time: 20:35
  Site: https://www.whatsblog.site
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<h1>用户注册</h1>
<form method="post" action="RegisterServlet">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td><input type="submit" value="注册"/></td>
        </tr>
    </table>
</form>
</body>
</html>
