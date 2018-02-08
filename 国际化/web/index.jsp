<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/2/1
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <center>
    <s:form action="login" method="post">
      <s:text name="user.login"></s:text>
      <s:textfield name="user.username" key="username"></s:textfield>
      <s:textfield name="user.password" key="password"></s:textfield>
      <s:submit key="login" align="center"></s:submit>
    </s:form>
    <a href="switch.action?request_locale=zh_CN">中文</a>
    <a href="switch.action?request_locale=en">English</a>
  </center>
  </body>
</html>
