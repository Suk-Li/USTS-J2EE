<%@ page import="java.util.Objects" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>获取表单数据</title>
</head>
<body>
<%
    String[] names = new String[]{"张歌手", "李歌手", "刘歌手", "王歌手"};
    String name = request.getParameter("name");
    out.println("您的姓名是：" + name+"<br>");
    String gender = request.getParameter("gender");
    out.println("您的性别为：" + (Objects.equals(gender, "0") ?"男":"女")+"<br>");
    String[] hobbies = request.getParameterValues("hobbies");
    out.print("您喜欢的歌手：");
    for (String hobby : hobbies) {
        out.print(names[Integer.parseInt(hobby)] + " ");
    }
%>
</body>
</html>
