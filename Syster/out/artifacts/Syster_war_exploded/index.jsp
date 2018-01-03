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
  用户名：<%=session.getAttribute("username")%>
  昵称：<%=session.getAttribute("nickname")%>
  <a href="login.jsp">退出</a>
  <%
    if(session.getAttribute("username")!=null){
  %>
    <table border="1">
    <tr>
      <th>书名</th>
      <th>作者</th>
      <th>价钱</th>
    </tr>
  <%!BookDao bookDao = new BookDao();%>
<%
  List<Book> bookList = bookDao.queryBook();
  for (Book o :bookList ) {
    String bookname = o.getBookname();
    String auther = o.getAuther();
    double price = o.getPrice();
    String website = o.getWebsite();
%>
    <tr>
      <td> <a href=<%=website%>><%=bookname%></a></td>
      <td><%=auther%></td>
      <td><%=price%></td>
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
    }
  %>
  </body>
</html>
