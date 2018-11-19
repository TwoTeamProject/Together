<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/7
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h3>更新列表<h3>
    <form action="/emp/update.do">
        <table border="1">
            <tr hidden><td>用户名：</td><td><input type="text" value="${map.EMPNO}" name="EMPNO"/></td></tr>
            <tr><td>用户名：</td><td><input type="text" value="${map.ENAME}" name="ENAME"/></td></tr>
            <tr><td>职位：</td><td><input type="text" value="${map.JOB}" name="JOB"/></td></tr>
            <tr><td>工资：</td><td><input type="text" value="${map.SAL}" name="SAL"/></td></tr>
            <tr><td colspan="2" align="center"><input type="submit" value="修改"/></td></tr>
        </table>
    </form>
</center>
</body>
</html>
