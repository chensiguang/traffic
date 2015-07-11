<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	//String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + path + "/";

	String basePath = request.getScheme() 
			+ "://" 
			+ ( "xsaqjy".equals(request.getServerName()) ? "xsaqjy.ljgps.net" : request.getServerName() )
			+ ( request.getServerPort() == 80 ? "" : ":" + request.getServerPort() ) 
			+ path
			+ "/";

	String flag_temp = (String)request.getParameter("flag") == null ? "" : ((String)request.getParameter("flag")).trim();
	String loginname_temp = (String)request.getParameter("loginname") == null ? "" : ((String)request.getParameter("loginname")).trim();
	String outtime_temp = (String)request.getParameter("outtime") == null ? "" : ((String)request.getParameter("outtime")).trim();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>合肥市墙体材料革新和建筑节能办公室</title>
<link href="style/css.css" rel="stylesheet" type="text/css" media="screen" />

<style type="text/css">
* {
	margin: 0;
	padding: 0;
	list-style-type: none;
}

a,img {
	border: 0;
}

a {
	text-decoration: none;
}
/* slider */
.slider {
	margin: 5px auto;
	width: 300px;
	height: 180px;
	border: 1px solid #ccc;
	position: relative;
	overflow: hidden;
}

.conbox {
	position: absolute; /*必要元素*/
}

.switcher {
	position: absolute;
	bottom: 5px;
	right: 5px;
	float: right;
	z-index: 99;
}

.switcher a {
	background: #fff;
	border: 1px solid #D00000;
	cursor: pointer;
	float: left;
	font-family: arial;
	height: 14px;
	line-height: 14px;
	width: 14px;
	margin: 4px;
	text-align: center;
	color: #D00000;
}

.switcher a.cur,.switcher a:hover {
	background: #FF0000;
	border: 1px solid #D00000;
	height: 20px;
	line-height: 20px;
	width: 20px;
	margin: 0 1px;
	color: #fff;
	font-weight: 800;
}
/* slider1 水平 */
#slider1 .conbox {
	width: 9999em;
}

#slider1 .conbox div {
	width: 300px;
	height: 180px;
	overflow: hidden;
	float: left;
}

#indemo0 { 
    float: left; 
    width: 800%; 
} 
#demo10 { 
    float: left; 
} 
#demo20 { 
    float: left; 
}

</style>
<script type="text/javascript" src="Scripts/jquery.js"></script>
<script type="text/javascript" src="Scripts/jquery.Xslider.js"></script>
<script type="text/javascript" src="Scripts/comm.js"></script>
<!-- 系统调用 -->
<script language="JavaScript" type="text/JavaScript" src="/hfwalls/page/externalcall/js/external_js4.js"></script>

<script type="text/javascript">
$(document).ready(function(){
	
	// 焦点图片淡隐淡现
	$("#slider1").Xslider({
		affect:'fade',
		ctag: 'div'
	});
	
});
</script>
</head>

<body>
	<div class="w1">
		<ul>
			<a href="<%=basePath%>admin/index.jsp" target="_blank">后台管理</a> |
			<a href="javascript:homePage(this)">设为首页</a> |
			<a href="javascript:addFavoite()">加入收藏</a>
		</ul>
		<span id="clock" class="date">
<script language="javascript">
var index_todayDate = new Date();
var index_date = index_todayDate.getDate();
var index_month= index_todayDate.getMonth() + 1;
var index_year= index_todayDate.getFullYear();
	document.write("今天是  : ");
	document.write(index_year);
	document.write("\u5e74");
	document.write(index_month);
	document.write("\u6708");
	document.write(index_date);
	document.write("\u65e5");
	document.write("&nbsp;")

