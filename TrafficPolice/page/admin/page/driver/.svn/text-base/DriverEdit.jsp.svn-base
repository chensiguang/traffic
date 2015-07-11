<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.web.pojo.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String basePath = (String)session.getAttribute("basePath");
	String orgid  = request.getParameter("orgid");
	String repeat = request.getParameter("repeat");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/TrafficPolice/page/admin/css/style.css" rel="stylesheet" type="text/css" />
<link href="/TrafficPolice/page/admin/css/kindeditor/default.css" rel="stylesheet" type="text/css" />
<style type="text/css">td {text-align: left}</style>

<script type="text/javascript" src="/TrafficPolice/page/admin/javascript/jquery.min.js"></script>
<script type="text/javascript" src="/TrafficPolice/page/admin/javascript/kindeditor-min.js"></script>
<script type="text/javascript" src="/TrafficPolice/page/admin/javascript/zh_CN.js"></script>
<script type="text/javascript" src="/TrafficPolice/page/admin/javascript/ajaxfileupload.js"></script>
<script type="text/javascript" src="/TrafficPolice/page/admin/javascript/jquery-html5Validate.js"></script>
<script type="text/javascript" src="/TrafficPolice/page/admin/My97DatePicker/WdatePicker.js"></script>

<!-- 页面人员，车辆选中，删除的js，css -->
<link href="/TrafficPolice/page/admin/safegroupjs/jquery-ui-1.8.7.custom.css" rel="stylesheet" type="text/css" />
<link href="/TrafficPolice/page/admin/safegroupjs/css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="/TrafficPolice/page/admin/safegroupjs/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="/TrafficPolice/page/admin/safegroupjs/jquery-ui-1.8.7.custom.min.js"></script>
<script type="text/javascript" src="/TrafficPolice/page/admin/safegroupjs/email.min.js"></script>
<script type="text/javascript" src="/TrafficPolice/page/admin/javascript/jquery.js"></script>

<script type="text/javascript" src="/TrafficPolice/page/admin/safegroupjs/jquery.js"></script>
<link rel="stylesheet" href="/TrafficPolice/page/js/pagination/pagination.css" /> 
<script type="text/javascript" src="/TrafficPolice/page/js/pagination/jquery.pagination.js"></script>
<script type="text/javascript" src="/TrafficPolice/page/js/autoscreen.js"></script>
 <!-- the mousewheel plugin -->
