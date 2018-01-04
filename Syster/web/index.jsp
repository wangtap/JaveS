<%@ page import="homework.dao.BookDao" %>
<%@ page import="homework.bean.Book" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/2
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page  contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="homework.bean.Book" %>
<%@page import="homework.dao.BookDao" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
  if (session.getAttribute("username1")==null){
    response.sendRedirect("http://localhost:8080/login.jsp");
  }
  else{
  %>
  用户名：${sessionScope.username}
  昵称：${sessionScope.nickname}
  <form action="quit" method="post">
    <input type="submit" value="退出" >
  </form>
  <%--<a href="login.jsp" methods="get">退出</a>--%>
  <%
    if(session.getAttribute("username")!=null){
  %>
    <table border="1">
    <tr>
      <th>书名</th>
      <th>作者</th>
      <th>价钱</th>
    </tr>

<%
  List<Book> bookList = (List<Book>)request.getAttribute("bookList");
  for (Book o :bookList ) {
%>
    <tr>
      <td> <a href=<%=o.getWebsite()%>><%=o.getBookname()%></a></td>
      <td><%=o.getAuther()%></td>
      <td><%=o.getPrice()%></td>
     </tr>
    <%
  }
    %>
  </table>
  <%
  }else {
  %>
  <h1><a href="login.jsp">请去登入</a></h1>
  <%
    }}
  %>
  </body>
</html>
