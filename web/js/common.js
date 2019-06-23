//弹出对话框
function alertmessage(message){
  window.alert(message);
}

// 验证是否有值
function checkValue(value){
  if(null == value  || ""==  value){
    return false;
  }
  return true;
}
// 验证HTMl元素是否存在
function checkObjValue(obj){
  if(obj!=null && obj.value!=null && obj.value!=""){
    return true;
  }
  return false;
}

// 中文字符验证
function checkchinese(str){
	var pattern=/^[chr(0xa1)-chr(0xff)]+$/ ;
	checkValue(str);
	if(!pattern.test(str)){
		return true;
	}else{
		return false;
	}
}

// 不包含(除了字母,下划线,数字)以外的就返回true,否则false,例如@#@$@等...;
// function checkID(value){
// var str=/\w+/;
// if(str.test(value)){
// return true;
// }else{
// return false;
// }
// }

// 验证字符串不包含(除了字母,下划线,数字)以外的就返回true,否则false,例如@#@$@等...;
function checkID(value){
   if(!checkValue(value)){
   	return false;
   }
   for(var i=0;i<value.length;i=i+1){
     var c = value.charCodeAt(i);
	 if((c>64&&c<91) || (c>96&&c<123) || (c>47&&c<58) || (c==95)){
	 }else{
	 	return false;
	 }
   }
   var first = value.charCodeAt(0);
   if((first>64&&first<91) || (first>96&&first<123)){
     return true;
   }
   return false;
}

// 去空格函数
function trim(str) {
	var t=str.replace(/(^[\s\u3000]*)|([\s\u3000]*$)/g, "");
	return t;
}

// 是否为excel文件
function isExcelFile(obj){
	if(obj==null){
		return false;
	}
	var fileName =obj.value;
	if(trim(fileName).length!=0){
		if(fileName.lastIndexOf(".") != -1){
			var fileType=fileName.substring(fileName.lastIndexOf(".")+1,fileName.length);
			fileType = fileType.toLowerCase();
			if(fileType != "xls" && fileType!= "xlsx"){
				return false;
			}
		}
	}
	return true;
}

// email格式验证
function checkemail(email){
	var p= /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
	if(p.test(email)){
		return true;
	}else{
		return false;
	}
}


// 验证手机号
function isMobileNo(mobile){ 
	mobile = trim(mobile);
    if(mobile.length==0){ 
//  	alert("不是手机");
       return false; 
    }    
    if(mobile.length!=11){ 
//  	alert("不是手机");
        return false; 
    } 
    var myreg = /^(((1[3-5]{1}[0-9]{1})|(18[0-9]{1}))+\d{8})$/; 
    if(!myreg.test(mobile)){ 
//  	alert("不是手机");
        return false; 
    } 
	return true; 
}

// 初始化寄件人省市县,传入省、市、县的值与将要改变的省、市、县的ID,如果调用没反应,请在页面中调用前加：
function initPCC(provinceValue,cityValue,countyValue,changeProvinceId,changeCityId,changeCountyId){
	// 省份
	var sp=document.getElementById(changeProvinceId);
	// 将与省份值对应的option设置为选中
	for (var i = 0; i < sp.options.length; i++) {  
        if (sp.options[i].value ==provinceValue){ 
           sp.options[i].selected=true;
        }  
   	}
    // 省份信息改变了，刷新改变相应的城市信息
    onProviceChange(changeProvinceId,changeCityId,changeCountyId);		
    // 城市
    var objCitySelect =document.getElementById(changeCityId);		
    for (var i = 0; i < objCitySelect.options.length; i++) {   
     	 if (objCitySelect.options[i].value ==cityValue){ 
           objCitySelect.options[i].selected=true; 
       }  
    }
    // 城市信息改变了，刷新改变相应的县区信息
    onCityChange(changeCityId,changeCountyId);
    // 县区
    var objCountySelect =document.getElementById(changeCountyId); 
	for(var i = 0; i < objCountySelect.options.length; i++) {        
       if (objCountySelect.options[i].value ==countyValue){
           objCountySelect.options[i].selected=true; 
       }  
    } 
}
	
