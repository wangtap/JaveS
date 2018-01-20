<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/17
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%--<%@taglib prefix="a" uri="j" %>--%>
<html>
<head>
    <title>OGNL</title>
</head>
<body>

    <%--
    如果使用单引号括起来
    会认为hello是一个字符串
    如果不用单引号括起来
    会认为hello是一个表达式
    --%>


    <%--调用字符串的length方法--%>
    <s:property value=" 'hello'.length() "/>
    <%--
    使用#，调用request对象
    使用.找到request对象中的hello属性
    --%>
    <s:property value="#request.hello"/>

    <s:property value="#session.hello"/>

    <s:property value="@java.lang.Integer@MAX_VALUE"/>

    <s:property value="@@abs(-100)"/>

    <%--
        获取ActionContext中的键值对
        键为show
        输出对应的 值
    --%>

    <s:property value="#show"/>

    <%--
    获取栈顶的元素的name属性
    --%>
    <s:property value="name"/>

    ${name}

    <s:set var="v" value=" 'value' " scope="session"/>
    在session中查找${ sessionScope.v}

    <%--<s:action name="hello"/>--%>
    <s:set var="grade" value="'B'"/>

    <s:if test="#grade=='A'">
        nb
    </s:if>

    <s:if test="#grade== 'B'">
        仍需努力
    </s:if>

    <%--保存一个路径变量名为books--%>
    <s:url value="book.action" var="books" />

<a href="${books}">看书</a>

    <%--
    struts2封装好的超链接标签
    可以使用ognl表达式找到上面的url标签
    存起来的路径
    --%>

<s:a action="book">哈哈哈哈</s:a>
<s:a action="%{books}">哈哈哈哈</s:a>



<s:form action="book" method="post">
    <%--
    通过ognl表达式提交参数
    这里检查BookAction中是否有
    username属性
    没有就会报红
    --%>
    <s:textfield name="book.naem" label="名字"></s:textfield>
    <s:textfield name="book.category" label="种类"></s:textfield>
    <s:textfield name="book.author" label="作者"></s:textfield>
    <s:set var="sex" value="'女'"/>

    <%--
    list:可选项
    value：默认选择的
    name：对应bookAction中的某个属性
    所以这三个属性在用ognl表达式
    --%>
    <s:radio list="{'男','女'}" value="sex" name="sex"/>

    <%--
如果使用${}。那么就会去找某个属性
下面直接用{}
在使用ognl表达式是创建集合
--%>
    <s:select list="{'武汉','大连','北京','天津','湖北','上海','江西','赣州'}" name="city"/>

    <s:submit value="提交"></s:submit>



    <%-- list --%>
    <s:radio name="sex" list="{'男','女'}"></s:radio>
    <%-- map --%>
    <s:radio name="sex" list="#{'0':'男','1' :' 女'}" value="'man'"></s:radio>
    <s:set var="q" value="#{'a':'1','b':'2'}"/>
    <s:property value="q"/>
</s:form>









</body>
</html>
