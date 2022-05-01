<%--
  User: Suk-Lees
  Date: 2022/5/1
  Time: 12:54
  Site: https://www.whatsblog.site
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
  <form action="SessionServlet" method="post">
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
              <td>
                  <input type="submit" value="登录"/>
              </td>
          </tr>
      </table>
  </form>
</body>
</html>
