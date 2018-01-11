
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/2
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page  contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="showBook" uri="http://showbook.com" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
  用户名：${sessionScope.user.username}
  昵称：${sessionScope.user.nickname}
  <form action="quit" method="post">
    <input type="submit" value="退出" >
  </form>
<c:if test="${sessionScope.get('User')!=null}">
    <table border="1">
    <tr>
      <th>书名</th>
      <th>作者</th>
      <th>价钱</th>
    </tr>
      <c:forEach var="o" items="${showBook:showBookUtil()}">
        <tr>
        <td> <a href=${o.getWebsite()}>${o.getBookname()}</a></td>
        <td>${o.getAuther()}</td>
        <td>${o.getPrice()}</td>
        </tr>
      </c:forEach>
  </table>
</c:if>
  </body>
</html>
