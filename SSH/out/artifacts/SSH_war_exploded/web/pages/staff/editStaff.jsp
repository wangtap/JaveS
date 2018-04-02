<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>无标题文档</title>
	<link href="${pageContext.request.contextPath}/css/sys.css" type="text/css" rel="stylesheet" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/Calendar.js"></script>
	<script src="../../js/jquery-3.2.1.min.js"></script>
</head>

<body class="emp_body">
<table border="0" cellspacing="0" cellpadding="0" width="100%">
	<tr>
		<td class="topg"></td>
	</tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
	<tr>
		<td width="1%"><img src="${pageContext.request.contextPath}/images/tleft.gif"/></td>
		<td width="44%" align="left">[员工管理]</td>

		<td width="52%"align="right">
			<!-- 提交表单 -->
			<a href="javascript:void(0)" onclick="document.forms[0].submit()">
				<img src="${pageContext.request.contextPath}/images/button/save.gif" />
			</a>
			<!-- 执行js，进行返回 -->
			<a href="javascript:void(0)" onclick="window.history.go(-1)"><img src="${pageContext.request.contextPath}/images/button/tuihui.gif" /></a>

		</td>
		<td width="3%" align="right"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
	</tr>
</table>

<s:form action="staff_edit" namespace="/">

	<s:hidden name="staff.staffId" value="%{staffId}"/>

	<table width="88%" border="0" class="emp_table" style="width:80%;">
		<tr>
			<td>登录名：</td>
			<td><s:textfield name="staff.loginName" value="%{loginName}" readonly="true" /> </td>
			<td>密码：</td>
			<td><s:password  name="staff.loginPwd" value="%{loginPwd}" showPassword="true" readonly="true" /> </td>
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

				<s:select id="depSelect" list="allDpm" name="staff.post.crmDepartment.depId" listKey="depId" listValue="depName"
						  headerKey="" headerValue="----请--选--择----"/>
			<%--<select name="crmPost.crmDepartment.depId"  onchange="changePost(this)">--%>
					<%--<option value="">----请--选--择----</option>--%>
					<%--<option value="ee050687bd1a4455a153d7bbb7000001" selected="selected">教学部</option>--%>
					<%--<option value="ee050687bd1a4455a153d7bbb7000002">咨询部</option>--%>
				<%--</select>--%>

			</td>
			<td width="8%">职务：</td>
			<td width="62%">
				<%--<select name="crmPost.postId" id="postSelectId">--%>
					<%--<option value="">----请--选--择----</option>--%>
					<%--&lt;%&ndash;<option value="2c9091c14c78e58b014c78e6b34a0003">总监</option>&ndash;%&gt;--%>
					<%--<option value="2c9091c14c78e58b014c78e6d4510004" selected="selected">讲师</option>--%>
				<%--</select>--%>
					<s:select id="postSelect" list="post == null ? {} : post.crmDepartment.postSet" name="staff.post.postId" listKey="postId"
		  			  listValue="postName" headerKey="" headerValue="----请--选--择----"/>

			</td>
		</tr>
		<tr>
			<td width="10%">入职时间：</td>
			<td width="20%">
				<s:date name="onDutyDate" format="yyyy-MM-dd" var="date"/>
				<s:textfield name="staff.onDutyDate" value="%{date}" readonly="true" onfocus="c.showMoreDay=true; c.show(this);"/>
			</td>
			<td width="8%"></td>
			<td width="62%"></td>
		</tr>
	</table>
</s:form>

</body>
<script type="text/javascript">
	$
    $('#depSelect').change(function () {
//	    验证我们获得的选中项到底是什么
//		发现是listKey属性
//		也就是部门的id
//		console.log($(this).val());
        var depId = $(this).val();
//		那么要根据这个部门的id，执行异步请求，获得对应部门的职务信息
        var findAllByDep = "${pageContext.request.contextPath}/post_findAllByDep?crmDepartment.depId="+depId;
        $.getJSON(findAllByDep,function (data) {
//		    测试得到的返回结果
            console.log(data.toString());

//             先清空第二个

            $("#postSelect").empty();


//			将结果设置到职务select中
//             循环生成多个option
            $.each(data,function (index,obj) {
//				子选项
                var option = $("<option>").val(obj['postId']).text(obj['postName']);
                $("#postSelect").append(option);
            })
        })
    })
</script>

</html>
