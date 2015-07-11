<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>机动车网上交通安全宣传教育监管平台</title>

<link href="${projectpath}/page/css/css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${projectpath}/page/js/jquery.js"></script>
<link rel="stylesheet" href="${projectpath}/page/js/pagination/pagination.css" />
<script type="text/javascript" src="${projectpath}/page/js/pagination/jquery.pagination.js"></script>
<script type="text/javascript" src="${projectpath}/page/js/autoscreen.js"></script>
<!-- the mousewheel plugin -->
<script type="text/javascript" src="${projectpath}/page/js/jScroll/jquery.mousewheel.js"></script>
<!-- the jScrollPane script -->
<script type="text/javascript" src="${projectpath}/page/js/jScroll/jquery.jscrollpane.min.js"></script>
<script type="text/javascript" src="${projectpath}/page/js/jScroll/scroll-startstop.events.jquery.js"></script>
<script type="text/javascript" src="${projectpath}/page/js/util.js"></script>


</head>

<body>
<%@ include file="../head/head.jsp"%> 
<div class="main">
<div class="box">
	<div class="nTab3">
	<div class="TabTitle3">
    <div class="jt_h3 pos">
		<span class="left main_left"><img src="${projectpath}/page/images/icon03.png"  align="absmiddle" />&nbsp;&nbsp;基本信息</span>
		<span class="gb"><a href="#"><img src="${projectpath}/page/images/close.png" width="10" height="10" /></a></span>
		<ul id="myTab30">
			<li class="active3" onmouseover="nTabs3(this,0);">基本信息</li>
			<li class="normal3" onmouseover="nTabs3(this,1);">车辆管理</li>
      </ul>
	</div>
	</div>
	
    <div class="TabContentny3"><!-- 内容开始 -->
   	<div id="myTab30_Content30"><!-- 列表 -->
    <div class="box_nr1">
    <div class="jbxx_nr1">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" style="margin-bottom:0px;">
			<tr style="background:url(${projectpath}/page/images/jb_list_top.gif) repeat-x;">
				<td width="8%" height="26" align="center"><strong>姓名</strong></td>
				<td width="8%" height="27" align="center"><strong>年龄</strong></td>
				<td width="8%" height="27" align="center"><strong>性别</strong></td>
				<td width="8%" height="27" align="center"><strong>所属公司</strong></td>
				<td width="12%" height="27" align="center"><strong>身份证号码</strong></td>
				<td width="12%" height="27" align="center"><strong>年审日期</strong></td>
				<td width="10%" height="27" align="center"><strong>电话</strong></td>
				<td width="12%" height="27" align="center"><strong>有效日期</strong></td>
				<td height="27" align="center"><strong>地址</strong></td>
				<td width="8%" align="center"><strong>操作</strong></td>
			</tr>
		</table>  
		<table width="100%" border="0" cellspacing="0" cellpadding="0" id="driverlisthtml"></table>  
	</div>
    <div class="clear"></div>
    <div class="sabrosus">
		<div id='Pagination' class="pagination"></div>
	</div>
    <div id="TB_overlayBG"></div>
	<div class="boxt" style="display:none">
		<h2>基本信息<a href="#" class="close">关闭</a></h2>
		<div class="mainlist">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
				<td width="10%">姓名：</td>
				<td width="25%" id="name">&nbsp;</td>
				<td width="10%">年龄：</td>
				<td width="25%" id="age">&nbsp;</td>
				
				</tr>
				<tr>
				<td width="10%">性别：</td>
				<td id="sex">&nbsp;</td>
				<td>身份证：</td>
				<td id="identitycard">&nbsp;</td>
				</tr>
				<tr>

				<td>电话</td>
				<td id="phone">&nbsp;</td>
				<td>地址：</td>
				<td id="address">&nbsp;</td>
				</tr>
				
				<tr>
				<td>准驾车型</td>
				<td id="cartype">&nbsp;</td>
				<td>年审日期</td>
				<td id="certificationtime">&nbsp;</td>
				</tr>
				<tr>
				<td >所属公司</td>
				<td id="dwid">&nbsp;</td>
				
				<td >有效日期</td>
				<td id="validtime">&nbsp;</td>
				</tr>
			</table>
		</div>
	</div>
    </div>
	</div>
	<!-- 车辆管理 -->
