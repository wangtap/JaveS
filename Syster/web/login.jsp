<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登入</title>
    <style type="text/css">

        #username{
            height: 40px;
            margin: -20px auto;
            width: 347px;
            font-size: 22px;
            text-indent: 35px;
        }
        #password{
            margin-top: -40px;
            margin-bottom: -10px;
            width: 347px;
            height: 40px;
            font-size: 22px;
            text-indent: 35px;
        }
        #region{ font-size: 30px ;
            font-weight: 100;
            width: 355px;
            position: relative; left: 90px;top: 30px;
            background-color: #1e88e5; color: white}
        .a{width:100%;
            height:100%;
            position: absolute;
            background-color: #FFFDFC}

        h1{
            position: relative;
            top: 45px;
        }
        .b1{height: 5% ;
            background-color: white }
        .b2{height: 500px;
            width: 500px ;
            background-color: white;
            position: absolute;
            right: 35%;
            top: 25%}
       .c1{position: relative;
            height: 100px;
            background-color: white}
        .c2{position: relative;
            height: 100px;
            background-color: white}
        .c22{
            border: 1px;
            position: relative;
            height: 0px;
            width: 350px;
            background-color: white;
            left:90px;
            top : 25px;
        }
        .c3{position: relative;
            height: 100px;
            background-color: white}
        .c33{
            position: relative;
            height: 0px;
            width: 350px;
            background-color: white;
            left:90px;
            top : 25px;
        }
        .c4{position: relative;
            height: 100px;
            background-color:white}
       .c5{position: relative;
            height: 100px;
            background-color:white}
        .goLogin{
            float: right;position: relative;right: 55px;top: 10px ; color: #1e88e5;
        }
        .forget{
            float: left;position: relative;left: 90px;top: 10px ; color: #1e88e5;
        }
        .t1{
            left: 5px;top: 17px;
           position: relative;
            /*background-color: green;*/
            width: 21px;height: 21px;
            background: url("img/123.png");
        }
        .t2{
            left: 5px;top: -9px;
            position: relative;
            /*background-color: green;*/
            width: 21px;height: 21px;
            background: url("img/123.png")-21px -3px no-repeat;
        }





    </style>
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

                   <%
                   if(request.getSession().getAttribute("username")!=null){
                               %>
                   value='${sessionScope.username}'
                        <% }%>
                  onfocus="fou(this)" onblur="lev(this)">
            </div>
        </div>
        <div class="c3" >
            <div class="c33">
            <div class="t2"></div>
            <input placeholder="密码" type="password" id="password" name="password" onfocus="fou(this)" onblur="lev(this)">
            </div>
        </div>
        <div class="c4">  <input  type="submit" id="region" value="登入" ></div>
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