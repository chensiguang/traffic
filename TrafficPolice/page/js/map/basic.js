
var map_basic_mapObj = null; //map 对象
var map_basic_toolbar = null; // 工具条
var map_basic_overview = null; // 鹰眼
var map_basic_scale = null; // 比例尺
var map_basic_mousetool = null; // 鼠标工具

/** 
* 地图初始化
* levelval  13
* id mapmonitor_show_map_div  map放置div
* lng lat 经度纬度
* position true | false null    false null 不自动定位当前位置  true 自动定位当前位置
*/
function map_basic_init(levelval,id,lng,lat,position){
	var opt = {
		level:levelval,                             //初始地图视野级别
		center:new MMap.LngLat(lng,lat),         //设置地图中心点
		doubleClickZoom:true,                    //双击放大地图
		scrollwheel:true                         //鼠标滚轮缩放地图
	};
	
	map_basic_mapObj = new MMap.Map(id,opt); //创建地图对象
	/*
	map_basic_mapObj.plugin(["MMap.ToolBar","MMap.OverView","MMap.Scale","MMap.MouseTool"]
	,function(){
		map_basic_toolbar = new MMap.ToolBar();
		if(position == null || position == false){
			map_basic_toolbar.autoPosition=false; //加载工具条 false 不自动定位当前位置  true 自动定位当前位置
		}else{
			map_basic_toolbar.autoPosition=true; //加载工具条 false 不自动定位当前位置  true 自动定位当前位置
		}
		
		map_basic_mapObj.addControl(map_basic_toolbar);
		
		//map_basic_overview = new MMap.OverView(); //加载鹰眼
		//map_basic_mapObj.addControl(map_basic_overview);
		
		map_basic_scale = new MMap.Scale(); //加载比例尺
		map_basic_mapObj.addControl(map_basic_scale);
		
		map_basic_mousetool = new MMap.MouseTool(map_basic_mapObj); // 鼠标工具
	});
	*/
	// 设置鼠标样式
	map_basic_mapObj.setDefaultCursor(map_basic_geturl("../page/images/map/aero_pen_xl.cur"));
}

/**
* 工具条 功能
* type show,hide,showRuler,hideRuler,showDirection,hideDirection
*/
function map_basic_toolbarfun(type){
	if(type == 'show'){
		map_basic_toolbar.show();
	}else if(type == 'hide'){
		map_basic_toolbar.hide();
	}else if(type == 'showRuler'){
		map_basic_toolbar.showRuler();
	}else if(type == 'hideRuler'){
		map_basic_toolbar.hideRuler();
	}else if(type == 'showDirection'){
		map_basic_toolbar.showDirection();
	}else if(type == 'hideDirection'){
		map_basic_toolbar.hideDirection();
	}
}


/**
* 比例尺 功能
* type show,hide
*/
function map_basic_scalefun(type){
	if(type == 'show'){
		map_basic_scale.show();
	}else if(type == 'hide'){
		map_basic_scale.hide();
	}
}

/**
* 鹰眼 功能
* type show,hide,open,close
*/
function map_basic_overviewfun(type){
	if(type == 'show'){
		map_basic_overview.show();
	}else if(type == 'hide'){
		map_basic_overview.hide();
	}else if(type == 'open'){
		map_basic_overview.open();
	}else if(type == 'close'){
		map_basic_overview.close();
	}
}

/**
* 展示 地区
* returnid 返回id
* district 地区
* city 省市
*/
function map_basic_byDistrict(district,city,returnid){ 

	map_basic_mapObj.clearOverlays();
	var partition = new MMap.Partition(); 
	partition.byDistrict(district,city,function(data){ 
		var resultStr="";
		if(data.status=="E0"){
			for(var i=0,l=data.list.length;i<l;i++){
				resultStr+='<div style=\"cursor:pointer;\" onclick="map_basic_drawpolygon(\''+data.list[i].coords+'\',\''+data.list[i].citycode+data.list[i].name+'\')">'+(i+1)+'、'+data.list[i].citycode+data.list[i].name+'</div>';
			}
		}else if(data.status =="E1"){
			resultStr = "未查找到任何结果!<br />建议：<br />1.请确保所有字词拼写正确。<br />2.尝试不同的关键字。<br />3.尝试更宽泛的关键字。";
		}else{ 
			var error=data.status+":"+data.error.description;
			resultStr= "错误信息："+error; 
		}
		document.getElementById(returnid).innerHTML = resultStr;
	});
} 
  

