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

</head>

<body>

<%@ include file="../head/head.jsp"%> 


<div class="main">


<div class="box">
      
      
      
      <div class="nTab">
    <!-- 标题开始 -->
    <div class="TabTitle">
    <div class="jt_h3 pos"><span class="left main_left"><img src="${projectpath}/page/images/icon02.png" align="absmiddle" />&nbsp;&nbsp;宣教中心</span><span class="gb"><a href="#"><img src="${projectpath}/page/images/close.png" width="10" height="10" /></a></span>
      <ul id="myTab0">
        <li class="active" onmouseover="nTabs(this,0);">视频</li>
      </ul>
    </div>
    </div>
    <!-- 内容开始 -->
    <div class="TabContentny padding">
      <div id="myTab0_Content0">
     <div style="padding-left:15px;">
     <div id="jp-container" class="jp-container">
    <div style="padding:10px 15px; line-height:22px">
    <iframe height=498 width=510 src="${eduVideo.videoUrl}" allowfullscreen="true"  frameborder=0></iframe>
      </div>
</div>
</div>
<script type="text/javascript">
		$(function() {
			autoscroll();
			window.onresize=function(){
			autoscroll();
			};
		});
	</script>
     
	  </div>
      <div id="myTab0_Content1" class="none">
	  <div style="padding:10px 15px; line-height:22px">
       <iframe height=498 width=480 src="${eduVideo.videoUrl}" allowfullscreen="true"  frameborder=0></iframe>
	  <p>${eduVideo.videoTitle}</p>
	  <p>时间：${eduVideo.videoReleaseTime}</p>
	  <p>${eduVideo.content}</p>
      </div>
	  </div>
    </div>
</div>
    
    </div>
<div class="clear"></div>    
<div style="color:#2a81c4; text-align:center">版权所有：机动车网上交通安全宣传教育监控平台&nbsp;&nbsp;技术支持：浙江网泽</div>
</div>

</body>
</html>