/*
 * 电话号码验证 区号：前面一个0，
 * 后面跟2-3位数字 ： 0\d{2,3}
 * 
 * 电话号码：7-8位数字： \d{7,8}
 * 
 * 分机号：一般都是3位数字： \d{3,}
 */ 
function isTelNo(str){
	var pattern =/^((0\d{2,3})-)(\d{7,8})(-(\d{3,}))?$/; 
    if(!pattern.test(str)){
    	return false;
    }
    return true;
}
//housh-提示信息
function inputTipText(){    
	$("input[class*=grayTips]")  
	.each(function(){   
	   var oldVal=$(this).val();   //默认的提示性文本   
	   $(this)   
	   .css({"color":"#888"})  //灰色   
	   .focus(function(){   
	    if(trim($(this).val())!=oldVal){
	    	$(this).css({"color":"#000"})
	    }else{
	    	$(this).val("").css({"color":"#888"})}   
	   })   
	   .blur(function(){   
	    if(trim($(this).val())==""){
	    	$(this).val(oldVal).css({"color":"#888"})}   
	   })   
	   .keydown(function(){$(this).css({"color":"#000"})});	  
	     
	})   
} 
//housh-初始化三段式固话
function initTelNo(hiddenID,telNum_quhaoID,telNum_telID,telNum_fenjiID){
	var hiddenInputTel=$("#"+hiddenID).val();
	hiddenInputTel=trim(hiddenInputTel);
	if(hiddenInputTel!=''){
		var hiddenInputTelArr=hiddenInputTel.split("-");
		if(hiddenInputTelArr.length==2){
			$("#"+telNum_quhaoID).val(hiddenInputTelArr[0]).css({"color":"#000"});
			$("#"+telNum_telID).val(hiddenInputTelArr[1]).css({"color":"#000"});
		}else if(hiddenInputTelArr.length==3){
			$("#"+telNum_quhaoID).val(hiddenInputTelArr[0]).css({"color":"#000"});
			$("#"+telNum_telID).val(hiddenInputTelArr[1]).css({"color":"#000"});
			$("#"+telNum_fenjiID).val(hiddenInputTelArr[2]).css({"color":"#000"});
		}
	} 
}
//housh-固话分三段
function doCheckTelNo(quhaoID,telNoID,fenjiID,hiddenID,tipsID,fontColor,tipsMessage){
  	var telNum_quhao=$("#"+quhaoID);
  	var telNum_tel=$("#"+telNoID);
  	var telNum_fenji=$("#"+fenjiID);
  	 
  	if(telNum_quhao.val()=="区号"&&telNum_tel.val()=="电话号码"&&telNum_fenji.val()=="分机"){
  		$("#"+hiddenID).val("");
  		return true;
  	}else {  //如果有输入就校验完整性
  		if(telNum_fenji.val()!="分机"&&telNum_fenji.val()!=""){
				$("#"+hiddenID).val(telNum_quhao.val()+"-"+telNum_tel.val()+"-"+telNum_fenji.val());
  		}else{
  			$("#"+hiddenID).val(telNum_quhao.val()+"-"+telNum_tel.val());
  		}
  	//	alert("input: "+$("#"+hiddenID).val());
		var isValidate=isTelNo($("#"+hiddenID).val());
		var tipsMess ="请输入正确的电话号码！";
		if(tipsMessage!=null){
			tipsMess = tipsMessage;
		}
		if(!isValidate){ //非法输入
			$("#"+hiddenID).val("");
			if(fontColor==null){
				$("#"+tipsID).html("<font color='red'>"+tipsMess+"</font>");
			}else{
				$("#"+tipsID).html("<font color='"+fontColor+"'>"+tipsMess+"</font>");
			}
			return false;
		}
		return true;
  	} 
}
//housh-截取详细地址
function addressSubStr(inputAddressId,provinceId,cityID,countyID){
	var sendDetailAddress=$.trim($("#"+inputAddressId).val());
	//var sendDetailAddress="厦门市 海沧区 钟林南里厦门市规划局海沧分局";
	//var str="北京 东城区 	城关东城根";
	//var sendDetailAddress1=sendDetailAddress;
	//var sendDetailAddress =str;
	
	var provinceText =$.trim( $("#"+provinceId+" option:selected").text());
	var provinceVal = $("#"+provinceId+" option:selected").val();
	
	var cityText = $.trim($("#"+cityID+" option:selected").text());
	var cityVal = $("#"+cityID+" option:selected").val();
	
	var countyText = $.trim($("#"+countyID+" option:selected").text());
	var countyVal = $("#"+countyID+" option:selected").val();
	//alert("provinceVal:"+provinceVal+"cityVal:"+cityVal+"countyVal:"+countyVal);
	if(provinceVal!=""&&cityVal!=""&&countyVal!=""){
		var t1=cityText+"市 ";
		if (sendDetailAddress.indexOf(t1,0)!=-1){
			sendDetailAddress=sendDetailAddress.replace(t1,"");
			sendDetailAddress=trim(sendDetailAddress);
		//	alert("t1==="+sendDetailAddress1+"==="+t1+"=="+sendDetailAddress+"=");
		}
		 var t2=cityText+" ";
		if (sendDetailAddress.indexOf(t2,0)!=-1){
			sendDetailAddress=sendDetailAddress.replace(t2,"");
			sendDetailAddress=trim(sendDetailAddress);
		//	alert("t2==="+sendDetailAddress1+"==="+t2+"=="+sendDetailAddress+"=");
		}
		var t3=countyText+"区 ";
		if (sendDetailAddress.indexOf(t3,0)!=-1 ){
			sendDetailAddress=sendDetailAddress.replace(t3,"");
			sendDetailAddress=trim(sendDetailAddress);
		//	alert("t3==="+sendDetailAddress1+"==="+t3+"=="+sendDetailAddress+"=");
		}
		var t4=countyText+"县 ";
		if (sendDetailAddress.indexOf(t4,0)!=-1 ){
			sendDetailAddress=sendDetailAddress.replace(t4,"");
			sendDetailAddress=trim(sendDetailAddress);
		//	alert("t4==="+sendDetailAddress1+"==="+t4+"=="+sendDetailAddress+"=");
		}
		var t5=countyText+" ";
		if (sendDetailAddress.indexOf(t5,0)!=-1 ){
			sendDetailAddress=sendDetailAddress.replace(t5,"");
			sendDetailAddress=trim(sendDetailAddress);
		//	alert("t5==="+sendDetailAddress1+"==="+t5+"=="+sendDetailAddress+"=");
		}
		//	alert("reuslt==="+sendDetailAddress1+"==="+sendDetailAddress+"=");
	}	
	$("#"+inputAddressId).val(sendDetailAddress);
}
// 手机号码验证，验证13系列和150-159(154除外)、180、185、186、187、188、189几种号码，长度11位
function isMobel(value){
	if(/^13\d{9}$/g.test(value)||(/^15[0-35-9]\d{8}$/g.test(value))|| (/^18[05-9]\d{8}$/g.test(value))){ 
		return true; 
	}else{ 
		return false; 
	}
}


