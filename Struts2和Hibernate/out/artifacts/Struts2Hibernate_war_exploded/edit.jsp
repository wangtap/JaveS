<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/20
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>idet</title>
</head>
<body>
<%--<form border="1" action="edit.action" method="post">--%>
    <%--<tr>--%>
        <%--<th>属性</th>--%>
        <%--<th>修改前</th>--%>
        <%--<th>修改后</th>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>姓名</td>--%>
        <%--<td>${requestScope.staff.sname}</td>--%>
        <%--<td><input type="text" name="staff.sname" value="${requestScope.staff.sname}"></td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>年龄</td>--%>
        <%--<td>${requestScope.staff.age}</td>--%>
        <%--<td><input type="text" name="staff.age" value="${requestScope.staff.age}"></td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>部门</td>--%>
        <%--<td>${requestScope.staff.department}</td>--%>
        <%--<td><input type="text" name="staff.department" value="${requestScope.staff.department}"></td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>入职时间</td>--%>
        <%--<td>${requestScope.staff.hiredate}</td>--%>
        <%--<td><input type="text" name="staff.hiredate" value="${requestScope.staff.hiredate}"></td>--%>
    <%--</tr>--%>

    <%--<tr>--%>
        <%--<td>地址</td>--%>
        <%--<td>${requestScope.staff.address}</td>--%>
        <%--<td><input type="text" name="staff.address" value="${requestScope.staff.address}"></td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>电话</td>--%>
        <%--<td>${requestScope.staff.phone}</td>--%>
        <%--<td><input type="text" name="staff.phone" value="${requestScope.staff.phone}"></td>--%>
<%--</tr>--%>
    <%--<input type="hidden" name="staff.sid" value="${requestScope.staff.sid}">--%>
<%--<input type="submit" value="提交">--%>
<%--</form>--%>


<s:form action="edit" method="POST">
    <s:textfield name="staff.sname" label="用户名" value="%{#request.staff.sname}"></s:textfield>
    <s:textfield name="staff.age" label="年龄" value="%{#request.staff.age}"></s:textfield>
    <s:textfield name="staff.department" label="部门" value="%{#request.staff.department}" ></s:textfield>
    <s:textfield name="staff.hiredate" label="入职时间"  value="%{#request.staff.hiredate}"></s:textfield>
    <s:textfield name="staff.address" label="地址" value="%{#request.staff.address}"></s:textfield>
    <s:textfield name="staff.phone" label="电话" value="%{#request.staff.phone}"></s:textfield>
    <s:textfield name="staff.sid" value="%{#request.sid}" type="hidden"/>
    <s:submit value="提交"></s:submit>
</s:form>

</body>
</html>
