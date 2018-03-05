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
    <script language="javascript" type="text/javascript">
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
    <div id="save_result_info" class="save_fail">资费修改失败！数据并发错误。</div>
    <form action="${pageContext.request.contextPath}/service/update" method="post" class="main_form">
        <!--必填项-->
        <div class="text_info clearfix"><span>业务账号ID：</span></div>
        <div class="input_info">
            <input name="serviceId" type="text" value="${Service.serviceId}" readonly class="readonly" />
        </div>
        <div class="text_info clearfix"><span>OS 账号：</span></div>
        <div class="input_info">
            <input name="osUsername" type="text" value="${Service.osUsername}" readonly class="readonly" />
        </div>
        <div class="text_info clearfix"><span>服务器 IP：</span></div>
        <div class="input_info">
            <input name="unixHost" type="text" value="${Service.unixHost}" readonly class="readonly" />
        </div>
        <div class="text_info clearfix"><span>资费类型：</span></div>
        <div class="input_info">
            <select name="costId" class="width150">
                    <option value="1">5.9元套餐</option>
                    <option value="2"> 6.9元套餐</option>
                    <option value="3">8.5元套餐</option>
                    <option value="4">10.5元套餐</option>
                    <option value="5">计时收费</option>
                    <option value="6"> 包月</option>
                </select>
            <div class="validate_msg_long">请修改资费类型，或者取消修改操作。</div>
        </div>
        <!--操作按钮-->
        <div class="button_info clearfix">
            <input type="submit" value="保存" class="btn_save"  />
            <input type="button" value="取消" class="btn_save" />
        </div>


        <p>业务说明：<br />
            1、修改资费后，点击保存，并未真正修改数据库中的数据；<br />
            2、提交操作到消息队列；<br />
            3、每月月底由程序自动完成业务所关联的资费；</p>

    </form>
</div>
<!--主要区域结束-->
<div id="footer">
    <span>[源自北美的技术，最优秀的师资，最真实的企业环境，最适用的实战项目]</span>
    <br />
    <span>版权所有(C)云科技有限公司 </span>
</div>
</body>
</html>