/**
* 绘制 区域边界
*/
function map_basic_drawpolygon(arr,name){
	map_basic_mapObj.clearOverlays(); 
	var polygonArr = new Array();
	var district = arr.split(";");
	var lnglat = new Array();
	for(var e=0;e<district.length-1;e++){
		var lnglat=district[e].split(",");
		polygonArr.push(new MMap.LngLat(lnglat[0],lnglat[1]));
	} 
	
	var polygon=new MMap.Polygon({
		id:"polygon01",
		path:polygonArr, //线经纬度数组
		strokeColor:"#005cb5", //线颜色 
		strokeOpacity:0.8, //线透明度  
		strokeWeight:6, //线宽
		fillColor: "#f5deb3", //填充色 
		fillOpacity: 0 //填充透明度  
	});  
	
	map_basic_mapObj.addOverlays(polygon); 
	
	var inforWindow = new MMap.InfoWindow({//多边形的信息窗体
		content:name,//窗体内容 
		autoMove:true 
	}); 
	
	map_basic_mapObj.bind(polygon,"click",function(e){ 
		inforWindow.open(map_basic_mapObj,e.lnglat); 
	}); 
	map_basic_mapObj.setFitView([polygon]); 
} 

/**
* 展示 所有省列表
* returnid 返回divid
*/
function map_basic_byprovince(returnid){
	var partition = new MMap.Partition();
	partition.byProvince(function(data){
		var resultStr="";
		if(data.status=="E0"){
			var lineNum = data.province_list.length;//返回总数.
			for(var i=0;i<lineNum;i++){
				resultStr += "<div style=\"cursor:pointer;\" onclick=\"map_basic_getprovince('"+data.province_list[i].bounds+"')\"><dl>";
				resultStr += "<dt>"+(i+1)+".省份名称："+data.province_list[i].name+"<dd>简称："+data.province_list[i].ename+"</dd>"+"<dd>英文名称："+data.province_list[i].englishname+"</dd>"+"<dd>城市编号："+data.province_list[i].code+"</dd></dt>";
				resultStr+="</dl></div>";
			}
			if(lineNum>0){
				map_basic_getprovince(data.province_list[0].bounds);
			}
		}else if(data.status =="E1"){
			resultStr = "未查找到任何结果!<br />建议：<br />1.请确保所有字词拼写正确。<br />2.尝试不同的关键字。<br />3.尝试更宽泛的关键字。";
		}else{
			var error=data.status+":"+data.error.description
			resultStr= "错误信息："+error
		}
		document.getElementById(returnid).innerHTML = resultStr;
	});
}
  
/**
* 展示 省地图
* bounds 西南;东北 坐标  lnglat;lnglat 
*/
function map_basic_getprovince(bounds){
    var xys = bounds.split(";");
    var a = xys[0].split(",");
    var b = xys[1].split(",");
    var southwest =new MMap.LngLat(a[0],a[1]);
    var northeast = new MMap.LngLat(b[0],b[1]);
    var provinceBounds = new MMap.Bounds(southwest,northeast);
    map_basic_mapObj.setBounds(provinceBounds);
} 


/**
* 查询 地理解释 返地理解析
* param:
* type 类型 address,lnglat
*/
function map_basic_geocodesearch(type,name){ 
	if(name== ""){
		alert("请输入地址！");
		return;
	}else{
		var GeocoderOption = {
			range:300,//范围
			crossnum:2,//道路交叉口数
			roadnum :3,//路线记录数
			poinum:2//POI点数
		}; 
		
		var geo = new MMap.Geocoder(GeocoderOption); 
		if(type == 'address'){
			geo.geocode(name,addressToGeoSearch_CallBack);
		}else if(type == 'lnglat'){
			geo.regeocode(name,poiToAddressSearch_CallBack); 
		}
	}
} 