if (index_todayDate.getDay() == 5){
	document.write("\u661f\u671f\u4e94");
}else if (index_todayDate.getDay() == 6){
	document.write("\u661f\u671f\u516d");
}else if (index_todayDate.getDay() == 0){
	document.write("\u661f\u671f\u65e5");
}else if (index_todayDate.getDay() == 1){
	document.write("\u661f\u671f\u4e00");
}else if (index_todayDate.getDay() == 2){
	document.write("\u661f\u671f\u4e8c");
}else if (index_todayDate.getDay() == 3){
	document.write("\u661f\u671f\u4e09");
}else if (index_todayDate.getDay() == 4){
	document.write("\u661f\u671f\u56db");
}
</script>
		</span>
	</div>
	<div class="head">
		<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
			width="980" height="145" id="FlashID" title="">
			<param name="movie" value="style/fg.swf" />
			<param name="quality" value="high" />
			<param name="wmode" value="transparent" />
			<param name="swfversion" value="6.0.65.0" />
			<!-- 此 param 标签提示使用 Flash Player 6.0 r65 和更高版本的用户下载最新版本的 Flash Player。如果您不想让用户看到该提示，请将其删除。 -->
			<param name="expressinstall" value="Scripts/expressInstall.swf" />
			<!-- 下一个对象标签用于非 IE 浏览器。所以使用 IECC 将其从 IE 隐藏。 -->
			<!--[if !IE]>-->
			<object type="application/x-shockwave-flash" data="style/fg.swf"
				width="980" height="145">
				<!--<![endif]-->
				<param name="quality" value="high" />
				<param name="wmode" value="transparent" />
				<param name="swfversion" value="6.0.65.0" />
				<param name="expressinstall" value="Scripts/expressInstall.swf" />
				<!-- 浏览器将以下替代内容显示给使用 Flash Player 6.0 和更低版本的用户。 -->
				<div>
					<h4>此页面上的内容需要较新版本的 Adobe Flash Player。</h4>
					<p>
						<a href="http://www.adobe.com/go/getflashplayer"><img
							src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif"
							alt="获取 Adobe Flash Player" width="112" height="33" /> </a>
					</p>
				</div>
				<!--[if !IE]>-->
			</object>
			<!--<![endif]-->
		</object>
	</div>
	<div class="nav">
		<ul id="topMenu">
			<li><a href="<%=basePath%>" class="on">首页</a></li>
			<li><a href="agencyfunc_viewAgencyfunc.action">政务公开</a></li>
			<li><a href="dynamicInfo_viewcwList_Front.action">信息动态</a></li>
			<li><a href="policies_viewprList_Front.action">政策法规</a></li>
			<li><a href="reform_viewReformList_Front.action">墙材革新</a></li>
			<li><a href="notice_viewNoticeList_Front.action">通知公告</a></li>
			<li><a href="enter_viewList_Front.action">企业信息</a></li>
			<li><a href="wall_viewList_Front.action">墙材信息</a></li>
			<li><a href="product_viewProductList_Front.action">产品展示</a></li>
			<li><a href="download_viewDownList_Front.action">下载中心</a></li>
		</ul>
	</div>
	<div class="m1">
		<div class="mleft">
			<div class="box1 news">
				<div class="boxt">
					<div class="l"></div>
					<div class="r"></div>
				</div>
				<div class="boxc">
					<div class="boxcr">
						<div class="infoPic">
							<div id="slider1" class="slider">
								<div class="conbox">
									<s:iterator value="pdynamicInfoList" status="pdynamicInfo">
										<s:if test="type==1">
											<div>
												<a target="_blank" 
													href="dynamicInfo_viewcw_Front.action?id=<s:property value='id' />"
													title="<s:property value='title' />"><img width="300"
													height="180" alt="<s:property value='title' />"
													src="<s:property value='image' />" />
												</a>
											</div>
										</s:if>
										<s:elseif test="type==2">
											<div>
												<a target="_blank" 
													href="dynamicInfo_viewpi_Front.action?id=<s:property value='id' />"
													title="<s:property value='title' />"><img width="300"
													height="180" alt="<s:property value='title' />"
													src="<s:property value='image' />" />
												</a>
											</div>
										</s:elseif>
										<s:else>
											<div>
												<a target="_blank" 
													href="dynamicInfo_viewsh_Front.action?id=<s:property value='id' />"
													title="<s:property value='title' />"><img width="300"
													height="180" alt="<s:property value='title' />"
													src="<s:property value='image' />" />
												</a>
											</div>
										</s:else>
									</s:iterator>
								</div>
								<div class="switcher">
									<a href="#">1</a> <a href="#">2</a> <a href="#">3</a> <a
										href="#">4</a> <a href="#">5</a>
								</div>
							</div>
							<div id="pictitle"
								style="font-size: 15px; text-align: center; margin-top: 13px;white-space:nowrap;text-overflow:ellipsis; -o-text-overflow:ellipsis; overflow: hidden;"></div>
						</div>
						<div class="infoc">
							<div class="infoTit">
								<i><a href="dynamicInfo_viewcwList_Front.action">more</a> </i><strong>信息动态</strong>
							</div>
							<ul class="list1">
								<s:iterator value="dynamicInfoList" status="dynamicInfo">
									<s:if test="type==1">
										<li><a target="_blank" 
											href="dynamicInfo_viewcw_Front.action?id=<s:property value='id' />"><i><s:date
														name="createtime" format="yyyy/MM/dd" />
											</i>
											<s:property value='title' />
										</a>
										</li>
									</s:if>
									<s:elseif test="type==2">
										<li><a target="_blank" 
											href="dynamicInfo_viewpi_Front.action?id=<s:property value='id' />"><i><s:date
														name="createtime" format="yyyy/MM/dd" />
											</i>
											<s:property value='title' />
										</a>
										</li>
									</s:elseif>
									<s:else>
										<li><a target="_blank" 
											href="dynamicInfo_viewsh_Front.action?id=<s:property value='id' />"><i><s:date
														name="createtime" format="yyyy/MM/dd" />
											</i>
											<s:property value='title' />
										</a>
										</li>
									</s:else>

								</s:iterator>
							</ul>
							<div class="c"></div>
						</div>
						<div class="c"></div>
					</div>
				</div>
				<div class="boxb">
					<div class="l"></div>
					<div class="r"></div>
				</div>
			</div>
		</div>
		<div class="mright">
			<div class="box2 login">
				<div class="boxt">
					<strong>网上办公</strong>
				</div>
				<div class="boxc">
					<!--
					<div class="boxcr">
						<ul class="login_c">
							<li><label class="r1" for="textfield">用户名：</label> <input
								class="Sinput" type="text" name="textfield" id="textfield" /></li>
							<li><label class="r1" for="textfield2">密&nbsp;&nbsp;&nbsp;码：</label>
								<input class="Sinput" type="text" name="textfield2"
								id="textfield2" /></li>
							<li><label class="r1" for="passkey_0">密&nbsp;&nbsp;&nbsp;令：</label>
								<div class="radio_btn">
									<input class="hidden Sinput" type="text" name="textfield3"
										id="textfield3" />
									<div class="radio_sel">
										<label> <input name="passkey_0" type="radio"
											id="passkey_0" value="no" checked="checked" /> 无</label> <label>
											<input type="radio" name="passkey_0" value="yes"
											id="passkey_1" /> 有</label>
									</div>
								</div></li>
							<li><a href="#" class="login_btn">登录</a>
							</li>
							<div class="c"></div>
						</ul>
					</div>
					-->
					<!-- 登录div -->
					<div class="boxcr" id="index_login"></div>
					<div style="display:none;">
						<input type="hidden" id="index_flag" name="index_flag" value="<%=flag_temp%>"/>
						<input type="hidden" id="index_loginname" name="index_loginname" value="<%=loginname_temp%>"/>
						<input type="hidden" id="index_outtime" name="index_outtime" value="<%=outtime_temp%>"/>
					</div>
					<div style=" height:0px;" id="index_login_setmobileemail"></div>
				</div>
				<div class="boxb">
					<div class="l"></div>
					<div class="r"></div>
				</div>
			</div>
		</div>
		<div class="c"></div>
	</div>
	<div class="m1">
		<div class="mleft">
			<div class="ad_mini">
				<img src="style/ad_mini.jpg" width="715" height="66" alt="小广告" />
			</div>
			<div class="c"></div>
			<div class="box1 zcfg">
				<div class="boxt">
					<i><a href="policies_viewprList_Front.action">more</a> </i><strong>政策法规</strong>
				</div>
				<div class="boxc">
					<div class="boxcr">
						<ul class="list1">
							<s:iterator value="policiesList" status="policies">
								<li><a target="_blank" 
									href="policies_viewpr_Front.action?id=<s:property value='id' />"><i><s:date
												name="createtime" format="yyyy/MM/dd" />
									</i>
									<s:property value='title' />
								</a>
								</li>
							</s:iterator>
						</ul>
						<div class="c"></div>
					</div>
				</div>
				<div class="boxb">
					<div class="l"></div>
					<div class="r"></div>
				</div>
			</div>
			<div class="box1 qcgx">
				<div class="boxt">
					<i><a href="reform_viewReformList_Front.action">more</a> </i><strong>墙材革新</strong>
				</div>
				<div class="boxc">
					<div class="boxcr">
						<ul class="list1">
							<s:iterator value="reformList" status="reform">
								<li><a target="_blank" 
									href="reform_viewReform_Front.action?id=<s:property value='id' />"><i><s:date
												name="createtime" format="yyyy/MM/dd" />
									</i>
									<s:property value='title' />
								</a>
								</li>
							</s:iterator>
						</ul>
						<div class="c"></div>
					</div>
				</div>
				<div class="boxb">
					<div class="l"></div>
					<div class="r"></div>
				</div>
			</div>
		</div>
		<div class="mright">
			<div class="box1">
				<div class="boxt">
					<div class="l"></div>
					<div class="r"></div>
				</div>
				<div class="boxc">
					<div class="boxcr">
						<div class="tzgg">
							<div class="Tit">
								<i><a href="notice_viewNoticeList_Front.action">more</a> </i><strong>通知公告</strong>
							</div>
							<ul class="list1">
								<s:iterator value="noticeList" status="notice">
									<li><a target="_blank" 
										href="notice_viewNotice_Front.action?id=<s:property value='id' />"><i><s:date
													name="createtime" format="MM/dd" />
										</i>
										<s:property value='title' />
									</a>
									</li>
								</s:iterator>
							</ul>
							<div class="c"></div>
						</div>
						<div class="bgl">
							<div class="Tit">
								<i><a href="publicity_viewPublicityList_Front.action">more</a> </i><strong>曝光栏</strong>
							</div>
							<ul class="list1">
								<s:iterator value="publicityList" status="publicity">
									<li><a target="_blank" 
										href="publicity_viewPublicity_Front.action?id=<s:property value='id' />"><i><s:date
													name="createtime" format="MM/dd" />
										</i>
										<s:property value='title' />
									</a>
									</li>
								</s:iterator>
							</ul>
							<div class="c"></div>
						</div>
					</div>
				</div>
				<div class="boxb">
					<div class="l"></div>
					<div class="r"></div>
				</div>
			</div>
		</div>
		<div class="c"></div>
	</div>
	<div class="ad">
		<img src="style/ad1.jpg" width="980" height="129" alt="广告1" />
	</div>
	<div class="m1">
		<div class="mleft">
			<div class="box1 qyxx">
				<div class="boxt">
					<i><a href="enter_viewList_Front.action">more</a> </i><strong>企业信息</strong>
				</div>
				<div class="boxc">
					<!--
					<div class="boxcr">
						<ul class="list1">
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
						</ul>
						<div class="c"></div>
					</div>
					-->
					<!-- 新型墙材企业div -->
					<div class="boxcr" id="index_newwallcomp"></div>
				</div>
				<div class="boxb">
					<div class="l"></div>
					<div class="r"></div>
				</div>
			</div>
			<div class="box1 cpxx">
				<div class="boxt">
					<i><a href="wall_viewList_Front.action">more</a> </i><strong>墙材信息</strong>
				</div>
				<div class="boxc">
					<!--
					<div class="boxcr">
						<ul class="list1">
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
							<li><a href="#"><i>2012/06/05</i>道路科研创新团队</a>
							</li>
						</ul>
						<div class="c"></div>
					</div>
					-->
					<!-- 新型墙体材料div -->
					<div class="boxcr" id="index_newwallprod"></div>
				</div>
				<div class="boxb">
					<div class="l"></div>
					<div class="r"></div>
				</div>
			</div>
		</div>
		<div class="mright">
			<div class="kjfw">
				<div class="kjfwTop">
					<strong>快捷服务</strong>
				</div>
				<ul>
					<li><a href="mailto:${mail}" class="zrxx">主任信箱</a>
					</li>
					<li><a href="enchiridion_viewList_Front.action" class="bszn">办事指南</a>
					</li>
					<li><a href="agencyfunc_viewAgencyfunc.action" class="jgzl">机构职能</a>
					</li>
				</ul>
			</div>
		</div>
		<div class="c"></div>
	</div>
	<div class="m1">
		<div class="box2 cpzs">
			<div class="boxt">
				<strong>产品展示</strong>
			</div>
			<div class="boxc">
				<div class="boxcr">
					<div id="demo0" class="rongqi">
						<div id="indemo0">
							<div id="demo10">
								<s:iterator value="productList" status="product">
									<dl>
										<dt>
											<a target="_blank" 
												href="product_viewProduct_Front.action?id=<s:property value='id' />"><img
												src="<s:property value='image' />" width="135" height="98"
												alt="<s:property value='pname' />" /> </a>
										</dt>
										<dd>
											<a target="_blank" 
												href="product_viewProduct_Front.action?id=<s:property value='id' />"><s:property
													value='pname' /> </a>
										</dd>
									</dl>
								</s:iterator>
							</div>
							<div id="demo20"></div>
						</div>
					</div>
				</div>
			</div>
			<script language="javascript">var speed0=40; //数字越大速度越慢 
