<%--默认忽视EL表达式，这里选择不忽视--%>
<%@page isELIgnored="false" %>
<%@page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<body>
<%--<jsp:forward page="/WEB-INF/pages/login.jsp"></jsp:forward>--%>
<h2>login</h2>
<form action="/login" method="post">

    用户名:<label>
    <input type="text" name="uname">
</label><br>
    <label>
        密&nbsp;码:
        <input type="password" name="password">
    </label><br>

    <input type="submit">
</form>





<h1>login2</h1>
<form action="/login2" method="post">

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

<h1>login3</h1>
<form action="/login3" method="post"><br>
 <input type="text" name="user.uname"><br>
 <input type="text" name="user.password"><br>
 <input type="text" name="code"><br>
 <input type="text" name="message"><br>
 <input type="text" name="user.list[0]"><br>
 <input type="text" name="user.list[1]"><br>
 <input type="text" name="user.list[2]"><br>
 <input type="text" name="user.list[3]"><br>
 <input type="text" name="user.map['o1']"><br>
 <input type="text" name="user.map['o2'].user.uname"><br>
    <input type="submit">
</form>

<h2>login4</h2>
<form action="/login4" method="post">

    用户名:<label>
    <input type="text" name="uname">
</label><br>
    <label>
        密&nbsp;码:
        <input type="password" name="password">
    </label><br>

    <input type="submit">
</form>

<a href="/updateById/2">点我</a>

<h1>register</h1>
<form action="/register1" method="post">
    <input type="text" name="uname"><br>
    <input type="password" name="password"><br>
    <input type="number" name="userid"><br>
    <input type="submit"><br>
</form>









</body>
</html>
