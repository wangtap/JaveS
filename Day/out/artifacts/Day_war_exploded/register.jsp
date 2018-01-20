<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/16
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>注册</title>
</head>
<body>
<%--<s:form action="register" method="post">--%>
  <%--<s:textfield name="user.username" label="用户名"></s:textfield> <div>  <s:fielderror fieldName="register.usernaem"/></div>--%>
  <%--<s:textfield name="user.password" label="密码"></s:textfield>  <div>     <s:fielderror fieldName="register.password"/></div>--%>
  <%--<s:textfield name="user.ps" label="确认密码"></s:textfield>      <div>      <s:fielderror fieldName="register.ps"/></div>--%>
  <%--<s:textfield name="user.phone" label="手机"></s:textfield>     <div>        <s:fielderror fieldName="register.phone"/></div>--%>
  <%--<s:textfield name="user.email" label="邮箱"></s:textfield>     <div>         <s:fielderror fieldName="register.email"/></div>--%>
  <%--<s:textfield name="user.code" label="验证码"></s:textfield>     <div>       <s:fielderror fieldName="register.code"/></div>--%>
  <%--<s:submit value="提交"></s:submit>--%>
<%--</s:form>--%>
<form action="register.action" method="post">
  <div>用户名：&nbsp;&nbsp;&nbsp;<input type="text" name="user.username"><span><s:fielderror fieldName="register.usernaem"/></span></div>
  <div> 密码：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="user.password"><span><s:fielderror fieldName="register.password"/></span></div>
  <div> 确认密码：<input type="password" name="user.ps" ><span><s:fielderror fieldName="register.ps"/></span></div>
  <div> 电话号码：<input type="text" name="user.phone"><span><s:fielderror fieldName="register.phone"/></span></div>
  <div> 邮箱：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="user.email"><span><s:fielderror fieldName="register.email"/></span></div>
  <div> 验证码：&nbsp;&nbsp;&nbsp;<input name="user.code" size="4"><img src="${pageContext.request.
contextPath}/codeImg.action"></div><span><s:fielderror fieldName="register.code"/></span>
  <div><input type="submit" value="注册"></div>
</form>
</body>
</html>
