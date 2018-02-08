<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/2/5
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

<form action="/l" method="post">

    <%--会自动找到对应控制器方法参数列表中
    User user 这个user参数的username，通过get方法给这个属性赋值  --%>
    用户名:<label>
    <input type="text" name="uname">
</label><br>
    <label>
        密&nbsp;码:
        <input type="password" name="password">
    </label><br>
    <input type="submit">
</form>
</body>
</html>