/**
* 添加 自定义菜单项
*/
var map_basic_ContextMenu = null;
function map_basic_adddefinedmenu(width,custom){
	map_basic_ContextMenu = new MMap.ContextMenu({
            isCustom:true,
            width:width,//一定要设置与自定义内容相同的宽度，不能省略不设置，否则在地图右边缘点击时会有菜单不在点击点显示的问题
            content:content
        }); 
  
        map_basic_mapObj.bind(map_basic_mapObj,"rightclick",function(e){
            map_basic_ContextMenu.open(map_basic_mapObj,e.lnglat);
        }); 
  
        map_basic_mapObj.bind(map_basic_mapObj,"click",function(e){
            map_basic_ContextMenu.close();
        }); 
} 

/**
* 添加 菜单项
*/
function map_basic_addcontextmenu(){
	
	map_basic_ContextMenu = new MMap.ContextMenu({
		isCustom:false,
		width:150
	}); 
	
	// 修改内容
	map_basic_ContextMenu.addItem("AutoNavi",fun1=function(){
		window.open("http://www.autonavi.com");
	},0);
	map_basic_ContextMenu.addItem("mapabc",fun2=function(){
		window.open("http://www.mapabc.com");
	},1);
	map_basic_ContextMenu.addItem("alert",fun3=function(){
		alert("hello,world");
	},2);
	
	map_basic_mapObj.bind(map_basic_mapObj,"rightclick",fun4=function(e){
		map_basic_ContextMenu.open(map_basic_mapObj,e.lnglat);
	});
} 

/**
* 删除 菜单项
*/
function map_basic_delcontextmenu(){
	
	// 修改内容
	map_basic_ContextMenu.removeItem("AutoNavi",function(){});
	map_basic_ContextMenu.removeItem("amap",function(){});
	map_basic_ContextMenu.removeItem("alert",function(){});
	
	map_basic_mapObj.unbind(map_basic_mapObj,'rightclick',function(){}); 
} 


/**
* 获得 地图展示时出现错误时候取代图片
* id
* png: map_basic_geturl('images/map/error.png')
*/
function map_basic_adderrorlayer(id,png){
	var layer = new MMap.TileLayer({
		id:id,
		tileSize:256,
		tileUrl:'http://emap{0,1,2,3}.mapabca.com/mapabc/maptile?x=[x]&y=[y]&z=[z]&type=mapabc', 
		errorUrl:png,
		zIndex:3
	});
	map_basic_mapObj.addLayer(layer); 
} 


/**
* 删除 指定图层 或者 所有图层
*/
function map_basic_dellayer(id){
	if(id != ''){
		map_basic_mapObj.removeLayer(id); 
	}else{
		map_basic_mapObj.clearOverlays();
	}
} 

/**
* 添加 地铁图层
*/
function map_basic_addlayersubway(id){
        map_basic_mapObj.clearOverlays();
        Trafficlay = new MMap.TileLayer({
        tileSize:256,//图像大小 
        id:id, 
        getTileUrl:function(x,y,z){
            return "http://emap0.is.autonavi.com/appmaptile?layer=subway&v=1.0&t=1&zoom="+(17-z)+"&x="+x+"&y="+y;
        } 
    });
    map_basic_mapObj.addLayer(Trafficlay); 
} 


/**
* 添加 交通图层
*/
function map_basic_addlayertraffic(id){
        map_basic_mapObj.clearOverlays();
        Trafficlay = new MMap.TileLayer({
        tileSize:256,//图像大小 
        id:id, 
        getTileUrl:function(x,y,z){
            return "http://tm.mapabc.com/trafficengine/mapabc/traffictile?v=1.0&t=1&zoom="+(17-z)+"&x="+x+"&y="+y;
        } 
    });
    map_basic_mapObj.addLayer(Trafficlay); 
} 

/**
* 添加 鼠标画点、鼠标画线、鼠标画圆、鼠标画矩形、鼠标多边形、鼠标测距
*     、鼠标测面、拉框放大、拉框缩小、鼠标移图
* param:
* type 类型
* marker,polyline,circle,rectangle,rectangle,polygon,rule
* ,measureArea,rectZoomIn,rectZoomOut,panWheelZoom
*/
function map_basic_addshape(type){
	var types_var = 'marker,polyline,circle,rectangle,rectangle,polygon,rule,measureArea,rectZoomIn,rectZoomOut,panWheelZoom';
	if(types_var.indexOf(type) > -1){
		map_basic_mapObj.setMouseTool(type);
	}
}

