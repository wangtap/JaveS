<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/20
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>show</title>
</head>
<body>
<table border="1">
    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th>部门</th>
        <th>入职时间</th>
        <th>地址</th>
        <th>电话</th>
        <th>编辑</th>
      </tr>
        <s:iterator var="staff" value="%{#request.staffList}">
     <tr>
        <%--<s:url action="desc" var="url">--%>
        <%--<s:param name="sid" value="#staff.sid"/>--%>
       <%--</s:url>--%>
            <td><s:property value="#staff.sname"/></td>
            <td><s:property value="#staff.age"/></td>
            <td><s:property value="#staff.department"/></td>
            <td><s:property value="#staff.hiredate" /></td>
            <td><s:property value="#staff.address"/></td>
            <td><s:property value="#staff.phone"/></td>
            <td><a href="
        <s:url action="desc">
        <s:param name="sid" value="#staff.sid"/>
    </s:url>">编辑属性</a> </td>
    </tr>
            </s:iterator>


    <s:form action="save" method="POST">
    <s:textfield  name="staff.sname" label="用户名"></s:textfield>
    <s:textfield name="staff.age" label="年龄"></s:textfield>
    <s:textfield name="staff.department" label="部门"></s:textfield>
    <s:textfield name="staff.hiredate" label="入职时间" type="date"  ></s:textfield>
    <s:textfield name="staff.address" label="地址"></s:textfield>
    <s:textfield name="staff.phone" label="电话"></s:textfield>
    <s:submit value="增加员工"></s:submit>
    </s:form>
</table>
</body>
</html>
