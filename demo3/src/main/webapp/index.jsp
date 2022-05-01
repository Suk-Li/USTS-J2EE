<%--
  User: Suk-Lees
  Date: 2022/5/1
  Time: 12:35
  Site: https://www.whatsblog.site
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>用户信息提交</title>
</head>
<body>
<form action="ParamServlet" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="age"/></td>
        </tr>
        <tr>
            <td align="center"><input type="submit" value="提交"/></td>
        </tr>
    </table>

</form>
</body>
</html>
