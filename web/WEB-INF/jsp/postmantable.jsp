<%--
  Created by IntelliJ IDEA.
  User: TableBear
  Date: 2018/6/21
  Time: 3:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Matrix Admin</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="css/uniform.css" />
    <link rel="stylesheet" href="css/select2.css" />
    <link rel="stylesheet" href="css/matrix-style.css" />
    <link rel="stylesheet" href="css/matrix-media.css" />
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href='http://fonts.useso.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
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

<!--sidebar-menu-->

<div id="sidebar"> <a href="#" class="visible-phone"><i class="icon icon-th"></i>Tables</a>
    <ul>
        <%--<li><a href="index.html"><i class="icon icon-home"></i> <span>Dashboard</span></a> </li>--%>
        <li><a href="${pageContext.request.contextPath}/userManage.action"><i class="icon icon-signal"></i> <span>用户管理</span></a> </li>
        <li class="active"><a href="${pageContext.request.contextPath}/postmanManage.action"><i class="icon icon-inbox"></i> <span>配送员管理</span></a> </li>
        <li><a href="${pageContext.request.contextPath}/manageStations.action"><i class="icon icon-th"></i> <span>站点管理</span></a></li>
        <li><a href="${pageContext.request.contextPath}/oderOperate.action"><i class="icon icon-th"></i> <span>订单操作</span></a></li>
    </ul>
</div>
<div id="content">
    <div id="content-header">
        <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="current">Tables</a> </div>
        <h1>配送员表</h1>
    </div>
    <div class="container-fluid">
        <hr>
        <div class="row-fluid">
            <div class="span12">
                <div class="widget-box">
                    <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
                        <h5>配送员数据</h5>
                    </div>
                    <div class="widget-content nopadding">
                        <table class="table table-bordered data-table">
                            <thead>
                            <tr>
                                <th>员工编号</th>
                                <th>员工姓名</th>
                                <th>手机号码</th>
                            </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${postmans}" var="postman">
                                    <tr>
                                    <td style="text-align:center;">${postman.postmanid}</td>
                                    <td style="text-align:center;">${postman.name}</td>
                                    <td style="text-align:center;">${postman.telephon}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="container-fluid"><hr>
                    <div class="row-fluid">
                        <div class="span12">
                            <div class="widget-box">
                                <div class="widget-title"> <span class="icon"> <i class="icon-info-sign"></i> </span>
                                    <h5></h5>
                                </div>
                                <div class="widget-content nopadding">
                                    <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/savePostman.action" name="basic_validate" id="basic_validate" novalidate="novalidate">
                                        <div class="control-group">
                                            <label class="control-label">姓名：</label>
                                            <div class="controls">
                                                <input required="required" type="text" name="name" id="required">
                                            </div>
                                        </div>
                                        <div class="control-group">
                                            <label class="control-label">手机号码：</label>
                                            <div class="controls">
                                                <input required="required" type="tel" name="telephone" id="required" >
                                            </div>
                                        </div>
                                        <div class="form-actions">
                                            <input type="submit" value="提交" class="btn btn-success">
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--Footer-part-->
    <div class="row-fluid">
        <div id="footer" class="span12"> 2013 &copy; TableBear Admin.<a href="#" target="_blank" title=""></a> - Collect from <a href="" title="" target="_blank"></a> </div>
    </div>
    <!--end-Footer-part-->
    <script src="/LMIS2/js/jquery.min.js"></script>
    <script src="/LMIS2/js/jquery.ui.custom.js"></script>
    <script src="/LMIS2/js/bootstrap.min.js"></script>
    <script src="/LMIS2/js/jquery.uniform.js"></script>
    <script src="/LMIS2/js/select2.min.js"></script>
    <script src="/LMIS2/js/jquery.dataTables.min.js"></script>
    <script src="/LMIS2/js/matrix.js"></script>
    <script src="/LMIS2/js/matrix.tables.js"></script>
    <script src="/LMIS2/js/jquery.validate.js"></script>
    <script src="/LMIS2/js/matrix.js"></script>
    <script src="/LMIS2/js/matrix.form_validation.js"></script>
</body>
</html>