/**
* 添加 自定义标签
* param:
* id 自定义id
* 经度，纬度
* obj html字符串或DOM对象
* content 添加内容
*/
function map_basic_addCustomMarker(id,lng,lat,obj,content){ 
	
	marker = new MMap.Marker({
		id:id,//marker id 
		position:new MMap.LngLat(lng,lat),//位置
		offset:new MMap.Pixel(0,0),
		draggable:false, //可拖动
		content:obj//自定义Marker内容，html字符串或DOM对象
	}); 
	
	map_basic_mapObj.addOverlays(marker);
	map_basic_mapObj.setFitView([marker]);
	
	var inforWindow = new MMap.InfoWindow({ 
		// 添加内容
		content:content
	}); 
	
	map_basic_mapObj.bind(marker,"click",function(e){ 
		inforWindow.open(map_basic_mapObj,marker.getPosition());   
	});
}

/**
* 获得 地图西南与东北角坐标
* return:西南+"#"+东北
*/
function map_basic_getBounds(){ 
	var bounds = map_basic_mapObj.getBounds();
	
	var ws = bounds.southwest.lng+","+bounds.southwest.lat; // 西南
	var en = bounds.northeast.lng+","+bounds.northeast.lat; // 东北
	
  	return ws+"#"+en; 
} 

/**
* 添加 地图点
* param:
* id marker id
* lng 经度
* lat 纬度
* png 图片
* content 展示
* time 间隔时间
*/
function map_basic_addspot(id,lng,lat,png,content,time){
	//添加点 
	var marker=new MMap.Marker({ 
		id:id,
		icon:map_basic_geturl("images/map/"+png),
		offset:new MMap.Pixel(-11.5,-32), //基点为图片左上角，设置相对基点的图片位置偏移量，向左向下为负 
		position:new MMap.LngLat(lng,lat),
		draggable:false, //可拖动
		visible:true,//可见 
		zIndex:1//设置点叠加顺序，在加载多个点有效果，详见设置点叠加顺序示例
	}); 
	map_basic_mapObj.addOverlays(marker); 
	map_basic_mapObj.setFitView([marker]);
	
//	var infoWindow = new MMap.InfoWindow({ 
//		// 添加内容
//		content:content,
//		offset:new MMap.Pixel(-106,-61) 
//	}); 
	
	// 自定义
	var infoWindow = new MMap.InfoWindow({
		isCustom:true,
		content:content, 
		size:new MMap.Size(300,0),
		offset:{x:-106,y:-115}
	}); 
	
	map_basic_mapObj.bind(marker,"click",function(e){ 
		infoWindow.open(map_basic_mapObj,marker.getPosition());   
	});
}

/**
* 根据省份名称、城市名称、区县名称、区号、邮编设置地图位置 
*/
function map_basic_setCity(param){
	map_basic_mapObj.setCity(param); 
}

/**
* 获得 url地址
*/
function map_basic_geturl(rep){
	var url_temp = ""+window.location;
	url_temp = ((url_temp.split('page'))[0])+'/'+rep;
	return url_temp;
}

/**
* 添加 地图上多边形框
* param:
* id div id
*/
function map_basic_addpolygon(id){
	//添加多边形 
	
	var arr1_temp=new Array();//经纬度坐标数组 117.281108000000000,31.86380000000000
	
	arr1_temp.push(new MMap.LngLat("117.40332221984863","31.92025505675715"));
	arr1_temp.push(new MMap.LngLat("117.41070365905762","31.89755531478615"));
	arr1_temp.push(new MMap.LngLat("117.40229225158691","31.892353073034826"));
	arr1_temp.push(new MMap.LngLat("117.38984680175781","31.89136526100842"));
	
	var polygon=new MMap.Polygon({
		id:id,
		path:arr1_temp,
		editable:false,
		strokeColor:"#0000ff",
		strokeOpacity:0.2,
		strokeWeight:3,
		fillColor: "#f5deb3",
		fillOpacity: 0.35
	});
	map_basic_mapObj.addOverlays(polygon);
}

