<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登入</title>
    <link type="text/css" href="css/login.css" rel="stylesheet">

</head>
<body>
<div class="a">
    <div class="b1">
    <img id="1" src="img/456.png" >
        <span id="2"  style="float: right ;width: 500px ; font-size: 30px"  ></span>
    </div>
    <form action="login" method="post" class="b2">
        <div class="c1" ><h1  align="center">网易云登入</h1> </div>
        <div class="c2">
            <div class="c22">
            <div class="t1"></div>
            <input placeholder="手机或邮箱" type="text" id="username"
                   name="username"
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
        <div class="c4">  <button  type="button" id="region" value="登入"></button></div>
        <div class="c5">
            <a href=""   class="forget">忘记密码</a>
            <a href="register.html" class="goLogin">去注册</a>
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
</script>
</html>