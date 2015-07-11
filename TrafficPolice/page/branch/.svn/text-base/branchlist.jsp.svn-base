<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%
String varname = (String) request.getParameter("varname");
%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>机动车网上交通安全宣传教育监管平台</title>
<link href="${projectpath}/page/css/css.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="${projectpath}/page/js/jquery.js"></script>
<link rel="stylesheet" href="${projectpath}/page/js/pagination/pagination.css" />
<script type="text/javascript" src="${projectpath}/page/js/pagination/jquery.pagination.js"></script>
<script type="text/javascript" src="${projectpath}/page/js/autoscreen.js"></script>
<script type="text/javascript" src="${projectpath}/page/js/index.js"></script>
<!-- the mousewheel plugin -->
<script type="text/javascript" src="${projectpath}/page/js/jScroll/jquery.mousewheel.js"></script>
<!-- the jScrollPane script -->
<script type="text/javascript" src="${projectpath}/page/js/jScroll/jquery.jscrollpane.min.js"></script>
<script type="text/javascript" src="${projectpath}/page/js/jScroll/scroll-startstop.events.jquery.js"></script>
<script type="text/javascript" src="${projectpath}/page/js/util.js"></script>

<script type="text/javascript" src="http://app.mapabc.com/apis?t=javascriptmap&v=3.1.1&key=3dc46b2cab503188ce5ce86c2c22bbcbc9bce56a5f0737ce79ddb1cd63c3b337a315cc8c1e8fe18c"></script>
<script src="page/js/map/basic.js" type="text/javascript"></script>
<script src="page/js/map/typeAhead2.js" type="text/javascript"></script>
<script type="text/javascript">

function nTabs(thisObj,Num){
if(thisObj.className == "active")return;
var tabObj = thisObj.parentNode.id;
var tabList = document.getElementById(tabObj).getElementsByTagName("li");
for(i=0; i <tabList.length; i++)
{
  if (i == Num)
  {
   thisObj.className = "active"; 
      document.getElementById(tabObj+"_Content"+i).style.display = "block";
  }else{
   tabList[i].className = "normal"; 
   document.getElementById(tabObj+"_Content"+i).style.display = "none";
  }
} 
}
</script>
<script type="text/javascript">
function nTabs1(thisObj,Num,id){
if($(thisObj).attr('class') == "active1") return;
var tabObj = $(thisObj).parent().attr('id');

$('#'+tabObj+' li').each(function(){
	$(this).removeClass(); 
	$(this).addClass("normal1"); 
});
$("div[id^="+tabObj+"_Content1]").css("display","none");

$("#"+tabObj+"_Content1"+Num).css("display","block");
$(thisObj).removeClass(); 
$(thisObj).addClass("active1"); 
if(id !=0)
 initMap1(id);
 else 
  initMap();
//if(thisObj.className == "active1")return;
//var tabObj = thisObj.parentNode.id;
//var tabList = document.getElementById(tabObj).getElementsByTagName("li");
//for(i=0; i <tabList.length; i++)
//{
//  if (i == Num)
//  {
//   thisObj.className = "active1"; 
//      document.getElementById(tabObj+"_Content1"+i).style.display = "block";
//  }else{
//   tabList[i].className = "normal1"; 
//   document.getElementById(tabObj+"_Content1"+i).style.display = "none";
//  }
//} 
}

</script>

<script type="text/javascript">
function nTabs2(thisObj,Num){
alert(thisObj);
if(thisObj.className == "active2")return;
var tabObj = thisObj.parentNode.id;
var tabList = document.getElementById(tabObj).getElementsByTagName("li");
for(i=0; i <tabList.length; i++)
{
  if (i == Num)
  {
   thisObj.className = "active2"; 
      document.getElementById(tabObj+"_Content2"+i).style.display = "block";
  }else{
   tabList[i].className = "normal2"; 
   document.getElementById(tabObj+"_Content2"+i).style.display = "none";
  }
} 
}
</script>

<script type="text/javascript">
//$(document).ready(function() {
// var oMoveBox = $("#col_box"), oArr = $("#arrow"), maxL = 185;
// oArr.click(function(){
//  oMoveBox.animate({"height":"-="+maxL},185,function(){
//   maxL = -maxL;
//  // $("#arrow").html(maxL<0 ? "﹀" : "︿");
// $("#arrow").html(maxL<0 ? "<img src=\"${projectpath}/page/images/zk02.png\"></img>" : "<img src=\"${projectpath}/page/images/zk01.png\"></img>");
//  })
// });
//});
</script>

