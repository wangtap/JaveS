<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>员⼯工列列表</title>
    <script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>

    </head>
    <body>
    部⻔门：
    <select id="depart">
        <option value="-1">--请选择--</option>
        <option value="0">--职规部--</option>
        <option value="1">--教学部--</option>
        </select>
    职务：
    <select id="post">
        <option value="-1">--请选择--</option>
        </select>
        </body>
<script type="text/javascript">
    function createXMLHttpRequest() {
        try {
            return new XMLHttpRequest();
        } catch (e) {
            try {
                return new ActiveXObject("Msxml2.HTTP");
            } catch (e) {
                try {
                    return new ActiveXObject("Microsoft.HTTP");
                } catch (e) {
                    throw e;
                }
            }
        }
    }
    ;
    window.onload = function () {
        var depart = document.getElementById("depart");
        //给⽂文本框的失去焦点事件注册监听
        depart.onchange = function () {
            //1,获得XMLHttpRequest对象
            var xmlHttp = createXMLHttpRequest();
            //2,打开连接
            xmlHttp.open("POST", "/user/login", true);
            //3,设置请求头
            xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            //4,发出请求时,给出请求体
            xmlHttp.send("username=sd&password=123&departId=" + this.value);
            //5,给xmlHttp对象的onreadystatechange事件注册监听
            xmlHttp.onreadystatechange = function () {
                if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                    //6,返回json数据
                    var user = eval("(" + xmlHttp.responseText + ")");
                    //7,获取职务组件
                    var post = document.getElementById("post");
                    //8,添加职务下拉列列表
                    post.innerHTML = "<option value='-1'>--请选择--</option>";
                    post.innerHTML += "<option value=" + user.departId + ">--" + user.username + "--</option>";
                }
            };
        }
    }
</script>
        </html>