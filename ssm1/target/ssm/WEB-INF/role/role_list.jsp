<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/3/2
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html><html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>role</title>
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global.css" />
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global_color.css" />
    <script language="javascript" type="text/javascript">
        function deleteRole() {
            var r = window.confirm("确定要删除此角色吗？");
            document.getElementById("operate_result_info").style.display = "block";
        }
    </script>
</head>
<body>
<!--Logo区域开始-->
<div id="header">
    <img src="${pageContext.request.contextPath}/images/logo.png" alt="logo" class="left"/>
    <a href="#">[退出]</a>
</div>
<!--Logo区域结束-->
<!--导航区域开始-->
<div id="navi">
    <ul id="menu">
        <li><a href="${pageContext.request.contextPath}/login/toIndex" class="index_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/role_info/findAll" class="role_on"></a></li>
        <li><a href="${pageContext.request.contextPath}/admin_info/findAll" class="admin_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/cost/findAll" class="fee_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/account/findAll" class="account_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/service/findAll" class="service_off"></a></li>
        <li><a href="../bill/bill_list.html" class="bill_off"></a></li>
        <li><a href="../report/report_list.html" class="report_off"></a></li>
        <li><a href="../user/user_info.html" class="information_off"></a></li>
        <li><a href="../user/user_modi_pwd.html" class="password_off"></a></li>
    </ul>
</div>
<!--导航区域结束-->
<!--主要区域开始-->
<div id="main">
    <form action="${pageContext.request.contextPath}/role_info/findAllByPage" method="post">
        <input id="pageCode" name="pageCode" type="hidden" value="1">

        <!--查询-->
        <div class="search_add">
            <input type="button" value="增加" class="btn_add" onclick="location.href='${pageContext.request.contextPath}/role_info/toInsert';" />
        </div>
        <!--删除的操作提示-->
        <div id="operate_result_info" class="operate_success">
            <img src="../images/close.png" onclick="this.parentNode.style.display='none';" />
            删除成功！
        </div> <!--删除错误！该角色被使用，不能删除。-->
        <!--数据区域：用表格展示数据-->
        <div id="data">
            <table id="datalist">
                <tr>
                    <th>角色 ID</th>
                    <th>角色名称</th>
                    <th class="width600">拥有的权限</th>
                    <th class="td_modi"></th>
                </tr>
                <c:forEach items="${Role_infoPageBean.data}" var="role">
                    <tr>
                        <td>${role.roleId}</td>
                        <td>${role.name}</td>
                        <td><c:forEach items="${role.moduleIds}" var="module">
                            ${module.toString()}
                        </c:forEach></td>
                        <td>
                            <input type="button" value="修改" class="btn_modify"
                                   onclick="location.href='${pageContext.request.contextPath}/role_info/toUpdate?roleId=${role.roleId}';"/>
                            <input type="button" value="删除" class="btn_delete"
                                   onclick="location.href='${pageContext.request.contextPath}/role_info/delete?roleId=${role.roleId}';"/>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <!--分页-->
        <div id="pages">
            <span>第${Role_infoPageBean.pageCode}/${Role_infoPageBean.totalPages}页</span>
            <span>
   	<c:if test="${Role_infoPageBean.pageCode>1}">
        <a href="#" onclick="showPage(1)">[首页]</a>
        <a href="#" onclick="showPage(${Role_infoPageBean.pageCode}-1 )">[上一页]</a>
    </c:if>

      <c:forEach begin="${Role_infoPageBean.start}" end="${Role_infoPageBean.end}" var="num" step="1">
          <a href="#" class="current_page" onclick="showPage(${num})">${num}</a>
      </c:forEach>

	<c:if test="${Role_infoPageBean.pageCode < Role_infoPageBean.totalPages}">
        <a href="#" onclick="showPage(${Role_infoPageBean.pageCode}+1 )">[下一页]</a>
        <a href="#" onclick="showPage(${Role_infoPageBean.totalPages} )">[尾页]</a>
    </c:if>
</span>
        </div>
    </form>
</div>
<!--主要区域结束-->
<div id="footer">
    <p>[源自北美的技术，最优秀的师资，最真实的企业环境，最适用的实战项目]</p>
    <p>版权所有(C)云科技有限公司 </p>
</div>
</body>
<script type="text/javascript">
    function showPage(num) {
        document.getElementById("pageCode").value=num;
        document.forms[0].submit();
    }
</script>
</html>