</head>

<body>
<%@ include file="../head/head.jsp"%> 
<div class="main">
<div class="box">
     
    <div class="nTab1">
    
    <!-- 标题开始 -->
    <div class="TabTitle1">
    <div class="jt_h3 pos"><span class="left main_left"><img src="${projectpath}/page/images/icon05.png" align="absmiddle" />&nbsp;&nbsp;快速处理点</span><span class="gb"><a href="#"><img src="${projectpath}/page/images/close.png" width="10" height="10" /></a></span>
      <ul id="myTab10">
        <li class="active1" onmouseover="nTabs1(this,0,0);">列表</li>
        <li class="normal1" onmouseover="nTabs1(this,1,0);">地图</li>
      </ul>
    </div>
    </div>
    
    
    <!-- 内容开始 -->
    <div class="TabContentny1">
    
    <!-- 列表 -->
   <div id="myTab10_Content10">
       	 
    <div style="height:auto!important;min-height:450px;height:450px;">
      <table width="100%" border="0" cellspacing="0" cellpadding="0" style="margin-bottom:0px;">
         <tr style="background:url(${projectpath}/page/images/cl_list_top.gif) repeat-x;">
           <td width="40%" height="27" align="center"><strong>快速处理点</strong></td>
           <td width="40%" height="27" align="center"><strong>地址</strong></td>
           <td width="10%" height="27" align="center"><strong>电话</strong></td>
           <td width="10%" align="center"><strong>详情</strong></td>
        </tr>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" id="branchlisthtml"></table>
     </table>
   </div>
   <div class="clear"></div>
   <div class="sabrosus"><div id='Pagination' class="pagination"></div></div>
   <div id="TB_overlayBG"></div>
   <div class="boxt" style="display:none">
		<h2>快速处理点<a href="#" class="close">关闭</a></h2>
		<div class="mainlist">
		 <table width="100%" border="0" cellspacing="0" cellpadding="0">
           <tr>
			    <td width="15%">快速处理点：</td>
			    <td width="35%" id="branchName">&nbsp;</td>
				<td width="15%">联系电话：</td>
			    <td width="35%" id="branchPhone">&nbsp;</td>
           </tr>
           <tr>
     		<td width="15%">地址：</td>
    		<td width="35%" colspan="3" id="branchAddress">&nbsp;</td>
  		  </tr>
 		  <tr>
   			 <td>经度：</td>
    		 <td id="lng">&nbsp;</td>
    		 <td>纬度：</td>
    		 <td id="lat">&nbsp;</td>
 		  </tr>
        </table>
		
	  </div>
	 
  </div>
</div>

<!-- 地图 -->
<div id="myTab10_Content11" class="none" style="height:550px;">
	
</div>
</div>
<!-- 内容结束 -->
</div>
<div class="clear"></div>
</div>
<div style="color:#2a81c4; text-align:center">版权所有：机动车网上交通安全宣传教育监控平台&nbsp;&nbsp;技术支持：浙江网泽</div>
</div>
</body>
</html>

<script type="text/javascript">
$(function(){
	map_basic_init(11,'myTab10_Content11',120.2,30.3,false);
	var optInit = getOptionsFromForm();
	$("#Pagination").pagination(${count}, optInit);
	
	$(".close").click(function(){
		$("#TB_overlayBG").css("display","none");//通过id属性绑定
		$(".boxt").css("display","none");//通过class属性绑定
	});
	
})


