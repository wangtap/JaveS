<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/3/3
  Time: 10:16
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
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js">

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
        <li><a href="${pageContext.request.contextPath}/login/toIndex" class="off"></a></li>
        <li><a href="${pageContext.request.contextPath}/role_info/findAll" class="fee_off"></a></li>
        <li><a href="${pageContext.request.contextPath}/admin_info/findAll" class="admin_on"></a></li>
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
    <form action="${pageContext.request.contextPath}/admin_info/findAllByPage" method="post">
        <input id="pageCode" name="pageCode" type="hidden" value="1">

        <!--查询-->
        <div class="search_add">
            <div>
                模块：
                <select id="selModules" class="select_search">
                    <option>全部</option>
                    <option>角色管理</option>
                    <option>管理员管理</option>
                    <option>资费管理</option>
                    <option>账务账号</option>
                    <option>业务账号</option>
                    <option>账单管理</option>
                    <option>报表</option>
                </select>
            </div>
            <div>角色：<input type="text" value="" class="text_search width200" /></div>
            <div><input type="button" value="搜索" class="btn_search"/></div>
            <input type="button" value="密码重置" class="btn_add" onclick="resetPwd();" />
            <input type="button" value="增加" class="btn_add" onclick="location.href='${pageContext.request.contextPath}/admin_info/toInsert';" />
        </div>
        <!--删除和密码重置的操作提示-->
        <div id="operate_result_info" class="operate_fail">
            <img src="../images/close.png" onclick="this.parentNode.style.display='none';" />
            <span>密码初始化成功</span><!--密码重置失败！数据并发错误。-->
        </div>
        <!--数据区域：用表格展示数据-->
        <div id="data">
            <table id="datalist">
                <tr>
                    <th class="th_select_all">
                        <input type="checkbox" onclick="selectAdmins(this);" />
                        <span>全选</span>
                    </th>
                    <th>管理员ID</th>
                    <th>姓名</th>
                    <th>登录名</th>
                    <th>电话</th>
                    <th>电子邮件</th>
                    <th>授权日期</th>
                    <th class="width100">拥有角色</th>
                    <th></th>
                </tr>
                <c:forEach items="${admin_infoPageBean.data}" var="admin" >
                    <tr>
                        <td><input name="check_admin" id="check_admin" type="checkbox" /></td>
                        <td>${admin.adminId}</td>
                        <td>${admin.name}</td>
                        <td>${admin.adminCode}</td>
                        <td>${admin.telephone}</td>
                        <td>${admin.email}</td>
                        <td>${admin.enrolldate}</td>
                        <td>
                            <a class="summary"  onmouseover="showDetail(true,this);" onmouseout="showDetail(false,this);"><c:if test="${admin.roleIds.size() != 0}">${admin.roleIds.get(0)}</c:if></a>
                                <!--浮动的详细信息-->
                            <div class="detail_info">
                            <c:forEach items="${admin.roleIds}" var="name">
                                ${name.toString()}
                            </c:forEach>
                            </div>
                        </td>
                        <td class="td_modi">
                            <input type="button" value="修改" class="btn_modify" onclick="location.href='${pageContext.request.contextPath}/admin_info/toUpdate?adminId='+${admin.adminId};" />
                            <input type="button" value="删除" class="btn_delete" onclick="deleteAdmin(${admin.adminId});" />

                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <!--分页-->
          <div id="pages">
        <span>第${admin_infoPageBean.pageCode}/${admin_infoPageBean.totalPages}页</span>
        <span>
   	<c:if test="${admin_infoPageBean.pageCode>1}">
        <a href="#" onclick="showPage(1)">[首页]</a>
        <a href="#" onclick="showPage(${admin_infoPageBean.pageCode}-1 )">[上一页]</a>
    </c:if>

      <c:forEach begin="${admin_infoPageBean.start}" end="${admin_infoPageBean.end}" var="num" step="1">
          <a href="#" class="current_page" onclick="showPage(${num})">${num}</a>
      </c:forEach>

	<c:if test="${admin_infoPageBean.pageCode < admin_infoPageBean.totalPages}">
        <a href="#" onclick="showPage(${admin_infoPageBean.pageCode}+1 )">[下一页]</a>
        <a href="#" onclick="showPage(${admin_infoPageBean.totalPages} )">[尾页]</a>
    </c:if>
</span>
    </div>
    </form>
</div>
<!--主要区域结束-->
<div id="footer">
    <p>[源自北美的技术，最优秀的师资，最真实的企业环境，最适用的实战项目]</p>
    <span>版权所有(C)云科技有限公司 </span>
</div>
</body>
<script type="text/javascript">
    function showPage(num) {
        document.getElementById("pageCode").value=num;
        document.forms[0].submit();
    }
    //重置密码
    function resetPwd() {
        var checkObjs=$(":checkbox[name='check_admin']:checked");
        if(checkObjs.length==0){
            alert("请至少选择一个管理员")
            return;
        }
        var ids=new Array();
        for(var i=0;i<checkObjs.length;i++){
            var trObj=checkObjs.eq(i).parent().parent();
            var tdObk=trObj.children().eq(1);
            ids.push(tdObk.text());
        }
//            var ids = $("#idcard_no").val();
        $.ajax({
            url:"/admin_info/resetPassword",
            data:{"ids":ids.toString()},
            type:"POST",
            dataType:"json",
            success:success,})

        function success(allData) {
            $("#operate_msg").text(allData.message);
            $("#operate_result_info").show();
            setTimeout(function () {
                $("#operate_result_info").hide();
            },2000);
        }
    }

    //删除
    function deleteAdmin(id) {
        var r = window.confirm("确定要删除此管理员吗？");
        if(r){
        location.href='${pageContext.request.contextPath}/admin_info/delete?adminId='+id;
        document.getElementById("operate_result_info").style.display = "block";
        }
    }
    //显示角色详细信息
    function showDetail(flag, a) {
        var detailDiv = a.parentNode.getElementsByTagName("div")[0];
        if (flag) {
            detailDiv.style.display = "block";
        }
        else
            detailDiv.style.display = "none";
    }

    //全选
    function selectAdmins(inputObj) {
        var inputArray = document.getElementById("datalist").getElementsByTagName("input");
        for (var i = 1; i < inputArray.length; i++) {
            if (inputArray[i].type == "checkbox") {
                inputArray[i].checked = inputObj.checked;
            }
        }
    }
</script>
</html>
