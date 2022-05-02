<%@ page import="site.whatsblog.bookManage.pojo.Book" %>
<%@ page import="java.util.List" %><%--
  User: Suk-Lees
  Date: 2022/5/1
  Time: 20:35
  Site: https://www.whatsblog.site
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>图书列表</title>
</head>
<body>
<h1>图书列表&nbsp;&nbsp;&nbsp;<a href="addBook.jsp">添加图书</a></h1>

<table border="1">
    <tr>
        <th>图书编号</th>
        <th>图书名称</th>
        <th>图书作者</th>
        <th>图书ISBN</th>
        <th>图书数量</th>
        <th>操作</th>
    </tr>
    <%
    List<Book> books = (List<Book>) request.getAttribute("books");
    for (Book book : books) { %>
    <tr>
        <td><%= book.getBookId() %></td>
        <td><%= book.getBookName() %></td>
        <td><%= book.getAuthor() %></td>
        <td><%= book.getIsbn() %></td>
        <td><%= book.getBookNum() %></td>
        <td>
            <a href="<%= request.getContextPath() %>/ManageBookServlet.do?type=2&bookId=<%= book.getBookId() %>">修改</a>
            <a href="<%= request.getContextPath() %>/ManageBookServlet.do?type=3&bookId=<%= book.getBookId() %>">删除</a>
        </td>
    </tr>
    <% } %>
</body>
</html>
