<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/5
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.io.*,java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${requestScope.erroMsg!=null}"/>
<h1>${requestScope.erroMsg}</h1>
<form action="user" method="post">
    <input type="hidden" name="method" value="login">
    <input type="text" name="username">
    <input type="password" name="password">
   <input type="submit">




</form>
</body>
</html>
