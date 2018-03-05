<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/3/1
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global.css" />
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global_color.css" />
    <script language="javascript" type="text/javascript">
        //显示角色详细信息
        function showDetail(flag, a) {
            var detailDiv = a.parentNode.getElementsByTagName("div")[0];
            if (flag) {
                detailDiv.style.display = "block";
            }
            else
                detailDiv.style.display = "none";
        }
        //删除
        function deleteService(id) {
            var r = window.confirm("确定要删除此业务账号吗？删除后将不能恢复。");
            if(r) {
                location.href='${pageContext.request.contextPath}/service/delete?serviceId='+id;
            document.getElementById("operate_result_info").style.display = "block";
            }
        }
        //开通或暂停
        function start_State(id) {
            var r = window.confirm("确定要开通此账务账号吗？");
            if(r) {
                location.href = "startAccount?serviceId="+id;
            }
        }
        function pause_State(id) {
            var r = window.confirm("确定要暂停此账务账号吗？");
            if(r) {
                location.href = "pauseAccount?serviceId="+id;
            }
        }
    </script>
</head>
<body>
<!--Logo区域开始-->
<div id="header">
    <img src="../images/logo.png" alt="logo" class="left"/>
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
        <li><a href="${pageContext.request.contextPath}/account/findAll" class="account_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/service/findAll" class="service_on"></a></li>
        <li><a href="../bill/bill_list.html" class="bill_off"></a></li>
        <li><a href="../report/report_list.html" class="report_off"></a></li>
        <li><a href="../user/user_info.html" class="information_off"></a></li>
        <li><a href="../user/user_modi_pwd.html" class="password_off"></a></li>
    </ul>
</div>
<!--导航区域结束-->
<!--主要区域开始-->
<div id="main">
    <form action="${pageContext.request.contextPath}/service/findAllByPage" method="post">
        <input id="pageCode" name="pageCode" type="hidden" value="1">
        <!--查询-->
        <div class="search_add">
            <div>OS 账号：<input type="text" value="" class="width100 text_search" /></div>
            <div>服务器 IP：<input type="text" value="" class="width100 text_search" /></div>
            <div>身份证：<input type="text"  value="" class="text_search" /></div>
            <div>状态：
                <select class="select_search">
                    <option>全部</option>
                    <option>开通</option>
                    <option>暂停</option>
                    <option>删除</option>
                </select>
            </div>
            <div><input type="button" value="搜索" class="btn_search" /></div>
            <input type="button" value="增加" class="btn_add" onclick="location.href='${pageContext.request.contextPath}/service/toInsert';" />
        </div>
        <!--删除的操作提示-->
        <div id="operate_result_info" class="operate_success">
            <img src="../images/close.png" onclick="this.parentNode.style.display='none';" />
            删除成功！
        </div>
        <!--数据区域：用表格展示数据-->
        <div id="data">
            <table id="datalist">
                <tr>
                    <th class="width50">业务ID</th>
                    <th class="width70">账务账号ID</th>
                    <th class="width150">身份证</th>
                    <th class="width70">姓名</th>
                    <th>OS 账号</th>
                    <th class="width50">状态</th>
                    <th class="width100">服务器 IP</th>
                    <th class="width100">资费</th>
                    <th class="width200"></th>
                </tr>
            <c:forEach items="${servicePageBean.data}" var="service">
                    <tr>
                        <td><a href="service_detail.html" title="查看明细">${service.serviceId}</a></td>
                        <td>${service.accountId}</td>
                        <td>${service.account.idcardNo}</td>
                        <td>${service.account.realName}</td>
                        <td>${service.osUsername}</td>
                        <td>
                            <c:if test="${service.status==1}">暂停</c:if>
                            <c:if test="${service.status==0}">开通</c:if>
                        </td>
                        <td>${service.unixHost}</td>
                        <td>
                            <a class="summary"  onmouseover="showDetail(true,this);" onmouseout="showDetail(false,this);">${service.cost.name}</a>
                            <!--浮动的详细信息-->
                            <div class="detail_info">
                                    ${service.cost.descr}
                            </div>
                        </td>
                        <td class="td_modi">
                            <c:choose >
                                <c:when test="${service.status==0}">
                                    <input type="button" value="暂停" class="btn_start" onclick="pause_State(${service.serviceId});" />
                                    <input type="button" value="修改" class="btn_modify"
                                           onclick="location.href='${pageContext.request.contextPath}/service/toUpdate?serviceId=${service.serviceId}';" />
                                    <input type="button" value="删除" class="btn_delete" onclick="deleteService(${service.serviceId});" />
                                </c:when>
                                <c:when test="${service.status==1}">
                                    <input type="button" value="开通" class="btn_start" onclick="start_State(${service.serviceId});" />
                                    <input type="button" value="修改" class="btn_modify"
                                           onclick="location.href='${pageContext.request.contextPath}/service/toUpdate?serviceId=${service.serviceId}';" />
                                    <input type="button" value="删除" class="btn_delete" onclick="deleteService(${service.serviceId});" />
                                </c:when>
                            </c:choose>
                        </td>
                    </tr>
                </c:forEach>

            </table>
            <p>业务说明：<br />
                1、创建即开通，记载创建时间；<br />
                2、暂停后，记载暂停时间；<br />
                3、重新开通后，删除暂停时间；<br />
                4、删除后，记载删除时间，标示为删除，不能再开通、修改、删除；<br />
                5、业务账号不设计修改密码功能，由用户自服务功能实现；<br />
                6、暂停和删除状态的账务账号下属的业务账号不能被开通。</p>
        </div>
        <!--分页-->
        <div id="pages">
            <span>第${servicePageBean.pageCode}/${servicePageBean.totalPages}页</span>
            <span>
   	<c:if test="${servicePageBean.pageCode>1}">
        <a href="#" onclick="showPage(1)">[首页]</a>
        <a href="#" onclick="showPage(${servicePageBean.pageCode}-1 )">[上一页]</a>
    </c:if>

      <c:forEach begin="${servicePageBean.start}" end="${servicePageBean.end}" var="num" step="1">
          <a href="#" class="current_page" onclick="showPage(${num})">${num}</a>
      </c:forEach>

	<c:if test="${servicePageBean.pageCode < servicePageBean.totalPages}">
        <a href="#" onclick="showPage(${servicePageBean.pageCode}+1 )">[下一页]</a>
        <a href="#" onclick="showPage(${servicePageBean.totalPages} )">[尾页]</a>
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