// 控制只允许输入整数
function intOnly() {
   if (!((window.event.keyCode >= 48) && (window.event.keyCode <= 57) || (window.event.keyCode == 45))){
   	   window.event.keyCode = 0;
   }
}

// 密码验证
function checkpassword(password){
	if(password.length<6 || password.length>=20){			
		return false;
	}
	return true;			
}
// 得到单选按钮值
function getRadioValue(radio){
	if(radio==null){
		return null;
	}
	for(var i=0;i<radio.length;i++){
		if(radio[i].checked){
			return radio[i].value;
		}
	}
}
// 初始化一个一级Select
function init(frm,select){
  var s = frm.elements[select];
  for(var i=0;i<nodeid.length;i++){
  	s.options[s.length] = new Option(nodename[i].tid,nodeid[i].tid);
  }
}

// 客户端的二级联动
function getNodes(frm,select1,select2){
  var s1 = frm.elements[select1];
  var s2 = frm.elements[select2];
  
  if(s1==null || s2==null){
  	return ;
  }
  s2.length = 1;
  var s1_index = s1.selectedIndex-1;
  if(s1_index<0){
  	s2.options[0] = new Option("--未选择--","");
  	s2.options.length = 1;
  	return ;
  }
  var s2_value = nodename[s1_index].value.split(",");
  var s2_text = nodeid[s1_index].value.split(",");
  
  for(var i=0;i<s2_value.length;i++){
  	if(s2_value!="" && s2_text!=""){
  	  s2.options[s2.length] = new Option(s2_value[i],s2_text[i]);
  	}
  }
}
// 获得日期
function initDate(beginTime,endTime,datekind){
	var begin = new Date(); 
	var year = begin.getYear();
	var month = begin.getMonth()+1;
	var day = begin.getDate();
	if(datekind=="month"){
	 beginTime.value = year+"-"+month+"-1";
	 endTime.value = year+"-"+month+"-"+day;
	}else if(datekind=="day"){
	 beginTime.value = year+"-"+month+"-"+day;
	 endTime.value = year+"-"+month+"-"+day;	
	}else if(datekind=="year"){
	 beginTime.value = year+"-1-1";
	 endTime.value = year+"-"+month+"-"+day;	
	}
}
// 邮编
function isZipCode(str){
	str=trim(str);
	var reg=/^\d{6}$/;
	return reg.test(str);
}
// 格式化日期
// 例：new DateFormat().format('yyyy-mm-dd')
var DateFormat=function(date){
 	var format=function(str){
	    str=str.replace(/yyyy/g,date.getFullYear());
	    str=str.replace(/yy/g,date.getFullYear().toString().slice(2));
	    var tempDay = date.getMonth()+1;
	    if(tempDay<10){
	    	tempDay = "0"+tempDay;
	    }
	    str=str.replace(/mm/g,tempDay);
	    str=str.replace(/dd/g,date.getDate());
	    str=str.replace(/wk/g,date.getDay());
	    str=str.replace(/hh/g,date.getHours());
	    str=str.replace(/mi/g,date.getMinutes());
	    str=str.replace(/ss/g,date.getSeconds());
	    str=str.replace(/ms/g,date.getMilliseconds());
	    return str;
	}
	var valueOf=function(){}
	var toString=function(){
	    return date.toLocaleString();
	}
	date=new Date(date);
	if(!date||date=="NaN")
	    date=new Date();
	this.format=format;
	this.valueOf=valueOf;
	this.toString=toString;
}



/**过滤表单中的特殊字符*/   
/**
 * inputvalue:input对象
 * divID:显示错误信息的div的ID
 * 
 * 例 ：在 input中加入事件:    onblur ="checkSpecialCharacter(this,'formVailte')" 
 */
function checkSpecialCharacter(inputvalue,divID)          
{      
    var str=inputvalue.value;   
    var SPECIAL_STR ="￥#$~!@%^&*();'\"?><[]{}\\|,:/=+—“”‘";
    for(i=0;i<str.length;i++)   
      if (SPECIAL_STR.indexOf(str.charAt(i)) !=-1) {   
    	   $("#"+divID).html("请输入字母、数字、下划线！");
	       inputvalue.value='';
	       inputvalue.focus();   
	       return false;   
       }else{
    	   $("#"+divID).html("");
       }   
    return true;   
}