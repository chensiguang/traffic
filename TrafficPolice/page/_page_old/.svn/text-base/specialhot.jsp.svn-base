<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() 
			+ "://" 
			+ ( "xsaqjy".equals(request.getServerName()) ? "xsaqjy.ljgps.net" : request.getServerName() )
			+ ( request.getServerPort() == 80 ? "" : ":" + request.getServerPort() ) 
			+ path
			+ "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>合肥市墙体材料革新和建筑节能办公室</title>
<link href="style/css.css" rel="stylesheet" type="text/css"
	media="screen" />
<!--[if IE 6]>
<script type="text/javascript" src="js/DD_belatedPNG_0.0.8a-min.js"></script>
<script>
DD_belatedPNG.fix('.listLboxtit strong');
</script>
<![endif]-->
<script type="text/javascript" src="Scripts/comm.js"></script>
</head>

<body>
	<div class="w1">
		<ul>
			<a href="<%=basePath%>admin/index.jsp" target="_blank">后台管理</a> |
			<a href="javascript:homePage(this)">设为首页</a> |
			<a href="javascript:addFavoite()">加入收藏</a>
		</ul>
		<span id="clock" class="date"></span>
	</div>
	<div class="head">
		<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
			width="980" height="145" id="FlashID" title="logo">
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
							alt="获取 Adobe Flash Player" width="112" height="33" />
						</a>
					</p>
				</div>
				<!--[if !IE]>-->
			</object>
			<!--<![endif]-->
		</object>
	</div>
	<div class="nav">
		<ul>
			<li><a href="<%=basePath%>">首页</a>
			</li>
			<li><a href="agencyfunc_viewAgencyfunc.action">政务公开</a>
			</li>
			<li><a href="dynamicInfo_viewcwList_Front.action" class="on" >信息动态</a>
			</li>
			<li><a href="policies_viewprList_Front.action">政策法规</a>
			</li>
			<li><a href="reform_viewReformList_Front.action">墙材革新</a>
			</li>
			<li><a href="notice_viewNoticeList_Front.action">通知公告</a>
			</li>
<li><a href="enter_viewList_Front.action">企业信息</a></li>
			<li><a href="wall_viewList_Front.action">墙材信息</a></li>
			<li><a href="product_viewProductList_Front.action">产品展示</a>
			</li>
			<li><a href="download_viewDownList_Front.action">下载中心</a>
			</li>
		</ul>
	</div>
	<div class="m2">
		<div class="lboxtop"></div>
		<div class="lboxc">
			<div class="lleft">
				<div class="listLbox">
					<div class="listLboxtit">
						<strong>信息动态</strong>
					</div>
					<div class="listLboxc">
						<ul class="listman">
							<li ><img src="style/llist_ico.png" width="20"
								height="20" /><a href="dynamicInfo_viewcwList_Front.action">市县工作</a>
							</li>
							<li ><img src="style/llist_ico.png" width="20" height="20" /><a
								href="dynamicInfo_viewpiList_Front.action">行业资讯</a>
							</li>
							<li class="on"><img src="style/llist_ico.png" width="20" height="20" /><a
								href="dynamicInfo_viewshList_Front.action">专题热点</a>
							</li>
						</ul>
					</div>
					<div class="listLboxbot"></div>
				</div>
				<div class="box4">
					<div class="boxt">
						<i><a href="policies_viewprList_Front.action">more</a> </i><strong>政策法规</strong>
					</div>
					<div class="boxc">
						<div class="boxcr">
							<ul class="list1">
								<s:iterator value="policiesList" status="policies">
									<li><a target="_blank" 
										href="policies_viewpr_Front.action?id=<s:property value='id' />"><i><s:date
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
					<div class="boxb">
						<div class="l"></div>
						<div class="r"></div>
					</div>
				</div>
				<div class="c"></div>
			</div>
			<div class="lright">
				<div class="box3 leirong">
					<div class="boxt">
						<div class="l"></div>
						<div class="r"></div>
					</div>
					<div class="boxc">
						<div class="boxcr">
							<h1>${dom.title}</h1>
							<h2> 发布时间:${dom.showDataTime} 点击数:${dom.num}
							</h2>
							<div class="ztlr">
								<s:if test="dom.isimgcontent==1">
									<p style="text-align: center;"><img  alt="${dom.title}" src="${dom.imgPath}" /></p>
								</s:if>
								${dom.content}

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
		</div>
		<div class="lboxbot"></div>
	</div>
	<div class="copyright">
		<script language="javascript" type="text/javascript" src="Scripts/footer.js"></script>
	</div>
</body>
</html>