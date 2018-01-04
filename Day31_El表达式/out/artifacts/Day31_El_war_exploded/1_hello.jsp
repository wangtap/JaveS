<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/4
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
            <%--
            使用El可以获得JSP四大域中的属性
            这与昨天学到的PageContext的全域查找是一个意思
            EL表达式格式：
            ${}
            --%>
            <%--如果没有指定域则优先获得范围小，优先级高的name--%>
    ${name}
${100/5}
            ${100 div 5}
            ${100 mod 5}
            ${ 5 eq 5}
${ ! empty ""}
</body>
</html>
