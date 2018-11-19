<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/7
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h3>添加列表</h3>
    <form action="/emp/add.do">
        <table border="1">
            <tr><td>${text}</td></tr>
            <tr><td>员工编号：</td><td><input type="text" name="EMPNO"/></td></tr>
            <tr><td>用户名：</td><td><input type="text" name="ENAME"/></td></tr>
            <tr><td>职位：</td><td><input type="text"name="JOB"/></td></tr>
            <tr><td>工资：</td><td><input type="text" name="SAL"/></td></tr>
            <tr><td colspan="2" align="center"><input type="submit" value="添加"/></td></tr>
        </table>
    </form>
</center>
</body>
</html>
