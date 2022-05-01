<jsp:useBean id="book" scope="request" type="site.whatsblog.bookManage.pojo.Book"/>
<%--
  User: Suk-Lees
  Date: 2022/5/1
  Time: 22:36
  Site: https://www.whatsblog.site
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>添加书籍</title>
</head>
<body>
    <h1>添加书籍</h1>
    <form action="UpdateBookServlet.do" method="post">
        <table>
            <tr>
                <td>书名</td>
                <td><input type="hidden" name="bookId" value="${book.bookId}">
                    <input type="text" name="bookName" value="${book.bookName}"/></td>
            </tr>
            <tr>
                <td>作者</td>
                <td><input type="text" name="author" value="${book.author}"/></td>
            </tr>
            <tr>
                <td>ISBN</td>
                <td><input type="text" name="isbn" value="${book.isbn}"/></td>
            </tr>
            <tr>
                <td>数量</td>
                <td><input type="text" name="bookNum" value="${book.bookNum}"/></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="更新"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