/**
* 获得 点击地图获得坐标
* param: id 存入指定div
*/
function map_basic_mapclick(id){
    map_basic_mapObj.bind(map_basic_mapObj,"click",function(e){
    	var temp = e.lnglat.lng+","+e.lnglat.lat;
		$('#'+id).val(temp);
    });
} 
  
/**
* 解除 点击地图获得坐标
* param: id 解除指定div
*/
function map_basic_unmapclick(id){
    map_basic_mapObj.unbind(map_basic_mapObj,"click",function(e){ 
  		var temp = e.lnglat.lng+","+e.lnglat.lat;
		$('#'+id).val(temp);
    });
	$('#'+id).val('');
} 

//自定义信息窗口样式
function infoWindow_style(flag,id,title,content,icon_path){ 
    var bg = "";
	//var bg = "/${res}/img/images/info_01.png";
	if(icon_path != "" && icon_path != null && icon_path != "undefined" )
		bg = icon_path;
	else
		bg = iconpath;
	
  
    var m = []; 
  
    m.push('<div style=" width:250px;height:30px;position:relative;z-index:104;overflow:hidden;">'); 
  
    m.push('<div style="width:8px;height:30px;background:url('+bg+') 0px 0px;position:absolute;left:0;top:0;overflow:hidden;"></div>'); 
  
    //信息窗体头部样式更改 
  	if(title.length>15){
		title = title.substring(0,15)+"...";
	}
	if(flag == -1){
		m.push("<div style=\"position:relative;height:29px;border-top:#BBCCD3 solid 1px;margin:0px 8px 1px 8px;background-color:#BBCCD3;overflow:hidden;font-size:14px;line-height:29px;color:#333333\">"+title+"</div>"); 
	}else if(flag == 1){
		m.push("<div style=\"position:relative;height:29px;border-top:#BBCCD3 solid 1px;margin:0px 8px 1px 8px;background-color:#BBCCD3;overflow:hidden;font-size:14px;line-height:29px;color:#333333\">"+title+"</div>"); 	
	}else{
		m.push("<div style=\"position:relative;height:29px;border-top:#BBCCD3 solid 1px;margin:0px 8px 1px 8px;background-color:#BBCCD3;overflow:hidden;font-size:14px;line-height:29px;color:#333333\">"+title+"</div>"); 	
	}
    
  
    m.push('<div style="width:8px;height:30px;background:url('+bg+') -8px 0px;position:absolute;right:0;top:0;overflow:hidden;"></div>'); 
  
    m.push('<div style="position:absolute;width:7px;height:7px;background:url('+bg+') -25px -35px;right:8px;top:11px;cursor:hand;cursor:pointer;" onclick="map_basic_mapObj.clearInfoWindow();"></div>'); 
  
    m.push('</div>'); 
  
    //信息窗体内部样式更改 
  
    m.push('<div style="padding:0 2px;border-left:#BBCCD3 solid 1px;border-right:#BBCCD3 solid 1px; background-color:#F8F8F8;width:244px;height:auto;word-break:break-all;font-size:12px;overflow:hidden;">');
    m.push(content); 
  
    m.push('</div>'); 
  
    m.push('<div style="width:250px;height:8px;position:relative;z-index:104;">'); 
  
    m.push('<div style="width:8px;height:8px;background:url('+bg+') 0px -38px;position:absolute;left:0;top:0;overflow:hidden;"></div>'); 
  
    m.push('<div style="height:7px;border-bottom:#BBCCD3 solid 1px;margin:0px 8px;background-color:#F8F8F8;overflow:hidden;"></div>'); 
  
    m.push('<div style="width:8px;height:8px;background:url('+bg+') -8px -38px;position:absolute;right:0;top:0;overflow:hidden;"></div>'); 
  
    m.push('</div>'); 
  
    m.push('<div style="height:0;position:relative;z-index:104;">'); 
  
    for(var i=0;i<5;i++){ 
  
        m.push("<div style=\"position:absolute;width:"+(26-i*5)+"px;height:5px;background:url("+bg+") -"+(22-i)+"px "+(-i*5)+"px;left:"+(85-i)+"px;top:"+(-1+i*5)+"px;\"></div>"); 
  
    } 
  
    m.push('</div>'); 
  
    return m.join(""); 
  
} 





//----------------------------------------重新定义--------------------------------------------------
