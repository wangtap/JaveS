<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/15
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
<table border="1">

    <tr>
        <td>名字</td>
        <td>年龄</td>
    </tr>
<c:forEach var="user" items="${requestScope.users}">
        <tr>
         <th>${user.name}</th>
        <th>${user.age}</th>
        </tr>
</c:forEach>
   </table>
</body>
</html>
