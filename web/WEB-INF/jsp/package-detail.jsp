<%@ page import="com.hzx.service.OrdersMessage" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
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
        <div class="logo"><a href=""><img src="img/logo.png" alt=""></a></div>
        <div class="menu">
            <div class="head_top">
                <a href="${pageContext.request.contextPath}/toLogin.action">登录</a>
                <a href="${pageContext.request.contextPath}/toLogin.action">注册</a>
                <a href="">设为首页</a>
                <a href="">加入收藏</a>
            </div>
            <ul class="clearfix">
                <li class="now"><a href="">首页</a></li>
                <li><a href="">我的物流</a></li>
                <li class="news"><a href="">消息<span>12</span></a></li>
                <li><a href="">网站地图</a></li>
                <li><a href="">帮助与支持</a></li>
                <li><a href="">关于找物流</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="box-main">
    <h3 class="title"><span>物流跟踪信息</span></h3>
    <p class="title" style="text-align: left;margin-bottom: 1em;padding-left: 20px">订单编号：${orderId}</p>
    <div class="package-box">
        <ul  class="package-detail" style="">
            <%
                List<OrdersMessage> messages = (List<OrdersMessage>) request.getAttribute("messages");
                if (messages!=null){
                    for (int i=0;i<messages.size();i++){
                        if (i!=messages.size()-1){
                            out.print("<li><span class=\"date\">"+messages.get(i).getTime()+"</span>");
                            out.print("<span class=\"text\">["+messages.get(i).getCity()+"]"+messages.get(i).getStationName()+" "+messages.get(i).getOperateType()+"</span></li>");
                        }else {
                            out.print("<li class=\"latest\"><span class=\"date\">"+messages.get(i).getTime()+"</span>");
                            out.print("<span class=\"text\">["+messages.get(i).getCity()+"]"+messages.get(i).getStationName()+" "+messages.get(i).getOperateType()+"</span></li>");
                        }
                    }
                }else{
                    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
                    java.util.Date dateo = new java.util.Date();
                    String date = sdf.format(dateo);
                    out.print("<li class=\"latest\"><span class=\"date\">"+dateo.toString()+"</span>");
                    out.print("<span class=\"text\">"+"还没有物流信息"+"</span></li>");
                }
            %>
            <%--<c:forEach items="${messages}" var="itme" varStatus="index" end="last">--%>
                <%--&lt;%&ndash;<c:when test="${index}!=${messages.get(messages.size()-1)}">&ndash;%&gt;--%>
                    <%--<li><span class="date">${messages.getTime()}</span> <span class="text">+"["${messages.getCity()}"]"+</span></li>--%>
                <%--&lt;%&ndash;</c:when>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<c:otherwise>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<li><span class="latest">${messages.getTime()}</span> <span class="text">"[${messages.getCity()}]${messages.getStationName} ${messages.getOperateType()}"</span></li>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</c:otherwise>&ndash;%&gt;--%>
            <%--</c:forEach>--%>
            <%--<li><span class="date">2016-12-12 20:22:21</span> <span class="text">[深圳市]深圳平湖分部收件员 已揽件</span></li>--%>
            <%--<li><span class="date">2016-12-12 21:35:47</span> <span class="text">[深圳市]快件已到达 深圳平湖分部</span></li>--%>
            <%--<li><span class="date">2016-12-12 22:27:39</span> <span class="text">[深圳市]快件已到达 深圳转运中心</span></li>--%>
            <%--<li class="latest"><span class="date">2016-12-13 01:50:29</span> <span class="text">[深圳市]深圳转运中心 已发出</span></li>--%>
        </ul>
    </div>
</div>
</body>
</html>

