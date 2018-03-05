<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/2/28
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>云科技</title>
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global.css" />
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global_color.css" />
    <script language="javascript" type="text/javascript">
        //删除
        function deleteAccount(id) {
            var r = window.confirm("确定要删除此账务账号吗？");
            if(r) {
                location.href='${pageContext.request.contextPath}/account/delete?accountId='+id;
            document.getElementById("operate_result_info").style.display = "block";
            }
        }
        //开通或暂停
        function start_State(id) {
            var r = window.confirm("确定要开通此账务账号吗？");
            if(r) {
                location.href = "startAccount?accountId="+id;
            }
        }
        function pause_State(id) {
            var r = window.confirm("确定要暂停此账务账号吗？");
            if(r) {
                location.href = "pauseAccount?accountId="+id;
            }
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
        <li><a href="${pageContext.request.contextPath}/role_info/findAll" class="role_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/admin_info/findAll" class="admin_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/cost/findAll" class="fee_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/account/findAll" class="account_on"></a></li>
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
    <form action="${pageContext.request.contextPath}/account/findAllByPage" method="post">
        <input id="pageCode" name="pageCode" type="hidden" value="1">
        <!--查询-->
        <div class="search_add">
            <div>身份证：<input name="idcardNo" type="text" value="" class="text_search" /></div>
            <div>姓名：<input name="realName" type="text" value="" class="width70 text_search"  /></div>
            <div>登录名：<input name="loginName" type="text" value=""    class="text_search"/></div>
            <div>
                状态：
                <select name="status" class="select_search">
                    <option value="" >全部</option>
                    <option value="0">开通</option>
                    <option value="1">暂停</option>
                    <option>删除</option>
                </select>
            </div>
            <div><input type="submit" value="搜索" class="btn_search" /></div>
            <input type="button" value="增加" class="btn_add" onclick="location.href='${pageContext.request.contextPath}/account/toInsert';" />
        </div>
        <!--删除等的操作提示-->
        <div id="operate_result_info" class="operate_success">
            <img src="${pageContext.request.contextPath}/images/close.png" onclick="this.parentNode.style.display='none';" />
            删除成功，且已删除其下属的业务账号！
        </div>
        <!--数据区域：用表格展示数据-->
        <div id="data">
            <table id="datalist">
                <tr>
                    <th>账号ID</th>
                    <th>姓名</th>
                    <th class="width150">身份证</th>
                    <th>登录名</th>
                    <th>状态</th>
                    <th class="width100">创建日期</th>
                    <th class="width150">上次登录时间</th>
                    <th class="width200"></th>
                </tr>
                <c:forEach items="${accountPageBean.data}" var="account">
                <tr>
                    <td>${account.accountId}</td>
                    <td><a href="account_detail.html">${account.realName}</a></td>
                    <td>${account.idcardNo}</td>
                    <td>${account.loginName}</td>
                    <td>
                        <c:if test="${account.status==1}">暂停</c:if>
                        <c:if test="${account.status==0}">开通</c:if>
                    </td>
                    <td>${account.createDate}</td>
                    <td>${account.lastLoginTime}</td>
                    <td class="td_modi">
                        <c:choose >
                            <c:when test="${account.status==0}">
                                <input type="button" value="暂停" class="btn_start" onclick="pause_State(${account.accountId});" />
                                <input type="button" value="修改" class="btn_modify"
                                       onclick="location.href='${pageContext.request.contextPath}/account/toUpdate?accountId=${account.accountId}';" />
                                <input type="button" value="删除" class="btn_delete" onclick="deleteAccount(${account.accountId});" />
                            </c:when>
                            <c:when test="${account.status==1}">
                                <input type="button" value="开通" class="btn_start" onclick="start_State(${account.accountId});" />
                                <input type="button" value="修改" class="btn_modify"
                                       onclick="location.href='${pageContext.request.contextPath}/account/toUpdate?accountId=${account.accountId}';" />
                                <input type="button" value="删除" class="btn_delete" onclick="deleteAccount(${account.accountId});" />
                            </c:when>
                        </c:choose>
                    </td>
                </tr>
                </c:forEach>
            </table>
            <p>业务说明：<br />
                1、创建则开通，记载创建时间；<br />
                2、暂停后，记载暂停时间；<br />
                3、重新开通后，删除暂停时间；<br />
                4、删除后，记载删除时间，标示为删除，不能再开通、修改、删除；<br />
                5、暂停账务账号，同时暂停下属的所有业务账号；<br />
                6、暂停后重新开通账务账号，并不同时开启下属的所有业务账号，需要在业务账号管理中单独开启；<br />
                7、删除账务账号，同时删除下属的所有业务账号。</p>
        </div>
        <!--分页-->
        <div id="pages">
            <span>第${accountPageBean.pageCode}/${accountPageBean.totalPages}页</span>
            <span>
   	<c:if test="${accountPageBean.pageCode>1}">
        <a href="#" onclick="showPage(1)">[首页]</a>
        <a href="#" onclick="showPage(${accountPageBean.pageCode}-1 )">[上一页]</a>
    </c:if>

      <c:forEach begin="${accountPageBean.start}" end="${accountPageBean.end}" var="num" step="1">
          <a href="#" class="current_page" onclick="showPage(${num})">${num}</a>
      </c:forEach>

	<c:if test="${accountPageBean.pageCode < accountPageBean.totalPages}">
        <a href="#" onclick="showPage(${accountPageBean.pageCode}+1 )">[下一页]</a>
        <a href="#" onclick="showPage(${accountPageBean.totalPages} )">[尾页]</a>
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
