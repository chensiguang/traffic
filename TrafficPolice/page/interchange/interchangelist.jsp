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
    <div class="jt_h3 pos"><span class="main_left"><img src="${projectpath}/page/images/icon08.png"  align="absmiddle" />&nbsp;&nbsp;问题互动</span><span class="gb"><a href="#"><img src="${projectpath}/page/images/close.png" width="10" height="10" /></a></span></div>
    <div class="box_nr1">
		<div class="inter_nr1">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" style="margin-bottom:0px;" id="interlisthtml">
		</table>
		</div>
	
		 <div class="clear"></div>
		 <div class="sabrosus"><div id='Pagination' class="pagination"></div>
		 </div>
		 <div id="TB_overlayBG"></div>
    </div>
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


//分页回调函数
function pageselectCallback(page_index, jq){
	// Get number of elements per pagionation page from form
	page_index = page_index + 1;
	var newcontent = '';
	$.ajax({
		type:'post',//可选get
		url:'getInterchangeDateinterlist.action',//这里是接收数据的PHP程序
		data:'currentpage='+page_index+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
			var re =eval('('+data+')');
			var  a = 0;
  
			if(re.size > 0)
			{
				for(var i =0 ; i<re.interchanges.length;i++)
				{
				a=i+1;
					 newcontent +='<tr><td width="100%" height="50" align="left"><strong>'+a+". "+re.interchanges[i].question+'</strong></td></tr><tr><td align="left">答：'+re.interchanges[i].answer+'</td></tr>';
				}
			}
			$('#interlisthtml').html(newcontent);
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
