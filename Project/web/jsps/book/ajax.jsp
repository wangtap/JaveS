<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>图书列表</title>

    <script src="../../js/jquery-3.2.1.min.js"></script>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <style type="text/css">
        body {
            font-size: 10pt;
        }
        .icon {
            margin:10px;
            border: solid 2px gray;
            width: 160px;
            height: 180px;
            text-align: center;
            float: left;
        }
        .code{
            /*position: relative;*/
            /*top: 500px;*/
            /*background-color:red;*/
        }


    </style>
</head>
<body>
<c:if test="${requestScope.page !=null}">
    <c:forEach  var="book" items="${requestScope.page.books}">
        <div class="icon">
            <a href="<c:url value='/descBook?${book.bid}'/>" >
                <img border="0" class="img" src=/${book.image}>
            </a>
            <br>
            <a href="">${book.bname}</a>
        </div>
    </c:forEach>
      <%--<c:set var="totalPages" value="${requestScope.page.totalPages}"/>--%>
    <%--<c:set var="pageCode" value="${requestScope.page.pageCode}"/>--%>
    <%--<c:set var="begin" value="1"/>--%>
    <%--<c:set var="end" value="10"/>--%>
    <%--<c:if test="${totalPages<10}">--%>
        <%--<c:set var="end" value="${totalPages}"/>--%>
    <%--</c:if>--%>
    <%--<c:if test="${pageCode>6}">--%>
        <%--<c:set var="begin" value="${pageCode-5}"/>--%>
        <%--<c:set var="end" value="${pageCode+4}"/>--%>
        <%--<c:if test="${pageCode>totalPages-4}">--%>
            <%--<c:set var="begin" value="${totalPages-9}"/>--%>
            <%--<c:set var="end" value="${totalPages}"/>--%>
        <%--</c:if>--%>
    <%--</c:if>--%>
    <%--<c:if test="${pageCode>1}">--%>
        <%--<a href="bookList?cid=${requestScope.page.cid}&pc=${pageCode-1}${requestScope.page.params}">上一页</a>--%>
    <%--</c:if>--%>


    <%--<div>  <c:forEach begin="${begin}" end="${end}" var="v">--%>
        <%--&nbsp;--%>
        <%--<a  class="code" href="bookList?cid=${requestScope.page.cid}&pc=${v}${requestScope.page.params}">--%>
            <%--<c:if test="${requestScope.page.pageCode==v}">--%>
                <%--${v}--%>
            <%--</c:if>--%>
            <%--<c:if test="${requestScope.page.pageCode!=v}">--%>
                <%--[${v}]--%>
            <%--</c:if>--%>
        <%--</a>--%>
        <%--&nbsp;--%>
    <%--</c:forEach></div>--%>
    <%--<c:if test="${totalPages>pageCode}">--%>
        <%--<a  href="bookList?cid=${requestScope.page.cid}&pc=${pageCode+1}${requestScope.page.params}">下一页</a>--%>
    <%--</c:if>--%>
    <%--<form action="bookList" method="get">--%>
        <%--<input type="text" name="pc"  value="${pageCode}">/${totalPages}--%>
        <%--<input type="hidden" name="cid" value="${requestScope.page.cid}">--%>
        <%--<input type="submit" value="跳页">--%>
    <%--</form>--%>
</c:if>

</body>
<%--<script type="text/javascript">--%>
 <%--$('#login').click(function ajax() {--%>
<%--//        var email=$("#email").val();--%>
<%--//        var Password =$("#password").val() ;//获取id为password标签的value值--%>
<%--//        var user = {password:Password,email:email};// 1--%>

<%--//        $.ajax({--%>
<%--//            type : "get",//POST方法--%>
<%--//            url : "/ajax?cid=-1&pc=1",//Servlet中对应的url-pattern--%>
<%--////            data :user,//上面定义的json数据--%>
<%--//     dataType:"Json",//后台返回的数据格式类型--%>
<%--//            success : function(msg) {--%>
<%--////         console.log(msg);//控制台输入后台返回的数据信息--%>
<%--//                if (msg.indexOf("SUCCESS")){--%>
<%--//                    alert(msg);--%>
<%--//                } else {--%>
<%--//                    console.log(msg);--%>
<%--//                    $(window).attr('location',"http://localhost:8080/jsps/main.jsp");--%>
<%--//                }--%>
<%--//            },--%>
<%--//            error:function(XMLHttpRequest, textStatus, errorThrown){--%>
<%--//                //如果后台无法返回数据到前台，则输出前台想要传到到后台的信息和Error标识--%>
<%--////         console.info(JSON.stringify(user)+"\nError");--%>
<%--//            }--%>
<%--//        });--%>
<%--//    })--%>

    <%--$.get("http://localhost:8080/ajax?cid=-1&pc=1",function (data,status) {--%>
        <%--//第一个参数：--%>
        <%--//获得的数据--%>
        <%--//第二个参数：--%>
        <%--//访问是否成功--%>
<%--//            console.log(status)--%>
        <%--if(status=="success"){--%>
<%--//                        console.log(data);--%>
            <%--//使用parseJSON方法--%>
            <%--///将data数据解析成JS中json对象--%>
            <%--var jsonData = $.parseJSON(data);--%>

<%--//                        console.log(jsonData[0]['score']);--%>

            <%--if (jsonData!=null){--%>

                <%--//角标，元素--%>
                                  <%--$.each(jsonData,function (index,books) {--%>
                        <%--$('body').append($('<div>').class('icon')--%>
                            <%--.append($("<a>").href('/descBook?'+books['bid']).append($("<img>").src('/'+books['image'])))--%>
                            <%--.append($("<br>"))--%>
                            <%--.append($("<a>").href('/descBook?'+books['bid']).value([books['bname']])))--%>
                    <%--})--%>
            <%--}--%>
        <%--}--%>
    <%--})--%>

<%--</script>--%>



</html>


