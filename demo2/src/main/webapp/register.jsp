<%--
  User: Suk-Lees
  Date: 2022/5/1
  Time: 10:17
  Site: https://www.whatsblog.site
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ page import="site.whatsblog.pojo.UserInfo" %>
<%--
    1．实现功能说明：以用户注册信息页面为例，定义一个用户信息 JavaBean 并在JSP页面中通过jsp中通过直接访问或标签两种形式进行调用。实现下列功能：
      (a)创建一个用户注册信息输入页面，用户输入信息包括：姓名、学号、登录密码、性别、年龄、籍贯、选修课程以及个人简介，其中性别为布尔值、选修课程为多选；
      (b)定义用户信息JavaBean，其内容与用户注册表单相一致；
      (c)创建一个用户信息保持页面，在JSP中使用标签形式，根据前一个页面提交的注册信息构造用户信息JavaBean对象，注意设置其作用范围；
      (d)创建一个用户登录以及验证页面，用户通过输入姓名和密码来进行系统登录，当用户名和密码与JavaBean中的信息一致时允许登录，否则输出错误信息或转向错误页面。
--%>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
    <h6>注册信息</h6>
    <form action="register.jsp" method="post">
        <table>
            <tr>
                <td>姓名：</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>学号：</td>
                <td><input type="text" name="id"/></td>
            </tr>
            <tr>
                <td>登录密码：</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td>性别：</td>
                <td><input type="radio" name="gender" value="true"/>男
                    <input type="radio" name="gender" value="false"/>女
                </td>
            </tr>
            <tr>
                <td>年龄：</td>
                <td><input type="text" name="age"/></td>
            </tr>
            <tr>
                <td>籍贯：</td>
                <td><input type="text" name="province"/></td>
            </tr>
            <tr>
                <td>选修课程：</td>
                <td>
                    <input type="checkbox" name="course" value="java"/>java
                    <input type="checkbox" name="course" value="c++"/>c++
                    <input type="checkbox" name="course" value="python"/>python
                    <input type="checkbox" name="course" value="php"/>php
                </td>
            </tr>
            <tr>
                <td>个人简介：</td>
                <td><textarea name="introduction" cols="30" rows="10"></textarea></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="提交"/>
                    <input type="reset" value="重置"/>
                </td>
            </tr>
        </table>
    </form>
    <%
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        if (name != null && password != null) {
            boolean gender = request.getParameter("gender").equals("true");
            int age = Integer.parseInt(request.getParameter("age"));
            String province = request.getParameter("province");
            String[] course = request.getParameterValues("course");
            String introduction = request.getParameter("introduction");
            UserInfo userInfo = new UserInfo(name, password, gender, age, province, course, introduction);
            out.println("Register Success！");
            session.setAttribute("userInfo",userInfo);
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }else{
            out.println("Register Fail！");
        }
    %>
</body>
</html>
