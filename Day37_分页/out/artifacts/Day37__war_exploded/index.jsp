<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/12
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
    <style type="text/css">
      a{
        text-decoration-line: none;
      }
      form{
        display: inline-block;
      }
      /*属性选择器*/
      /*  display: inline-block;设置内联元素*/
      input[type='text']{
        display: inline-block;
        width: 20px;
      }


    </style>
  </head>
  <body>
  <c:if test="${requestScope.pageBean !=null}">
    <table border="1">
      <tr>
        <th>书名</th>
        <th>作者</th>
        <th>价格</th>
        <th>类别</th>
      </tr>
      <c:forEach var="book"  items="${requestScope.pageBean.books}">
        <tr>
        <td>${book.name}</td>
        <td>${book.author}</td>
        <td>${book.price}</td>
        <td>${book.category}</td>
     </c:forEach>
        </tr>
     </table>
    <c:set var="totalPages" value="${requestScope.pageBean.totalPages}"/>
    <c:set var="pageCode" value="${requestScope.pageBean.pageCode}"/>
    <c:set var="begin" value="1"/>
    <c:set var="end" value="10"/>
    <c:if test="${totalPages<10}">
      <c:set var="end" value="${totalPages}"/>
    </c:if>
    <c:if test="${pageCode>6}">
      <c:set var="begin" value="${pageCode-5}"/>
      <c:set var="end" value="${pageCode+4}"/>
      <c:if test="${pageCode>totalPages-4}">
        <c:set var="begin" value="${totalPages-9}"/>
        <c:set var="end" value="${totalPages}"/>
      </c:if>
    </c:if>
    <c:if test="${pageCode>1}">
     <a href="query?pc=${pageCode-1}${requestScope.pageBean.params}">上一页</a>
    </c:if>
    <c:forEach begin="${begin}" end="${end}" var="v">
      <a href="query?pc=${v}${requestScope.pageBean.params}">
          <c:if test="${requestScope.pageBean.pageCode==v}">
         ${v}
          </c:if>
        <c:if test="${requestScope.pageBean.pageCode!=v}">
          [${v}]
        </c:if>
      </a>
    </c:forEach>
    <c:if test="${totalPages>pageCode}">
    <a href="query?pc=${pageCode+1}${requestScope.pageBean.params}">下一页</a>
    </c:if>
    <form action="query" method="get">
      <input type="text" name="pc" >/${totalPages}
      <input type="submit" value="跳页">
    </form>
    <form action="query" method="get">
      <input type="text" name="name">书名
      <input type="text" name="author">作者
      <input type="text" name="price">价格
      <input type="text" name="category">类型
      <input type="submit" value="高级搜索">
    </form>

  </c:if>
  </body>
</html>