<div class="TabContentny3"><!-- 内容开始 -->
   	<div id="myTab30_Content30"><!-- 列表 -->
    <div class="box_nr1">
    <div class="jbxx_nr1">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" style="margin-bottom:0px;">
			<tr style="background:url(${projectpath}/page/images/jb_list_top.gif) repeat-x;">
				<td width="8%" height="26" align="center"><strong>车牌号</strong></td>
				<td width="8%" height="27" align="center"><strong>常用驾驶员</strong></td>
				<td width="8%" height="27" align="center"><strong>驾驶员电话</strong></td>
				<td width="12%" height="27" align="center"><strong>车辆类型</strong></td>
				<td width="12%" height="27" align="center"><strong>生产厂家</strong></td>
				<td width="10%" height="27" align="center"><strong>所属公司</strong></td>
				<td width="12%" height="27" align="center"><strong>起始时间</strong></td>
				<td height="27" height="27" align="center"><strong>结束时间</strong></td>
				<td width="8%" height="27" align="center"><strong>操作</strong></td>
			</tr>
		</table>  
		<table width="100%" border="0" cellspacing="0" cellpadding="0" id="carlisthtml"></table>  
	</div>
    <div class="clear"></div>
    <div class="sabrosus">
		<div id='Pagination2' class="pagination"></div>
	</div>
    <div id="TB_overlayBG2"></div>
	<div class="boxt2" style="display:none">
		<h2>车辆管理<a href="#" class="close">关闭</a></h2>
		<div class="mainlist2">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
				<td width="10%">车牌号：</td>
				<td width="25%" id="busLicPlate">&nbsp;</td>
				<td width="10%">常用驾驶员：</td>
				<td width="25%" id="driver1">&nbsp;</td>
				<td width="10%">驾驶员电话：</td>
				<td id="phone1">&nbsp;</td>
				</tr>
				
				<tr>
				<td>车辆类型：</td>
				<td id="busType">&nbsp;</td>
				<td>生产厂家</td>
				<td id="manufacturer">&nbsp;</td>
				<td>所属公司：</td>
				<td id="comname">&nbsp;</td>
				</tr>
				
				<tr>
				<td>登记证书</td>
				<td id="regCode">&nbsp;</td>
				<td>起始时间</td>
				<td id="regStartTime">&nbsp;</td>
				<td >结束时间</td>
				<td id="regEndTime">&nbsp;</td>
				</tr>
			</table>
		</div>
	</div>
    </div>
    </div>
	
	</div>
	</div>
	<div class="clear"></div>
</div>
  	<div style="color:#2a81c4; text-align:center">版权所有：机动车网上交通安全宣传教育监控平台&nbsp;&nbsp;技术支持：浙江网泽</div>
</div>
</body>
</html>
<script type="text/javascript">
$(function(){
	//基本信息
	var optInit = getOptionsFromForm();
	$("#Pagination").pagination(${count}, optInit);
	$(".close").click(function(){
		$("#TB_overlayBG").css("display","none");
		$(".boxt").css("display","none");
	});
	
	//车辆管理
	var optInit2 = getOptionsFromForm2();
	$("#Pagination2").pagination(${count}, optInit2);
	$(".close").click(function(){
		$("#TB_overlayBG2").css("display","none");
		$(".boxt2").css("display","none");
	});
})

//基本信息、车辆管理
function nTabs3(thisObj, Num) {
	
	if (thisObj.className == "active3")
		return;
	var tabObj = thisObj.parentNode.id;
	
	var tabList = document.getElementById(tabObj)
			.getElementsByTagName("li");
	for (i = 0; i < tabList.length; i++) {
		var width = $(thisObj).css('width');
		if (i == Num) {
			$(thisObj).removeClass('normal3');
			$(thisObj).removeClass('active3');
			$(thisObj).addClass('active3');
			document.getElementById(tabObj + "_Content3" + i).style.display = "block";
		} else {
			$(tabList[i]).removeClass('normal3');
			$(tabList[i]).removeClass('active3');
			$(tabList[i]).addClass('normal3');
			document.getElementById(tabObj + "_Content3" + i).style.display = "none";
		}
	}
}