<script type="text/javascript" src="/TrafficPolice/page/js/jScroll/jquery.mousewheel.js"></script>
<!-- the jScrollPane script -->
<script type="text/javascript" src="/TrafficPolice/page/js/jScroll/jquery.jscrollpane.min.js"></script>
<script type="text/javascript" src="/TrafficPolice/page/js/jScroll/scroll-startstop.events.jquery.js"></script>
<script type="text/javascript" src="/TrafficPolice/page/js/util.js"></script>
<script type="text/javascript" src="/TrafficPolice/page/css/css.css"></script>
</head>
<body style="padding-top: 10px">
 <div class="pageTitle"  align="left">${title}</div>
    <div class="box_nr1  padding">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="38%" align="left" valign="top" >
	<div  style="border:2px solid #D8DFEA;height:500px">
	  <ul class="fg_list1" id='rulelisthtml'>
        	<div id="contentWrap" align="center">
		<form name="company_edit_form" id="company_edit_form" action="${action}" method="post">
		<br/><br/>
			<table cellpadding="0" cellspacing="5" width="600px" align="center" >
				<tr style="height: 3px">
					<td>&nbsp;&nbsp;&nbsp;姓名:<input type="text" style="width: 200px; height: 22px;"
						name="dom.name" value="${dom.name}" maxlength="100" required="true"/>&nbsp;<font color="#FF0000">*</font></td>
					<td>登陆账号：<input type="text" style="width: 200px; height: 22px;"
						name="dom.loginname" value="${dom.loginname}" maxlength="100" required="true"/>&nbsp;<font color="#FF0000">*</font></td>
				</tr>
				
				 <tr style="height: 45px">
					<td>&nbsp;&nbsp;&nbsp;性别:<input  type="radio" name="dom.sex" value="男" <s:if test='dom.sex == "男"'>checked="checked"</s:if>/>&nbsp;男
					<input  type="radio" name="dom.sex" value="女" <s:if test='dom.sex == "女"'>checked="checked"</s:if>/>&nbsp;女</td>
					<td>
					登陆密码：<input type="text" style="width: 200px; height: 22px;"
						name="dom.password" value="${dom.password}" maxlength="100" required="true"/>&nbsp;<font color="#FF0000">*</font>
					</td>
				</tr>
				
				 <tr style="height: 45px">
					<td>&nbsp;&nbsp;&nbsp;年龄:<input style="width: 200px; height: 22px;" type="number" name="dom.age" value="${dom.age}"/></td>
					<td>
					管辖车辆:<textarea id="cartxt" style="width: 200px; height: 22px;" name="dom.cars">${dom.cars}</textarea>
					</td>
				</tr>
				
				 <tr style="height: 45px">
				 <td>准驾车型:<input style="width: 200px; height: 22px;" type="text" name="dom.cartype" value="${dom.cartype}"/></td>
					<td>所属企业:
					
					<select name="dom.dwid" id="getcomid" style="width: 200px; height: 22px;" onchange="getcomid()" required="true">
					<!-- <option value="">请选择所属企业--</option> -->
					<s:iterator value="companylist" status="com">
					 <option value='<s:property value="comid" />' <s:if test="comid == dom.dwid">selected="selected"</s:if>>
					    <s:property value="comname" />
					 </option>
					 </s:iterator>
					</select>&nbsp;<font color="#FF0000">*</font><!-- &nbsp;<input name="dom.dwid"/> -->
					</td>
				</tr>
			
				<tr style="height: 45px">
					<td>身份证号:<input style="width: 200px; height: 22px;" type="text" name="dom.identitycard" value="${dom.identitycard}"/></td>
					<td>
					驾驶证号:<input style="width: 200px; height: 22px;" type="text" name="dom.licenseno" value="${dom.licenseno}"/>
					</td>
				</tr>
			
				<tr style="height: 45px">
					<td>年审日期:<input id="d11" onClick="WdatePicker()" style="width: 200px; height: 22px;" type="text" name="dom.certificationtime" value="${dom.certificationtime}"/></td>
					<td>
					&nbsp;&nbsp;&nbsp;电话:<input style="width: 200px; height: 22px;" type="text" name="dom.phone" value="${dom.phone}"/>
					</td>
				</tr> 
				
				<tr style="height: 45px">
					<td>有效日期:<input id="d12" onClick="WdatePicker()" style="width: 200px; height: 22px;" type="text" name="dom.validtime" value="${dom.validtime}"/></td>
					<td>&nbsp;&nbsp;&nbsp;地址:<input style="width: 200px; height: 22px;" type="text" name="dom.address" value="${dom.address}"/></td>
				</tr>
			
				<tr style="height: 45px">
					<td>&nbsp;&nbsp;&nbsp;备注:
						<textarea style="width: 200px; height: 40px;" type="text" name="dom.remark"/>${dom.remark}</textarea>
					</td>
				</tr> 
				
				<tr>
					<td style="height: 50px; text-align: center" colspan="2" valign="middle">
						<input type="submit" value="提 交"/>
						<input type="button" value="清 空" onClick="resetfunction();"/>
						<input type="button" value="返 回" name="text" onClick="javascript:history.back();"/>
						<input type="hidden" value="${id }" name="id" />
					</td>
				</tr>
			</table>
		</form>
	</div>
      </ul>
	
      <div class="clear"></div>
      <div class="sabrosus"><div id='Pagination' class="pagination"></div></div>
	   </div>
    </td>

	<td align="left" valign="top" class="autowidth" id="contentdetail">
    <div id="jp-container" class="jp-container ">
     	<div style="padding:10px 15px; line-height:22px" >
  			
					<div class=lxr id=lxr>
						<div class=tt><input style="width: 400px; height: 22px;" value="公司人员车辆信息" onfocus="if(value=='公司人员车辆信息') {value=''}" onblur="if (value=='') {value='公司人员车辆信息'}"/></div>
				    </div>
				    
				    <div id=dialog title="Dialog Title">
	      	<table>
			<tbody>
				<tr>
					<td>
						<div class=left>
							<div class=groupclose>
								<input class=groupcloselm_ico type=button />公司车辆
							</div>
							<div id="carhtml" class=groupSub>
							</div>
						</div>
					</td>
					<td><img src="/TrafficPolice/page/admin/safegroupjs/arrow_left.gif"></td>
					<td>
						<div class=right></div>
					</td>
				<tr></tr>
			</tbody>
		</table>
	</div> 
        </div>
	</div>
    </td>
  </tr>
