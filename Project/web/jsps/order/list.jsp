<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="showbook" uri="http://showbook.com" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>订单列表</title>
    
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
		border: solid 2px gray;
		width: 75px;
		height: 75px;
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
  <h1>我的订单</h1>
  <c:forEach var="orders" items="${requestScope.get('ordersList')}">
  <table border="1" width="100%" cellspacing="0" background="black">
	  <tr bgcolor="gray" bordercolor="gray">
		  <td colspan="6">
			  订单编号：${orders.getOid()}　成交时间：${orders.getOrderTime()}　　
			  金额：<font color="red"><b>${orders.getPrice()}</b></font>
			  <a href="<c:url value='/orderItem?oid=${orders.getOid()}'/>">付款</a>
			  等待发货
			  <a href="javascript:alert('已确认收货！');">确认收货</a>
			  订单结束
		  </td>
	  </tr>
	  <c:forEach var="orderitem" items="${showbook:queryAllOrderitemByOid(orders.getOid())}">
		  <c:set var="book" value="${showbook:bookDao(orderitem.getBid())}"/>
	  <tr bordercolor="gray" align="center">
		  <td width="15%">
			  <div><img src="<c:url value='/${book.getImage()}'/>" height="75"/></div>
		  </td>
		  <td>书名：${book.getBname()}</td>
		  <td>单价：${book.getPrice()}</td>
		  <td>作者：${book.getAuthor()}</td>
		  <td>数量：${orderitem.getCount()}</td>
		  <td>小计：${orderitem.getSubtotal()}元</td>
	  </tr>
	</c:forEach>
  </table>
</c:forEach>
  </body>
</html>
