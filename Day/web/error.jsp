<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/16
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib prefix="s"% >--%>
<html>
<head>
    <title>error</title>
</head>
<body>
<%--
会将错误信息，显示在jsp页面中
是struts2给我我们提供的标签
--%>
    <%--<s:fielderror/>--%>

<s:fielderror fieldName="register.usernaem"/>
<s:fielderror fieldName="register.password"/>
<s:fielderror fieldName="register.email"/>
<s:fielderror fieldName="register.phone"/>
</body>
</html>



