<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/31
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="file" method="post" >
    <input name="fileName" type="file">
    <input  type="submit" value="提交">
</form>

<h2>使用JSP+Servlet实现文件的上传下载</h2>
<form action="file" method="post" enctype="multipart/form-data" >
    请选择文件：<input id="file" name="file" type="file" />
    <input type="submit" value="上传"  />${result}
</form>
下载：<a href="file?filename=FileTest.txt">fileTest.txt</a> ${errorResult}
</body>
</html>
