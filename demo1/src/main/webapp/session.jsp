<%@ page contentType="text/html;charset=gb2312" %>
<%@ page session="true" %>
<%
    session.setAttribute("user","Suk");
%>

<html>
<body>
���ĻỰID�ǣ�<%=session.getId()%><br>
session�����д�ŵı���user��ֵΪ��<%=session.getAttribute("user")%>
</body>
</html>
