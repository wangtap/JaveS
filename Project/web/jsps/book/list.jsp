<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>图书列表</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	body {
		font-size: 10pt;
	}
	.icon {
		margin:10px;
		border: solid 2px gray;
		width: 160px;
		height: 180px;
		text-align: center;
		float: left;
	}
    .code{
        display: inline;
        /*position: relative;*/
        /*top: 500px;*/
        /*background-color:red;*/
    }
    body{
        width: 740px;
    }


</style>
  </head>
    <body>
<c:if test="${requestScope.page !=null}">
    <c:forEach var="book" items="${requestScope.page.books}">
       <div class="icon">
          <a href="<c:url value='/descBook?${book.bid}'/>" >
              <img border="0" class="img" src=/${book.image}>
          </a>
          <br>
          <a href="">${book.bname}</a>
      </div>
  </c:forEach>
    <c:set var="totalPages" value="${requestScope.page.totalPages}"/>
    <c:set var="pageCode" value="${requestScope.page.pageCode}"/>
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
        <a  class="code" href="bookList?cid=${requestScope.page.cid}&pc=${pageCode-1}">上一页</a>
    </c:if>
    <c:forEach begin="${begin}" end="${end}" var="v">
        &nbsp;
       <a   class="code" href="bookList?cid=${requestScope.page.cid}&pc=${v}">
            <c:if test="${requestScope.page.pageCode==v}">
                ${v}
            </c:if>
            <c:if test="${requestScope.page.pageCode!=v}">
                [${v}]
            </c:if>
        </a>
        &nbsp;
    </c:forEach>
    <c:if test="${totalPages>pageCode}">
        <a class="code" href="bookList?cid=${requestScope.page.cid}&pc=${pageCode+1}">下一页</a>
    </c:if>
    <form class="code" action="bookList" method="get">
        <input type="text" name="pc"  style="width: 50px" value="${pageCode}">/${totalPages}
        <input type="hidden" name="cid" value="${requestScope.page.cid}">
        <input type="submit" value="跳页">
    </form>
</c:if>
    </body>
 </html>

