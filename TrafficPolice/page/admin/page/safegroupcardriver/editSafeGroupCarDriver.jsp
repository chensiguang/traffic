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
<script type="text/javascript" src="page/admin/videouploadjs/ajaxfileupload.js"></script>

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
				<tr style="height: 45px">
					<td>&nbsp;&nbsp;&nbsp;企业名称:</td>
					<td>
					<s:iterator value="comList" status="com">
					<textarea style="width: 400px; height: 22px;" id="comid" readonly="readonly" required="true"><s:property value="comname"/></textarea>&nbsp;<em>*</em>
					<input name="dom.dwid" type="hidden" value="<s:property value="comid"/>"/>
					</s:iterator>
					</td>
				</tr>
			 	<tr style="height: 45px">
					<td>&nbsp;&nbsp;&nbsp;安全组组名:</td>
					<td>
					<select name="dom.groupid" id="groupname" style="width: 400px; height: 22px;" required="true">
					<s:iterator value="safeList" status="safe">
					<option value="<s:property value="groupid"/>"><s:property value="groupname"/></option>
					</s:iterator>
					</select>&nbsp;<em>*</em>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td>&nbsp;&nbsp;&nbsp;组长:</td>
					<td>
					<select name="dom.zzid" id="groupname" style="width: 400px; height: 22px;" required="true" >
					<s:iterator value="zzid" status="safe">
					<option value="<s:property value="id"/>"><s:property value="name"/></option>
					</s:iterator>
					</select>&nbsp;<em>*</em>
					</td>
				</tr>
				<tr style="height: 45px">
					<td>&nbsp;&nbsp;&nbsp;驾驶员:</td>
					<td>
					<select name="dom.driverid" style="width: 400px; height: 22px;" name="dom.cars">
					<option value="0">请选择驾驶员</option>
					<s:iterator value="driverList">
					<option value="<s:property value="id"/>"><s:property value="name"/></option>
					</s:iterator>
					</select>
					</td>
				</tr>
				<tr style="height: 60px">
					<td>&nbsp;&nbsp;&nbsp;车辆:</td>
					<td>
					<select name="dom.carid" style="width: 400px; height: 22px;" name="dom.cars">
					<option value="0">请选择驾驶员</option>
					<s:iterator value="carList">
					<option value="<s:property value="carid"/>"><s:property value="busLicPlate"/></option>
					</s:iterator>
					</select>
					</td>
				</tr>
				
				<tr style="height: 45px">
					<td valign="top">&nbsp;&nbsp;&nbsp;备注:</td>
					<td>
						<textarea style="width: 400px; height: 60px;" name="dom.remark">${dom.remark}</textarea>
					</td>
				</tr> 
				
				<tr>
					<td style="height: 50px; text-align: center" colspan="2" valign="middle">
						<input type="submit" value="提 交"/>
						<input type="button" value="清 空" onClick="resetfunction();"/>
						<input type="button" value="返 回" name="text" onClick="javascript:history.back();"/>
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
</script>
</html>
