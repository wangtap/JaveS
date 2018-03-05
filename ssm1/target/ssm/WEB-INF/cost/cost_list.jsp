<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/2/6
  Time: 下午2:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>

    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global.css" />
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global_color.css" />
    <script language="javascript" type="text/javascript">
        //排序按钮的点击事件
        function sort(btnObj) {
            if (btnObj.className == "sort_desc"){
                btnObj.className = "sort_asc";
                document.getElementById("s").value="ASC";
                document.getElementById("column1").value=  btnObj.value;
                document.forms[0].submit();
            }

            else
                btnObj.className = "sort_desc";
            document.getElementById("s").value="DESC";
            document.getElementById("column1").value=  btnObj.value;
            document.forms[0].submit();
        }

        //启用
        function startFee() {
            var r = window.confirm("确定要启用此资费吗？资费启用后将不能修改和删除。");
            document.getElementById("operate_result_info").style.display = "block";
        }
        //删除
        function deleteFee(id) {
            var r = window.confirm("确定要删除此资费吗？");
            if(r){
                location.href='${pageContext.request.contextPath}/cost/delete?id='+id;
            document.getElementById("operate_result_info").style.display = "block";
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
        <li><a href="${pageContext.request.contextPath}/cost/findAll" class="fee_on"></a></li>
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
    <form action="${pageContext.request.contextPath}/cost/findAllByPage" method="post">
        <input id="pageCode" name="pageCode" type="hidden" value="1">

        <!--排序-->
        <div class="search_add">
            <div>
                <!--<input type="button" value="月租" class="sort_asc" onclick="sort(this);" />-->
                <input   type="button" value="基费" class="sort_asc" onclick="sort(this);" />
                <input  type="button" value="时长" class="sort_asc" onclick="sort(this);" />
                <input id="s" name="s" type="hidden" value="">
                <input id="column1" name="column1" type="hidden" value="">
            </div>
            <input type="button" value="增加" class="btn_add" onclick="location.href='${pageContext.request.contextPath}/cost/toInsert';" />
        </div>
        <!--启用操作的操作提示-->
        <div id="operate_result_info" class="operate_success">
            <img src="images/close.png" onclick="this.parentNode.style.display='none';" />
            删除成功！
        </div>
        <!--数据区域：用表格展示数据-->
        <div id="data">
            <table id="datalist">
                <tr>
                    <th>资费ID</th>
                    <th class="width100">资费名称</th>
                    <th>基本时长</th>
                    <th>基本费用</th>
                    <th>单位费用</th>
                    <th>创建时间</th>
                    <th>开通时间</th>
                    <th class="width50">状态</th>
                    <th class="width200"></th>
                </tr>
                <c:forEach items="${costPageBean.data}" var="cost">
                    <tr>
                        <td>${cost.id}</td>
                        <td><a href="fee_detail.html">${cost.name}</a></td>
                        <td>${cost.baseDuration} 小时</td>
                        <td>${cost.baseCost} 元</td>
                        <td>${cost.unitCost} 元/小时</td>
                        <td><fmt:formatDate value="${cost.creatime}" /></td>
                        <td><fmt:formatDate value="${cost.startime}" /></td>
                        <td>${cost.status}</td>
                        <td>
                            <input type="button" value="启用" class="btn_start" onclick="startFee();" />
                            <input type="button" value="修改" class="btn_modify" onclick="location.href='${pageContext.request.contextPath}/cost/toUpdate?id=${cost.id}';" />
                            <input type="button" value="删除" class="btn_delete" onclick="deleteFee(${cost.id});" />
                        </td>
                    </tr>
                </c:forEach>
                     </table>
            <p>业务说明：<br />
                1、创建资费时，状态为暂停，记载创建时间；<br />
                2、暂停状态下，可修改，可删除；<br />
                3、开通后，记载开通时间，且开通后不能修改、不能再停用、也不能删除；<br />
                4、业务账号修改资费时，在下月底统一触发，修改其关联的资费ID（此触发动作由程序处理）
            </p>
        </div>
        <!--分页-->
        <div id="pages">
            <span>第${costPageBean.pageCode}/${costPageBean.totalPages}页</span>
            <span>
   	<c:if test="${costPageBean.pageCode>1}">
        <a href="#" onclick="showPage(1)">[首页]</a>
        <a href="#" onclick="showPage(${costPageBean.pageCode}-1 )">[上一页]</a>
    </c:if>

      <c:forEach begin="${costPageBean.start}" end="${costPageBean.end}" var="num" step="1">
          <a href="#" class="current_page" onclick="showPage(${num})">${num}</a>
      </c:forEach>

	<c:if test="${costPageBean.pageCode < costPageBean.totalPages}">
        <a href="#" onclick="showPage(${costPageBean.pageCode}+1 )">[下一页]</a>
        <a href="#" onclick="showPage(${costPageBean.totalPages} )">[尾页]</a>
    </c:if>
</span>
        </div>
    </form>
</div>
<!--主要区域结束-->
<div id="footer">
    <p>[源自北美的技术，最优秀的师资，最真实的企业环境，最适用的实战项目]</p>
    <p>版权所有(C)云科技有限公司</p>
</div>
</body>
<script type="text/javascript">
    function showPage(num) {
        document.getElementById("pageCode").value=num;
        document.forms[0].submit();
    }
</script>
</html>
