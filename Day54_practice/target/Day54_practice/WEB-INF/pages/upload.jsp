<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/2/5
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>下载</title>
</head>
<body>
<form action="/user/upload" method="post" enctype="multipart/form-data"
>
    选择⽂文件：
    <input type="file" name="items_pic"/>
    <input type="submit" value="上传">
</form>
</body>
</html>