//分页回调函数-基本信息
function pageselectCallback(page_index, jq){
	// Get number of elements per pagionation page from form
	page_index = page_index + 1;
	var newcontent = '';
	$.ajax({
		type:'post',//可选get
		url:'getDriverDatedrilist.action',//这里是接收数据的PHP程序
		data:'currentpage='+page_index+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
			var re =eval('('+data+')');
  			
			if(re.size > 0)
			{
				for(var i =0 ; i<re.drivers.length;i++)
				{
					 newcontent +='<tr><td width="8%" height="36" align="left"">'+re.drivers[i].name+'</td><td align="left"" width="8%">'+re.drivers[i].age+'</td><td width="8%" align="left"">'+re.drivers[i].sex+'</td><td width="8%" align="left"">'+re.drivers[i].dwid+'</td><td align="left"" width="12%"><p>'+re.drivers[i].identitycard+'</p></td><td width="12%" height="36" align="left"">'+re.drivers[i].certificationtime+'</td><td width="10%" height="36" align="left"">'+re.drivers[i].phone+'</td><td width="12%" height="36" align="left"">'+re.drivers[i].validtime+'</td><td>'+re.drivers[i].address+'</td><td width="8%" align="left""><a href="#" onclick="detailinfo('+re.drivers[i].id+');">查询</a></td></tr>';
				}
			}
			$('#driverlisthtml').html(newcontent);
		},
		error:function(){
			alert('error');
		}
	});
	// Replace old content with new content
	
	// Prevent click eventpropagation
	return false;
}

//分页回调函数-车辆管理
function pageselectCallback2(page_index, jq){
	// Get number of elements per pagionation page from form
	page_index = page_index + 1;
	var newcontent = '';
	$.ajax({
		type:'post',//可选get
		url:'getCarDatacarList.action',//这里是接收数据的PHP程序
		data:'currentpage='+page_index+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
			var re = eval('('+data+')');
			if(re.size > 0)
			{
				for(var i =0 ; i<re.cars.length;i++)
				{	
					var dv1 = re.cars[i].driver1;
					if(dv1 == "null"){dv1 = "";}
					
					var ph1 = re.cars[i].phone1;
					if(ph1 == "null"){ph1 = "";}
					
					var mft = re.cars[i].manufacturer;
					if(mft == "null"){mft = "";}
					
					var cmn = re.cars[i].comname;
					if(cmn == "null"){cmn = "";}
					 newcontent +='<tr><td width="8%" height="36" align="left">'+re.cars[i].busLicPlate+'</td><td align="left"" width="8%">'+dv1+'</td><td width="8%" align="left"">'+ph1+'</td><td align="left"" width="12%"><p>'+re.cars[i].busType+'</p></td><td width="12%" height="36" align="left"">'+mft+'</td><td width="10%" height="36" align="left"">'+cmn+'</td><td width="12%" height="36" align="left"">'+re.cars[i].regStartTime+'</td><td>'+re.cars[i].regEndTime+'</td><td width="8%" align="left""><a href="#" onclick="detailinfo2('+re.cars[i].carid+');">详情</a></td></tr>';
				}
			}
			$('#carlisthtml').html(newcontent);
		},
		error:function(){
			alert('error');
		}
	});
	// Replace old content with new content
	
	// Prevent click eventpropagation
	return false;
}

// The form contains fields for many pagiantion optiosn so you can
// quickly see the resuluts of the different options.
// This function creates an option object for the pagination function.
// This will be be unnecessary in your application where you just set
// the options once.
function getOptionsFromForm(){
	var opt = {callback: pageselectCallback};
	// Collect options from the text fields - the fields are named like their option counterparts
	//"Previous" label
	opt.prev_text = '上一页';
	//"Next" label
	opt.next_text = '下一页';
	//Number of pagination links shown
	opt.num_display_entries = '3';
	//Number of items per page
	opt.items_per_page = '15';
	// Avoid html injections in this demo
	var htmlspecialchars ={ "&":"&amp;", "<":"&lt;", ">":"&gt;", '"':"&quot;"};
	$.each(htmlspecialchars, function(k,v){
		opt.prev_text = opt.prev_text.replace(k,v);
		opt.next_text = opt.next_text.replace(k,v);
	})
	return opt;
}

