<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="showbook" uri="http://showbook.com" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>购物车列表</title>
    
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
	* {
		font-size: 11pt;
	}
	div {
		margin:20px;
		border: solid 2px gray;
		width: 150px;
		height: 150px;
		text-align: center;
	}
	li {
		margin: 10px;
	}
	
	#buy {
		background: url(<c:url value='/images/all.png'/>) no-repeat;
		display: inline-block;
		
		background-position: 0 -902px;
		margin-left: 30px;
		height: 36px;
		width: 146px;
	}
	#buy:HOVER {
		background: url(<c:url value='/images/all.png'/>) no-repeat;
		display: inline-block;
		
		background-position: 0 -938px;
		margin-left: 30px;
		height: 36px;
		width: 146px;
	}
</style>
  </head>
  
  <body>
  <c:set var="a" value="0">

  </c:set>
<h1>购物车</h1>

<table border="1" width="100%" cellspacing="0" background="black">
	<tr>
		<td colspan="7" align="right" style="font-size: 15pt; font-weight: 900">
			<%--<a href="javascript:alert('已清空购物车！');">清空购物车</a>--%>
			<a href="http://localhost:8080/cart?iid=-1">清空购物车</a>
		</td>
	</tr>
	<tr>
		<th>图片</th>
		<th>书名</th>
		<th>作者</th>
		<th>单价</th>
		<th>数量</th>
		<th>小计</th>
		<th>操作</th>
	</tr>
	<c:forEach var="o" items="${sessionScope.get('orderItems')}">
		<c:set var="book" value="${showbook:bookDao(o.getBid())}"/>
			<tr>
			<td><div><img src="<c:url value='/${book.getImage()}'/>"/></div></td>
			<td>${book.getBname()}</td>
			<td>${book.getAuthor()}</td>
			<td>${book.getPrice()}</td>
			<td>${o.count}</td>
			<c:set var="a" value="${book.getPrice()*o.count+a}"/>
			<td><fmt:formatNumber value="${book.getPrice()*o.count}" type="currency"/></td>
			<%--<td><a href="javascript:alert('删除购物项成功！');">删除</a></td>--%>
			<td><a href="http://localhost:8080/cart?iid=${o.getIid()}">删除</a></td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="7" align="right" style="font-size: 15pt; font-weight: 900">
			<fmt:formatNumber value="${a}" type="currency"/>
		</td>
	</tr>
	<tr>
		<td colspan="7" align="right" style="font-size: 15pt; font-weight: 900">
			<form action="<c:url value='/orderItem'/>" method="post">
				<input type="hidden" name="price" value="<fmt:formatNumber value="${a}" type="currency"/>">
			<button id="buy" ></button>
			</form>
		</td>
	</tr>
</table>
  </body>
</html>
