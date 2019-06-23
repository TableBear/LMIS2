<!--User: TableBear
Date: 2018/6/17
Time: 23:27
To change this template use File | Settings | File Templates.-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <title>首页</title>
  <link rel="stylesheet" href="../css/common.css" />
  <link rel="stylesheet" href="../css/goodnav.css" />
  <link rel="stylesheet" href="../css/index.css" />
  <link rel="stylesheet" href="../css/reset.css" />
  <script src="../js/jquery-3.3.1.min.js"></script>
  <script type="text/javascript" src="http://api.map.baidu.com/api?key=&v=1.1&services=true"></script>
  <script type="text/javascript">
      $(function(){
          $("#tab1").css("display","block");
          $("#1").mouseenter(function(){
              $('#1').css("background-color","#007AFF");
          });
          $("#1").mouseout(function(){
              $('#1').css("background-color","");
          });
          $("#2").mouseenter(function(){
              $('#2').css("background-color","#007AFF");
          });
          $("#2").mouseout(function(){
              $('#2').css("background-color","");
          });
          $("#3").mouseenter(function(){
              $('#3').css("background-color","#007AFF")
          });
          $("#3").mouseout(function(){
              $('#3').css("background-color","");
          });
          $("#4").mouseenter(function(){
              $('#4').css("background-color","#007AFF");
          });
          $("#4").mouseout(function(){
              $('#4').css("background-color","");
          });
          $("#a1").css("display","block");
          $("#1").click(function(){
              $("#tab1").css("display","block");
              $("#tab2").css("display","none");
              $("#tab3").css("display","none");
              $("#tab4").css("display","none");
              $("#dituContent").css("display","none");
          });
          $("#2").click(function(){
              $("#tab2").css("display","block");
              $("#tab1").css("display","none");
              $("#tab3").css("display","none");
              $("#tab4").css("display","none");
              $("#dituContent").css("display","none");
          });
          $("#3").click(function(){
              $("#tab3").css("display","block");
              $("#tab1").css("display","none");
              $("#tab2").css("display","none");
              $("#tab4").css("display","none");
              $("#dituContent").css("display","block");
          });
          $("#4").click(function(){
              $("#tab4").css("display","block");
              $("#tab1").css("display","none");
              $("#tab3").css("display","none");
              $("#tab2").css("display","none");
              $("#dituContent").css("display","none");
          });
      });
      function aclick() {
//          alert("click");
          var value = $("#orderid").val();
//          alert(value);
          if (value!==null){
              var myurl = "${pageContext.request.contextPath}/getOrderstatus.action?orderId="+value;
              window.location = myurl;
          }
      }
      function searchStation (name) {
          var value = $("#station_name").val();
          $.getJSON("${pageContext.request.contextPath}/getStation.action?name="+value,function(resule){
              var p0 = resule.point.split(",")[0];
              var p1 = resule.point.split(",")[1];
              var point = new BMap.Point(p0,p1);
              map.centerAndZoom(point, 15);
          });
      }
  </script>
</head>
<body>
<div class="head_bg">
  <div class="head clearfix">
    <div class="logo"><a href=""><img src="../img/logo.png" alt=""></a></div>
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
        <%--<a href="${pageContext.request.contextPath}/toLogin.action">登录</a>--%>
        <%--<a href="${pageContext.request.contextPath}/toLogin.action">注册</a>--%>
        <a href="">设为首页</a>
        <a href="">加入收藏</a>
      </div>
      <ul class="clearfix">
        <li class="now"><a href="">首页</a></li>
        <li><a href="${pageContext.request.contextPath}/orderHistory.action">我的物流</a></li>
        <li class="news"><a href="">消息<span>12</span></a></li>
        <li><a href="">网站地图</a></li>
        <li><a href="">帮助与支持</a></li>
        <li><a href="">关于找物流</a></li>
      </ul>
    </div>
  </div>
</div>

