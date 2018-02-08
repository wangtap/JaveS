<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/2/5
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<link href="${pageContext.request.contextPath}/css/sys.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/Calendar.js"></script>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD>
    <STYLE>
        .cla1 {
            FONT-SIZE: 12px; COLOR: #4b4b4b; LINE-HEIGHT: 18px; TEXT-DECORATION: none
        }
        .login_msg{
            font-family:serif;
        }
        .login_msg .msg{
            background-color: #acf;
        }
        .login_msg .btn{
            background-color: #9be;
            width: 73px;
            font-size: 18px;
            font-family: 微软雅黑;
        }
    </STYLE>

    <TITLE></TITLE>
    <script type="text/javascript">
        if(self != top){
            top.location = self.location;
        }
    </script>
    <script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
    <LINK href="${pageContext.request.contextPath}/css/style.css" type=text/css rel=stylesheet>
    <META content="MSHTML 6.00.2600.0" name=GENERATOR></HEAD>
<BODY leftMargin=0 topMargin=0 marginwidth="0" marginheight="0" background="${pageContext.request.contextPath}/images/rightbg.jpg">
<div ALIGN="center">
    <table border="0" width="1140px" cellspacing="0" cellpadding="0" id="table1" >
        <tr>
            <td height="193"></td>

        </tr>
        <tr align="center" >

            <td class="login_msg" width="400">

                <s:form action="staff_edit" namespace="/">

                    <s:hidden name="staff.staffId" value="%{staffId}"/>

                    <table width="88%" border="0" class="emp_table" style="width:80%;">
                        <tr>
                            <td>登录名：</td>
                            <td><s:textfield name="staff.loginName" value="%{loginName}"  /> </td>
                            <td>密码：</td>
                            <td><s:password  name="staff.loginPwd" value="%{loginPwd}" showPassword="true"  /> </td>
                        </tr>
                        <tr>
                            <td>姓名：</td>
                            <td><s:textfield name="staff.staffName" value="%{staffName}" /></td>
                            <td>性别：</td>
                            <td>
                                <s:radio list="{'男','女'}" name="staff.gender" value="%{gender}"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="10%">所属部门：</td>
                            <td width="20%">

                                <%--<s:select id="depSelect" list="allDpm" name="staff.post.crmDepartment.depId" listKey="depId" listValue="depName"--%>
                                          <%--headerKey="" headerValue="----请--选--择----"/>--%>
                                    <select name="staff.postid"  onchange="changePost(this)">
                                    <option value="">----请--选--择----</option>
                                    <option value="ee050687bd1a4455a153d7bbb7000001" selected="selected">教学部</option>
                                    <option value="ee050687bd1a4455a153d7bbb7000002">咨询部</option>
                                    </select>

                            </td>
                            <td width="8%">职务：</td>
                            <td width="62%">
                                    <select name="staff.post.postId" id="postSelectId">
                                    <option value="">----请--选--择----</option>
                                    <option value="ee050687bd1a4455a153d7bbb7000003">总监</option>
                                    <option value="2c9091c14c78e58b014c78e6d4510004" selected="selected">讲师</option>
                                    <option value="ee050687bd1a4455a153d7bbb7000005" selected="selected">主管</option>
                                    </select>
                                <%--<s:select id="postSelect" list="post == null ? {} : post.crmDepartment.postSet" name="staff.post.postId" listKey="postId"--%>
                                          <%--listValue="postName" headerKey="" headerValue="----请--选--择----"/>--%>

                            </td>
                        </tr>
                        <tr>
                            <td width="10%">入职时间：</td>
                            <td width="20%">
                                <s:date name="onDutyDate" format="yyyy-MM-dd" var="date"/>
                                <s:textfield name="staff.onDutyDate"  readonly="true" onfocus="c.showMoreDay=true; c.show(this);"/>
                            </td>
                            <td width="8%"></td>
                            <td width="62%"><s:submit value="提交"/> </td>
                        </tr>
                    </table>
                </s:form>
            </td>
        </tr>
    </table>

    <%--<script type="text/javascript">--%>
        <%--function registerUrl(){--%>
        <%--document.location='${pageContext.request.contextPath}/uiAction_staff_register';--%>
        <%--}--%>

    <%--</script>--%>
</div>
</BODY>
<script type="text/javascript">

    $('#friends').change(function () {
//        var id=$('#friends').title.valueOf()
//        console.log(id);
        var users="${pageContext.request.contextPath}/friends";
        $.getJSON(users,function (data) {
            console.log(data.toString());
            $('#people').empty();
            $.each(data,function (index,obj) {
                var option=$("<option>").text([obj['username']])
                $('#people').append(option);
            })
        })
    })



</script>
</HTML>