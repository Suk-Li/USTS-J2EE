<%@ page contentType="text/html;charset=gb2312" %>
<%@ page session="true" %>
<%
    session.setAttribute("user","Suk");
%>

<html>
<body>
您的会话ID是：<%=session.getId()%><br>
session对象中存放的变量user的值为：<%=session.getAttribute("user")%>
</body>
</html>
