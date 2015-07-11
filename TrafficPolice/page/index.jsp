<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String basePath = request.getScheme()
			+ "://"
			+ ("xsaqjy".equals(request.getServerName())
					? "xsaqjy.ljgps.net"
					: request.getServerName())
			+ (request.getServerPort() == 80 ? "" : ":"
					+ request.getServerPort()) + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<base href="<%=basePath%>" />
<title>机动车网上交通安全宣传教育监管平台</title>
<link href="${projectpath}/page/css/css.css" rel="stylesheet" type="text/css" />

<!-- 视频模块所需的 -->
<link href="http://vjs.zencdn.net/c/video-js.css" rel="stylesheet"/>  
<script src="http://vjs.zencdn.net/c/video.js"></script>  
<script type="text/javascript" src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script> 
<script type="text/javascript" src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<script src="http://api.html5media.info/1.1.4/html5media.min.js"></script>



<script type="text/javascript" src="${projectpath}/page/js/jquery.js"></script>
<script type="text/javascript"
	src="${projectpath}/page/js/autoscreen.js"></script>
<script type="text/javascript" src="${projectpath}/page/js/index.js"></script>
<script type="text/javascript"
	src="http://app.mapabc.com/apis?t=javascriptmap&v=3.1.1&key=3dc46b2cab503188ce5ce86c2c22bbcbc9bce56a5f0737ce79ddb1cd63c3b337a315cc8c1e8fe18c"></script>
<script src="${projectpath}/page/js/map/basic.js" type="text/javascript"></script>
<script src="${projectpath}/page/js/map/typeAhead2.js"type="text/javascript"></script>
<!--模态窗口-->
<link rel="STYLESHEET" type="text/css" href="<%=request.getContextPath()%>/page/css/subModal.css">
<script src="<%=request.getContextPath()%>/page/js/mland/common.js"></script>
<script src="<%=request.getContextPath()%>/page/js/mland/subModal.js"></script>	


<script type="text/javascript">
	$(function() {
		var opt = {
			'widthname' : 'autowidth',
			'callback' : function(d) {
				var lidiv = {
					'self' : 'li[limit]',
					'rate' : 51
				};
				$(document.body).limit(d, lidiv);
				var lidiv2 = {
					'self' : '.limit',
					'rate' : 43
				};
				$(document.body).limit(d, lidiv2);
				var lidiv3 = {
					'self' : '.limit2',
					'rate' : 120
				};
				$(document.body).limit(d, lidiv3);
			}
		};
		opt = atuoscreen(opt);
		//$(document).bind("keydown",function(e){if(e.which == 122)flag=false;});
		window.onresize = function() {
			opt = atuoscreen(opt);
		};
		initMap();
		//alert(oldwidth);

	});

	function nTabs(thisObj, Num) {
		if (thisObj.className == "active")
			return;
		var tabObj = thisObj.parentNode.id;
		var tabList = document.getElementById(tabObj)
				.getElementsByTagName("li");
		for (i = 0; i < tabList.length; i++) {
			var width = $(thisObj).css('width');
			if (i == Num) {
				$(thisObj).removeClass('normal');
				$(thisObj).removeClass('active');
				$(thisObj).addClass('active');
				document.getElementById(tabObj + "_Content" + i).style.display = "block";
				//$(thisObj).css('width',width);
			} else {
				$(tabList[i]).removeClass('normal');
				$(tabList[i]).removeClass('active');
				$(tabList[i]).addClass('normal');

				document.getElementById(tabObj + "_Content" + i).style.display = "none";
				//$(tabList[i]).css('width',widths);
			}
		}
	}
</script>

<script type="text/javascript">
	function nTabs1(thisObj, Num,id) {
	if($(thisObj).attr('class') == "active1") return;
	var tabObj = $(thisObj).parent().attr('id');
	
	$('#'+tabObj+' li').each(function(){
		$(this).removeClass(); 
		$(this).addClass("normal1"); 
	});
	$("div[id^="+tabObj+"_Content1]").css("display","none");
	
	$("#"+tabObj+"_Content1"+Num).css("display","block");
	$(thisObj).removeClass(); 
	$(thisObj).addClass("active1"); 
	}
	
