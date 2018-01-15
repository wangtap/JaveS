<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登入</title>
    <script src="../js/jquery-3.2.1.min.js"></script>
    <link type="text/css" href="../css/login.css" rel="stylesheet">

</head>
<body>
<div class="a">
    <div class="b1">
    <img id="1" src="../img/456.png" >
        <span id="2"  style="float: right ;width: 500px ; font-size: 30px"  ></span>
    </div>
    <form action="login.action" method="get" class="b2">
        <div class="c1" ><h1  align="center">网易云登入</h1> </div>
        <div class="c2">
            <div class="c22">
            <div class="t1"></div>
            <input placeholder="手机或邮箱" type="text" id="email"
                   name="email"
                   <c:if test="${cookie.get('username')!=null}">
                  value='${cookie.get('username').value}'
                   </c:if>
               onfocus="fou(this)" onblur="lev(this)">
            </div>
        </div>
        <div class="c3" >
            <div class="c33">
            <div class="t2"></div>
            <input placeholder="密码" type="password" id="password" name="password" onfocus="fou(this)" onblur="lev(this)">
           </div>
        </div>
        <div class="c4">  <input  type="submit" id="login" value="登入" ></div>
        <div class="c5">
            <a href=""   class="forget">忘记密码</a>
            <a href="register.jsp" class="goLogin">去注册</a>
        </div>
    </form>
</div>
</body>
<script type="text/javascript">
    function fou(ele) {
        ele.style.fontSize="30px";
        ele.style.borderColor="red";
    }
    function lev(ele) {
        ele.style.fontSize="22px";
        ele.style.borderColor="#A9A9A9";
    }
    function CurentTime()
    {
        var now = new Date();
        var year = now.getFullYear();       //年
        var month = now.getMonth() + 1;     //月
        var day = now.getDate();            //日
        var hh = now.getHours();            //时
        var mm = now.getMinutes();          //分
        var seconds = now.getSeconds();
        var clock = year + "-";
        if(month < 10)
            clock += "0";
        clock += month + "-";
        if(day < 10)
            clock += "0";
        clock += day + " ";
        if(hh < 10)
            clock += "0";
        clock += hh + ":";
        if (mm < 10) clock += '0';
        clock += mm+":";
        if(seconds<10)clock+='0';
        clock+=seconds;
        return(clock);
    }
    function t() {
        var id = document.getElementById("2");
        setInterval(function () {
            id.innerText=CurentTime();
        },1000)
    }
    t();

//    $('#login').click(function ajax() {
//     var email=$("#email").val();
//     var Password =$("#password").val() ;//获取id为password标签的value值
//     var user = {password:Password,email:email};// 1
//
//     $.ajax({
//         type : "POST",//POST方法
//         url : "/userLogin",//Servlet中对应的url-pattern
//         data :user,//上面定义的json数据
////     dataType:"User",//后台返回的数据格式类型
//         success : function(msg) {
////         console.log(msg);//控制台输入后台返回的数据信息
//            if (msg.indexOf("SUCCESS")){
//                 alert(msg);
//             } else {
//                 console.log(msg);
//                 $(window).attr('location',"http://localhost:8080/jsps/main.jsp");
//             }
//         },
//         error:function(XMLHttpRequest, textStatus, errorThrown){
//             //如果后台无法返回数据到前台，则输出前台想要传到到后台的信息和Error标识
////         console.info(JSON.stringify(user)+"\nError");
//         }
//     });
//    })
//
//    $.get("http://192.168.20.221:8080/day16/ten",function (data,status) {
//        //第一个参数：
//        //获得的数据
//        //第二个参数：
//        //访问是否成功
//        if(status=="success"){
////                        console.log(data);
//            //使用parseJSON方法
//            ///将data数据解析成JS中json对象
//            var jsonData = $.parseJSON(data);
//            var json = $.parseJSON(data);
////                        console.log(jsonData[0]['score']);
//            if (jsonData!=null){
//                $('table').append($('<tr>')
//                    .append($("<td>").text('昵称'))
//                    .append($("<td>").text('分数')))
//
//                //角标，元素
//                $.each(jsonData,function (index,obj) {
////                            console.log(index);
////                            console.log(obj);
//                    $('table').append(
//                        $('<tr>').append(
//                            $('<td>').text(obj['nickname'])
//                        ).append(
//                            $('<td>').text(obj['score'])
//                        )
//                    )
//                })
//            }
//        }
//    })
</script>
</html>