function getOptionsFromForm2(){
	var opt = {callback: pageselectCallback2};
	// Collect options from the text fields - the fields are named like their option counterparts
	//"Previous" label
	opt.prev_text = '上一页';
	//"Next" label
	opt.next_text = '下一页';
	//Number of pagination links shown
	opt.num_display_entries = '3';
	//Number of items per page
	opt.items_per_page = '15';
	// Avoid html injections in this demo
	var htmlspecialchars ={ "&":"&amp;", "<":"&lt;", ">":"&gt;", '"':"&quot;"};
	$.each(htmlspecialchars, function(k,v){
		opt.prev_text = opt.prev_text.replace(k,v);
		opt.next_text = opt.next_text.replace(k,v);
	})
	return opt;
}

//车辆管理
function detailinfo2(id)
{
	$.ajax({
		type:'post',//可选get
		url:'getCarDatainfo.action',//这里是接收数据的PHP程序
		data:'carid='+id+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
			var re = eval('('+data+')');
			
			var dv1 = re.driver1;
			if(dv1 == "null"){dv1 = "";}
			
			var ph1 = re.phone1;
			if(ph1 == "null"){ph1 = "";}
			
			var mft = re.manufacturer;
			if(mft == "null"){mft = "";}
			
			var cmn = re.comname;
			if(cmn == "null"){cmn = "";}
			
			//车牌号
  			$('#busLicPlate').html('&nbsp;'+re.busLicPlate);

			// 常用驾驶员
			$('#driver1').html('&nbsp;'+dv1);

			// 驾驶员电话
			$('#phone1').html('&nbsp;'+ph1);

			// 车辆类型
			$('#busType').html('&nbsp;'+re.busType);

			// 生产厂家
			$('#manufacturer').html('&nbsp;'+mft);

			// 所属公司
			$('#comname').html('&nbsp;'+cmn);

			// 登记证书
			$('#regCode').html('&nbsp;'+re.regCode);

			// 起始时间
			$('#regStartTime').html('&nbsp;'+re.regStartTime);

			// 结束时间
            $('#regEndTime').html('&nbsp;'+re.regEndTime);
			bindshow2();
		},
		error:function(){
			alert('error');
		}
	});
	return;
	
}


function detailinfo(id)
{
	$.ajax({
		type:'post',//可选get
		url:'getDriverDateinfo.action',//这里是接收数据的PHP程序
		data:'driverid='+id+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
			var re =eval('('+data+')');
		//alert(data);
  			$('#phone').html('&nbsp;'+re.phone);

			// 姓名
			$('#name').html('&nbsp;'+re.name);

			// 地址
			$('#address').html('&nbsp;'+re.address);

			// 身份证号
			$('#identitycard').html('&nbsp;'+re.identitycard);

			// 性别
			$('#sex').html('&nbsp;'+re.sex);
			
			// 所属公司
			$('#dwid').html('&nbsp;'+re.dwid);

			// 准驾车型
			$('#cartype').html('&nbsp;'+re.cartype);

			// 有效日期
			$('#validtime').html('&nbsp;'+re.validtime);

			// 年审日期
			$('#certificationtime').html('&nbsp;'+re.certificationtime);

            $('#age').html('&nbsp;'+re.age);
			bindshow();
		},
		error:function(){
			alert('error');
		}
	});
	return;
	
}

function bindshow()
{
	$("#TB_overlayBG").css({
		display:"block",height:$(document).height()
	});
	$(".boxt").css({
		left:($("body").width()-$(".boxt").width())/2-20+"px",
		top:($(window).height()-$(".boxt").height())/3+$(window).scrollTop()+33+"px",
		display:"block"
	});
}

function bindshow2()
{
	$("#TB_overlayBG2").css({
		display:"block",height:$(document).height()
	});
	$(".boxt2").css({
		left:($("body").width()-$(".boxt2").width())/2-20+"px",
		top:($(window).height()-$(".boxt2").height())/3+$(window).scrollTop()+18+"px",
		display:"block"
	});
}


</script>
