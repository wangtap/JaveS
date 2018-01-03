<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/3
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>3_include</title>
</head>
<body>
<%@include file="4_target.jsp"%>
<%--
静态包含include指令
是在4_target.jsp文件中被编译成.java文件之前就添加到3_include.java
所以只能查看到3_include.java
--%>
<h1>我是Include</h1>
</body>
</html>
