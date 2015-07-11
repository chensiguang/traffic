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
<script type="text/javascript" src="/TrafficPolice/page/css/css.css"></script>
</head>

<body>

<%@ include file="../head/head.jsp"%> 
<% 
 String id = (String)request.getParameter("id");
%>

<div class="main autowidth">
	<div class="box">
    <div class="jt_h3 pos"><span class="main_left"><img src="${projectpath}/page/images/icon01.png" width="18" height="20" align="absmiddle" />&nbsp;&nbsp;交通法规</span><span class="gb"><a href="#"><img src="${projectpath}/page/images/close.png" width="10" height="10" /></a></span></div>
    <div class="box_nr1  padding">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="38%" align="left" valign="top" >
	<div  style="border:2px solid #D8DFEA;height:500px">
	  <ul class="fg_list1" id='rulelisthtml'>
        
      </ul>
	
      <div class="clear"></div>
      <div class="sabrosus"><div id='Pagination' class="pagination"></div></div>
	   </div>
    </td>
	<td width="2%">
	    <img src="${projectpath}/page/images/jt.gif"></img>
	</td>
	
	<td align="left" valign="top" class="autowidth" id="contentdetail">
    <div id="jp-container" class="jp-container ">
      <div style="padding:10px 15px; line-height:22px" id="contenthtml">
	  
      </div>
	</div>
    
    </td>
  </tr>
</table>	
    </div>
  </div>	
<div style="color:#fff; text-align:center">Copyright © 2013  版权所有：浙江网泽科技有限公司  技术支持：浙江网泽科技有限公司</div>
</div>
</body>
<script type="text/javascript">
var pid=<%=id%>;
if(pid == "" || pid ==null)
pid =0;
loadRuleContent(parseInt(pid));
//分页回调函数
function pageselectCallback(page_index, jq){
	// Get number of elements per pagionation page from form
	page_index = page_index + 1;
	var newcontent = '';
	$.ajax({
		type:'post',//可选get
		url:'getRuleDateruleList.action',//这里是接收数据的PHP程序
		data:'currentpage='+page_index+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
			var re =eval('('+data+')');
			
			if(re.size > 0)
			{
				for(var i =0 ; i<re.rules.length;i++)
				{
					 <!--newcontent +='<li><a onmousemove=this.style.color="blue" onmouseout=this.style.color="#044885" style="cursor:pointer;" href="#" onclick="loadRuleContent('+re.rules[i].id+')">'+re.rules[i].title+'</a></li>';-->
					  if(pid !=0 && pid == parseInt(re.rules[i].id))
					  newcontent +='<li><a onmousemove=this.style.color="blue" onmouseout=this.style.color="#044885" style="cursor:pointer;color:blue;" href="#" onclick="loadRuleContent('+re.rules[i].id+')">'+re.rules[i].title+'</a></li>';
					  else 
					  newcontent +='<li><a onmousemove=this.style.color="blue" onmouseout=this.style.color="#044885" style="cursor:pointer;" href="#" onclick="loadRuleContent('+re.rules[i].id+')">'+re.rules[i].title+'</a></li>';
					 
					 if(i==0 && pid ==0)
					 {
					 	loadRuleContent(re.rules[i].id);
					 }
				}
			}
			$('#rulelisthtml').html(newcontent);
		},
		error:function(){
			alert('error');
		}
	});
	// Replace old content with new content
	
	// Prevent click eventpropagation
	return false;
}

//右边页面显示栏
function loadRuleContent(id)
{
		var newcontent ='';
	$.ajax({
		type:'post',//可选get
		url:'getRuleDateinfo.action',//这里是接收数据的PHP程序
		data:'ruleid='+id+'&random='+Math.random(),//传给PHP的数据，多个参数用&连接
		dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
		contentType: "application/x-www-form-urlencoded; charset=utf-8", 
		success:function(data){
		//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！

			var re =eval('('+elformat(data)+')');
				newcontent +='<p style="text-align:center;font:14px;"><strong>'+re.ruleTitle+'</strong></p>';
				newcontent +='<p style="text-align:center;">时间: '+re.ruleInsertTime+'</p>';
				newcontent +='<p>'+re.ruleContent+'</p>';
			$('#contenthtml').html(newcontent);
			
			autoscroll();
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
	opt.items_per_page = '15';
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
// When document has loaded, initialize pagination and form
$(function(){
	// Create pagination element with options from form
	var optInit = getOptionsFromForm();
	$("#Pagination").pagination(${count}, optInit);

	//自动适应屏幕宽度js
	var opt = {'widthname':'autowidth','callback':function(e){contentappend();autoscroll();}};
	
	opt = atuoscreen(opt);

	//$(document).bind("keydown",function(e){if(e.which == 122)flag=false;});
	window.onresize=function(){
			opt = atuoscreen(opt);
	};
	
});
</script>
</html>
