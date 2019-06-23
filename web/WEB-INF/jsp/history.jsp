<%--
  Created by IntelliJ IDEA.
  User: TableBear
  Date: 2018/7/10
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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

    <link rel="stylesheet" href="/LMIS2/css/common.css" />
    <link rel="stylesheet" href="/LMIS2/css/goodnav.css" />
    <link rel="stylesheet" href="/LMIS2/css/index.css" />
    <link rel="stylesheet" href="/LMIS2/css/reset.css" />
    <script type="text/javascript" src="/js/jquery-3.3.1.min.js" ></script>
    <script type="text/javascript" src="/js/common.js" ></script>
    <link rel="stylesheet" href="/LMIS2/css/dcalendar.picker.css"/>
</head>
<body>
    <div class="head_bg">
        <div class="head clearfix">
        <div class="logo"><a href="http://www.17sucai.com/preview/396391/2016-05-18/zlog/index.html"><img src="/LMIS2/img/logo.png" alt=""></a></div>
        <div class="menu">
            <div class="head_top">
                <%
                    String name = (String) session.getAttribute("userName");
                    if (name!=null){
                        out.println("<a href=\"\">"+"你好！"+name+"</a>");
                        out.println("<a href=\""+request.getContextPath()+"/logout.action\">退出</a>");
                    }else{
                        out.println("<a href=\""+request.getContextPath()+"/toLogin.action\">登录</a>");
                        out.println("<a href=\""+request.getContextPath()+"/toRegister.action\">注册</a>");
                    }
                %>
                <a href="">设为首页</a>
                <a href="">加入收藏</a>
            </div>
            <ul class="clearfix">
                <li class="now"><a href="${pageContext.request.contextPath}/jsp/index.jsp">首页</a></li>
                <li><a href="${pageContext.request.contextPath}/jsp/index.jsp">我的物流</a></li>
                <li class="news"><a href="${pageContext.request.contextPath}/jsp/index.jsp">消息<span>12</span></a></li>
                <li><a href="${pageContext.request.contextPath}/jsp/index.jsp">网站地图</a></li>
                <li><a href="${pageContext.request.contextPath}/jsp/index.jsp">帮助与支持</a></li>
                <li><a href="${pageContext.request.contextPath}/jsp/index.jsp">关于找物流</a></li>
            </ul>
        </div>
    </div>
</div>
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span12">
                <div class="widget-box">
                    <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
                        <h5>订单数据</h5>
                    </div>
                    <div class="widget-content nopadding">
                        <table class="table table-bordered data-table">
                            <thead>
                            <tr>
                                <th>发货地点</th>
                                <th>收件地址</th>
                                <th>收件人姓名</th>
                            </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${orders}" var="order">
                                    <tr>
                                        <td style="text-align:center;">${order.origin}</td>
                                        <td style="text-align:center;">${order.destination}</td>
                                        <td style="text-align:center;">${order.receivername}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
