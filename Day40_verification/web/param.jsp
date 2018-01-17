<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/16
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>动态参数</title>
</head>
<body>
<h1>active</h1>
<form action="active.action" method="post">
    <input type="text" name="username">
    <input type="text" name="password">
    <input type="submit">
</form>

<h1>ognl</h1>
<form action="ognl.action" method="post">
    <input type="text" name="student.username">
    <input type="text" name="student.age">
    <input type="submit">
</form>
<h1>model</h1>
<form action="model.action" method="post">
    <input type="text" name="username">
    <input type="text" name="age">
    <input type="submit">
</form>

<h1>val</h1>
<form action="val.action" method="post">
    <input type="text" name="student.username">
    <input type="text" name="student.age">
    <input type="submit">
</form>

<h1>single</h1>
<form action="single.action" method="post">
    <input type="text" name="single">
   <input type="submit">
</form>

<h1>decVal</h1>
<form action="dec.action" method="post">
    <input type="text" name="name">
    <input type="submit">
</form>

</body>
</html>
