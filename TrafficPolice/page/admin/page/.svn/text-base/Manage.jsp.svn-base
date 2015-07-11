<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.web.pojo.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>



<%
   String path = request.getContextPath();
   String basePath = request.getScheme() + "://" + ("xsaqjy".equals(request.getServerName())? "xsaqjy.ljgps.net":request.getServerName())+ (request.getServerPort() == 80 ? "" : ":"+ request.getServerPort()) + path + "/";
   Long userno = (Long)session.getAttribute("userno");//获得当前登录用户的id用户号
   if(userno == null){response.sendRedirect(basePath + "page/admin/login.jsp"); return;}
   Long admin = (Long)session.getAttribute("adminflag");//获得标记当前登录用户是否为数据管理员
   if(admin == null){response.sendRedirect(basePath + "page/admin/login.jsp");}
   Long dwtype = (Long)session.getAttribute("dwtype");//获得当前登录用户所在单位类型 0代表交警  1代表货运公司
   if(dwtype == null){response.sendRedirect(basePath + "page/admin/login.jsp");}
   String username = (String)request.getSession().getAttribute("username");
   if(username == null){response.sendRedirect(basePath + "page/admin/login.jsp");}
   List<String> list = (List<String>)session.getAttribute("list");//获得权限的集合
   if(list == null){response.sendRedirect(basePath + "page/admin/login.jsp");}
   Long userid = (long)Integer.parseInt((String)request.getSession().getAttribute("driverid"));
   if(userid == null){response.sendRedirect(basePath + "page/admin/login.jsp"); return;}
	Object u = request.getSession().getAttribute("onlineuser");//获得当前登录用户的对象
	if (u == null) {response.sendRedirect(basePath + "page/admin/login.jsp");}//假如获得不到用户，就重新定向到登录页面
	session.setAttribute("basePath",basePath);//把basepath放到session中以便所有的页面使用
%>

<!-- 获取当前日期，时间，星期 -->
<%
String week = ""; 
if(new Date().getDay()==0) week="星期日";
if(new Date().getDay()==1) week="星期一";
if(new Date().getDay()==2) week="星期二" ;
if(new Date().getDay()==3) week="星期三";
if(new Date().getDay()==4) week="星期四";
if(new Date().getDay()==5) week="星期五";
if(new Date().getDay()==6) week="星期六";
java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
java.util.Date currentTime = new java.util.Date();//得到当前系统时间
String date1 = formatter.format(currentTime); //将日期时间格式化
String date2 = currentTime.toString(); //将Date型日期时间转换成字符串形式
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机动车网上交通安全宣传教育监管平台</title>
<link href="page/admin/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="page/admin/javascript/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		//setMenuHeight
		$('.menu').height($(window).height() - 56 - 27 - 26);
		$('.sidebar').height($(window).height() - 56 - 27 - 26);
		$('.page').height($(window).height() - 56 - 27 - 26);
		$('.page iframe').width($(window).width() - 15 - 168);
		$('.subMenu a[href="#"]').next('ul').toggle();
		//menu on and off
		$('.btn').click(function() {
			$('.menu').toggle();

			if ($(".menu").is(":hidden")) {
				$('iframe').width($(window).width() - 15 + 5);
			} else {
				$('iframe').width($(window).width() - 15 - 168);
			}
		});
 
		//
		$('.subMenu a[href="#"]').click(function() {
			$(this).next('ul').toggle();
			return false;
		});
	});
	
	function clickmenu(topage){
		 $('iframe')[0].src = topage;
	}
</script>

