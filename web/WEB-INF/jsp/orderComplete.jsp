<%--
  Created by IntelliJ IDEA.
  User: TableBear
  Date: 2018/6/22
  Time: 1:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>物流信息</title>
    <link rel="stylesheet" href="/LMIS2/css/common.css" />
    <link rel="stylesheet" href="/LMIS2/css/goodnav.css" />
    <link rel="stylesheet" href="/LMIS2/css/index.css" />
    <link rel="stylesheet" href="/LMIS2/css/reset.css" />
    <style>
        ul,li{ padding:0; margin:0; list-style:none; font-family:tahoma,arial,'Hiragino Sans GB','\5b8b\4f53',sans-serif}
        .box-main{ margin:0 auto; width:800px; padding:10px;border:1px solid #e8e8e8}
        .box-main h3.title{ height:40px; font-size:18px; line-height:40px; text-indent:18px; color:#1c81e5; text-align:left; background:#F7F7F7; margin-bottom:18px}
        .orderid{text-indent: 18px;}
        .package-box{overflow:hidden; margin:0 auto;width:780px;}
        .package-box:before{content:" ";background-color:#fff;display:block;position:absolute;top:-4px;left:20px;width:10px;height:4px}
        .package-box .supply{margin-top:20px;padding-right:10px;border-top:1px solid #e8e8e8;line-height:28px;color:#959595;text-align:right}
        .package-detail{margin:-9px 0 0 12px;padding:0 0 0 10px;list-style:none;line-height:30px;font-size:16px; overflow:hidden}
        .package-detail li{border-left:1px solid #d9d9d9}
        .package-detail li:before{content:'';border:3px solid #fff;background:#d9d9d9;display:inline-block;width:5px;height:5px;border-radius:5px;margin-left:-9px;margin-right:10px}
        .package-detail .date{font-weight:700;margin-right:8px;font-family:arial;display:inline-block}
        .package-detail .text{width:580px;display:inline-block;vertical-align:text-top;line-height:1.5em}
        .package-detail .latest:before{background:#fe4300;border-color:#f8e9e4}
    </style>
</head>
<body>
<div class="head_bg">
    <div class="head clearfix">
        <div class="logo"><a href=""><img src="/LMIS2/img/logo.png" alt=""></a></div>
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
                <li class="now"><a href="${pageContext.request.contextPath}">首页</a></li>
                <li><a href="">我的物流</a></li>
                <li class="news"><a href="${pageContext.request.contextPath}">消息<span>12</span></a></li>
                <li><a href="${pageContext.request.contextPath}">网站地图</a></li>
                <li><a href="${pageContext.request.contextPath}">帮助与支持</a></li>
                <li><a href="${pageContext.request.contextPath}">关于找物流</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="box-main">
    <h3 class="title"><span>下单成功</span></h3>
    <p class="title" style="text-align: left;margin-bottom: 1em;padding-left: 20px">您的订单编号为：${orderId}</p>
    <div class="package-box">
        <p>扫描二维码了解物流详情</p>
        <img src="https://api.qrserver.com/v1/create-qr-code/?size=100x100&data=${pageContext.request.contextPath}/getOrderstatus.action?orderId=${orderId}" alt="二维码"/>
    </div>
</div>
</body>
</html>