</table>	
    </div>
</body>
<script type="text/javascript">
//获取录入的信息
var repeat = '<%=repeat%>';
if(repeat != "" && repeat != "null")
{
	history.back();
}
//右边页面显示栏
function getcomid()
{
	var dwid = $("#getcomid").val();
	alert(dwid);
	var car ='';
$.ajax({
	type:'post',//可选get
	url:'/TrafficPolice/page/admin/page/driverback_carlist.action',//这里是接收数据的PHP程序
	data:'dwid='+dwid+'',//传给PHP的数据，多个参数用&连接
	dataType:'Json',//服务器返回的数据类型 可选XML ,Json jsonp script html text等
	contentType: "application/x-www-form-urlencoded; charset=utf-8", 
	success:function(data){
	//这里是ajax提交成功后，PHP程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
	var re =eval('('+elformat(data)+')');
	//alert(data);
		if(re.size > 0)
		{
			for(var i =0 ; i<re.cars.length;i++)
			{
				car +='<div class="info" id="carinfo" type="button"  onmousemove=this.style.color="red" onmouseout=this.style.color="black" onclick="javascript:addcar($(this).text())">'+re.cars[i].busLicPlate+'<'+re.cars[i].carid+'></div>';
			}
		}
		$('#carhtml').html(car);
	},
	error:function(){
		alert('error');
	}
});
}

var cararray = new Array();
var caridarray = new Array();
function addcar(carinfo)
{
	var carinfo = carinfo + ';';
	var str = carinfo.split(";");
	for(var i = 0; i < str.length - 1;i++)
		{
		    var str2 = str[i];
		    var str3 = str2.split(">");
		    var str4 = str3[0].split("<");
		    var  car = str4[0];
		    var carid = str4[1];
		    if(cararray.length == 0)
		    	{
		    	  cararray.push(car);
			      $("#cartxt").append(car + ";");
		    	}else
		    		{
		    		   var count = 0;
		    		  for(var j=0; j < cararray.length;j++ )
					   {
		    			  
					       var dri = cararray[j];
					       if(car == dri )
						   {
					    	   count +=1;
						   }
					   }
		    		  if(count != 1)
			    	   {
			    	      cararray.push(car);
					      $("#cartxt").append(car + ";");
			    	   }
		    		}
		    if(caridarray.length == 0)
	    	{
		    	caridarray.push(carid);
		      $("#caridtxt").append(carid + "#");
	    	}else
	    		{
	    		   var count = 0;
	    		  for(var k=0; k < caridarray.length;k++ )
				   {
	    			  
				       var cid = caridarray[k];
				       if(carid == cid )
					   {
				    	   count +=1;
					   }
				   }
	    		  if(count != 1)
		    	   {
	    			  caridarray.push(carid);
				      $("#caridtxt").append(carid + "#");
		    	   }
	    		}
		}
}
</script>
</html>
