// +----------------------------------------------------------------------
// | MapABC JavaScript API
// +----------------------------------------------------------------------
// | Copyright (c) 2010 http://MapABC.com All rights reserved.
// +----------------------------------------------------------------------
// | Licensed AutoNavi MapABC
// +----------------------------------------------------------------------
// | Author: yhostc <yhostc@gmail.com>
// +----------------------------------------------------------------------
/**
+------------------------------------------------------------------------------
* 类: ToolBar
* 地图控件
+------------------------------------------------------------------------------
*/
MMap.ToolBar = function(opt){
//控件类型
this._type = "toolbar";
//标尺键盘是否可见
this.ruler = true;
//罗盘是否可见
this.direction = true;
//工具条相对与地图容器左上角，偏移的位置
this.offset = new MMap.Pixel(10,10);
//是否自动定位
this.autoPosition = false;
//初始化
this.initialize(opt);
}
MMap.ToolBar.prototype = {
/**
+----------------------------------------------------------
* 工具条类初始化
+----------------------------------------------------------
* @param {Object} opt 参数对象
+----------------------------------------------------------
*/
initialize : function (opt){
for(var i in opt){//更新属性
if(i.substr(0,1)!="_" && this[i]!=undefined){
this[i] = opt[i];
}
}
this._guid = MMap.Util.guid();
return this;
},
/**
+----------------------------------------------------------
* 系统内置需要的方法
+----------------------------------------------------------
* @return obj 地图对象
+----------------------------------------------------------
*/
_getHtmlDom:function(obj){
//缓存地图对象
this._map = obj;
var al = obj._client+"Images/blank.gif";
var lo = obj._client+"Images/loading.gif";
var bg = obj._client+"Images/stdmap_ctrl.png";
//构造工具条对象
var tool = document.createElement("div");
tool.style.cssText = "position:absolute;left:5px;top:5px;z-Index:200";
tool.style.left = this.offset.x+"px";
tool.style.top = this.offset.y+"px";
//罗盘控制区域
var direction = document.createElement("div");
direction.style.cssText = "position:relative;width:54px;height:54px;left:0;top:0;background:url("+bg+") 1px -1px no-repeat;";
direction.className = "tool_mapabc";
if(!this.direction){
direction.style.display = "none";
}
var top = document.createElement("div");//top
top.style.cssText = "position:absolute;width:18px;height:12px;top:3px;left:18px;cursor:pointer;";
direction.appendChild(top);
var right = document.createElement("div");//right
right.style.cssText = "position:absolute;width:12px;height:18px;top:18px;left:37px; cursor:hand;cursor:pointer;";
direction.appendChild(right);
var bottom = document.createElement("div");//bottom
bottom.style.cssText = "position:absolute;width:18px;height:12px;top:38px;left:18px;cursor:pointer;";
direction.appendChild(bottom);
var left = document.createElement("div");//left
left.style.cssText = "position:absolute;width:12px;height:18px;top:18px;left:4px;cursor:pointer;";
direction.appendChild(left);
var geolocation = document.createElement("div");//geolocation
geolocation.style.cssText = "position:absolute;width:16px;height:16px;top:19px;left:19px;background:url("+bg+") -172px -6px no-repeat;cursor:pointer;";
var location = document.createElement("img");
location.src = al;
location.style.cssText = "position:absolute;width:7px;height:7px;top:4px;left:4px;background:url("+bg+") -177px -30px no-repeat;display:none;-moz-user-select:none;";
geolocation.appendChild(location);
var loading = document.createElement("img");
loading.src = lo;
loading.style.cssText = "position:absolute;width:10px;height:10px;top:3px;left:2px;display:none;";
geolocation.appendChild(loading);
direction.appendChild(geolocation);
var fail = document.createElement("div");//错误提示消息
fail.style.cssText = "background:#fffbe5;border:1px solid #d2982d;color:#9c6336;padding:2px;font-size:12px;position:absolute;left:36px;top:17px;width: 94px;-webkit-border-radius:10px;-moz-border-radius:10px;border-radius:10px;text-align:center;display:none;";
fail.innerHTML = "定位失败！";
direction.appendChild(fail);
tool.appendChild(direction);
this._direction = direction;
//级别控制区
var zoom = document.createElement("div");
zoom.style.cssText = "position:absolute;width:0;height:0;left:13px;";
//放大级别
var maxZoom = document.createElement("div");
maxZoom.style.cssText = "position:relative;width:25px;height:23px;background:url("+bg+") -144px -2px no-repeat;cursor:hand;cursor:pointer;";
maxZoom.className = "tool_mapabc";
zoom.appendChild(maxZoom);
var ruler = document.createElement("div");
ruler.style.cssText="position:relative;width:25px;height:137px;background:url("+bg+") -206px -1px repeat-y;";
ruler.className = "tool_mapabc";
if(!this.ruler){//初始化是否需要隐藏尺子
ruler.style.display = "none";
}
this._zooms = obj.getZooms();
this._length = (this._zooms[1]-this._zooms[0]+1)*7+4;//计算尺子长度
ruler.style.height = this._length+"px";//计算尺子长度
//已选择的ZOOM级别，自动撑高选择器
var hasZoom = document.createElement("div");
hasZoom.style.cssText = "position:absolute;width:8px;height:20px;background:url("+bg+") -246px -1px repeat-y;left:10px;";
hasZoom.style.height = (this._zooms[1]-obj.level)*7+Math.floor((this._zooms[1]-obj.level)/5)+"px";//计算当前手柄高度
ruler.appendChild(hasZoom);
//选择器
var but = document.createElement("img");
but.src = al;
but.style.cssText = "position:absolute;width:17px;height:9px;background:url("+bg+") -189px -10px no-repeat; left:5px;cursor:hand;cursor:pointer;";
but.style.top = (this._zooms[1]-obj.level)*7+Math.floor((this._zooms[1]-obj.level)/5)+"px";
ruler.appendChild(but);
//省份提示
var tips = document.createElement("div");
tips.style.display = "none";
var a = document.createElement("div");//街道,17
a.style.cssText = "position:absolute;width:41px;height:19px;background:url("+bg+") -56px -8px no-repeat;top:10px;left:21px;cursor:hand;cursor:pointer;display:none;";
if(this._zooms[1]>=17 && this._zooms[0]<17){
a.style.display = "block";
}
a.className = "tool_mapabc";
tips.appendChild(a);
var b = document.createElement("div");//市,10
b.style.cssText = "position:absolute;width:41px;height:19px;background:url("+bg+") -56px -28px no-repeat;top:40px;left:21px;cursor:hand;cursor:pointer;display:none;";
b.className = "tool_mapabc";
if(this._zooms[1]>10 && this._zooms[0]<=10){
b.style.display = "block";
}
tips.appendChild(b);
var c = document.createElement("div");//省,7
c.style.cssText = "position:absolute;width:41px;height:19px;background:url("+bg+") -101px -8px no-repeat;top:70px;left:21px;cursor:hand;cursor:pointer;display:none;";
c.className = "tool_mapabc";
if(this._zooms[1]>7 && this._zooms[0]<=7){
c.style.display = "block";
}
tips.appendChild(c);
var d = document.createElement("div");//全国,3
d.style.cssText = "position:absolute;width:41px;height:19px;background:url("+bg+") -101px -28px no-repeat;top:100px;left:21px;cursor:hand;cursor:pointer;display:none;";
d.className = "tool_mapabc";
if(this._zooms[1]>3 && this._zooms[0]<=3){
d.style.display = "block";
}
tips.appendChild(d);
ruler.appendChild(tips);
zoom.appendChild(ruler);
this._ruler = ruler;
//缩小级别
var minZoom = document.createElement("div");
minZoom.style.cssText = "position:relative;width:25px;height:23px;background:url("+bg+") -144px -28px no-repeat;cursor:hand;cursor:pointer;";
minZoom.className = "tool_mapabc";
zoom.appendChild(minZoom);
tool.appendChild(zoom);
//缓存dom对象
this._tool = tool;
//绑定事件
this._bind_();
//返回dom对象给地图引擎
return tool;
},
/**
+----------------------------------------------------------
* 节点被添加后自动执行的方法
+----------------------------------------------------------
*/
_trigger:function(){
//IE6,加载PNG透明处理类
if(!!window.ActiveXObject && !window.XMLHttpRequest){
if(typeof(DD_belatedPNG)=="undefined"){
new MMap.AjaxRequest(MMap.Conf._plugin+"?cls=iepngfix",function(){
DD_belatedPNG.fix(".tool_mapabc");
},true);
}else{
DD_belatedPNG.fix(".tool_mapabc");
}
}
},
/**
+----------------------------------------------------------
* 事件绑定方法
+----------------------------------------------------------
*/
_bind_:function(){
var self = this,obj = this._map,tool = this._tool,timer;
//移动动画效果
var animation = function(x,y){
window.clearInterval(timer);
var t=0,m,n;//初始值
timer = setInterval(function(){
m = MMap["Tween"]["Cubic"]["easeOut"];
if(y==0){
n = Math.round(m(t,0,x,10) - m(t-1,0,x,10));
obj.panBy(n,0);
}else{
n = Math.round(m(t,0,y,10) - m(t-1,0,y,10));
obj.panBy(0,n);
}
if(t>=10){
window.clearInterval(timer);
timer = 0;
}
t++;
},40);
};
var direction = tool.children[0];
obj.addEvent(direction.children[0],"click",function(){//地图上移
animation(0,obj.height/2);
});
obj.addEvent(direction.children[1],"click",function(){//地图右移
animation(-obj.width/2,0);
});
obj.addEvent(direction.children[2],"click",function(){//地图下移
animation(0,-obj.height/2);
});
obj.addEvent(direction.children[3],"click",function(){//地图左移
animation(obj.width/2,0);
});
//放大级别
var zoom = tool.children[1],city = zoom.children[1];
obj.addEvent(zoom.children[0],"click",function(){//放大级别
obj.zoomIn();
});
//省市区县提示条
var timer = 0;
obj.addEvent(city,"mouseover",function(e){//显示提示条
window.clearTimeout(timer);
city.children[2].style.display = "block";
});
obj.addEvent(city,"mouseout",function(e){//隐藏提示条
window.clearTimeout(timer);
timer = setTimeout(function(){city.children[2].style.display = "none";},1000);
});
var bar = city.children[2];
obj.addEvent(bar,"mouseover",function(e){//显示提示条
window.clearTimeout(timer);
bar.style.display = "block";
});
obj.addEvent(bar,"mouseout",function(e){//隐藏提示条
window.clearTimeout(timer);
timer = setTimeout(function(){bar.style.display = "none";},1000);
});
bar.children[0].style.top = (self._zooms[1]-17)*7-4+"px";
obj.addEvent(bar.children[0],"click",function(e){//街道
obj.setZoom(17);
obj.stopPropagation(e);
});
bar.children[1].style.top = (self._zooms[1]-10)*7-4+"px";
obj.addEvent(bar.children[1],"click",function(e){//市
obj.setZoom(10);
obj.stopPropagation(e);
});
bar.children[2].style.top = (self._zooms[1]-7)*7-4+"px";
obj.addEvent(bar.children[2],"click",function(e){//省
obj.setZoom(7);
obj.stopPropagation(e);
});
bar.children[3].style.top = (self._zooms[1]-3)*7-4+"px";
obj.addEvent(bar.children[3],"click",function(e){//全国
obj.setZoom(3);
obj.stopPropagation(e);
});
//拖拽调整视野级别
var Y = 0;
obj.drag(city.children[1],function(e){//mousedown
Y = e.clientY;
obj.stopPropagation(e);
},function(e){//mousemove
var h = parseInt(city.children[1].style.top)+(e.clientY-Y);
if(h>=0 && h<(self._length-10)){//有效距离拖拽
city.children[1].style.top = parseInt(city.children[1].style.top)+(e.clientY-Y)+"px";
city.children[0].style.height = city.children[1].style.top;
Y = e.clientY;
}
obj.stopPropagation(e);
},function(e){//mouseup
var h = parseInt(city.children[1].style.top);
var z = self._zooms[1] - Math.round(h/7);
city.children[1].style.top = h+Math.floor(Math.round(h/7)/5)+"px";
city.children[0].style.height = city.children[1].style.top;
obj.setZoom(z);
obj.stopPropagation(e);
});
obj.addEvent(city.children[1],"click",function(e){
obj.stopPropagation(e);
});
//点击定位级别
obj.addEvent(city,"click",function(e){//缩小级别
var Y = e.offsetY || e.layerY;
var z = self._zooms[1] - Math.round(Y/7) +1;
obj.setZoom(z);
});
//缩小级别
obj.addEvent(zoom.children[2],"click",function(e){//缩小级别
obj.zoomOut();
});
obj.bind(obj,"zoomchange",function(){
var a = self._zooms[1];
var b = obj.getZoom();
city.children[1].style.top = (a-b)*7+Math.floor((a-b)/5)+"px";
city.children[0].style.height = city.children[1].style.top;
},"plugin");
if(this.checkGeoLocation() && this.autoPosition){//如果支持地理定位则自动定位
this.doLocation();
}
},
/**
+----------------------------------------------------------
* 检查是否支持地理定位
+----------------------------------------------------------
*/
checkGeoLocation:function(){
var self = this,obj = this._map,geo = this._direction.children[4];
if(navigator.geolocation) {//是否浏览器支持定位
obj.addEvent(geo,"click",function(){//缩小级别
self.doLocation();
});
return true;
}else{
geo.style.display = "none";
return false;
}
},
/**
+----------------------------------------------------------
* 设置工具条元素的高度宽度及位置
+----------------------------------------------------------
*/
getOffset:function(){
return this.offset;
},
/**
+----------------------------------------------------------
* 设置工具条控件位置
+----------------------------------------------------------
*/
setOffset:function(o){
this.offset = o;
this._tool.style.left = o.x+"px";
this._tool.style.top = o.y+"px";
},
/**
+----------------------------------------------------------
* 隐藏级别控制尺
+----------------------------------------------------------
*/
hideRuler:function(){
this._ruler.style.display = "none";
},
/**
+----------------------------------------------------------
* 显示级别控制尺
+----------------------------------------------------------
*/
showRuler:function(){
this._ruler.style.display = "block";
},
/**
+----------------------------------------------------------
* 隐藏罗盘
+----------------------------------------------------------
*/
hideDirection:function(){
this._direction.style.display = "none";
},
/**
+----------------------------------------------------------
* 显示罗盘
+----------------------------------------------------------
*/
showDirection:function(){
this._direction.style.display = "block";
},
/**
+----------------------------------------------------------
* 进行位置定位
+----------------------------------------------------------
*/
doLocation:function(){
var self = this,obj = this._map,geo = this._tool.children[0].children[4];
if(!navigator.geolocation){return false;}
geo.children[1].style.display = "block";
var msg = this._direction.children[5];
navigator.geolocation.getCurrentPosition(function(e){//成功后的回调方法
geo.children[1].style.display = "none";
geo.children[0].style.display = "block";
self.position = new MMap.LngLat(e.coords.longitude, e.coords.latitude);
self._addOverlay(self.position,e.coords.accuracy);
msg.innerHTML = "定位成功！";
msg.style.display = "block";
setTimeout(function(){
msg.style.display = "none";
},2000);
self._map.trigger(self,"location",self);
return true;
},function(err){//错误后回调的方法
geo.children[1].style.display = "none";
geo.children[0].style.display = "none";
msg.innerHTML = "定位失败";
msg.style.display = "block";
setTimeout(function(){
msg.style.display = "none";
},2000);
self._map.trigger(self,"location",self);
return false;
},{//选项
enableHighAccuracy:true
});
},
_addOverlay:function(lnglat,radius){
var self = this,obj = this._map,geo = this._direction.children[4];
var r = radius / Math.sqrt(Math.pow(obj.width,2)+Math.pow(obj.height,2));
var l = Math.floor(Math.LOG2E * Math.log(Math.cos(lnglat.lat * Math.PI/180)*2*Math.PI*6378137.0/r/256));
obj.setZoom(l-1);
self.position = {center:lnglat,radius:radius,level:l-1};
var circle = new MMap.Circle({
id:"geoc"+self._guid,
center:lnglat,
radius:radius,
strokeColor: "#0093FF",
strokeOpacity: 0.1,
strokeWeight: 1,
fillColor: "#02B0FF",
fillOpacity: 0.05
});
var mkr = new MMap.Marker({
id:"geom"+self._guid,
position:lnglat,
offset:new MMap.Pixel(-7,-7),
content:"<div style=\"width:16px;height:16px;overflow:hidden;\" title=\"定位精度:"+radius+"米\"><img style=\"position:relative;left:-24px;top:-2px;cursor:pointer;\" src=\""+obj._client+"/Images/my_location.png\"></div>"
});
obj.addOverlays([mkr,circle]);
var fn = function(e){
var b = obj.getBounds(),sw = b.southwest,ne = b.northeast;
if(lnglat.lng <= sw.lng || lnglat.lng>=ne.lng || lnglat.lat<=sw.lat || lnglat.lat>=ne.lat){
obj.removeOverlays([mkr.id,circle.id]);
geo.children[0].style.display = "none";
obj.unbind(obj,"dragend",fn);
}
}
obj.bind(obj,"dragend",fn,"plugin");
obj.setCenter(lnglat);
},
/**
+----------------------------------------------------------
* 获取位置定位信息
+----------------------------------------------------------
*/
getLocation:function(){
if(this.position){
return this.position;
}
return false;
},
/**
+----------------------------------------------------------
* 隐藏工具条控件
+----------------------------------------------------------
*/
hide:function(){
this._tool.style.display = "none";
this._map.trigger(this,"hide");
},
/**
+----------------------------------------------------------
* 显示工具条控件
+----------------------------------------------------------
*/
show:function(){
this._tool.style.display = "block";
this._map.trigger(this,"show");
}
};
// +----------------------------------------------------------------------
// | MapABC JavaScript API
// +----------------------------------------------------------------------
// | Copyright (c) 2010 http://MapABC.com All rights reserved.
// +----------------------------------------------------------------------
// | Licensed AutoNavi MapABC
// +----------------------------------------------------------------------
// | Author: yhostc <yhostc@gmail.com>
// +----------------------------------------------------------------------
/**
+------------------------------------------------------------------------------
* @constructor OverView
* 用于鹰眼图层加载及相关方法
+------------------------------------------------------------------------------
*/
MMap.OverView = function(opts){
this._type = "overview";
//地图对象
this._map = {};
//鹰眼图层对象
this.overview = {};
//鹰眼切片图层对象
this.tileLayer= false;
//鹰眼控件是否可视
this.visible = true;
//鹰眼地图的开合状态
this.isOpen = true;
//初始化鹰眼类
this.initialize(opts);
}
MMap.OverView.prototype = {
//鹰眼类初始化
initialize:function(opt){
//更新属性
for(var i in opt){
if(i.substr(0,1)!="_" && this[i]!=undefined){
this[i] = opt[i];
}
}
},
/**
+----------------------------------------------------------
* 地图移动方法
+----------------------------------------------------------
* @map 地图对象
+----------------------------------------------------------
*/
_getHtmlDom:function(map){
//保存地图对象
this._map = map;
//创建鹰眼容器
var overview = document.createElement('div');
//设置鹰眼容器CSS样式
overview.style.cssText = "width:120px; height:120px;position:absolute;bottom:0px;right:0px; border-top:#979797 solid 1px;border-left:#979797 solid 1px;background-color:#E8ECF8;z-index:304;overflow:hidden;-moz-user-select:-moz-none;";
if(!this.visible){
overview.style.display = "none";
}
var layerset = document.createElement("div");//构造图层外容器
layerset.style.cssText = "width:115px;height:115px;position:absolute;left:5px;top:5px;border-top:#979797 solid 1px;border-left:#979797 solid 1px;overflow:hidden;background:url("+this._map._client+"Images/transparent.png) no-repeat center center;";
var layer = document.createElement("div");//构造图层内容器
layer.style.cssText = "position:absolute;left:0;top:0;width:auto;";
layerset.appendChild(layer);
var drag1 = document.createElement("div");//构造拖拽框1
drag1.style.cssText = "width:50px;height:50px;position:absolute;border:rgb(68,68,187) solid 2px;left:45px; top:45px;overflow:hidden;";
drag1.innerHTML = '<div style="width:50px;height:50px;filter:alpha(opacity=25);opacity:0.25;background-color: rgb(102,102,204);"></div>';
layerset.appendChild(drag1);//添加第1个拖拽框
var drag2 = document.createElement("div");//构造拖拽框1
drag2.style.cssText = "width:50px; height:50px;position:absolute;border:rgb(68,68,187) solid 2px;left:45px; top:45px;overflow:hidden;";
drag2.innerHTML = '<div style="width:50px;height:50px;filter:alpha(opacity=25);opacity:0.25;background-color: rgb(102,102,204);"></div>';
layerset.appendChild(drag2);//添加第2个拖拽框
overview.appendChild(layerset);
var control = document.createElement("div");//构造控制容器
control.style.cssText = "width:15px;height:15px;position:absolute;background:url("+this._map._client+"Images/bg.png) -183px -15px no-repeat;right:0;_right:-1px;bottom:0;_bottom:-1px;cursor:pointer;border:none;font:12px/16px Verdana,Helvetica,Arial,sans-serif;";
overview.appendChild(control);
//将鹰眼DIV对象返回给地图
this.overview = overview;
this.tileLayer = this.tileLayer || map.defaultTileLayer;
//如果鹰眼为打开状态则加载鹰眼图层
var cp = MMap.$("_copyright_"+(map._unique || map.id));
if(this.isOpen){//加载鹰眼图层
this._layerInit();
cp.style.right = 120+5 +"px";
control.style.backgroundPosition = "-183px 0px";
}else{
overview.style.width = 15+"px";
overview.style.height = 15+"px";
cp.style.right = 20 +"px";
control.style.backgroundPosition = "-183px -15px";
}
if(!this.visible){
cp.style.right = 5 +"px";
}
//绑定相关事件
this._bind();
return overview;
},
/**
+----------------------------------------------------------
* 鹰眼事件绑定
+----------------------------------------------------------
*/
_bind : function(){
var obj = this._map,self = this,view = this.overview;
//鹰眼眼睛大小
var scale = obj.width/obj.height;
this._width = scale >=1 ? 50 : 50*scale;
this._height = scale<=1 ? 50 : 50/scale;
this._left = (115-this._width)/2-2.5;
this._top = (115-this._height)/2-2.5;
var lay = view.children[0];
//初始化drag 框大小及位置
lay.children[1].style.width = lay.children[2].style.width = this._width+"px";
lay.children[1].style.height = lay.children[2].style.height = this._height+"px";
lay.children[1].style.left = lay.children[2].style.left = this._left +"px";
lay.children[1].style.top = lay.children[2].style.top = this._top+"px";
//设置 鹰眼控件 的容器宽度
obj.addEvent(view.children[1],"click",function(e){
if(self.isOpen){//执行关闭操作
self.close();
}else{//执行打开操作
self.open();
}
obj.stopPropagation(e);//阻止冒泡
});
var layer = view.children[0].children[0];
var drag1 = view.children[0].children[1];//第一个拖拽框
var drag2 = view.children[0].children[2];//第二个拖拽框
var mouse = {x:0,y:0};
obj.drag(drag2,function(e){
mouse = {x:parseInt(e.clientX),y:parseInt(e.clientY)};
obj.stopPropagation(e);//阻止冒泡
},function(e){
//移动第二个拖拽手柄
drag2.style.left = e.clientX - mouse.x + parseInt(drag2.style.left) +"px";
drag2.style.top = e.clientY - mouse.y + parseInt(drag2.style.top) +"px";
mouse = {x:parseInt(e.clientX),y:parseInt(e.clientY)};
obj.stopPropagation(e);//阻止冒泡
},function(e){//动画移动第一个拖拽手柄
var step = 20;//步进
//每次移动量
var c = (parseFloat(drag2.style.left) - parseFloat(drag1.style.left));
var d = (parseFloat(drag2.style.top) - parseFloat(drag1.style.top));
var m = c/step,n = d/step;
//定义初始值
var i=0,k = parseFloat(drag1.style.left),l = parseFloat(drag1.style.top);
var t = setInterval(function(){
drag1.style.left = k+ m*i +"px";
drag1.style.top = l+ n*i +"px";
if(i>=step){
window.clearInterval(t);
//图层移动至目标位置
layer.style.left = parseInt(layer.style.left) - m*step +"px" ;
layer.style.top = parseInt(layer.style.top) - n*step +"px" ;
//恢复drag到默认位置
drag2.style.left = drag1.style.left = self._left +"px";
drag2.style.top = drag1.style.top = self._top +"px";
//计算移动后的中心点
obj.panTo(obj.pixelToLngLat({x:self._pixel.x+c,y:self._pixel.y+d},self._level));
self._layerInit();
}
i++;
},15);
obj.stopPropagation(e);//阻止冒泡
});
/**
+----------------------------------------------------------
* 对地图进行监控，从而改变鹰眼
+----------------------------------------------------------
*/
var mouseX=0,mouseY=0,overX=0,overY=0;
//地图拖拽监控
obj.bind(obj,"mapmove",function(){
self._layerInit();
});
obj.bind(obj,"zoomchange",function(e){
self._layerInit();
},"system");
},
/**
+----------------------------------------------------------
* 鹰眼图层加载初始化
+----------------------------------------------------------
*/
_layerInit:function(){
var obj = this._map,lay = this.overview.children[0].children[0];
while(lay.length>0){//清空图层内所有切片
lay.removeChild(lay.children[0]);
}
this._level = Math.max(3,obj.level>=4 ? obj.level-4 : obj.level);
//将地图中心点经纬度赋值为视野中心经纬度
this._center = obj.getCenter();
//鹰眼中心点地理像素坐标
this._pixel = obj.lnglatToPixel(this._center,this._level);
//图层左上角地理像素坐标
this._relative = {x:this._pixel.x-115/2,y:this._pixel.y-115/2};
// 西北地理像素坐标
this._northwest = {x:0,y:0};
// 东南地理像素坐标
this._southeast = {x:115,y:115};
//图层归位
lay.style.left = 0;
lay.style.top = 0;
//加载视野图层
this._layerLoad();
},
/**
+----------------------------------------------------------
* 鹰眼图层加载
+----------------------------------------------------------
*/
_layerLoad:function(){
var obj = this._map,lay = this.overview.children[0].children[0];
this._northwest = MMap.extend(this._northwest,this._getTileNum(this._northwest,this._relative));
this._southeast = MMap.extend(this._southeast,this._getTileNum(this._southeast,this._relative));
var fragment = document.createDocumentFragment();
var temp = new Array();this._tile=[];
for(var y=this._northwest.line-1;y<=this._southeast.line+1;y++){
for(var x=this._northwest.column-1;x<=this._southeast.column;x++){
if(this._tile.join(",").indexOf(x+"."+y)==-1){
var tile = new Image();
tile.className = "css-3d-bug-fix-hack";
tile.style.cssText = "width:256px;height:256px;position:absolute;-moz-user-select:none;";
tile.style.top = Math.round(256*y-this._relative.y)+"px";
tile.style.left = Math.round(256*x-this._relative.x)+"px";
tile.onmousedown=function(){return false;};
tile.src = this.tileLayer.getTileUrl(x,y,this._level);
lay.appendChild(tile);
this._tile.push(x+"."+y);
}
temp.push(x+"."+y);
}
}
//删除过期切片
temp = temp.join(",");
for(var i=0;i<this._tile.length;i++){
if(temp.indexOf(this._tile[i])==-1){//切片失效，删除
var oNode = lay.getElementsByTagName("img");
lay.removeChild(oNode[i]);
this._tile.splice(i,1);//从数组删除该切片序号
i--;
}
}
this._map.trigger(this,"load");
},
_getTileNum:function(pixel,relative){
return {"line":Math.floor((pixel["y"] + relative["y"])/256),"column":Math.floor((pixel["x"] + relative["x"])/256)};
},
/**
+----------------------------------------------------------
* 鹰眼显示方法
+----------------------------------------------------------
*/
show : function(){
this.overview.style.display = "block";
this.visible = true;
this._map.trigger(this,"show");
this.open();
},
/**
+----------------------------------------------------------
* 鹰眼隐藏方法
+----------------------------------------------------------
*/
hide:function(){
this.overview.style.display = "none";
this.visible = false;
this._map.trigger(this,"hide");
},
/**
+----------------------------------------------------------
* 鹰眼打开
+----------------------------------------------------------
*/
open:function(){
this._layerInit();
var view = this.overview,self = this;
var timer = setInterval(function(){
var b = parseInt(view.style.width);
if(b<120){
view.style.width = b+5+"px";
view.style.height = b+5+"px";
}else{
window.clearInterval(timer);
self.isOpen = true;
view.children[1].style.backgroundPosition = "-183px 0px";
}
MMap.$("_copyright_"+(self._map._unique || self._map.id)).style.right = b+5 +"px";
self._map.trigger(self,"changeposition");
},15);
this._map.trigger(this,"open");
},
/**
+----------------------------------------------------------
* 鹰眼关闭
+----------------------------------------------------------
*/
close:function(){
var view = this.overview,self = this;
var timer = setInterval(function(){
var b = parseInt(view.style.width)||15;
if(b>15){
view.style.width = b-5+"px";
view.style.height = b-5+"px";
}else{
window.clearInterval(timer);
self.isOpen = false;
view.children[1].style.backgroundPosition = "-183px -15px";
}
MMap.$("_copyright_"+(self._map._unique || self._map.id)).style.right = b+5 +"px";
self._map.trigger(self,"changeposition");
},30);
this._map.trigger(this,"close");
},
/**
+----------------------------------------------------------
* 设置鹰眼切片图层
+----------------------------------------------------------
* @lay TileLayer对象
+----------------------------------------------------------
*/
setTileLayer:function(lay){
this.tileLayer = lay;
this._layerInit();
},
/**
+----------------------------------------------------------
* 获取鹰眼切片图层
+----------------------------------------------------------
*/
getTileLayer:function(){
return this.tileLayer;
}
};
// +----------------------------------------------------------------------
// | MapABC JavaScript API
// +----------------------------------------------------------------------
// | Copyright (c) 2010 http://MapABC.com All rights reserved.
// +----------------------------------------------------------------------
// | Licensed AutoNavi MapABC
// +----------------------------------------------------------------------
// | Author: yhostc <yhostc@gmail.com>
// +----------------------------------------------------------------------
/**
+------------------------------------------------------------------------------
* @constructor Scale
* 地图比例尺插件
+------------------------------------------------------------------------------
*/
MMap.Scale = function(v){
if(v==undefined){
this.visible = true;
}else{
this.visible = v;
}
};
MMap.Scale.prototype = {
_getHtmlDom:function(map){
this._map = map;
var scale = document.createElement("div");
scale.style.cssText = "width:150px; height:25px; position:absolute;left:5px;bottom:5px;z-index:303;-moz-user-select:none";
scale.unselectable = "on";
if(!this.visible){
scale.style.display = "none";
}
var a = document.createElement("div");
a.style.cssText = "height:10px; line-height:10px;position:absolute; left:3px; top:0px; font-family:Verdana, Geneva, sans-serif; font-size:10px;-moz-user-select:none;";
scale.appendChild(a);
var b = document.createElement("div");
b.style.cssText = "height:11px;line-height:11px;position:absolute;left:3px;top:15px;font-family:Verdana,Geneva,sans-serif;font-size:10px;-moz-user-select:none;";
scale.appendChild(b);
var c = document.createElement("img");
c.src = map._client+"Images/blank.gif";
c.style.cssText = "width:2px; height:23px;position:absolute;background:url("+map._client+"Images/bg.png) -169px 0 no-repeat; left:0; top:2px;";
scale.appendChild(c);
var d = document.createElement("img");
d.src = map._client+"Images/blank.gif";
d.style.cssText = "width:2px; height:12px;position:absolute;background:url("+map._client+"Images/bg.png) -176px 0 no-repeat;left:2px;top:2px;";
scale.appendChild(d);
var e = document.createElement("img");
e.src = map._client+"Images/blank.gif";
e.style.cssText = "width:120px; height:2px;position:absolute;background:url("+map._client+"Images/bg.png) -50px -44px repeat-x;left:2px;top:12px;";
scale.appendChild(e);
var f = document.createElement("img");
f.src = map._client+"Images/blank.gif";
f.style.cssText = "width:2px;height:11px;position:absolute;background:url("+map._client+"Images/bg.png) -176px 0 no-repeat;left:2px;top:14px;";
scale.appendChild(f);
this.dom = scale;
this._scale();
//绑定视野改变事件
var self = this;
map.bind(map,"zoomchange",function(){
self._scale();
});
return scale;//返回dom对象
},
/**
+----------------------------------------------------------
* 地图比例尺相关操作
* Notes: 原理：将中心点横向偏移s距离后，换算两点的像素坐标差（横向）
+----------------------------------------------------------
*/
_scale:function(){
var map = this._map;
//米，比例尺
var lngX1 = map.center.lng*Math.PI/180.0+2*Math.asin(Math.sin(this._scaleLevel[map.level][0]/(2*6378137.0))/Math.cos(map.center.lat*Math.PI/180.0));
var pixel = map.lnglatToPixel(map.center,map.level);
var pixel1 = map.lnglatToPixel({lng:lngX1*180/Math.PI,lat:map.center.lat,_type:"lnglat"},map.level);
var scale1 = Math.round(pixel1.x - pixel.x);
//英尺，比例尺
var lngX2 = map.center.lng*Math.PI/180.0+2*Math.asin(Math.sin(this._scaleLevel[map.level][2]*0.3048/(2*6378137.0))/Math.cos(map.center.lat*Math.PI/180.0));
var pixel2 = map.lnglatToPixel({lng:lngX2*180/Math.PI,lat:map.center.lat,_type:"lnglat"},map.level);
var scale2 = Math.round(pixel2.x - pixel.x);
this.dom.children[0].innerHTML = this._scaleLevel[map.level][1];
this.dom.children[1].innerHTML = this._scaleLevel[map.level][3];
this.dom.children[3].style.left = scale1 + 2 +"px";
this.dom.children[4].style.width = Math.abs(scale1 > scale2 ? scale1 : scale2) + 2 +"px";
this.dom.children[5].style.left = scale2 + 2 +"px";
},
/**
+----------------------------------------------------------
* 地图比例尺各级别换算
* Notes:
+----------------------------------------------------------
*/
_scaleLevel:[
/**公里都已换算为米，英里都已换算为英尺**/
[10000000, "10000公里", 26400000, "5000英里"], //0级
[5000000, "5000公里", 10560000, "2000英里"], //1级
[2000000, "2000公里", 5280000, "1000英里"], //2级
[1000000, "1000公里", 2640000, "500英里"], //3级
[500000, "500公里", 1056000, "200英里"], //4级
[200000, "200公里", 1056000, "200英里"], //5级
[100000, "100公里", 528000, "100英里"], //6级
[100000, "100公里", 264000, "50英里"], //7级
[50000, "50公里", 105600, "20英里"], //8级
[20000, "20公里", 52800, "10英里"], //9级
[10000, "10公里", 26400, "5英里"], //10级
[5000, "5公里", 10560, "2英里"], //11级
[2000, "2公里", 10560, "2英里"], //12级
[1000, "1公里", 5280, "1英里"], //13级
[500, "500米", 2000, "200英尺"], //14级
[200, "200米", 1000, "1000英尺"], //15级
[200, "200米", 500, "500英尺"], //16级
[100, "100米", 200, "200英尺"], //17级
[50, "50米", 100, "100英尺"], //18级
[20, "20米", 50, "50英尺"] //19级
],
/**
+----------------------------------------------------------
* 显示比例尺
+----------------------------------------------------------
*/
show:function(){
this.dom.style.display = "block";
this.visible = true;
this._map.trigger(this,"show");
},
/**
+----------------------------------------------------------
* 隐藏比例尺
+----------------------------------------------------------
*/
hide:function(){
this.dom.style.display = "none";
this.visible = false;
this._map.trigger(this,"hide");
}
}; 