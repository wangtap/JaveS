<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/2/28
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>云科技</title>
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

        //显示修改密码的信息项
        function showPwd(chkObj) {
            if (chkObj.checked)
                document.getElementById("divPwds").style.display = "block";
            else
                document.getElementById("divPwds").style.display = "none";
        }
    </script>
</head>
<body>
<!--Logo区域开始-->
<div id="header">
    <img src="../images/logo.png" alt="logo" class="left"/>
    <a href="#">[退出]</a>
</div>
<!--Logo区域结束-->
<!--导航区域开始-->
<div id="navi">
    <ul id="menu">
        <li><a href="${pageContext.request.contextPath}/login/toIndex" class="off"></a></li>
        <li><a href="${pageContext.request.contextPath}/role_info/findAll" class="role_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/admin_info/findAll" class="admin_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/cost/findAll" class="fee_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/account/findAll" class="account_on"></a></li>
        <li><a href="${pageContext.request.contextPath}/service/findAll" class="service_off"></a></li>
        <li><a href="../bill/bill_list.html" class="bill_off"></a></li>
        <li><a href="../report/report_list.html" class="report_off"></a></li>
        <li><a href="../user/user_info.html" class="information_off"></a></li>
        <li><a href="../user/user_modi_pwd.html" class="password_off"></a></li>
    </ul>
</div>
<!--导航区域结束-->
<!--主要区域开始-->
<div id="main">
    <!--保存成功或者失败的提示消息-->
    <div id="save_result_info" class="save_fail">保存失败，旧密码错误！</div>
    <form action="${pageContext.request.contextPath}/account/update" method="post" class="main_form">
        <!--必填项-->
        <div class="text_info clearfix"><span>账务账号ID：</span></div>
        <div class="input_info">
            <input name="accountId" type="text" value="${account.accountId}" readonly class="readonly" />
        </div>
        <div class="text_info clearfix"><span>姓名：</span></div>
        <div class="input_info">
            <input  name="realName" type="text" value="${account.realName}" />
            <span class="required">*</span>
            <div class="validate_msg_long error_msg">20长度以内的汉字、字母和数字的组合</div>
        </div>
        <div class="text_info clearfix"><span>身份证：</span></div>
        <div class="input_info">
            <input name="idcardNo" type="text" value="${account.idcardNo}" readonly class="readonly" />
        </div>
        <div class="text_info clearfix"><span>登录账号：</span></div>
        <div class="input_info">
            <input name="loginName" type="text" value="${account.loginName}" readonly class="readonly"  />

        </div>
      <div class="text_info clearfix"><span>电话：</span></div>
        <div class="input_info">
            <input name="telephone" value="${account.telephone}" type="text" class="width200"/>
            <span class="required">*</span>
            <div class="validate_msg_medium error_msg">正确的电话号码格式：手机或固话</div>
        </div>
        <div class="text_info clearfix"><span>推荐人身份证号码：</span></div>
        <div class="input_info">
            <input name="recommenderId" value="${account.recommenderId}" type="text"/>
            <div class="validate_msg_long error_msgs">正确的身份证号码格式</div>
        </div>
        <div class="text_info clearfix"><span>生日：</span></div>
        <div class="input_info">
            <input name="birthdate" type="text" value="${account.birthdate}" readonly class="readonly" />
        </div>
        <div class="text_info clearfix"><span>Email：</span></div>
        <div class="input_info">
            <input name="email" value="${account.email}" type="text" class="width200"/>
            <div class="validate_msg_medium">50长度以内，合法的 Email 格式</div>
        </div>
        <div class="text_info clearfix"><span>职业：</span></div>
        <div class="input_info">
            <select name="occupation" >
                <option>干部</option>
                <option>学生</option>
                <option>技术人员</option>
                <option>其他</option>
            </select>
        </div>
        <div class="text_info clearfix"><span>性别：</span></div>
        <div class="input_info fee_type">
            <input value="${account.gender}" type="radio" name="gender" checked="checked" id="female" onclick="feeTypeChange(1);" />
            <label for="female">女</label>
            <input type="radio" name="gender" id="male" onclick="feeTypeChange(2);" />
            <label for="male">男</label>
        </div>
        <div class="text_info clearfix"><span>通信地址：</span></div>
        <div class="input_info">
            <input name="emailaddress" value="${account.emailaddress}" type="text" class="width350"/>
            <div class="validate_msg_tiny">50长度以内</div>
        </div>
        <div class="text_info clearfix"><span>邮编：</span></div>
        <div class="input_info">
            <input name="zipcode" value="${account.zipcode}" type="text"/>
            <div class="validate_msg_long">6位数字</div>
        </div>
        <div class="text_info clearfix"><span>QQ：</span></div>
        <div class="input_info">
            <input name="qq" type="text" value="${account.qq}"/>
            <div class="validate_msg_long">5到13位数字</div>
        </div>
        <!--操作按钮-->
        <div class="button_info clearfix">
            <input type="submit" value="保存" class="btn_save"  />
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
</html>
