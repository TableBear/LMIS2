<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TableBear
  Date: 2018/6/22
  Time: 2:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单操作</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="/LMIS2/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/LMIS2/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="/LMIS2/css/colorpicker.css" />
    <link rel="stylesheet" href="/LMIS2/css/datepicker.css" />
    <link rel="stylesheet" href="/LMIS2/css/uniform.css" />
    <link rel="stylesheet" href="/LMIS2/css/select2.css" />
    <link rel="stylesheet" href="/LMIS2/css/matrix-style.css" />
    <link rel="stylesheet" href="/LMIS2/css/matrix-media.css" />
    <link rel="stylesheet" href="/LMIS2/css/bootstrap-wysihtml5.css" />
    <link href="/LMIS2/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href='http://fonts.useso.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
    <script type="text/javascript" src="/LMIS2/js/jquery.min.js" ></script>
    <script type="text/javascript">
        function mysubmit(){
            $.ajax({
                type:"post",
                url:"${pageContext.request.contextPath}/changeOrderstatus.action",
                data:$('#formID').serialize(),
                async:true,
                success:function(){
                    alert("请求成功");
//						$("#myModal").css("display","none");
//						$("#myModal").css("aria-hidden","true");
//						alert(("#myModal").has("hide modal in"));
//						$("#myModal").removeClass("hide modal in");
                },
                beforeSend:function(){
//						alert("开始上传");
//						$("#myModal").css("display","block");
//						$("#myModal").css("aria-hidden","false");
//						$("#myModal").addClass("hide modal in");
                },
                error:function(){
//						$("#myModal").removeClass("hide modal in");
                    alert("请求失败");
                }
            });
        }
    </script>
</head>
<body>
<!--Header-part-->
<div id="header">
    <h1><a href="dashboard.html">后台管理</a></h1>
</div>
<!--close-Header-part-->

<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
    <ul class="nav">
        <li  class="dropdown" id="profile-messages" ><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user"></i>  <span class="text">Welcome User</span><b class="caret"></b></a>
            <ul class="dropdown-menu">
                <li><a href="#"><i class="icon-user"></i> My Profile</a></li>
                <li class="divider"></li>
                <li><a href="#"><i class="icon-check"></i> My Tasks</a></li>
                <li class="divider"></li>
                <li><a href="login.html"><i class="icon-key"></i> Log Out</a></li>
            </ul>
        </li>
        <li class="dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">Messages</span> <span class="label label-important">5</span> <b class="caret"></b></a>
            <ul class="dropdown-menu">
                <li><a class="sAdd" title="" href="#"><i class="icon-plus"></i> new message</a></li>
                <li class="divider"></li>
                <li><a class="sInbox" title="" href="#"><i class="icon-envelope"></i> inbox</a></li>
                <li class="divider"></li>
                <li><a class="sOutbox" title="" href="#"><i class="icon-arrow-up"></i> outbox</a></li>
                <li class="divider"></li>
                <li><a class="sTrash" title="" href="#"><i class="icon-trash"></i> trash</a></li>
            </ul>
        </li>
        <li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">Settings</span></a></li>
        <li class=""><a title="" href="login.html"><i class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
    </ul>
</div>

<!--start-top-serch-->
<div id="search">
    <input type="text" placeholder="Search here..."/>
    <button type="submit" class="tip-bottom" title="Search"><i class="icon-search icon-white"></i></button>
</div>
<!--close-top-serch-->
<div id="sidebar"> <a href="#" class="visible-phone"><i class="icon icon-th"></i>Tables</a>
    <ul>
        <li><a href="${pageContext.request.contextPath}/userManage.action"><i class="icon icon-signal"></i> <span>用户管理</span></a> </li>
        <li><a href="${pageContext.request.contextPath}/postmanManage.action"><i class="icon icon-inbox"></i> <span>配送员管理</span></a> </li>
        <li><a href="${pageContext.request.contextPath}/manageStations.action"><i class="icon icon-th"></i> <span>站点管理</span></a></li>
        <li class="active"><a href="${pageContext.request.contextPath}/oderOperate.action"><i class="icon icon-th"></i> <span>订单操作</span></a></li>
    </ul>
</div>
<div id="content">
    <div class="container-fluid" >
        <div class="row-fluid">
            <div class="span6">
                <div class="widget-box">
                    <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                        <h5>Personal-info</h5>
                    </div>
                    <div class="widget-content nopadding">
                        <form action="#" method="get" class="form-horizontal" id="formID">
                            <div class="control-group">
                                <label class="control-label">工号 :</label>
                                <div class="controls">
                                    <input required="required" type="text" name="postmanId" class="span6" placeholder="工号" />
                                    <!--<input type="checkbox" id="lookid"/>-->
                                </div>
                                <label class="control-label">网点编号 :</label>
                                <div class="controls">
                                    <input required="required" type="text" name="stationId" class="span6" placeholder="网点编号" />
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label">操作类型 :</label>
                                <div class="controls">
                                    <select name="operateType" class="span6">
                                        <option value="揽件">揽件</option>
                                        <option value="入库">入库</option>
                                        <option value="发出">发出</option>
                                        <option value="派送">派送</option>
                                    </select>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label">订单号:</label>
                                <div class="controls">
                                    <input required="required" type="text" name="id" class="span6" placeholder="点单号" />
                                </div>
                            </div>
                            <div class="form-actions">
                                <button type="button" class="btn btn-success" onclick="mysubmit()">录入</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <hr>
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span6">
                <div class="widget-box">
                    <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
                        <h5>订单数据</h5>
                    </div>
                    <div class="widget-content nopadding">
                        <table class="table table-bordered data-table">
                            <thead>
                            <tr>
                                <th>订单编号</th>
                                <th>操作员工</th>
                                <th>操作时间</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${orders}" var="orderStatu">
                                <tr>
                                    <td style="text-align:center;">${orderStatu.ordersid}</td>
                                    <td style="text-align:center;">${orderStatu.postmanid}</td>
                                    <td style="text-align:center;">${orderStatu.operatetime}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div id="myModal" class="modal hide">
    <div class="modal-header">
        <button data-dismiss="modal" class="close" type="button">×</button>
        <h3>正在上传</h3>
    </div>
    <div class="modal-body">
        <p>请稍等片刻</p>
    </div>
</div>
<script src="/LMIS2/js/jquery.min.js"></script>
<script src="/LMIS2/js/jquery.ui.custom.js"></script>
<script src="/LMIS2/js/bootstrap.min.js"></script>
<script src="/LMIS2/js/jquery.uniform.js"></script>
<script src="/LMIS2/js/select2.min.js"></script>
<script src="/LMIS2/js/jquery.dataTables.min.js"></script>
<script src="/LMIS2/js/matrix.js"></script>
<script src="/LMIS2/js/matrix.tables.js"></script>
<script type="text/javascript"/>
</body>
</html>

