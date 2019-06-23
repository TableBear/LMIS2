<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>下单</title>
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
		<script type="text/javascript">
			$(function(){
				$(".tabBox .tabNav li").click(function(){
					alert("ok");
					$(this).siblings("li").removeClass("now");
					$(this).addClass("now");
					$(this).parents(".tabBox").find(".tabCont").css("display","none");
					var i=$(this).index();
					$(this).parents(".tabBox").find(".tabCont:eq("+i+")").css("display","block");
				});
			})
		</script>
		<style type="text/css">
			#content {font-family: "times new roman" "宋体";font-size: 18px;}
			#content .form-control {
			    display: inline-block;
			    padding: 6px 12px;
			    font-size: 13px;
			    line-height: 1.5;
			    color: #333;
			    vertical-align: middle;
			    background-color: #fff;
			    background-image: none;
			    border: 1px solid #ccc;
			    border-radius: 0;
			    box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
			    -webkit-transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
			    transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
			}
			table tr td:nth-child(2){
        		text-align: left;
        	}
        	div.middle{
        		background-color:#FDF9EE;/*border:solid 1px #FCD8C3;*/height:35px;
        		border-bottom-color:3px solid #F2A506;
        		margin-top:3px;width:67%;margin: 0 auto;
        	}
		</style>
		<script type="text/javascript" src="/LMIS2/js/jquery-3.3.1.min.js"></script>
		<script type="text/javascript">
        	$(function(){
        		$.getJSON("${pageContext.request.contextPath}/getAllProvince.action",
	                function(result) {
		        		var objPro1 = document.getElementById("provinces1");
		        		var objPro2 = document.getElementById("provinces2");
		        		objPro1.length = 1;
		        		objPro2.length = 1;
		                for(var i=0;i<result.length;i++) {
		                objPro1[i+1] = new Option(result[i].provincesname.toString().trim().substring(0,2),result[i].provincecode);
		                objPro2[i+1] = new Option(result[i].provincesname.toString().trim().substring(0,2),result[i].provincecode);
		                console.log(i+":"+result[i].provincesname);
	                }
                });      
      		});
      		function proChange1(){
      			var objPro = document.getElementById("provinces1");
      			var index = objPro.selectedIndex;
//      			console.log(objPro[index].value);
      			$.getJSON("${pageContext.request.contextPath}/getAllCity.action?proCode="+objPro[index].value,
	                function(result) {
			        	var objCity = document.getElementById("citys1");
			        	objCity.length = 1;
		                for(var i=0;i<result.length;i++) {
			                objCity[i+1] = new Option(result[i].cityname.toString().trim().substring(0,2),result[i].citycode);
			                console.log(i+":"+result[i].cityname);
	               		}
                });
      		}
      		function proChange2(){
      			var objPro = document.getElementById("provinces2");
      			var index = objPro.selectedIndex;
//      			console.log(objPro[index].value);
      			$.getJSON("${pageContext.request.contextPath}/getAllCity.action?proCode="+objPro[index].value,
	                function(result) {
			        	var objCity = document.getElementById("citys2");
			        	objCity.length = 1;
		                for(var i=0;i<result.length;i++) {
			                objCity[i+1] = new Option(result[i].cityname.toString().trim().substring(0,2),result[i].citycode);
			                console.log(i+":"+result[i].cityname);
	               		}
                });
      		}
      		function citChange1(){
      			var objCity = document.getElementById("citys1");
      			var index = objCity.selectedIndex;
      			console.log(objCity[index].value);
      			$.getJSON("${pageContext.request.contextPath}/getAllCounty.action?citCode="+objCity[index].value,
	                function(result) {
			        	var objCot = document.getElementById("countrys1");
			        	objCot.length = 1;
		                for(var i=0;i<result.length;i++) {
			                objCot[i+1] = new Option(result[i].countyname.toString().trim().substring(0,2),result[i].countycode);
			                console.log(i+":"+result[i].countyname);
	               		}
                });
      		}
      		function citChange2(){
      			var objCity = document.getElementById("citys2");
      			var index = objCity.selectedIndex;
      			console.log(objCity[index].value);
      			$.getJSON("${pageContext.request.contextPath}/getAllCounty.action?citCode="+objCity[index].value,
	                function(result) {
			        	var objCot = document.getElementById("countrys2");
			        	objCot.length = 1;
		                for(var i=0;i<result.length;i++) {
			                objCot[i+1] = new Option(result[i].countyname.toString().trim().substring(0,2),result[i].countycode);
			                console.log(i+":"+result[i].countyname);
	               		}
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
            function myclick(){
                var calc = {
                    count: 0,
                    add: function() {
                        this.count++;
                    },
                    check: function() {
                        this.count--;
                        if (this.count === 0) {
                            transit.getResult(start, end);
                        }
                    }
                };
                calc.add();
                calc.add();
                var start = null;
                var end = null;
                var myGeo = new BMap.Geocoder();
                var address1 = $("#detailAdress1").val();
                var address2 = $("#detailAdress2").val();
                var city1CF1 = document.getElementById("citys1");
                var city1 = city1CF1.options[city1CF1.selectedIndex].innerHTML+"市";
                var city1CF2 = document.getElementById("citys2");
                var city2 = city1CF2.options[city1CF2.selectedIndex].innerHTML+"市";
                alert(city1);
				alert(city2);
                myGeo.getPoint(address1,
                    function(point) {
                        if (point) {
                            start = point;
                            calc.check();
                        } else {
                            alert("您选择地址没有解析到结果!");
                        }
                    }, city1);
                myGeo.getPoint(address2,
                    function(point) {
                        if (point) {
                            end = point;
                            calc.check();
                        } else {
                            alert("您选择地址没有解析到结果!");
                        }
                    }, city2);
                var transit = {
                    getResult: function(startPoint, endPoint) {
                        var transitInner = new BMap.DrivingRoute("北京", {
                            onSearchComplete: function(data) {
                                var plan = data.getPlan(0);
                                $("#postalFree").val(plan.getDistance(true));
//                                alert(plan.getDistance(true));
                                checkValueVlaid();
                                if($("#goodsize").val()<$("#goodweight").val()){
                                    var disc =  $("#postalFree").val();
                                    disc = disc.substring(0,disc.length-2);
//                                    alert("disc"+disc);
                                    var weight = $("#goodweight").val();
//                                    alert("weight"+weight);
                                    var free = disc*weight*1;
                                    $("#postalFree").val(free);
                                    alert("free"+free);
                                }else{
                                    var disc =  $("#postalFree").val();
                                    disc = disc.substring(0,disc.length-2);
//                                    alert("disc"+disc);
                                    var weight = $("#goodsize").val();
//                                    alert("weight"+weight);
                                    var free = disc*weight*1;
                                    $("#postalFree").val(free);
//                                    alert("free"+free);
                                }
//                                alert($("#postalFree").val());
                            },
                            onPolylinesSet: function() {
                                //setTimeout(function(){alert(output)},"1000");
                            }
                        });
                        transitInner.setPolicy(BMAP_DRIVING_POLICY_LEAST_DISTANCE);
                        transitInner.search(startPoint, endPoint);
                    }
                };
            }
            function mySubmit () {
//                alert("in");
                alert("您的费用为："+$("#postalFree").val()+" 我们的配送员会在上门取件时收取");
                $.ajax({
                    type:"post",
                    url:"${pageContext.request.contextPath}/createOrders.action",
                    async:true,
                    data:$("#myFrom").serialize(),
                    dataType:"json",
                    success:function(data){
                        alert("您的订单好为:"+data);
                        window.location.href="${pageContext.request.contextPath}/orderComplete.action?orderId="+data;
                    },
                    error:function(){
                        alert("错误");
                    }
                });
            }
		</script>
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
	<div id="content">

    		<form action="${pageContext.request.contextPath}/createOrders.action" method="post" id="myFrom" onsubmit="return checkValueVlaid();">
	    		<table style="margin: 0 auto;text-align: right;margin-top: 20px;">
	    			<tr>
	    				<td><label for="sendername">寄件人：</label></td>
	    				<td><input required="required" type="text" name="sendername" id="sendername" class="form-control"/></td>
	    			</tr>
	    			<tr>
	    				<td><label for="sendermobielephone">寄件人手机：</label></td>
	    				<td><input required="required" type="text" name="sendermobielephone" id="sendermobielephone" class="form-control" onblur="isMobileNo(this.value)" /></td>
	    			</tr>
	    			<tr>
	    				<td><label for="telNum_quhao1">寄件人固话：</label></td>
	    				<td>
		    				<input type="text" id="telNum_quhao1" class="form-control" name="telNum_quhao" placeholder="区号"    title="区号" style="width: 39px; color: rgb(136, 136, 136);"/>
		    				<span>-</span>
		      				<input type="text" id="telNum_tel1"   class="form-control" name="telNum_tel"   placeholder="电话号码" title="电话号码" style="width: 80px; color: rgb(136, 136, 136);"/>
		      				<span>-</span>
		      				<input type="text" id="telNum_fenji1" class="form-control" name="telNum_fenji" placeholder="分机"    title="分机" style="width: 39px; color: rgb(136, 136, 136);" />
	    				</td>
	    			</tr>
	    			<tr>
	    				<td>地址：</td>
	    				<td>
	    					<select id="provinces1" name="provinces" class="form-control" onchange="proChange1(this)">
	    						<option>请选择</option>
	    					</select>
	    					<span>省</span>
	    					<select id="citys1" name="citys" class="form-control" onchange="citChange1()">
	    						<option>请选择</option>
	    					</select>
	    					<span>市</span>
	    					<select id="countrys1" name="countrys" class="form-control">
	    						<option>请选择</option>
	    					</select>
	    					<span>县</span>
	    				</td>
	    				
	    			</tr>
	    			<tr>
	    				<td ><label for="detailAdress1">详细地址：</label></td>
	    				<td><input required="required" class="form-control" type="text" name="detailAdress1" id="detailAdress1"/></td>
	    			</tr>
	    			<tr>
	    				<td><label for="receivername">收件人：</label></td>
	    				<td ><input required="required" class="form-control" type="text" name="receivername" id="receivername" /></td>
	    			</tr>
	    			<tr>
	    				<td><label for="receivermobilephone">收件人手机：</label></td>
	    				<td><input pattern="[0-9]{11}" required="required" class="form-control" type="text" name="receivermobilephone" id="receivermobilephone" /></td>
	    			</tr>
	    			<tr>
	    				<td><label for="telNum_quhao2">收件人固话：</label></td>
	    				<td>
		    				<input class="form-control" type="text" id="telNum_quhao2" name="telNum_quhao" placeholder="区号"    title="区号" style="width: 40px; color: rgb(136, 136, 136);"/>
		    				<span>-</span>
		      				<input class="form-control" type="text" id="telNum_tel2"   name="telNum_tel"   placeholder="电话号码" title="电话号码" style="width: 80px; color: rgb(136, 136, 136);"/>
		      				<span>-</span>
		      				<input class="form-control" type="text" id="telNum_fenji2" name="telNum_fenji" placeholder="分机"    title="分机" style="width: 40px; color: rgb(136, 136, 136);" />
	    				</td>
	    			</tr>
	    			<tr>
	    				<td>地址：</td>
	    				<td >
	    					<select id="provinces2" name="provinces" class="form-control" onchange="proChange2()">
	    						<option>请选择</option>
	    					</select>
	    					<span>省</span>
	    					<select id="citys2" name="citys" class="form-control" onchange="citChange2()">
	    						<option>请选择</option>
	    					</select>
	    					<span>市</span>
	    					<select id="countrys2" name="countrys" class="form-control">
	    						<option>请选择</option>
	    					</select>
	    					<span>县</span>
	    				</td>
	    			</tr>
	    			<tr>
	    				<td><label for="detailAdress2">详细地址：</label></td>
	    				<td ><input required="required" type="text" name="detailAdress2" id="detailAdress2" class="form-control" /></td>
	    			</tr>
					<input type="text" name="origin" id="origin" style="display: none"/>
					<input type="text" name="requestdate" id="requestdate" style="display: none"/>
					<input type="text" name="sendertelephone" id="sendertelephone" style="display: none"/>
					<input type="text" name="receivertelephone" id="receivertelephone" style="display: none"/>
					<input type="text" name="destination" id="destination" style="display: none"/>
					<input type="text" name="goodsize" id="goodsize" style="display: none"/>
	    			<tr>
	    				<td><label for="mydatepicker2">选择预定日期：</label></td>
	    				<td><input required="required" id='mydatepicker2' type='tex' class="form-control"/></td>
	    			</tr>
	    		</table>
	    		<div class="box_1 clearfix" style="height: 40px;border-bottom:3px solid #F2A506;">
	    			<table>
	    				<td width=""><a>备注<img src="/LMIS2/img/show.png"/></a></td>
	    			</table>
				</div>
				<table width="80%" style="line-height: 30px;margin: 0 auto;margin-top: 20px;">
					<tr>
						<td align="right" width="20%">物品名称：</td>
						<td align="left"  width="30%">
							<input type="text" name="goodname" maxlength="100" value="" id="shipment.gooddesc" class="form-control" />
						</td>
						<td align="right" width="20%">类别：</td>
						<td align="left" width="30%" style="">
							<input type="radio" name="type" id="shipment.type1" checked="checked" value="1" style="vertical-align: middle;width:20px;"><label for="shipment.type1" style="vertical-align: middle;width:20px;">物品</label>
							<input type="radio" name="type" id="shipment.type2" value="2" style="vertical-align: middle;width:20px;"><label for="shipment.type2" style="vertical-align: middle;width:20px;">信函</label>
							<input type="radio" name="type" id="shipment.type3" value="3" style="vertical-align: middle;width:20px;"><label for="shipment.type3" style="vertical-align: middle;width:20px;">文件资料</label>
						</td>
					</tr>
					<tr>     
						<td align="right">尺寸：</td>
						<td align="left">
							<input placeholder="长" class="form-control" type="text" onkeypress="intOnly()" style="width:31px" id="chang" maxlength="5" onblur="this.value=this.value.replace(/\D/g,'')" 
								onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')" value=""/>
							X&nbsp;<input placeholder="宽" class="form-control" type="text" onkeypress="intOnly()" style="width:31px" id="kuang" maxlength="5" onblur="this.value=this.value.replace(/\D/g,'')" 
								onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')" value=""/>
							X&nbsp;<input placeholder="高" class="form-control" type="text" onkeypress="intOnly()" style="width:31px" id="gao" maxlength="5" onblur="this.value=this.value.replace(/\D/g,'')" onkeyup="this.value=this.value.replace(/\D/g,'')" 
								onafterpaste="this.value=this.value.replace(/\D/g,'')" value=""/>
						</td>
						<td align="right">数量：</td>
						<td align="left"><input class="form-control" type="text" name="count" value="" id="shipment.count" onblur="this.value=this.value.replace(/\D/g,'')" 
							onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"></td>
					</tr>
					<tr>
						<td align="right">购买运费险：</td>
						<td align="left"><input class="form-control" type="radio" name="shipment.ifinsure" id="saveShipmentForm_shipment_ifinsure1" value="1" 
							style="vertical-align: middle;;width:20px;" onclick="onIfinsure(this);"><label for="saveShipmentForm_shipment_ifinsure1" style="vertical-align: middle;;width:20px;">
								是</label>
						<input type="radio" name="shipment.ifinsure" id="saveShipmentForm_shipment_ifinsure0" checked="checked" value="0" 
							style="vertical-align: middle;;width:20px;" onclick="onIfinsure(this);"><label for="saveShipmentForm_shipment_ifinsure0" style="vertical-align: middle;;width:20px;">否</label>
						</td>
						<td align="right">重量：</td>
						<td align="left"><input class="form-control" type="text" name="goodweight" value="" id="goodweight" onblur="this.value=this.value.replace(/\D/g,'');" 
							style="size: 30px" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"/> 千克</td>
					</tr>
					<!--<tr id="insuremoneyDiv" style="display:none ">
						<td align="right" width="20%">保价金额：</td>
						<td align="left" width="30%">
							<input class="form-control" id="shipment.insuremoney" maxlength="10" onkeypress="intOnly()" onblur="this.value=this.value.replace(/\D/g,'');" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')" name="shipment.insuremoney" value=""/>
						</td>
						<td align="right"></td>
						<td align="left"></td>
					</tr>-->
					<tr>
						<td align="right">添加备注：</td>
						<td><textarea name="note" cols="70" rows="3" id="shipment.remark"></textarea></td>
						<td style="display: none"><input type="text" name="postalFree" id="postalFree"></td>
					</tr>
				</table>

				<table style="margin: 0 auto;" cellspacing="20px">
					<tr>
						<td><input  type="reset" value="重置" class="div form-control"/></td>
						<td><input  type="button" value="运费计算" class="div form-control" onclick="myclick()"/></td>
						<td><input id="sub" type="button" value="提交" class="div form-control" onclick="mySubmit()"/></td>
						<td><input id="save" type="button" value="保存" class="div form-control" onclick=""/></td>
					</tr>					
				</table>

    		</form>
    	</div>
	</body>
	<script type="text/javascript">
//			function displayMessage(sourceId,targetId){
//		    	var e = $("#"+sourceId);
//		    	if (e.is(":visible")){
//		    		$("#"+sourceId).hide();
//		    		$("#"+targetId).attr("src","img/show.png");
//		    	}else{
//		    		$("#"+sourceId).show();
//		    		$("#"+targetId).attr("src","img/hidden.png");
//		    	}
//	    	}
			function onIfinsure() {

            }
	    	function checkValueVlaid(){
//	    		if(!isMobileNo($("#senderTelephone").val())){
//	    			alert("寄件人手机错误");
//	    			return false;
//	    		}else if(!isMobileNo($("#receiverTelephone").val())){
//	    			alert("手机件人手机错误");
//	    			return false;
//	    		}
	    		var origin = getAddress("provinces1","citys1","countrys1","detailAdress1");
	    		var destination = getAddress("provinces2","citys2","countrys2","detailAdress2");
	    		var sendertelephone = getTelePhone("telNum_quhao1","telNum_tel1","telNum_fenji1");
                var requestdate = $("#mydatepicker2").val();
                var goodsize = computSize();
                var receivertelephone = getTelePhone("telNum_quhao2","telNum_tel2","telNum_fenji2");
                $("#origin").val(origin);
                $("#destination").val(destination);
                $("#sendertelephone").val(sendertelephone);
                $("#requestdate").val(requestdate);
                $("#goodsize").val(goodsize);
                $("#receivertelephone").val(receivertelephone);
//	    		alert("origin"+$("#origin").val());
//	    		alert("destination"+$("#destination").val());
//	    		alert("sendertelephone"+$("#sendertelephone").val());
//	    		alert("requestdate"+$("#requestdate").val());
//	    		alert("goodsize"+$("#goodsize").val());
//	    		alert("receivertelephone"+$("#receivertelephone").val());
//				alert(myFormData["goodname"]);
//	    		return true;
	    	}
	    	function getAddress(provinceId,cityId,countyId,detailAdress){
//	    		alert("in getAddress");
				var pro = document.getElementById(provinceId);
				var cit = document.getElementById(cityId);
				var cou = document.getElementById(countyId);
				var detial = document.getElementById(detailAdress);
				var address = pro[pro.selectedIndex].innerHTML+"省";
				address += cit[cit.selectedIndex].innerHTML+"市";
				address += cou[cou.selectedIndex].innerHTML+"县";
				address  += detial.value;
	    		return address;
	    	}
	    	function getTelePhone(telNum_quhao,telNum_tel,telNum_fenji){
//	    		alert("in getTelePhone");
	    		var quhao = document.getElementById(telNum_quhao);
	    		var tel = document.getElementById(telNum_tel);
	    		var fenji = document.getElementById(telNum_fenji);
	    		var telePhone = quhao.value;
	    		telePhone += tel.value;
	    		telePhone+=fenji.value;	    			
//	    		alert(telePhone);
	    		return telePhone;
	    	}
	    	function computSize(){
	    		var chang = document.getElementById("chang");
	    		var kuang = document.getElementById("kuang");
	    		var gao = document.getElementById("gao");
	    		var size = chang.value*kuang.value;
	    		size = size*gao.value;
//	    		alert(size);
	    		return size;
	    	}
	</script>
	<!--<script src="http://libs.useso.com/js/jquery/1.11.0/jquery.min.js" type="text/javascript"></script>-->
	<script>window.jQuery || document.write('<script src="/LMIS2/js/jquery-1.11.0.min.js"><\/script>')</script>
	<script type="text/javascript" src="/LMIS2/js/dcalendar.picker.js"></script>
	<script type="text/javascript">
			$('#mydatepicker').dcalendarpicker(); 
			$('#mydatepicker2').dcalendarpicker({
				format:'yyyy-mm-dd'
			}); 
			$('#mycalendar').dcalendar();
	</script>
	
</html>
