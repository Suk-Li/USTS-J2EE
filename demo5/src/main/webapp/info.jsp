<%--
  User: Suk-Lees
  Date: 2022/5/1
  Time: 14:20
  Site: https://www.whatsblog.site
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 id="info">${info}</h1>
<h2 id="msg"></h2>
</body>
</html>
<script>
    //加载完毕后执行
    window.onload = function () {
        var info = document.getElementById("info").innerHTML;
        if (info.indexOf("注册") > -1) {
            document.getElementById("msg").innerHTML = "3秒后跳转到登录页面";
            //三秒后跳转到登录页面
            setTimeout(function () {
                window.location.href = "/login.jsp";
            }, 3000);
        }
    }
</script>
