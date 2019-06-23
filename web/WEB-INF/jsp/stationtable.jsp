<%--
  Created by IntelliJ IDEA.
  User: TableBear
  Date: 2018/6/21
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>后台管理</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="css/uniform.css" />
    <link rel="stylesheet" href="css/select2.css" />
    <link rel="stylesheet" href="css/matrix-style.css" />
    <link rel="stylesheet" href="css/matrix-media.css" />
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href='http://fonts.useso.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'/>
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
        <%--<li><a href="index.html"><i class="icon icon-home"></i> <span>Dashboard</span></a> </li>--%>
        <li><a href="${pageContext.request.contextPath}/userManage.action"><i class="icon icon-signal"></i> <span>用户管理</span></a> </li>
        <li><a href="${pageContext.request.contextPath}/postmanManage.action"><i class="icon icon-inbox"></i> <span>配送员管理</span></a> </li>
        <li class="active"><a href="${pageContext.request.contextPath}/manageStations.action"><i class="icon icon-th"></i> <span>站点管理</span></a></li>
        <li><a href="${pageContext.request.contextPath}/oderOperate.action"><i class="icon icon-th"></i> <span>订单操作</span></a></li>
    </ul>
</div>

<!--sidebar-menu-->F
<div id="content">
    <div id="content-header">
        <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="current">Tables</a> </div>
        <%--<h1>站点数据</h1>--%>
    </div>
    <div class="span12"  style= "width: auto" >
        <div class="widget-box">
            <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
                <h5>站点数据表</h5>
                <span class="label label-info">Featured</span> </div>
            <div class="widget-content">
                <form action="${pageContext.request.contextPath}/deleteStation.action">
                <table class="table table-bordered data-table" >
                    <thead>
                    <tr>
                        <th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
                        <th style="width: 10%">站点编号</th>
                        <th style="width: 18%">站点名称</th>
                        <th style="width: 15%">站点联系方式</th>
                        <th style="width: 57%">站点详细地址</th>
                    </tr>
                    </thead>

                        <tbody>
                        <c:forEach items="${stations}" var="station" varStatus="s">
                            <tr>
                                <td style="text-align:center;" ><input type="checkbox" name="stationIds" value="${station.stationid}" /></td>
                                <td style="text-align:center;">${station.stationid}</td>
                                <td style="text-align:center;">${station.stationname}</td>
                                <td style="text-align:center;">${station.telephone}</td>
                                <td style="text-align:center;">${station.address}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    <input type="submit" class="btn btn-danger btn-large" value="删除" style="margin-top: 10px"/>
                </form>
            </div>
        </div>
    </div>
    <div class="row-fluid" style="margin: 0 auto;width: 490px">
        <div class="span6" style="margin: 0 auto;width: 490px">
            <div class="widget-box">
                <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                    <h5>录入站点</h5>
                </div>
                <div class="widget-content nopadding">
                    <form action="${pageContext.request.contextPath}/saveStatio.action" method="post" class="form-horizontal">
                        <div class="control-group">
                            <label class="control-label">站点名称</label>
                            <div class="controls">
                                <input required="required" type="text" class="span11" name="stationName" placeholder="站点名称" />
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">所在省份</label>
                            <div class="controls">
                                <select class="span11" id="province" name="province" onchange="proChange()">
                                    <option>请选择</option>
                                </select>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">所在城市</label>
                            <div class="controls">
                                <select class="span11" class="span11" id="city" name="city" onchange="citChange()">
                                    <option>请选择</option>
                                </select>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">所在区县</label>
                            <div class="controls">
                                <select class="span11" id="county" name="county">
                                    <option>请选择</option>
                                </select>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">联系电话</label>
                            <div class="controls">
                                <input required="required" type="text" class="span11" name="telephone" placeholder="联系电话" />
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">详细地址</label>
                            <div class="controls">
                                <input required="required" type="text" class="span11" name="address" id="address" placeholder="精确到门牌号码" onblur="myblur()" />
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">GPS坐标</label>
                            <div class="controls">
                                <input required="required" type="text" class="span11" name="point" placeholder="经度，纬度(以，隔开)" id="point" />
                            </div>
                        </div>
                        <div class="form-actions">
                            <button type="submit" class="btn btn-success">保存</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!--Footer-part-->
</div>
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
    <script type="text/javascript">
        $.getJSON("${pageContext.request.contextPath}/getAllProvince.action",
            function(result) {
                var objPro1 = document.getElementById("province");
                objPro1.length = 1;
                for(var i=0;i<result.length;i++) {
                    objPro1[i+1] = new Option(result[i].provincesname.toString().trim().substring(0,2),result[i].provincecode);
                    console.log(i+":"+result[i].provincesname);
                }
            });
        function proChange(){
            var objPro = document.getElementById("province");
            var index = objPro.selectedIndex;
            $.getJSON("${pageContext.request.contextPath}/getAllCity.action?proCode="+objPro[index].value,
                function(result) {
                    var objCity = document.getElementById("city");
                    objCity.length = 1;
                    for(var i=0;i<result.length;i++) {
                        objCity[i+1] = new Option(result[i].cityname.toString().trim().substring(0,2),result[i].citycode);
                        console.log(i+":"+result[i].cityname);
                    }
//                    objCity.selectedIndex=1;
                });
        }
        function citChange(){
            var objCity = document.getElementById("city");
            var index = objCity.selectedIndex;
            console.log(objCity[index].value);
            $.getJSON("${pageContext.request.contextPath}/getAllCounty.action?citCode="+objCity[index].value,
                function(result) {
                    var objCot = document.getElementById("county");
                    objCot.length = 1;
                    for(var i=0;i<result.length;i++) {
                        objCot[i+1] = new Option(result[i].countyname.toString().trim().substring(0,2),result[i].countycode);
                        console.log(i+":"+result[i].countyname);
                    }
//                    objCot.selectedIndex=1;
                });
        }
    </script>
    <!--
    作者：2390445347@qq.com
    时间：2018-06-22
    描述：调用百度地图api计算距离
    -->
    <script type="text/javascript" src="http://api.map.baidu.com/api?key=&v=1.4&services=true"></script>
    <script type="text/javascript">
        function myblur(){
            var varlur = $("#address").val();
            var myGeo = new BMap.Geocoder();
            myGeo.getPoint(varlur,
                function(point) {
                    if (point) {
                        $("#point").val(point.lng+","+point.lat);
                    } else {
                        alert("您选择地址没有解析到结果!");
                    }
                },
                "上海市");
        }
</script>
</body>

</html>

