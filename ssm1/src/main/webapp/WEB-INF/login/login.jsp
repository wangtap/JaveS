<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/3/5
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js">

    </script>

        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>login</title>
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global.css" />
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global_color.css" />
</head>
<body class="index">
<div class="login_box">
    <table id="myform">
        <tr>
            <td class="login_info">账号：</td>
            <td colspan="2"><input id="adminCode" name="adminCode" type="text" class="width150" /></td>
            <td class="login_error_info"><span class="required">30长度的字母、数字和下划线</span></td>
        </tr>
        <tr>
            <td class="login_info">密码：</td>
            <td colspan="2"><input id="password" name="password" type="password" class="width150" /></td>
            <td><span class="required">30长度的字母、数字和下划线</span></td>
        </tr>
        <tr>
            <td class="login_info">验证码：</td>
            <td class="width70"><input id="code" name="code" type="text" class="width70" /></td>
            <td><img src="${pageContext.request.contextPath}/images/valicode.jpg" alt="验证码" title="点击更换" /></td>
            <td><span class="required">验证码错误</span></td>
        </tr>
        <tr>
            <td></td>
            <td class="login_button" colspan="2">
                <a href="javascript:check_login();"><img src="${pageContext.request.contextPath}/images/login_btn.png" /></a>
            </td>
            <td><span class="required">用户名或密码错误，请重试</span></td>
        </tr>
    </table>
</div>
</body>
<script>
    function check_login() {
        var adminCode=$("#adminCode").val();
        var code=$("#code").val();
        var password=$("#password").val();
        if (adminCode==""){
            $("#adminCode").text("请输入账号");
        }
        $.ajax({
            url:"/login/login",
            data:{"adminCode": adminCode,"code": code,"password": password},
            type:"POST",
            dateType:"json",
            success:success})}


       function success(date) {
            location.href="/login//toIndex"
       }


</script>
</html>