var tabb=document.getElementById("demo0"); 
var tabb1=document.getElementById("demo10"); 
var tabb2=document.getElementById("demo20"); 
tabb2.innerHTML=tabb1.innerHTML+tabb1.innerHTML; 
function Marquee2(){
  if(tabb2.offsetWidth-tabb.scrollLeft<=0) 
  tabb.scrollLeft-=tabb1.offsetWidth;
  else{ 
  tabb.scrollLeft++; 
  } 
} 
var MyMar2=setInterval(Marquee2,speed0); 
tabb.onmouseover=function(){clearInterval(MyMar2)}; 
tabb.onmouseout=function(){MyMar2=setInterval(Marquee2,speed0)}; 
--> 
</script>
			<div class="boxb">
				<div class="l"></div>
				<div class="r"></div>
			</div>
		</div>
		<div class="c"></div>
	</div>
	<div class="m1">
		<div class="box2 yqlj">
			<div class="boxt">
				<strong>友情链接</strong>
			</div>
			<div class="boxc">
				<div class="boxcr">
					<dl>
						<dt>政&nbsp;府&nbsp;类</dt>
						<dd>：
							<s:iterator value="linkList" status="link">
								<s:if test="type==0">
									<a href="<s:property value='lineurl' />"><s:property
											value='title' />
									</a> | 
							</s:if>
							</s:iterator>
						</dd>
					</dl>
					<dl>
						<dt>墙&nbsp;改&nbsp;办</dt>
						<dd>：
							<s:iterator value="linkList" status="link">
								<s:if test="type==1">
									<a href="<s:property value='lineurl' />"><s:property
											value='title' />
									</a> | 
							</s:if>
							</s:iterator>
						</dd>
					</dl>
					<dl>
						<dt>建设领域</dt>
						<dd>：
							<s:iterator value="linkList" status="link">
								<s:if test="type==2">
									<a href="<s:property value='lineurl' />"><s:property
											value='title' />
									</a> | 
							</s:if>
							</s:iterator>
						</dd>
					</dl>
					<dl>
						<dt>企&nbsp;业&nbsp;类</dt>
						<dd>：
							<s:iterator value="linkList" status="link">
								<s:if test="type==3">
									<a href="<s:property value='lineurl' />"><s:property
											value='title' />
									</a> | 
							</s:if>
							</s:iterator>
						</dd>
					</dl>
					<div class="c"></div>
				</div>
			</div>
			<div class="boxb">
				<div class="l"></div>
				<div class="r"></div>
			</div>
		</div>
		<div class="c"></div>
	</div>
	<div class="copyright">
		<script language="javascript" type="text/javascript"
			src="Scripts/footer.js"></script>
	</div>
</body>
</html>