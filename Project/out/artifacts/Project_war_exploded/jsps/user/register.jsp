<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <script src="../../js/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" href="../../css/register.css" type="text/css">
   </head>
<body>
<div
        class="a">
    <div class="b1">
    <img id="1" src="../../img/456.png" >
       <span id="2"  style="float: right ;width: 500px ; font-size: 20px"  ></span>
    </div>
    <form action="/userRegister" method="post" class="b2" name="myform">
        <div class="c1" >
            <div class="b22">
                <div class="t0"></div>
            <a  align="center">邮箱号注册</a>
        </div>
        </div>
        <div class="c2">
            <div class="c22">
            <div class="t1"></div>
            <input  placeholder="请输入邮箱地址" type="text" id="email" name="email" onblur="onblur1()" onfocus="onfocus1()">
               <div id="point">请输入正确的邮箱格式</div>
            </div>

        </div>
        <div class="c6">
            <div class="c222">
                <input  placeholder="请输入用户名" type="text" id="username" name="username" onblur="onblur1()" onfocus="onfocus1()">
            </div>
        </div>
        <div class="c3">
            <div class="c33">
            <div class="t2"></div>
            <input placeholder="请输入登入密码" type="password" id="password" name="password" onfocus="onfocus2()" onblur="onblur2()">
                <div id="point1">密码要大于6位小于14位，一定要有大小写字母和数字</div>
            </div>
        </div>
        <div
                class="c4">  <button  type="button" id="region" value="注册"   >注册</button>
        </div>
        <div class="c5">
             <a href="login.jsp" class="forget" id="a">去登入</a>
       </div>
    </form>
    <img src="../../img/timg.jpg" class="view">
</div>

</body>
<script type="text/javascript">
    function onfocus1() {
        var ele = document.getElementById("point");
        ele.style.display="block";
    }
    function onblur1() {
        var ele = document.getElementById("point");
        ele.style.display="none";
    }
    function onfocus2() {
        var ele = document.getElementById("point1");
        ele.style.display="block";
    }
    function onblur2() {
        var ele = document.getElementById("point1");
        ele.style.display="none";
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




$('#region').click(function ajax() {
    var username =$("#username").val();  //获取id为userName标签的value值
    var email=$("#email").val();
    var Password =$("#password").val() ;//获取id为password标签的value值
    var user = {username:username,password:Password,email:email};// 1

    $.ajax({
        type : "POST",//POST方法
        url : "/userRegister",//Servlet中对应的url-pattern
        data :user,//上面定义的json数据
//        dataType:"User",//后台返回的数据格式类型
        success : function(msg) {
//            console.log(msg);//控制台输入后台返回的数据信息
                    console.log(msg.toString())
            if (msg.indexOf("SUCCESS")){
                alert(msg);
            } else {
               console.log(msg);
                $(window).attr('location',"http://localhost:8080/jsps/msg.jsp");
           }
        },
        error:function(XMLHttpRequest, textStatus, errorThrown){
            //如果后台无法返回数据到前台，则输出前台想要传到到后台的信息和Error标识
//            console.info(JSON.stringify(user)+"\nError");
        }


    });
})
</script>
</html>
