<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/2/8
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/register" method="post">
    <input type="text" name="username">
    <input type="submit" value="提交">


</form>

</body>
</html>
