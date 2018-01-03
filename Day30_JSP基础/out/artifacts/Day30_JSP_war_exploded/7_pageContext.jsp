<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/3
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>7_pageContext</title>
</head>
<body>
    <%
        //代理
        //使用PageContext，可以向其他域对象中设置属性
        //给request域设置域属性
        pageContext.setAttribute(
                "game","page",pageContext.PAGE_SCOPE
        );
        pageContext.setAttribute(
                "game","REQUEST",pageContext.REQUEST_SCOPE
        );
        pageContext.setAttribute(
                "game","SESSION",pageContext.SESSION_SCOPE
        );
        pageContext.setAttribute(
                "game","APPLICATION",pageContext.APPLICATION_SCOPE
        );
        //全域查找
        //这里就会去pageContext中查找属性名为game的属性
         Object game = pageContext.findAttribute("game");
        out.write(game.toString());
    %>
</body>
</html>