<!--中间部分-->
<!--盒子1-->
<div class="box_1 clearfix">
  <div class="box_1_l">
    <a href="${pageContext.request.contextPath}/createOrder.action">网上下单<img src="../img/icon2.png"></a>
    <a href="" class="a_2">承运商申请<img src="../img/icon2.png"></a>
  </div>
  <div class="banner">
    <!-- 代码 开始 -->
    <div id="hotpic">
      <div id="NewsPic">
        <a target="_blank" href="" style="visibility: hidden; display: none;">
          <img src="../img/banner.jpg" class="Picture" alt=""></a>
        <a style="visibility: hidden; display: none;" target="_blank" href="">
          <img src="../img/banner.jpg" class="Picture" alt=""></a>
        <a style="visibility: visible; display: block;" target="_blank" href="">
          <img src="../img/banner.jpg" class="Picture" alt=""></a>
        <a style="visibility: hidden; display: none;" target="_blank" href="">
          <img src="../img/banner.jpg" class="Picture" alt=""></a>
        <a style="visibility: hidden; display: none;" target="_blank" href="">
          <img src="../img/banner.jpg" class="Picture" alt=""></a>
        <a style="visibility: hidden; display: none;" target="_blank" href="">
          <img src="../img/banner.jpg" class="Picture" alt=""></a>
        <div class="Nav">
          <span class="Normal">6</span>
          <span class="Normal">5</span>
          <span class="Normal">4</span>
          <span class="Cur">3</span>
          <span class="Normal">2</span>
          <span class="Normal">1</span>
        </div>
      </div>
    </div>
    <script type="text/javascript">
        $('#hotpic').liteNav(5000);
    </script>
    <!-- 代码 结束 -->
  </div>
</div>
<!--盒子1-->
<div class="space_hx">&nbsp;</div>
<!--盒子2-->
<div class="box_2">
  <div class="tabBox_t">
    <div class="tabBox" id="tabBox">
      <ul class="tabNav">
        <li id="1">综合</li>
        <li id="2">运费查询</li>
        <li id="3">网点查询</li>
        <li id="4">货物追踪</li>
      </ul>
      <form action="" method="post">
        <div class="tabCont" id="tab1">
          <div class="ctn">
            <input name="" type="text" placeholder="请输入关键字">
            <a href="">搜索</a>
          </div>
        </div>
        <div class="tabCont" id="tab2">
          <div class="ctn">
            <span>发货城市</span>
            <input name="" type="text" placeholder="请输入城市名（中文/拼音）">
            <span>到达城市</span>
            <input name="" type="text" placeholder="请输入城市名（中文/拼音）">
            <a href="">搜索比价</a>
          </div>
        </div>
        <div class="tabCont" id="tab3">
          <div class="ctn">
            <label for="station_name">网点查询</label>
            <input name="" type="text" id="station_name" placeholder="请输入网点名称">
            <a href="javascript:void(0);" onclick="searchStation()">搜索</a>
          </div>
        </div>
        <div class="tabCont" id="tab4">
          <div class="ctn">
            <label for="orderid">订单号</label>
              <input required="required" id="orderid" name="orderid" type="text" placeholder="请输入订单号" >
            <a href="javascript:void(0);" onclick="aclick()">搜索</a>
          </div>
        </div>
      </form>
    </div>

  </div>
</div>
<!--百度地图容器-->
<div style="width:960px;height:550px;border:#ccc solid 1px;clear: both;margin: 0 auto;display: none;" id="dituContent"></div>
<!--盒子2-->
<div class="space_hx">&nbsp;</div>
<!--盒子3-->
<div class="box_3 clearfix">
  <div class="box_3_l">
    <div class="box_head">
      <span>订单信息</span>
      <a href=""><img src="../mg/more.png"></a>
    </div>
    <ul>
      <li>
        <a href="">
          <span>东莞</span>
          <img src="../mg/icon15.png">
          <span>重庆</span>
        </a>
        <em>2014-04-13</em>
      </li>
      <li>
        <a href="">
          <span>东莞</span>
          <img src="../mg/icon15.png">
          <span>重庆</span>
        </a>
        <em>2014-04-13</em>
      </li>
      <li>
        <a href="">
          <span>东莞</span>
          <img src="../mg/icon15.png">
          <span>重庆</span>
        </a>
        <em>2014-04-13</em>
      </li>
      <li>
        <a href="">
          <span>东莞</span>
          <img src="../mg/icon15.png">
          <span>重庆</span>
        </a>
        <em>2014-04-13</em>
      </li>
      <li>
        <a href="">
          <span>东莞</span>
          <img src="../mg/icon15.png">
          <span>重庆</span>
        </a>
        <em>2014-04-13</em>
      </li>
      <li>
        <a href="">
          <span>东莞</span>
          <img src="../img/icon15.png">
          <span>重庆</span>
        </a>
        <em>2014-04-13</em>
      </li>
      <li>
        <a href="">
          <span>东莞</span>
          <img src="../img/icon15.png">
          <span>重庆</span>
        </a>
        <em>2014-04-13</em>
      </li>
    </ul>
  </div>
  <div class="box_3_r">
    <div class="box_head">
      <span>活动信息</span>
      <a href=""><img src="../img/more.png"></a>
    </div>
    <!--开始-->
    <div class="box16 clearfix">
      <ul>
        <li>
          <span><a href="">2014清明节发货通知</a></span>
          <em>2014-04-15</em>
        </li>
        <li>
          <span><a href="">2014年外请合同车</a></span>
          <em>2014-04-15</em>
        </li>
        <li>
          <span><a href="">开展“打造和谐团队”主题培训</a></span>
          <em>2014-04-15</em>
        </li>
        <li>
          <span><a href="">召开2014年全网汽运工作会</a></span>
          <em>2014-04-15</em>
        </li>
        <li>
          <span><a href="">中国快递协会及各省（市）快递协会</a></span>
          <em>2014-04-15</em>
        </li>
        <li>
          <span><a href="">召开2014年全网汽运工作会</a></span>
          <em>2014-04-15</em>
        </li>
        <li>
          <span><a href="">开展“打造和谐团队”主题开展“打造和谐团队”主题</a></span>
          <em>2014-04-15</em>
        </li>
      </ul>
    </div>
    <!--结束-->
  </div>
