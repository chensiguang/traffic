<%@ page contentType="text/html; charset=utf-8" %>
<script type="text/javascript">
$(document).ready(function() {
 var oMoveBox = $("#col_box"), oArr = $("#arrow"), maxL = 185;
 oArr.click(function(){
  oMoveBox.animate({"height":"-="+maxL},185,function(){
   maxL = -maxL;
  $("#arrow").html(maxL<0 ? "<img src=\"${projectpath}/page/images/zk02.png\"></img>" : "<img src=\"${projectpath}/page/images/zk01.png\"></img>");
  })
 });
});
</script>


<div class="top" id="box">

<div id="col_box">
<table width="100%" height="108" border="0" cellspacing="0" cellpadding="0" style="float:left">
  <tr>
    <td align="left" valign="middle">
		<span class="padding-left "><a href="${projectpath}/index_view.action"><img src="${projectpath}/page/images/logo.png" class="autoheight" style="width:508px;height:104px;" /></a></span>
	</td>
	<td rowspan="2" align="right" valign="bottom"><img src="${projectpath}/page/images/logo_img1.png"/>
	</td>
	</tr>
	<tr>
    <td align="left" valign="middle">
		<div style="padding:10px 10px 10px 15px;width:100%">
			<div class="nav">
			    <!--首页-->
			    <a href="${projectpath}/index_view.action"><img src="${projectpath}/page/images/nav11.png" style="width:60px;height:60px;" /></a>&nbsp;&nbsp;
			    <!--交通法规-->
				<a href="${projectpath}/rule_list.action"><img src="${projectpath}/page/images/nav01.png" style="width:60px;height:60px;" /></a>&nbsp;&nbsp;
				<!--宣教中心-->
				<a href="${projectpath}/edu_list.action"><img src="${projectpath}/page/images/nav02.png" style="width:60px;height:60px;" /></a>&nbsp;&nbsp;
				<!--基本信息-->
				<a href="${projectpath}/driver_list.action"><img src="${projectpath}/page/images/nav03.png" style="width:60px;height:60px;" /></a>&nbsp;&nbsp;
				<!--违法查询-->
				<a href="${projectpath}/ruleIllegal_list.action"><img src="${projectpath}/page/images/nav04.png" style="width:60px;height:60px;" /></a>&nbsp;&nbsp;
				<!--快速处理点-->
				<a href="${projectpath}/branch_list.action"><img src="${projectpath}/page/images/nav05.png" style="width:60px;height:60px;" /></a>&nbsp;&nbsp;
				<!--安全提醒-->
				<a href="${projectpath}/safeNotice_list.action"><img src="${projectpath}/page/images/nav06.png" style="width:60px;height:60px;" /></a>&nbsp;&nbsp;
				<!--会议通知-->
				<a href="${projectpath}/meetNotice_list.action"><img src="${projectpath}/page/images/nav07.png" style="width:60px;height:60px;" /></a>&nbsp;&nbsp;
				<!--问题互动-->
				<a href="${projectpath}/interchange_list.action"><img src="${projectpath}/page/images/nav08.png" style="width:60px;height:60px;" /></a>&nbsp;&nbsp;
				<!--微博微信-->
				<a href="${projectpath}/micromessage_list.action"><img src="${projectpath}/page/images/nav09.png" style="width:60px;height:60px;" /></a>&nbsp;&nbsp;

				<!--后台管理-->
				<%-- <a href="${projectpath}/page/admin/login.jsp"><img src="${projectpath}/page/images/nav10.png" style="width:60px;height:60px;" /></a> --%>
			</div>
		</div>
	</td>
  </tr>
</table>
</div>
<div class="clear"></div>
<!--<div id="arrow">︿</div>-->
<div id="arrow"><img src="${projectpath}/page/images/zk02.png"> </img></div>
</div>
<div class="clear"></div>