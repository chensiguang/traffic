<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>机动车网上交通安全宣传教育监管平台</title>

<!-- 视频模块所需的 -->
<link href="http://vjs.zencdn.net/c/video-js.css" rel="stylesheet"/>  
<script src="http://vjs.zencdn.net/c/video.js"></script>  
<script type="text/javascript" src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script> 
<script type="text/javascript" src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<script src="http://api.html5media.info/1.1.4/html5media.min.js"></script>



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
function videomore(eduid)
{
	if(eduid != '')
	{
		location.href = 'edu_info.action?eduid='+eduid;
	}
}


//左边分页回调函数 视频模块
function pageselectCallback(page_index, jq){
	// Get number of elements per pagionation page from form
	page_index = page_index + 1;
	var newcontent = '';
	$.ajax({
		type:'post',//可选get
		url:'getEduDateedulist.action',//这里是接收数据的PHP程序
		data:'currentpage='+page_index+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
			var re =eval('('+data+')');
			if(re.size > 0)
			{
				for(var i =0 ; i<re.eduvideos.length;i++)
				{
					 //alert(re.eduvideos[i].videourl);
					 //"${video.videoUrl}" frameborder=0 allowfullscreen></iframe>
					 newcontent += '<li><table width="100%" border="0" cellspacing="0" cellpadding="0"><tr><td width="150" align="center" valign="middle"><img src="' + re.eduvideos[i].img +'" width="125" height="80" /></td><td align="left" valign="top"><p><strong style="cursor:pointer;" onmousemove=this.style.color="red" onmouseout=this.style.color="#044885" onclick="loadRuleContent(';
					 newcontent += re.eduvideos[i].id;
					 newcontent +=');">';
					 newcontent +='&nbsp;&nbsp;&nbsp;点击播放';
					 newcontent +='</strong>&nbsp;&nbsp;&nbsp;&nbsp;<font color="#999999">';
					//newcontent +=re.eduvideos[i].content;
					 newcontent +='</font></p><p>';
					 //newcontent +='点播';
					 newcontent +='&nbsp;&nbsp;&nbsp;&nbsp;'+ re.eduvideos[i].content;
					 newcontent +='</p></td></tr></table></li>';
					 if(i==0)
					 {
					 	loadRuleContent(re.eduvideos[i].id);
					 }
					 
				}
			}
			$('#edulisthtml').html(newcontent);
			//var lidiv = {'self':'.limit','rate':35};$(document.body).limit(document.documentElement.clientWidth,lidiv);
		},
		error:function(){
			alert('ajax error');
		}
	});
	// Replace old content with new content
	
	// Prevent click eventpropagation
	return false;
}
 
 
 

//右边页面显示栏  视频模块
function loadRuleContent(id)
{
		var newcontent ='';
	$.ajax({
		type:'post',//可选get
		url:'getEduDateinfo.action',//这里是接收数据的PHP程序
		data:'eduid='+id+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
			var re =eval('('+data+')');
				/* newcontent +='<iframe width=100%  class="autoheight" src="' + re.videourl +'" height="460" />';
				newcontent +='<div>'+(re.content == 'null' ? "暂无详细内容":re.content)+'</div>'; */
				newcontent +='<video id="my_video_1" class="video-js vjs-default-skin" controls preload="auto" poster="" data-setup="{}" height="460" width="800">'; 
				newcontent +='<source src="'+re.videourl+'"type=video/mp4/></video>'; 
				newcontent +='<div>'+(re.content == 'null' ? "暂无详细内容":re.content)+'</div>';
				
			$('#contenthtml').html(newcontent);
			autoscroll({'id':'jp-container'});
		},
		error:function(){
			alert('error');
		}
	});
	
}


//左边分页回调函数 图文模块
function pageselectCallback2(page_index, jq){
	// Get number of elements per pagionation page from form
	page_index = page_index + 1;
	var newcontent = '';
	$.ajax({
		type:'post',//可选get
		url:'getEduDateedulist.action',//这里是接收数据的PHP程序
		data:'currentpage='+page_index+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
			var re =eval('('+data+')');
			if(re.size > 0)
			{
				for(var i =0 ; i<re.eduvideos.length;i++)
				{
					 newcontent += '<li><table width="100%" border="0" cellspacing="0" cellpadding="0"><tr><td width="150" align="center" valign="middle"><img src="' + re.eduvideos[i].img +'" width="125" height="80" /></td><td align="left" valign="top"><p><strong style="cursor:pointer;" onclick="loadRuleContent2(';
					 newcontent += re.eduvideos[i].id;
					 newcontent +=');">';
					 newcontent +=re.eduvideos[i].videotitle;
					 newcontent +='</strong>&nbsp;&nbsp;&nbsp;&nbsp;<font color="#999999">';
					 newcontent +=re.eduvideos[i].videoreleasetime;
					 newcontent +='</font></p><p>';
					 newcontent +=re.eduvideos[i].content;
					 newcontent +='</p></td></tr></table></li>';
					 if(i==0)
					 {
					 	loadRuleContent2(re.eduvideos[i].id);
					 }
				}
			}
			$('#edulisthtml2').html(newcontent);
			//var lidiv = {'self':'.limit','rate':35};$(document.body).limit(document.documentElement.clientWidth,lidiv);
		},
		error:function(){
			alert('ajax error');
		}
	});
	// Replace old content with new content
	
	// Prevent click eventpropagation
	return false;
}





