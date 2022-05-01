<%--
  Created by IntelliJ IDEA.
  User: Sukle
  Date: 2022/5/1
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>输入</title>
</head>
<body>
<h6>请输入下列信息</h6>
<form action="${pageContext.request.contextPath}/recerve.jsp" method="post">
    <table>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="radio" name="gender" value="0"/>男
                <input type="radio" name="gender" value="1"/>女
            </td>
        </tr>
        <tr>
            <td>喜欢的歌手</td>
            <td>
                <input type="checkbox" name="hobbies" value="0"/>张歌手
                <input type="checkbox" name="hobbies" value="1"/>李歌手
                <input type="checkbox" name="hobbies" value="2"/>刘歌手
                <input type="checkbox" name="hobbies" value="3"/>王歌手
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"/></td>
        </tr>
    </table>
</form>
</body>
</html>