//分页回调函数
function pageselectCallback(page_index, jq){
	// Get number of elements per pagionation page from form
	page_index = page_index + 1;
	var newcontent = '';
	$.ajax({
		type:'post',//可选get
		url:'getBranchDatedetailList.action',//这里是接收数据的PHP程序
		data:'currentpage='+page_index+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
			var re =eval('('+data+')');
			if(re.size > 0)
			{
				for(var i =0 ; i<re.branchlists.length;i++)
				{
				  // newcontent +='<tr><td width="40%" height="36" align="center" class="branch"  lng="'+re.branchlists[i].lng+'" lat="'+re.branchlists[i].lat+'" branchAddress="'+re.branchlists[i].branchAddress+'">'+'<a href="#" onclick="pageselectCallback('+re.branchlists[i].id+')">'+re.branchlists[i].branchName+'</a>' + '</td><td align="center" width="40%">'+re.branchlists[i].branchAddress+'</td><td width="10%" align="center">'+re.branchlists[i].branchPhone+'</td><td align="center" width="10%"><a href="#" onclick="detailinfo('+re.branchlists[i].id+')">详情</a></td></tr>';
				   newcontent +='<tr><td width="40%" height="36" align="center" class="branch"  lng="'+re.branchlists[i].lng+'" lat="'+re.branchlists[i].lat+'" branchAddress="'+re.branchlists[i].branchAddress+'" branchPhone="'+re.branchlists[i].branchPhone+'" id="'+re.branchlists[i].id+'">'+'<a href="#" onclick="nTabs1($(\'.normal1\'),1,'+re.branchlists[i].id+')">'+re.branchlists[i].branchName+'</a>' + '</td><td align="center" width="40%">'+re.branchlists[i].branchAddress+'</td><td width="10%" align="center">'+re.branchlists[i].branchPhone+'</td><td align="center" width="10%"><a href="#" onclick="detailinfo('+re.branchlists[i].id+')">详情</a></td></tr>';
				}
			}
			$('#branchlisthtml').html(newcontent);
			//删除兴趣点
			map_basic_dellayer('m');
			//添加兴趣点
			initMap();
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


//点击详情的具体信息，采用模态窗口的方式显示信息
function detailinfo(id)
{
	$.ajax({
		type:'post',//可选get
		url:'getBranchDateinfo.action',//这里是接收数据的PHP程序
		data:'branchid='+id+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
			var re =eval('('+data+')');
  			$('#branchName').html('&nbsp;'+re.branchName);

			// 姓名
			$('#branchAddress').html('&nbsp;'+re.branchAddress);

			// 地址
			$('#branchPhone').html('&nbsp;'+re.branchPhone);

			// 经度
			$('#lng').html('&nbsp;'+(re.lng == 'null'?'':re.lng));

			// 纬度
			$('#lat').html('&nbsp;'+(re.lat == 'null'?'':re.lat));

			bindshow();
		},
		error:function(){
			alert('error');
		}
	});
	return;
	
}

//详情信息的模态窗口
function bindshow()
{
	$("#TB_overlayBG").css({
		display:"block",height:$(document).height()
	});
	$(".boxt").css({
		left:($("body").width()-$(".boxt").width())/2-20+"px",
		top:($(window).height()-$(".boxt").height())/3+$(window).scrollTop()+"px",
		display:"block"
	});
}

//兴趣点
function initMap()
{

	$('.branch').each(function(){
		//alert(obj.attr('branchAddress'));
		var obj = $(this);
		if(obj.attr('lng') != '' && obj.attr('lat') != '' && obj.attr('lng') != 'null' && obj.attr('lat') != 'null')
		{
			addmark(obj.attr('lng'),obj.attr('lat'));
			//alert(obj.attr('lng'));
		}
		else
		{
			addmarkbysearch(obj.attr('id'),obj.attr('branchAddress'),obj.text(),obj.attr('branchPhone'),0);
			
			
		}
	});
			
}

//兴趣点
function initMap1(id)
{
map_basic_mapObj.clearMap();//清除地图上的覆盖物
	$('.branch').each(function(){
	var obj = $(this);
		//alert(obj.attr('branchAddress'));
		if(id == obj.attr('id')){
		
		if(obj.attr('lng') != '' && obj.attr('lat') != '' && obj.attr('lng') != 'null' && obj.attr('lat') != 'null')
		{
			addmark(obj.attr('lng'),obj.attr('lat'));
		}
		else
		{
			addmarkbysearch(obj.attr('id'),obj.attr('branchAddress'),obj.text(),obj.attr('branchPhone'),id);
			
			
		}
		}
	});
			
}

//在高德地图上查找具体的位置
function addmarkbysearch(id,keyword,name,phone,indexid)
{  
	//alert(keyword);
	var poiSearchOption = {
		srctype:"POI",//数据来源
		type:"",//数据类别
		number:1,//每页数量，默认10
		batch:1,//请求页数，默认1
		range:3000,	//查询范围，默认3000米
		ext:""//扩展字段
		};
	var poiSearch = new MMap.PoiSearch(poiSearchOption);
	poiSearch.byKeywords(keyword,"0571", function(data){
		//alert(data.count);	
		
		var opt ={}; 
		opt.image="http://code.mapabc.com/images/lan_1.png"; 
		opt.size=new MMap.Size(16,20); 
		opt.imageOffset=new MMap.Pixel(0,18); 
		icon = new MMap.Icon(opt);//构造自定义MMap.Icon对象
		if(data.status == 'E0')
		{
			//alert(data.list[0].x);
			var marker;
			if(indexid ==0){
			
			marker = new MMap.Marker({id:"m"+data.list[0].x,position:new MMap.LngLat(data.list[0].x ,data.list[0].y),content:'<image width="16px;" height="20px;" src="http://code.mapabc.com/images/lan_1.png"> '						
			}) 
			} else {
			
			marker = new MMap.Marker({id:"m"+data.list[0].x,position:new MMap.LngLat(data.list[0].x ,data.list[0].y),content:'<image width="16px;" height="20px;" src="${projectpath}/page/images/map/spot_2.png"> '						
			})
			}
			//自定义构造MMap.Marker对象
			//marker2 = new MMap.Marker({id:"o",position:new MMap.LngLat(120.126548 ,30.323654),content:'<image width="16px;" height="20px;" src="http://code.mapabc.com/images/lan_1.png" title="'+name+'"> '}) //自定义构造MMap.Marker对象
			map_basic_mapObj.addOverlays(marker); //加载覆盖物
			//map_basic_mapObj.addOverlays(marker2); 
			map_basic_mapObj.setCenter(new MMap.LngLat(data.list[0].x ,data.list[0].y));
			var inforwindow = new MMap.InfoWindow({
						level:13,//初始地图视野级别
						isCustom:true,
						content:InfoWindow1(0,id,name,keyword,name,phone),
						autoMove:true ,
						size:new MMap.Size(200,10),
						offset:new MMap.Pixel(-75,-100) // 靠下，第一个数控制左右方向，第二数控制上下方向
					});
			//鼠标移动到地图点上时显示详细信息
			 map_basic_mapObj.bind(marker,"mouseover",function(e){
				inforwindow.open(map_basic_mapObj,marker.getPosition());   
			});
			//鼠标离开点时详细信息窗口关闭
			map_basic_mapObj.bind(marker,"mouseout",function(e){
				inforwindow.close(map_basic_mapObj,marker.getPosition());   
			});
			if(indexid !==0) {
				inforwindow.open(map_basic_mapObj,marker.getPosition());   
			}
			
		}
					  
	});
}

//在高德地图上显示具体的位置
function addmark(x,y)
{
		alert(x+y);
		var opt ={}; 
		opt.image="http://code.mapabc.com/images/lan_1.png"; 
		opt.size=new MMap.Size(16,20); 
		opt.imageOffset=new MMap.Pixel(0,-18); 
		icon = new MMap.Icon(opt);//构造自定义MMap.Icon对象
		
		var marker;
		marker = new MMap.Marker({id:"m",position:new MMap.LngLat(x ,y),content:'<image width="16px;" height="20px;" src="http://code.mapabc.com/images/lan_1.png">'}) //自定义构造MMap.Marker对象
		map_basic_mapObj.addOverlays(marker); //加载覆盖物

		map_basic_mapObj.setCenter(new MMap.LngLat(x ,y));
}

//快速处理点窗口
function InfoWindow1(flag,id,title,address,name,phone){
    var info_style_icon = "${projectpath}/page/images/map/info_01.png";
	var content = "";
	if(address.length>13){
		address = address.substring(0,13)+"...";
	}
	content += "&nbsp;&nbsp;快速处理点：" + name + "<br/>";
	content += "&nbsp;&nbsp;地址：" + address + "<br/>"; 
	content += "&nbsp;&nbsp;电话：" + phone + "<br/>"; 
	return infoWindow_style(flag,id,title,content,info_style_icon);	
	
}
</script>