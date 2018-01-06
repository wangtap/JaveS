<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/5
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core"
%>
<html>
<head>
    <title>Core</title>
</head>
<body>
    <%--创建变量--%>
<c:set var="name" value="张三" scope="request"/>
    <%--
    如果要修改域属性中的JavaBean
    targer：JavaBean在域属性中的属性名
    property：要修改的JavaBean属性
    value：要修改的值

    --%>
    <c:set value="女" property="gender" target="${requestScope.user}" />
${requestScope.user.gender}
</body>
</html>
