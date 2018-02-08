<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>friends</title>
    <script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
</head>
<body>
<select id="friends">
    <option id="c" title="0"  >请选择</option>
    <option id="a" title="1" >普通朋友</option>
    <option id="b" title="2" >亲密朋友</option>
</select>

<select id="people">
    <option >请选择</option>
</select>

</body>
<script type="text/javascript">

    $('#friends').change(function () {
        var id=$('#friends').title.valueOf()
        console.log(id);
       var users="${pageContext.request.contextPath}/friends";
       $.getJSON(users,function (data) {
           console.log(data.toString());
           $('#people').empty();
           $.each(data,function (index,obj) {
                var option=$("<option>").text([obj['username']])
                $('#people').append(option);
           })
       })
   })



</script>
</html>
