<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/3/1
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global.css" />
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global_color.css" />
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js">
        //保存成功的提示信息
        function showResult() {
            showResultDiv(true);
            window.setTimeout("showResultDiv(false);", 3000);
        }
        function showResultDiv(flag) {
            var divResult = document.getElementById("save_result_info");
            if (flag)
                divResult.style.display = "block";
            else
                divResult.style.display = "none";
        }

        //自动查询账务账号

        function searchAccounts(txtObj) {
            //document.getElementById("a1").innerHTML = txtObj.value;
        }
    </script>
</head>
<body>
<!--Logo区域开始-->
<div id="header">
    <img src="${pageContext.request.contextPath}/images/logo.png" alt="logo" class="left"/>
    <a href="#">[退出]</a>
</div>
<!--Logo区域结束-->
<!--导航区域开始-->
<div id="navi">
    <ul id="menu">
        <li><a href="${pageContext.request.contextPath}/login/toIndex" class="index_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/role_info/findAll" class="role_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/admin_info/findAll" class="admin_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/cost/findAll" class="fee_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/account/findAll" class="account_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/service/findAll" class="service_on"></a></li>
        <li><a href="../bill/bill_list.html" class="bill_off"></a></li>
        <li><a href="../report/report_list.html" class="report_off"></a></li>
        <li><a href="../user/user_info.html" class="information_off"></a></li>
        <li><a href="../user/user_modi_pwd.html" class="password_off"></a></li>
    </ul>
</div>
<!--导航区域结束-->
<!--主要区域开始-->
<div id="main">
    <!--保存操作的提示信息-->
    <div id="save_result_info" class="save_fail">保存失败！192.168.0.23服务器上已经开通过 OS 账号 “mary”。</div>
    <form action="${pageContext.request.contextPath}/service/insert" method="post" class="main_form">
        <input name="accountId" id="account_id" type="hidden">
        <!--内容项-->
        <div class="text_info clearfix"><span>身份证：</span></div>
        <div class="input_info">
            <input id="idcard_no" name="idcardNo" type="text" value="1" class="width180" />
            <input type="button" value="查询账务账号" class="btn_search_large"  onclick="findByIdcardNo(this)"/>
            <span class="required">*</span>
            <div class="validate_msg_short">没有此身份证号，请重新录入。</div>
        </div>
        <div class="text_info clearfix"><span>账务账号：</span></div>
        <div class="input_info">
            <input id="real_name" name="realName" type="text" value="zhangsan1" onkeyup="findByIdcardNo(this);" />
            <span class="required">*</span>
            <div class="validate_msg_long">没有此账务账号，请重新录入。</div>
        </div>
        <div class="text_info clearfix"><span>资费类型：</span></div>
        <div class="input_info">
            <select  name="costId">
                <option value="1">5.9元套餐</option>
                <option value="2"> 6.9元套餐</option>
                <option value="3">8.5元套餐</option>
                <option value="4">10.5元套餐</option>
                <option value="5">计时收费</option>
                <option value="6"> 包月</option>
            </select>
        </div>
        <div class="text_info clearfix"><span>服务器 IP：</span></div>
        <div class="input_info">
            <input name="unixHost" type="text" value="192.168.0.23"  />
            <span class="required">*</span>
            <div class="validate_msg_long">15 长度，符合IP的地址规范</div>
        </div>
        <div class="text_info clearfix"><span>登录 OS 账号：</span></div>
        <div class="input_info">
            <input name="osUsername" type="text" value="创建即启用，状态为开通"  />
            <span class="required">*</span>
            <div class="validate_msg_long">8长度以内的字母、数字和下划线的组合</div>
        </div>
        <div class="text_info clearfix"><span>密码：</span></div>
        <div class="input_info">
            <input name="loginPasswd" type="password"  />
            <span class="required">*</span>
            <div class="validate_msg_long">30长度以内的字母、数字和下划线的组合</div>
        </div>
        <div class="text_info clearfix"><span>重复密码：</span></div>
        <div class="input_info">
            <input name="loginpasswd" type="password"  />
            <span class="required">*</span>
            <div class="validate_msg_long">两次密码必须相同</div>
        </div>
        <!--操作按钮-->
        <div class="button_info clearfix">
            <input type="submit" value="保存" class="btn_save" />
            <input type="button" value="取消" class="btn_save" />
        </div>
    </form>
</div>
<!--主要区域结束-->
<div id="footer">
    <span>[源自北美的技术，最优秀的师资，最真实的企业环境，最适用的实战项目]</span>
    <br />
    <span>版权所有(C)云科技有限公司 </span>
</div>
</body>
<script type="text/javascript">
    function findByIdcardNo() {
        var idcardNo = $("#idcard_no").val();
        $.ajax({
            url:"/service/findByIdcardNo",
            data:{"idcardNo":idcardNo},
            type:"GET",
            dataType:"json",
            success:success})}
    function success(allData) {
        $(allData).each(function (index, data) {
         $("#real_name").val("").val(data.realName);
         $("#account_id").val(data.accountId);
        })
    }
    function findAllCost() {

    }
</script>
</html>