//会议通知－详情
function meetNoticeInfo(id){
	showPopWin(encodeURI('<%=basePath%>${projectpath}/page/notice/meetnoticeinfo.jsp?id='+id),600,320,null,null);
    $('#popupTitle').html("会议通知－详情");
}

//安全提醒－详情
function safeNoticeInfo(id){
	showPopWin(encodeURI('<%=basePath%>${projectpath}/page/notice/safenoticeinfo.jsp?id='+id),1200,500,null,null);
    $('#popupTitle').html("安全提醒－详情");
}
</script>

<script type="text/javascript">
function nTabs2(thisObj, Num) {
	if (thisObj.className == "active2")
		return;
	var tabObj = thisObj.parentNode.id;
	var tabList = document.getElementById(tabObj)
			.getElementsByTagName("li");
	for (i = 0; i < tabList.length; i++) {
		var width = $(thisObj).css('width');
		if (i == Num) {
			$(thisObj).removeClass('normal2');
			$(thisObj).removeClass('active2');
			$(thisObj).addClass('active2');
			document.getElementById(tabObj + "_Content2" + i).style.display = "block";
		} else {
			$(tabList[i]).removeClass('normal2');
			$(tabList[i]).removeClass('active2');
			$(tabList[i]).addClass('normal');
			document.getElementById(tabObj + "_Content2" + i).style.display = "none";
		}
	}
}

//基本信息、车辆管理
function nTabs3(thisObj, Num) {
	
	if (thisObj.className == "active3")
		return;
	var tabObj = thisObj.parentNode.id;
	
	var tabList = document.getElementById(tabObj)
			.getElementsByTagName("li");
	for (i = 0; i < tabList.length; i++) {
		var width = $(thisObj).css('width');
		if (i == Num) {
			$(thisObj).removeClass('normal3');
			$(thisObj).removeClass('active3');
			$(thisObj).addClass('active3');
			document.getElementById(tabObj + "_Content3" + i).style.display = "block";
		} else {
			$(tabList[i]).removeClass('normal3');
			$(tabList[i]).removeClass('active3');
			$(tabList[i]).addClass('normal3');
			document.getElementById(tabObj + "_Content3" + i).style.display = "none";
		}
	}
}
</script>

<script type="text/javascript">
function initMap() {
	map_basic_init(11, 'myTab10_Content11', 120.2, 30.3, false);

	$('.branch').each(function() {
		var obj = $(this);
		if (obj.attr('lng') != '' && obj.attr('lat') != '') {
			addmark(obj.attr('lng'), obj.attr('lat'));
		} else {
			addmarkbysearch(obj.parent().find('#branchAddress').text());
		}
	});

}


function addmarkbysearch(keyword) {
//function addmarkbysearch(id,keyword,name,phone,indexid)
	var poiSearchOption = {
		srctype : "POI",//数据来源
		type : "",//数据类别
		number : 1,//每页数量，默认10
		batch : 1,//请求页数，默认1
		range : 3000, //查询范围，默认3000米
		ext : ""//扩展字段
	};

	var poiSearch = new MMap.PoiSearch(poiSearchOption);
	poiSearch
			.byKeywords(
					keyword,
					"0571",
					function(data) {
						//alert(data.list[0].name);	

						var opt = {};
						opt.image = "http://code.mapabc.com/images/lan_1.png";
						opt.size = new MMap.Size(28, 37);
						opt.imageOffset = new MMap.Pixel(0, -18);
						icon = new MMap.Icon(opt);//构造自定义MMap.Icon对象
						if (data.status == 'E0') {
							var marker;
							marker = new MMap.Marker(
									{
										id : "m"+keyword,
										position : new MMap.LngLat(
												data.list[0].x,
												data.list[0].y),
										content : '<image width="28px;" height="37px;" src="http://code.mapabc.com/images/lan_1.png">'
									}) //自定义构造MMap.Marker对象
							map_basic_mapObj.addOverlays(marker); //加载覆盖物

							map_basic_mapObj.setCenter(new MMap.LngLat(
									data.list[0].x, data.list[0].y));
						}

					});
}

