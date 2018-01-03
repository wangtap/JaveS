<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/3
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>6_include_action</title>
</head>
<body>
<h1>哈哈哈哈或</h1>
<%--
相当于请求包含，是动作包含
会先创建出1_hello.jsp文件的.java文件
然后在包含进6.jsp

--%>
 <jsp:include page="4_target.jsp"></jsp:include>
</body>
</html>
