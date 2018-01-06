<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/5
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>core</title>
</head>
<body>
<%--直接在jsp网页中
value属性中使用EL表达式查找域属性
--%>
<c:out value="你好"/>
<c:out value="${requestScope.user.gender}" default="找不到啊"/>
<c:if test="${5>6}"  var="result" scope="request"/>
    <h1>抽刀断水水更流</h1>
<%--如果下面又需要用到相同的判定条件则可以直接使用request域中的result变量来断
该变量，就保存了上面判断的结果--%>
<c:if test="${result}">

</c:if>
<h1>OK</h1>
<table>
    <tr>
        <th>我是表头</th>
    </tr>
<c:forEach begin="0" end="10" step="2" >
<tr>
    <td>你好啊</td>
</tr>
</c:forEach>

    <%--这个写法，就是java中的增强for循环
    user是在循环中使用 的变量
    users是找到的集合对象--%>
    <c:forEach var="user" items="${requestScope.users}" varStatus="vs">
        <tr>
            <%--<td>${user.name}</td>--%>
            <td>${user}角标：${vs.index}第几个${vs.count} 当前对象${vs.current}</td>

        </tr>


    </c:forEach>
  <a href="  <c:url value="/index.jsp"/>">访问主页</a>
</table>
</body>
</html>