//右边页面显示栏  图文模块
function loadRuleContent2(id)
{
		var newcontent ='';
	$.ajax({
		type:'post',//可选get
		url:'getEduDateinfo.action',//这里是接收数据的PHP程序
		data:'eduid='+id+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！

			var re =eval('('+elformat(data)+')');
				newcontent +='<p style="text-align:center;font:14px;"><strong>'+re.videotitle+'</strong></p>';
				newcontent +='<p style="text-align:center;">时间: '+re.videoreleasetime+'</p>';
				newcontent +='<p>'+(re.content == 'null' ? "暂无详细内容":re.content)+'</p>';
			$('#contenthtml2').html(newcontent);
			
			autoscroll({'id':'jp-container2'});
		},
		error:function(){
			
			alert('error');
		}
	});
	
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
	opt.items_per_page = '4';
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
	opt.items_per_page = '4';
	// Avoid html injections in this demo
	var htmlspecialchars ={ "&":"&amp;", "<":"&lt;", ">":"&gt;", '"':"&quot;"};
	$.each(htmlspecialchars, function(k,v){
		opt.prev_text = opt.prev_text.replace(k,v);
		opt.next_text = opt.next_text.replace(k,v);
	})
	return opt;
}

function contentappend()
{
	var content = '<div id="jp-container" class="jp-container autowidth"><div style="padding:10px 15px; line-height:22px" id="contenthtml">';
	content += $('#contenthtml').html();
	content += '</div></div>';
	
	$('#contentdetail').html(content);
}

function contentappend2()
{
	var content = '<div id="jp-container2" class="jp-container autowidth"><div style="padding:10px 15px; line-height:22px" id="contenthtml2">';
	content += $('#contenthtml2').html();
	content += '</div></div>';
	
	$('#contentdetail2').html(content);
}


$(function(){
	var optInit = getOptionsFromForm();
	var optInit2 = getOptionsFromForm2();
	$("#Pagination").pagination(${count}, optInit);
	$("#Pagination2").pagination(${count}, optInit2);
	
	//自动适应屏幕宽度js
	var opt = {'widthname':'autowidth','callback':function(e){contentappend();contentappend2();autoscroll();autoscroll({'id':'jp-container2'})}};
	
	opt = atuoscreen(opt);

	$(document).bind("keydown",function(e){if(e.which == 122)flag=false;});
	window.onresize=function(){
			opt = atuoscreen(opt);
			var lidiv = {'self':'.limit','rate':51};$(document.body).limit(document.documentElement.clientWidth,lidiv);
	};
});
</script>
</head>

<body>
	<%@ include file="../head/head.jsp"%>
	<div class="main">
		<div class="box">
		
			<div class="nTab">
				<!-- 标题开始 -->
				<div class="TabTitle">
					<div class="jt_h3 pos">
						<span class="left main_left"><img src="${projectpath}/page/images/icon02.png" align="absmiddle" />&nbsp;&nbsp;宣教中心</span>
						<span class="gb"><a href="#"><img src="${projectpath}/page/images/close.png" width="10" height="10" /></a></span>
						<ul id="myTab0">
							<li class="active" onmouseover="nTabs(this,0);">视频</li>
							<li class="normal" onmouseover="nTabs(this,1);">图文</li>
							<!--<li class="normal" onmouseover="nTabs(this,2);">题库</li>-->
						</ul>
					</div>
				</div>
				
	<div class="TabContentny padding">
				
	<!--视频 -->
	<div id="myTab0_Content0">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
	  <tr>
		<td width="38%" align="left" valign="top">
		   <div style="border:2px solid #D8DFEA;height:500px">
			  <ul class="ny_sp" id='edulisthtml'>
			  </ul>
			  <div class="clear"></div>
			  <div class="sabrosus"><div id='Pagination' class="pagination"></div></div>
		   </div>
		 </td>
		 <td width="2%">
		    <img src="${projectpath}/page/images/jt.gif"></img>
		 </td>
		 <td align="left" valign="top" id="contentdetail">
			   <div id="jp-container" class="jp-container autowidth" >
			       <div  id="contenthtml">
			       </div>
		       </div>
		 </td>
	  </tr>
	</table>		
	</div>

<!-- 图文 -->					
<div id="myTab0_Content1" class="none">
<div class="box_nr1  padding">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
	  <tr>
		<td width="38%" align="left" valign="top">
		  <div style="border:2px solid #D8DFEA;height:500px">
			   <ul class="ny_sp" id='edulisthtml2'>
			   </ul>
			  <div class="clear"></div>
			  <div class="sabrosus"><div id='Pagination2' class="pagination2"></div></div>
		  </div>
	     </td>
			 <td width="2%">
						  <img src="${projectpath}/page/images/jt.gif"></img>
						</td> 
			<td align="left" valign="top" id="contentdetail2">
			
			<div id="jp-container2" class="jp-container autowidth" >
			<div style="padding:10px 15px; line-height:22px" id="contenthtml2">
			
			  </div>
		</div>
		
		</td>
	  </tr>
	</table>
    </div>
</div>

<!--试题-->
<div id="myTab0_Content2" class="none">3</div>
				</div>
			</div>
		</div>
		<div style="color: #2a81c4; text-align: center">版权所有：机动车网上交通安全宣传教育监控平台&nbsp;&nbsp;技术支持：浙江网泽</div>
	</div>
</body>
</html>