function addmark(x, y) {

	var opt = {};
	opt.image = "http://code.mapabc.com/images/lan_1.png";
	opt.size = new MMap.Size(28, 37);
	opt.imageOffset = new MMap.Pixel(0, -18);
	icon = new MMap.Icon(opt);//构造自定义MMap.Icon对象

	var marker;
	marker = new MMap.Marker(
			{
				id : "m",
				position : new MMap.LngLat(x, y),
				content : '<image width="28px;" height="37px;" src="http://code.mapabc.com/images/lan_1.png">'
			}) //自定义构造MMap.Marker对象
	map_basic_mapObj.addOverlays(marker); //加载覆盖物

	map_basic_mapObj.setCenter(new MMap.LngLat(x, y));
}

</script>

<script type="text/javascript">
$(function() {
	if($.browser.msie) {
	alert("this is msie");
	}
	else if($.browser.safari)
	{
	alert("this is safari!");
	}
	else if($.browser.mozilla)
	{
	alert("this is mozilla!");
	}
	else if($.browser.opera) {
	alert("this is opera");
	}
	else {
	alert("i don't konw!");
	} 
	var userAgent = navigator.userAgent.toLowerCase();
	// Figure out what browser is being used
	jQuery.browser = {
	version: (userAgent.match( /.+(?:rv|it|ra|ie)[\/: ]([\d.]+)/ ) || [])[1],
	safari: /webkit/.test( userAgent ),
	opera: /opera/.test( userAgent ),
	msie: /msie/.test( userAgent ) && !/opera/.test( userAgent ),
	mozilla: /mozilla/.test( userAgent ) && !/(compatible|webkit)/.test( userAgent )
	}; 
	$.browser.msie&&($.browser.version == "6.0")&&!$.support.style 
	{
		alert("IE浏览器版本太低，建议您使用IE7及以上浏览器")；
		}
	}

</script>
</head>

<body>
	<%@ include file="head/head.jsp"%>
	<div class="main autowidth ">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="25%" align="left" valign="top">
					<div class="box">
						<div class="jt_h3 autoheight pos">
							<span class="main_left"> <img
								src="${projectpath}/page/images/icon01.png" width="18px;"
								height="20px;" align="absmiddle" />&nbsp;&nbsp;交通法规 <span
								class="gb "><a href="#"><img
										src="${projectpath}/page/images/close.png"
										style="width: 10px; height: 10px;" /></a></span>
							</span>
						</div>
						<div class="box_nr autoheight ">
							<div id=link_logo
								style="OVERFLOW: hidden; WIDTH: 100%; HEIGHT: 280px"
								class="autoheight">
								<div id=link_logo1 style="OVERFLOW: hidden">
									<ul class="fg_list ">
										<s:iterator value="rulelist" status="rule">
											<s:if test="#rule.index < 12">
												<li><a href="${projectpath}/rule_list.action?id=${id}">
													 <s:if test="%{ruleTitle.length() > 27}">
															<s:property value="ruleTitle.substring(0,27) + '...'" />
														</s:if> <s:else>
															<s:property value="ruleTitle" />
														</s:else>
												</a></li>
											</s:if>
										</s:iterator>
									</ul>

								</div>
								<div id=link_logo2></div>
							</div>
							<script>
								var speed = 65
								link_logo2.innerHTML = link_logo1.innerHTML;
								link_logo.scrollTop = 0;
								var height = link_logo1.offsetTop;
								function Marquee_logo() {
									if (link_logo2.offsetTop
											- link_logo.scrollTop <= height + 5) {
										link_logo.scrollTop -= link_logo1.offsetHeight;
									} else {
										link_logo.scrollTop++;
									}
								}
								var MyMar_logo = setInterval(Marquee_logo,
										speed);

								link_logo.onmouseover = function() {
									clearInterval(MyMar_logo);
								}
								link_logo.onmouseout = function() {
									MyMar_logo = setInterval(Marquee_logo,
											speed);
								}
							</script>
						</div>
					</div>
				</td>
				<td width="25%" align="left" valign="top">
					<div class="box ">

						<div class="nTab ">
							<!-- 标题开始 -->
							<div class="TabTitle ">
								<div class="jt_h3 autoheight pos ">
									<span class="left main_left"><img
										src="${projectpath}/page/images/icon02.png" align="absmiddle" />&nbsp;&nbsp;宣教中心</span>
									<span class="gb "><a href="#"><img
											src="${projectpath}/page/images/close.png"
											style="width: 10px; height: 10px;" /></a></span>
									<ul id="myTab0">
										<li class="active" onmouseover="nTabs(this,0);">视频</li>
										<li class="normal" onmouseover="nTabs(this,1);">图文</li>
									</ul>
								</div>
							</div>
							<!-- 内容开始 -->
							<div class="TabContent autoheight">
								<div id="myTab0_Content0">
									<s:if test="video != null">
										 <%-- <iframe width=100% style="height: 280px;" class="autoheight"
											src="${video.videoUrl}" frameborder=0 allowfullscreen></iframe> --%>

										
								<video id="my_video_1" class="video-js vjs-default-skin" controls preload="auto" width="100%" height="280" poster="" data-setup="{}" media.windows-media-foundation.enabled="true">  
                                     <source src="${video.videoUrl}" type='video/mp4'/>  
								</video> 
								
								
									</s:if>
								</div>

								<div id="myTab0_Content1" class="none">
									<table width="90%">
										<s:iterator value="eduList2" status="edu">
											<s:if test="#edu.index <= 2">
												<tr>
													<td rowspan=2><a
														href="/TrafficPolice/admin/page/edu_list.action"><img
															src="<s:property value="img" />" width="125" height="80" /></a>
													</td>
													<td align="left">
													<a href="/TrafficPolice/admin/page/edu_list.action"> <s:if
																test="%{videoTitle.length() > 13}">
																<s:property value="videoTitle.substring(0,13) + '...'" />
															</s:if> <s:else>
																<s:property value="videoTitle" />
															</s:else>
													</a></td>
												</tr>

												<tr>
													<td colspan="2" align="right"><s:date
															name="videoReleaseTime" format="yyyy-MM-dd hh:mm:ss" /></td>
												</tr>
												<tr />
												<tr />
												<tr />
												<tr />
												<tr />
											</s:if>
										</s:iterator>
									</table>
								</div>
								<div id="myTab0_Content2" class="none">3</div>
							</div>
						</div>

					</div>
				</td>


				<td width="25%" align="left" valign="top">
					<div class="box ">
						<div class="nTab3 ">
							<!-- 标题开始 -->
							<div class="TabTitle3 ">
								<div class="jt_h3 autoheight pos ">
									<span class="left main_left"><img
										src="${projectpath}/page/images/icon03.png" align="absmiddle" />&nbsp;&nbsp;基本信息</span><span
										class="gb "><a href="#"><img
											src="${projectpath}/page/images/close.png" /></a></span>
									<ul id="myTab30">
										<li class="active3" onMouseOver="nTabs3(this,0);">基本信息</li>
										<li class="normal3" onMouseOver="nTabs3(this,1);">车辆管理</li>
									</ul>
								</div>
							</div>
							<!-- 内容开始 -->
							<div class="TabContent3 autoheight">
								<div id="myTab30_Content30">
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr
											style="background:url(${projectpath}/page/images/jb_list_top.gif) repeat-x;">
											<td width="15%" height="27" align="center">姓名</td>
											<td width="15%" height="27" align="center">准驾车型</td>
											<td width="25%" height="27" align="center">年审日期</td>
											<td width="25%" height="27" align="center">电话</td>
										</tr>
										<s:iterator value="driverlist" status="driver">
											<s:if test="#request.driver.index <= 7">
												<tr>
													<td height="36px;" align="center">${name}</td>
													<td align="center" title="${cartype}">${cartype}</td>
													<td align="center"><s:date name="certificationtime"
															format="yyyy-MM-dd" /></td>
													<td align="center"><s:if test='phone == null'>
															<s:property value="phone" />
														</s:if> <s:elseif test='phone != null'>
															<s:property
																value="phone.substring(0,4)+'...'+phone.substring(phone.length()-4,phone.length())" />
														</s:elseif></td>
												</tr>
											</s:if>
										</s:iterator>
									</table>
								</div>
								<div id="myTab30_Content31" class="none" style="height: 300px;">
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr style="background:url(${projectpath}/page/images/jb_list_top.gif) repeat-x;">
											<td width="15%" height="27" align="center">车牌号</td>
											<td width="20%" height="27" align="center">车辆类型</td>
											<td width="20%" height="27" align="center">注册时间</td>
											<td width="40%" height="27" align="center">所属公司</td>
										</tr>
										<s:iterator value="carlist" status="car">
											<s:if test="#request.car.index <= 7">
												<tr>
													<td height="36px;" align="center">${busLicPlate}</td>
													<td align="center" title="${busType}">${busType}</td>
													<td align="center"><s:date name="regStartTime"
															format="yyyy-MM-dd" /></td>
													<td align="center" title="${company.comname}">
														<s:if test="%{company.comname.length() > 8}">
															<s:property value="company.comname.substring(0,8)+'...'" />
														</s:if>
														<s:else>
															<s:property value="company.comname" />
														</s:else>
													</td>
												</tr>
											</s:if>
										</s:iterator>
									</table>
								</div>
							</div>
						</div>
						<div class="clear "></div>
					</div>
				</td>


				<td width="25%" align="left" valign="top">
					<div class="box ">
						<div class="jt_h3 autoheight pos">
							<span class="main_left"><img
								src="${projectpath}/page/images/icon04.png" align="absmiddle" />&nbsp;&nbsp;违法查询<span
								class="gb "><a href="#"><img
										src="${projectpath}/page/images/close.png"
										style="width: 10px; height: 10px;"
										class="autoheight autowidth" /></a></span></span>
						</div>
						<div class="box_nr autoheight ">
							<ul class="fg_list ">
								<%
									int j = 0;
								%>
								<s:iterator value="illegallist">
									<%
										j = j + 1;
											if (j < 12) {
									%>
									<a href="${projectpath}/ruleIllegal_list.action?id=${id}" onmousemove=this.style.color="blue" onmouseout=this.style.color="#044885">
										<li title="${illegalTitle}" limit='15'>${illegalTitle}</li>
									</a>
									<%
										}
									%>
								</s:iterator>
							</ul>
						</div>
					</div>
				</td>
			</tr>
		</table>



		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="25%" align="left" valign="top">
					<div class="box ">

						<div class="nTab1 ">
							<!-- 标题开始 -->
							<div class="TabTitle1 ">
								<div class="jt_h3 autoheight pos ">
									<span class="left main_left"><img
										src="${projectpath}/page/images/icon05.png" align="absmiddle" />&nbsp;&nbsp;快速处理点</span><span
										class="gb "><a href="#"><img
											src="${projectpath}/page/images/close.png"
											style="width: 10px; height: 10px;"
											class="autoheight autowidth" /></a></span>
									<ul id="myTab10">
										<li class="active1 autowidth autoheight"
											onmouseover="nTabs1(this,0,0);">列表</li>
										<li class="normal1 autowidth autoheight"
											onmouseover="nTabs1(this,1,0);">地图</li>
									</ul>
								</div>
							</div>
							<!-- 内容开始 -->
							<div class="TabContent1 autoheight">
								<div id="myTab10_Content10">
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr
											style="background:url(${projectpath}/page/images/cl_list_top.gif) repeat-x;">
											<td width="33%" height="27" align="center">快速处理点</td>
											<td width="40%" height="27" align="center">地址</td>
											<td height="27" align="center">电话</td>
										</tr>
										<s:iterator value="branchlist" status="branch">
										 <s:if test="#request.branch.index <= 5">
											<tr>
												<td class="branch" lng="${lng}" lat="${lat}" height="36"
													align="center">${branchName}</td>
												<td align="center" id="branchAddress">${branchAddress}</td>
												<td>${branchPhone}</td>
											</tr>
											</s:if>
										</s:iterator>
									</table>
								</div>
								<div id="myTab10_Content11" class="none" style="height: 280px;">

								</div>
							</div>
						</div>
						<div class="clear "></div>
					</div>
				</td>


				<td width="25%" align="left" valign="top">
					<div class="box ">
						<div class="jt_h3 autoheight pos ">
							<span class="main_left">
								<img src="${projectpath}/page/images/icon06.png" align="absmiddle" />&nbsp;&nbsp;安全提醒
								<span class="gb">
								<a href="#">
									<img src="${projectpath}/page/images/close.png" style="width: 10px; height: 10px;" />
								</a>
							   </span>
							</span>
						</div>
						<div class="tx_nr ">
							<div id=link_logoa style="OVERFLOW: hidden; HEIGHT: 250px"
								class="autoheight">
								<div id=link_logoa1 style="OVERFLOW: hidden">
									<s:iterator value="safenoticelist">
										<p class="tx_h3 ">
											<strong><a href="javascript:safeNoticeInfo(<s:property value='id'/>);">
											<s:if test="%{noticeTitle.length()> 15}">
											<s:property value='noticeTitle.substring(0,15) + "..."'/>
											</s:if>
											<s:else>
												<s:property value="noticeTitle" />
											</s:else>
											<%-- ${noticeTitle} --%></a></strong><span class="red ">【紧急】</span>
										</p>
										<p>
										<s:if test="%{noticeContent.length()> 55}">
											<s:property value='noticeContent.substring(0,55) + "..."'/>
											</s:if>
											<s:else>
												<s:property value="noticeContent" />
											</s:else>
										<%-- ${noticeContent} --%></p>
									</s:iterator>
								</div>
								<div id=link_logoa2></div>
							</div>
							<script>
								var speed = 65
								link_logoa2.innerHTML = link_logoa1.innerHTML
								function Mar_logoa() {
									if (link_logoa2.offsetTop
											- link_logoa.scrollTop <= 0)
										link_logoa.scrollTop -= link_logoa1.offsetHeight
									else {
										link_logoa.scrollTop++
									}
								}
								var Marquee_logoa = setInterval(Mar_logoa,
										speed)
								link_logoa.onmouseover = function() {
									clearInterval(Marquee_logoa)
								}
								link_logoa.onmouseout = function() {
									Marquee_logoa = setInterval(Mar_logoa,
											speed)
								}
							</script>
						</div>
					</div>
				</td>


				<td width="25%" align="left" valign="top">
					<div class="box ">
						<div class="jt_h3 autoheight pos ">
							<span class="main_left"><img
								src="${projectpath}/page/images/icon07.png" align="absmiddle" />&nbsp;&nbsp;会议通知<span
								class="gb "><a href="#"><img
										src="${projectpath}/page/images/close.png"
										style="width: 10px; height: 10px;" /></a></span></span>
						</div>

						<div class="tx_nr ">
							<div id=link_logob style="OVERFLOW: hidden; HEIGHT: 250px"
								class="autoheight">
								<div id=link_logob1 style="OVERFLOW: hidden">
									<s:iterator value="meetingnoticelist">
										<p class="tx_h3 ">
											<strong><a href="javascript:meetNoticeInfo(<s:property value='id'/>);">
											<s:if test="%{noticeTitle.length()> 15}">
											<s:property value='noticeTitle.substring(0,15) + "..."'/>
											</s:if>
											<s:else>
												<s:property value="noticeTitle" />
											</s:else><%-- ${noticeTitle} --%>
											</a></strong><span class="lv ">【一般】</span>
										</p>
										<p>
										<s:if test="%{noticeContent.length()> 55}">
											<s:property value='noticeContent.substring(0,55) + "..."'/>
											</s:if>
											<s:else>
												<s:property value="noticeContent" />
											</s:else>
										<%-- ${noticeContent} --%></p>
									</s:iterator>
								</div>
								<div id=link_logob2></div>
							</div>
							<script>
								var speed = 65
								link_logob2.innerHTML = link_logob1.innerHTML
								function Marquee2() {
									if (link_logob2.offsetTop
											- link_logob.scrollTop <= 0)
										link_logob.scrollTop -= link_logob1.offsetHeight
									else {
										link_logob.scrollTop++
									}
								}
								var MyMar2 = setInterval(Marquee2, speed)
								link_logob.onmouseover = function() {
									clearInterval(MyMar2)
								}
								link_logob.onmouseout = function() {
									MyMar2 = setInterval(Marquee2, speed)
								}
							</script>
						</div>
					</div>
				</td>


				<td width="25%" align="left" valign="top">
					<div class="box ">
						<div class="nTab2 ">
							<!-- 标题开始 -->
							<div class="TabTitle2 ">
								<div class="jt_h3 autoheight pos ">
									<span class="left main_left"><img
										src="${projectpath}/page/images/icon08.png" align="absmiddle" />&nbsp;&nbsp;微博微信</span><span
										class="gb "><a href="#"><img
											src="${projectpath}/page/images/close.png" /></a></span>
									<ul id="myTab20">
										<li class="active2" onMouseOver="nTabs2(this,0);">微博</li>
										<li class="normal2" onMouseOver="nTabs2(this,1);">微信</li>
										<li class="normal2" onMouseOver="nTabs2(this,2);">问题答疑</li>
									</ul>
								</div>
							</div>
							<!-- 内容开始 -->
							<div class="TabContent2 autoheight">
								<!--微博-->
								<div id="myTab20_Content20">
									<iframe width="100%" height="280" class="share_self"
										frameborder="0" scrolling="no"
										src="http://widget.weibo.com/weiboshow/index.php?language=&width=0&height=550&fansRow=2&ptype=1&speed=0&skin=1&isTitle=1&noborder=1&isWeibo=1&isFans=1&uid=3768869531&verifier=bc944b64&dpc=1"></iframe>

								</div>
								<!--微信-->
								<div id="myTab20_Content21" class="none">
									<div class="micro_nr">
										<table class="main_table" width="100%" border="0"
											cellspacing="0" cellpadding="0">
											<%
												int z = 0;
											%>
											<s:iterator value="micromessagelist">
												<%
													z = z + 1;
														if (z % 2 == 0) {
												%>
												<tr class="main_table_tr_1">
													<%
														} else {
													%>
													<tr class="main_table_tr_2">
														<%
															}
														%>
														<s:if test='microname == "下沙交警大队"'>
															<td height="40px;" align="right">${microname}&nbsp;${createtime}
																<p></p>
																<p>
																	<strong>${content}</strong>
																</p>
															</td>
														</s:if>
														<s:elseif test='microname != "下沙交警大队"'>
															<td height="40px;" align="left">${microname}&nbsp;${createtime}
																<p></p>
																<p>
																	<strong>${content}</strong>
																</p>
															</td>
														</s:elseif>

													</tr>
											</s:iterator>
										</table>
									</div>
								</div>
								<div id="myTab20_Content22" class="none">
									<div class="inter_nr">
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<%
												int i = 0;
											%>
											<s:iterator value="interchangelist">
												<tr>
													<td height="36px;" align="left"><strong><%=++i%>.${question}</strong></td>
												</tr>
												<tr>
													<td align="left">答：${answer}</td>
												</tr>
											</s:iterator>
										</table>
									</div>
								</div>
							</div>
						</div>
						<div class="clear "></div>
					</div>
				</td>
			</tr>
		</table>
		<div style="color: #fff; text-align: center">
			Copyright&nbsp;©&nbsp;2013&nbsp;&nbsp;版权所有：<a target="_bank" href="http://www.wazert.com" id="foot_href" style="color: #fff;">浙江网泽科技有限公司</a>&nbsp;&nbsp;技术支持：
			<a target="_bank" href="http://www.wazert.com" id="foot_href" style="color: #fff;">浙江网泽科技有限公司</a>
		</div>
	</div>
</body>
</html>