<!-- 后台页面权限的分配 -->
<script type="text/javascript">
//页面初始化进行
window.onload = function() 
{
	if("<%=admin%>" == "1")//数据管理员的id号设置为0，当id号为0时，拥有一切权限
		{
			$("li").show();
			$("#otherreprimand").remove();
			$("#driverreprimand").remove();
			
		}
	else
		{
		$("li").hide();
		$("#subMenu").show();
		<%
		if(dwtype == 0)//当登录的账号为交警部门时，默认的显示前台页面的8个模块对应的后台数据管理
		{
		%>
		    $("#firstpage").show();
			$("#rulenmanage").show();
			$("#edunmanage").show();
			$("#baseinfo").show();
			$("#policeorgmanage").show();
			$("#companymanage").show();
			$("#carmanage").show();
			$("#drivermanage").show();
			$("#rulenmanage").show();
			$("#branchmanage").show();
			$("#safenoticemanage").show();
			$("#meetnoticemanage").show();
			$("#interchangemanage").show();
			$("#micromessagemanage").show();
			$("#editpassword").show();
			$("#reprimand").show();
			$("#carlist").show();
	<%}%>
	
	<%
	if(dwtype == 1)//当登录的账号为货运部门时，默认显示货运公司对应的后台数据管理
	{
	%>
	    $("#firstpage").show();
		$("#baseinfo").show();
		$("#interchangemanage").show();
		$("#editpassword").show();
		$("#safelearn").show();
		$("#otherreprimand").show();
		$("#drivermanage").show();
		$("#micromessagemanage").show();
		$("#carmanage").show();
		$("#companymanage").show();
<%}%>

<%
if(dwtype == 2)//当登录的账号为货运部门的驾驶员时，默认显示货运公司驾驶员对应的后台数据管理
{
%>
    $("#firstpage").show();
	$("#baseinfo").show();
	$("#drivermanage").show();
	$("#editpassword").show();
	$("#interchangemanage").show();
	$("#safelearn").show();
	$("#micromessagemanage").show();
	$("#driverreprimand").show();
<%}%>
		<%
		if(u != null)
		{
		    String string = "";
			for(int i = 0;  i < list.size(); i++)
			{
					string = list.get(i);
		%>
		$("#<%=string %>").show();
		<%}}%>
      }
}
</script>
</head>
<body>
	<table border="0" width="100%" height="100%"style="margin: 0; padding: 0; background-color: #198bc9">
		<tr>
			<td colspan="3">
				<div id="header">
				<table border="0" width="100%" height="100%" style="margin: 0; padding: 0;">
				<tr>
				<td width="50%" style="text-align:left">
				<div class="logo fleft">&nbsp;</div>
				</td>
				<td width="30%"></td>
				<td width="20%" style="text-align:right">
				<div  class="logoright fleft" align="right">&nbsp;</div>
				</td>
				</tr>
				</table>
					</div>
			</td>
		</tr>
		
		<tr>
			<td colspan="3" align="left">
			<div class="logofont" style="margin-left:25px">
			<table border="0" width="100%" height="100%" style="margin: 0; padding: 0;">
			<tr><td align="left">
			<font>用户:<%=username %>&nbsp;&nbsp;时间:<%=date1 %>&nbsp;&nbsp;<%=week %>&nbsp;&nbsp;</font>
			</td>
			<td align="right">
			<a href="loginout.action"><font color="#FFFFF0">退出&nbsp;&nbsp;</font></a>
			</td>
			</tr>
			</table>
			</div>
			</td>
		</tr>
		
		<tr>
			<td width="168px">
				<div class="menu fleft">
					<ul>
						<li class="subMenuTitle" id="subMenu">机动车网安教后台管理</li>
						<li class="subMenu" id="firstpage">首页设置</li>
						<li class="subMenu" id="stationmanage"><a href="#">参数配置</a>
							<ul>
								<li><a href="javascript:clickmenu('page/admin/page/config_viewConfigList.action')">网站信息</a>
								</li>
							</ul></li>

						<li class="subMenu" id="accountmanage"><a href="#">系统管理</a>
							<ul>
								<li id="rolemanage"><a href="javascript:clickmenu('page/admin/page/role_viewRoleList.action')">角色管理</a></li>
								<li id="accountmanage"><a href="javascript:clickmenu('page/admin/page/account_viewAccountList.action')">账号管理</a></li>
								<li id="permisionmanage"><a href="javascript:clickmenu('page/admin/page/permission_viewPermissionList.action')">权限管理</a></li>
								<li  id="areamanage"><a href="javascript:clickmenu('page/admin/page/areaback_viewAreaList.action')">地域管理</a></li>
							</ul>
						</li>
						
						<li class="subMenu" id="rulenmanage"><a href="javascript:clickmenu('page/admin/page/ruleback_viewRuleList.action')">交通法规</a></li>
						<li class="subMenu" id="edunmanage"><a href="javascript:clickmenu('page/admin/page/eduback_viewEduList.action')">宣教中心</a></li>

					 <li class="subMenu" id="baseinfo"><a href="#">基本信息</a>
						 <ul>
						    <!-- <li id="policeorgmanage"><a href="javascript:clickmenu('page/admin/page/orgback_viewPoliceOrgList.action')">交警部门</a></li> -->
						    <li  id="orgmanage"><a href="javascript:clickmenu('page/admin/page/policeorgback_viewPoliceOrgList.action')">交警部门</a></li>
						    <li class="subMenu" id="carlist"><a href="javascript:clickmenu('page/admin/page/policeback_viewPoliceList.action')">交警信息</a></li>
							<li id="companymanage"><a href="javascript:clickmenu('page/admin/page/companyback_viewCompanyList.action')">企业安全组</a></li>
							<li id="carmanage"><a href="javascript:clickmenu('page/admin/page/carback_viewCarList.action')">车辆管理</a></li>
							<li id="drivermanage"><a href="javascript:clickmenu('page/admin/page/driverback_viewDriverList.action')">驾驶员管理</a></li>
						  	<li class="subMenu" id="editpassword"><a href="javascript:clickmenu('page/admin/page/account_viewPassword.action?id=<%=userid %>')">修改密码</a></li>
						  </ul>
					 </li>
						<li class="subMenu" id="rulenmanage"><a href="javascript:clickmenu('page/admin/page/illegalback_viewIllegalList.action')">违法查询</a></li>

						<li class="subMenu" id="branchmanage"><a href="javascript:clickmenu('page/admin/page/branchback_viewBranchList.action')">快速处理点</a></li>

						<li class="subMenu" id="safenoticemanage"><a href="javascript:clickmenu('page/admin/page/safenoticeback_viewSafeNoticeList.action')">安全提醒</a></li>

						<li class="subMenu" id="meetnoticemanage"><a href="javascript:clickmenu('page/admin/page/meetnoticeback_viewMeetNoticeList.action')">会议通知</a></li>

						<li class="subMenu" id="safelearn"><a href="javascript:clickmenu('page/admin/page/safelearnback_viewEduList.action')">安全教育学习</a></li>
						
						<li class="subMenu" id="reprimand"><a href="javascript:clickmenu('page/admin/page/reprimandback_viewReprimandList.action')">通报批评</a></li>
					
					    <li class="subMenu" id="otherreprimand"><a href="javascript:clickmenu('page/admin/page/otherreprimandback_viewReprimandList.action')">通报批评</a></li>
					    
					    <li class="subMenu" id="driverreprimand"><a href="javascript:clickmenu('page/admin/page/otherreprimandback_showDriverReprimand.action')">通报批评</a></li>
					   
					    <li class="subMenu" id="interchangemanage"><a href="javascript:clickmenu('page/admin/page/interchangeback_viewInterchangeList.action')">问题答疑</a></li>

						<li class="subMenu" id="micromessagemanage"><a href="javascript:clickmenu('page/admin/page/micromessage/micromessagelist.jsp')">微博互动</a></li>
					
					</ul>
					
				</div>
			</td>
			<td width="5px">
				<div class="sidebar fleft">
					<div class="btn"></div>
				</div>
			</td>
			<td class="page"><iframe width="100%" scrolling="auto"
					height="100%" FRAMEBORDER=0 style="border: medium none;"
					src="/TrafficPolice/page/admin/page/Startpage.jsp" id="rightMain"
					name="right"></iframe>
			</td>
		</tr>
		<tr>
			<td colspan="3"><div id="footer"></div></td>
		</tr>
	</table>
</body>

</html>