</div>
<!--盒子3-->
<div class="space_hx">&nbsp;</div>
</div>
<!--底部-->
<div class="foot_bg">
  <div class="foot">
    <div class="foot_t">
      <a href="http://www.17sucai.com/preview/396391/2016-05-18/zlog/index.html">业务介绍</a>
      <a href="http://www.17sucai.com/preview/396391/2016-05-18/zlog/index.html">联系我们</a>
    </div>
    <div class="copy">
      Copyright©&nbsp;2012-2015&nbsp; 找物流有限责任公司.&nbsp;&nbsp;All&nbsp;&nbsp;rights&nbsp;&nbsp;reserved. &nbsp;&nbsp;粤ICP备10005645
    </div>
  </div>
</div>
<!--底部-->
</body>

<!--
	作者：2390445347@qq.com
	时间：2018-06-20
	描述：百度地图组件
-->
<script type="text/javascript">
    //创建和初始化地图函数：
    function initMap(){
        createMap();//创建地图
//      initPoint();
        getAllPoint();
        setMapEvent();//设置地图事件
        addMapControl();//向地图添加控件
        addMarker();//向地图中添加marker
    }

    //重新设置中心点坐标
    function initPoint(){
        $.ajax({
            url:'http://api.map.baidu.com/location/ip',//百度地图Url
            data:{
                coor:'bd09ll',
                ak:'ipN9TVoaFssSAgcVdWjsm9CvHPpZejGB',//apK应用密钥
            },
            type:'get',
            dataType:'jsonp',
            async:true,
            success:function(data){
//              alert("ok");
                var map = window.map;
                var point = new BMap.Point(data.content.point.x,data.content.point.y);
                map.centerAndZoom(new BMap.Point(data.content.point.x,data.content.point.y), 15);
                var icon = new BMap.Icon('img/gps2.png', new BMap.Size(25, 25), {//是引用图标的名字以及大小，注意大小要一样
//  				anchor: new BMap.Size(0, -400)//这句表示图片相对于所加的点的位置
                    offset: new BMap.Size(0, 0), // 指定定位位置
                    imageOffset: new BMap.Size(0, 0 ) // 设置图片偏移
                });
	            map.centerAndZoom(point, 15);
                var marker = new BMap.Marker(point,{icon:icon}); // 创建标注
                var label = new BMap.Label("你的新地点",{"offset":new BMap.Size(10,-20)});
                marker.setLabel(label);
                map.addOverlay(marker); // 将标注添加到地图中
                label.setStyle({
                    borderColor:"#808080",
                    color:"#333",
                    cursor:"pointer"});
                (function(){
                    var index = 1;
                    var _iw = new BMap.InfoWindow("<b class='iw_poi_title' title='" + "新位置" + "'>" + "新位置" + "</b><div class='iw_poi_content'>"+"您的新位置"+"</div>");;
                    var _marker = marker;
                    _marker.addEventListener("click",function(){
                        this.openInfoWindow(_iw);
                    });
                    _iw.addEventListener("open",function(){
                        _marker.getLabel().hide();
                    })
                    _iw.addEventListener("close",function(){
                        _marker.getLabel().show();
                    })
                    label.addEventListener("click",function(){
                        _marker.openInfoWindow(_iw);
                    })
                    //					if(!!json.isOpen){
                    label.hide();
                    _marker.openInfoWindow(_iw);
                    //					}
                })()
            },
            error:function(data){
                alert("错误无法加载地图"+JSON.stringify(data));
            }
        });
    }

    function getAllPoint(){
        $.getJSON("${pageContext.request.contextPath}/getStations.action",
            function(result) {
//                alert(result);
                console.log(result);
                markerArr = result;
                addMarker();
            });
    }

    //创建地图函数：
    function createMap(){
        var map = new BMap.Map("dituContent");//在百度地图容器中创建一个地图
        var point = new BMap.Point(113.271429,23.135336);//定义一个中心点坐标
        map.centerAndZoom(point,12);//设定地图的中心点和坐标并将地图显示在地图容器中
        window.map = map;//将map变量存储在全局
    }

    //地图事件设置函数：
    function setMapEvent(){
        map.enableDragging();//启用地图拖拽事件，默认启用(可不写)
        map.enableScrollWheelZoom();//启用地图滚轮放大缩小
        map.enableDoubleClickZoom();//启用鼠标双击放大，默认启用(可不写)
        map.enableKeyboard();//启用键盘上下左右键移动地图
    }

    //地图控件添加函数：
    function addMapControl(){
        //向地图中添加缩放控件
        var ctrl_nav = new BMap.NavigationControl({anchor:BMAP_ANCHOR_TOP_LEFT,type:BMAP_NAVIGATION_CONTROL_LARGE});
        map.addControl(ctrl_nav);
        //向地图中添加缩略图控件
        var ctrl_ove = new BMap.OverviewMapControl({anchor:BMAP_ANCHOR_TOP_RIGHT,isOpen:1});
        map.addControl(ctrl_ove);
        //向地图中添加比例尺控件
        var ctrl_sca = new BMap.ScaleControl({anchor:BMAP_ANCHOR_BOTTOM_RIGHT});
        map.addControl(ctrl_sca);
    }

    //标注点数组
    var markerArr = [{title:"您的位置",content:"您所处的位置",point:"113.268781,23.137435",isOpen:1,icon:{w:25,h:25,l:0,t:0,x:6,lb:5}}
    ];
    //创建marker
    function addMarker(){
        for(var i=0;i<markerArr.length;i++){
            console.log(i);
            var json = markerArr[i];
            console.log(markerArr[i]);
            var p0 = json.point.split(",")[0];
            var p1 = json.point.split(",")[1];
            var point = new BMap.Point(p0,p1);
            console.log(json.icon.w);
            var iconImg = createIcon(json.icon);
            var marker = new BMap.Marker(point,{icon:iconImg});
            var iw = createInfoWindow(i);
            var label = new BMap.Label(json.title,{"offset":new BMap.Size(json.icon.lb-json.icon.x+10,-20)});
            marker.setLabel(label);
            map.addOverlay(marker);
            label.setStyle({
                borderColor:"#808080",
                color:"#333",
                cursor:"pointer"
            });

            (function(){
                var index = i;
                var _iw = createInfoWindow(i);
                var _marker = marker;
                _marker.addEventListener("click",function(){
                    this.openInfoWindow(_iw);
                });
                _iw.addEventListener("open",function(){
                    _marker.getLabel().hide();
                })
                _iw.addEventListener("close",function(){
                    _marker.getLabel().show();
                })
                label.addEventListener("click",function(){
                    _marker.openInfoWindow(_iw);
                })
                if(json.isOpen){
                    label.hide();
                    _marker.openInfoWindow(_iw);
                }
            })()
        }
    }
    //创建InfoWindow
    function createInfoWindow(i){
        var json = markerArr[i];
        var iw = new BMap.InfoWindow("<b class='iw_poi_title' title='" + json.title + "'>" + json.title + "</b><div class='iw_poi_content'>"+json.content+"</div>");
        return iw;
    }
    //创建一个Icon
    function createIcon(json){
        var icon = new BMap.Icon("img/gps2.png", new BMap.Size(json.w,json.h),{imageOffset: new BMap.Size(-json.l,-json.t),infoWindowOffset:new BMap.Size(json.lb+5,1),offset:new BMap.Size(json.x,json.h)})
        return icon;
    }
    initMap();//创建和初始化地图
</script>
</html>
