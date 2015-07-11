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
<div class="box ">
     
    <div class="nTab2 ">
    <!-- 标题开始 -->
    <div class="TabTitle2 ">
    <div class="jt_h3 autoheight pos "><span class="left main_left"><img src="${projectpath}/page/images/icon08.png" align="absmiddle" />&nbsp;&nbsp;微博微信</span><span class="gb "><a href="#"><img src="${projectpath}/page/images/close.png"/></a></span>
      <ul id="myTab20">
        <li class="active2" onMouseOver="nTabs2(this,0);">微博</li>
        <li class="normal2" onMouseOver="nTabs2(this,1);">微信</li>
      </ul>
    </div>
    </div>
	<div class="box_nr1">
    <!-- 内容开始 -->
    <!--<div class="TabContent2 autoheight">-->
      <div id="myTab20_Content20">
		 <iframe width="100%" height="400" class="share_self"   frameborder="0" scrolling="no" src="http://widget.weibo.com/weiboshow/index.php?language=&width=0&height=550&fansRow=2&ptype=1&speed=0&skin=1&isTitle=1&noborder=1&isWeibo=1&isFans=1&uid=3768869531&verifier=bc944b64&dpc=1"></iframe>
	  </div>
      <div id="myTab20_Content21" class="none">
	  <div class="box_nr1 padding">
		<div class="micro_nr1">
		<table  class="main_table" width="800" border="0" cellspacing="0" cellpadding="0" style="margin-bottom:0px;" id="microlisthtml">
		</table>
		</div>
	
		 <div class="clear"></div>
		 <div class="sabrosus"><div id='Pagination' class="pagination"></div>
		 </div>
		
    </div>
	  </div>
    <!--</div>-->
	</div>
</div>
   
   <div class="clear "></div>
    </div>
	<div style="color:#2a81c4; text-align:center">版权所有：机动车网上交通安全宣传教育监控平台&nbsp;&nbsp;技术支持：浙江网泽</div>
	</div>
</body>
</html>
<script type="text/javascript">
$(function(){
	var optInit = getOptionsFromForm();
	$("#Pagination").pagination(${count}, optInit);
	
	$(".close").click(function(){
		$("#TB_overlayBG").css("display","none");
		$(".boxt").css("display","none");
	});
})


function nTabs2(thisObj,Num){
if(thisObj.className == "active2")return;
var tabObj = thisObj.parentNode.id;
var tabList = document.getElementById(tabObj).getElementsByTagName("li");
for(i=0; i <tabList.length; i++)
{
var width = $(thisObj).css('width');
  if (i == Num)
  {
$(thisObj).removeClass('normal2');
	$(thisObj).removeClass('active2');
    $(thisObj).addClass('active2');      
	document.getElementById(tabObj+"_Content2"+i).style.display = "block";
  }else{
   $(tabList[i]).removeClass('normal2');
   $(tabList[i]).removeClass('active2');
   $(tabList[i]).addClass('normal');
   document.getElementById(tabObj+"_Content2"+i).style.display = "none";
  }
} 
}



//分页回调函数
function pageselectCallback(page_index, jq){
	// Get number of elements per pagionation page from form
	page_index = page_index + 1;
	var newcontent = '';
	$.ajax({
		type:'post',//可选get
		url:'getMicromessageDatemicrolist.action',//这里是接收数据的PHP程序
		data:'currentpage='+page_index+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
			var re =eval('('+data+')');
			var  a = 0;
  
			if(re.size > 0)
			{
				for(var i =0 ; i<re.micromessages.length;i++)
				{
				 if(re.micromessages[i].microname=='下沙交警大队'){
				    if(i%2==0){
					 newcontent +='<tr class="main_table_tr_1"><td align="right" height="50">'+re.micromessages[i].microname+' '+re.micromessages[i].createtime+'<p><strong>'+re.micromessages[i].content+'</strong></p></td></tr>';}
					 else{
					 newcontent +='<tr class="main_table_tr_2"><td align="right" height="50">'+re.micromessages[i].microname+' '+re.micromessages[i].createtime+'<p><strong>'+re.micromessages[i].content+'</strong></p></td></tr>';
					 }
					 }else{
					 if(i%2==0){
					  newcontent +='<tr class="main_table_tr_1"><td align="left" height="50">'+re.micromessages[i].microname+' '+re.micromessages[i].createtime+'<p><strong>'+re.micromessages[i].content+'</strong></p></td></tr>';} else{
					  newcontent +='<tr class="main_table_tr_2"><td align="left" height="50">'+re.micromessages[i].microname+' '+re.micromessages[i].createtime+'<p><strong>'+re.micromessages[i].content+'</strong></p></td></tr>';
					  }
					 }
				}
			}
			$('#microlisthtml').html(newcontent);
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



</script>

