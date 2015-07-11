<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% 
    String path = request.getContextPath();
    String basePath = request.getScheme() 
			+ "://" 
			+ ( "xsaqjy".equals(request.getServerName()) ? "xsaqjy.ljgps.net" : request.getServerName() )
			+ ( request.getServerPort() == 80 ? "" : ":" + request.getServerPort() ) 
			+ path
			+ "/";
            
    Object u = request.getSession().getAttribute("onlineuser");
	
	if(u == null) {
		response.sendRedirect(basePath + "admin/Login.jsp");
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Expires" CONTENT="0">  
<meta http-equiv="Cache-Control" CONTENT="no-cache">
<meta http-equiv="Pragma" CONTENT="no-cache">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/TrafficPolice/page/admin/css/style.css" rel="stylesheet" type="text/css" />
</head>
<script type="text/javascript">

function check(imageid){
	var file = document.getElementById(imageid);
	if(file.value == ''){
		alert('请选择文件，然后在上传！');
		return false;
	}
}


function checkmail(mailid){
	var file = document.getElementById(mailid);
	if(file.value == ''){
		alert('请填写邮箱地址！');
		return false;
	}
}


</script>
<body>
	<div id="contentWrap">
		<div class="pageTitle" style="background-color:#D2E9F4">首页-机动车网上交通安全宣传教育监管平台</div>
		<!--<div class="pageButton"></div>-->
		<div style="margin-top:12px; margin-right:6px" ></div>
		<div style="background-color:#D2E9F4;height:570px; margin-right:6px">
			<table bgcolor="#D2E9F4">
				<tr>
					<td width="30px"></td>
					<td>
					</td>
				</tr>
				<tr>
					<td width="30px"></td>
					<td height="145px" valign="middle">
					<!--<div style="float:left;" id="startpage_ad1_img_div">
						<img src="style/index1.jpg" id="startpage_ad1_img" style="width:980px; height:500px;" alt=""/>
					</div>
					<div style="float:left;text-indent:10px;" id="startpage_ad1_text_div" title="长：980 X 宽：129">
					
					</div>-->
					</td>
				</tr>
				<tr>
					<td width="30px"></td>
					<td>
					</td>
				</tr>
				</table>
			<!--<table style="margin-top:40px;">
				<tr>
				</tr>		
			</table>-->
		</div>
	</div>
</body>
<script language="javascript">

//图片上传预览 兼容ie ff
function startpage_getFullPath(obj,imgobj) {
	var newPreview = imgobj;
	if (obj && obj.value != '') {
		//ie
		if (window.navigator.userAgent.indexOf("MSIE") >= 1) {
			obj.select();
			newPreview.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale);";
			newPreview.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = document.selection.createRange().text;
			return;
		//firefox
		}else if (window.navigator.userAgent.indexOf("Firefox") >= 1) {
			if (obj.files) {
				newPreview.src = window.URL.createObjectURL(obj.files.item(0));
				return;
			}
			newPreview.src = obj.value;
			return;
		}
		newPreview.src = obj.value;
		return;
	}
}

//图片上传预览 兼容ie ff google
function startpage_previewImage(ywidth,yheight,imgdivid,imgid,file,textid)
{
  var MAXWIDTH  = ywidth;
  var MAXHEIGHT = yheight;
  var div = document.getElementById(imgdivid);
  if (file.files && file.files[0])
  {
      //div.innerHTML = '<img id="'+imgid+'">';
      var img = document.getElementById(imgid);
      img.onload = function(){
        var rect = startpage_clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
        img.width = rect.width;
        img.height = rect.height;
        img.style.marginLeft = rect.left+'px';
        img.style.marginTop = rect.top+'px';
      }
      var reader = new FileReader();
      reader.onload = function(evt){img.src = evt.target.result;}
      reader.readAsDataURL(file.files[0]);
  }
  else
  {
    var sFilter='filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src="';
    file.select();
    var src = document.selection.createRange().text;
    //div.innerHTML = '<img id="'+imgid+'">';
    var img = document.getElementById(imgid);
    img.filters.item('DXImageTransform.Microsoft.AlphaImageLoader').src = src;
    var rect = startpage_clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
    status =('rect:'+rect.top+','+rect.left+','+rect.width+','+rect.height);
    div.innerHTML = "<div id='"+imgid+"' style='width:"+rect.width+"px;height:"+rect.height+"px;margin-top:"+rect.top+"px;margin-left:"+rect.left+"px;"+sFilter+src+"\"'></div>";
  }
}

// 计算图片大小
function startpage_clacImgZoomParam( maxWidth, maxHeight, width, height ){
    var param = {top:0, left:0, width:width, height:height};
    if( width>maxWidth || height>maxHeight )
    {
        rateWidth = width / maxWidth;
        rateHeight = height / maxHeight;
        
        if( rateWidth > rateHeight )
        {
            param.width =  maxWidth;
            param.height = Math.round(height / rateWidth);
        }else
        {
            param.width = Math.round(width / rateHeight);
            param.height = maxHeight;
        }
    }
    
    param.left = Math.round((maxWidth - param.width) / 2);
    param.top = Math.round((maxHeight - param.height) / 2);
    return param;
}
</script>
</html>