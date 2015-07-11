//author:xinyu.li,date:2012/5/9
var TypeAheadPlugin=(function(){//单例
	function m_$(){
		var elements = new Array();
		for (var i = 0; i < arguments.length; i++) {
			var element = arguments[i];
			if (typeof element == 'string')
				element = document.getElementById(element);
			if (arguments.length == 1) 
				return element;
			elements.push(element);
		}
		return elements;
	}
	function keypress(e){
		var e=e||window.event;
		var keyCode=e.keyCode||e.which;
		if(keyCode==40){//向下键
			if(isShow){
				if(listIndex>=-1&&listIndex<listLength-1){
					listIndex+=1;listChecked();
					var thisDivObj=m_$('m_list'+listIndex);
					inputObj.value=thisDivObj.innerHTML;
				}else if(listIndex==listLength-1){
					m_$('m_list'+listIndex).style.backgroundColor=backgroundColor[1];
					inputObj.value=inputValyoupress;
					listIndex+=1;
				}else if(listIndex==listLength){
					listIndex=0;
					listChecked();
				}
			}
		}else if(keyCode==38){//向上键
			if(isShow){
				if(listIndex>0&&listIndex<=listLength){
					listIndex-=1;
					listChecked();
					var thisDivObj=m_$('m_list'+listIndex);
					inputObj.value=thisDivObj.innerHTML;
				}else if(listIndex==0){
					m_$('m_list'+listIndex).style.backgroundColor=backgroundColor[1];
					inputObj.value=inputValyoupress;
					listIndex=listLength;
				}
			}
		}else if(keyCode==13){//回车键
			if(typeof afterCheckedFun=='function')
				afterCheckedFun(inputObj.value);
		}else if((keyCode>=48 && keyCode<=57) 
				  	|| (keyCode>=65 && keyCode<=90) 
						|| (keyCode>=97 && keyCode<=112) 
							|| keyCode==8||keyCode==32){
			searchList();
			inputValyoupress=inputObj.value;
		}
		
	}
	function show(){
		listObj.style.display='block';
		listObj.style.backgroundColor=backgroundColor[1];
		isShow=true;
		if(typeof positionFun=='function')
			positionFun();
		else{

		}
	}
	function hide(){
		listObj.style.display='none';
		isShow=false;
	}
	function closes(){
		$('#m_list').remove();
		$('#m_list').trigger("update");
	}
	function searchList(){
		var search=new MMap.PoiSearch();
		search.inputPrompt(inputObj.value,city,searchListBack)
	}
	function searchListBack(data){
		if(data.status=='E0'){
			var s='';
			if(isShowCity.toString()=='true')s+='<div style="color:red;">当前城市：'+city+'</div>'
			for (var i = 0,l = data.list.length; i < l; i++) {
				s+='<div id="m_list'+i+'">'+data.list[i]+'</div>'
			};
			m_listObj.innerHTML=s;
			listLength=data.list.length;
			for(i=0;i<l;i++){
				var a=m_$('m_list'+i)
				a.onmouseover=function(e){
					listIndex=parseInt(this.id.substring(6));
					listChecked();
				}
				a.onmouseout=function(){
					var b=parseInt(this.id.substring(6));
					m_$('m_list'+b).style.backgroundColor=backgroundColor[1];
				}
				a.onmousedown=function(){
					inputObj.value=this.innerHTML;
					if(typeof afterCheckedFun=='function'){
						afterCheckedFun(inputObj.value);// 填入选择中
					}
					closes();
				}
			}
			show();
		}else{
			hide();
		}
	}
	function listChecked(){
		var a=m_$('m_list'+listIndex);
		a.style.background=checkedColor[1];
		for(var i=0;i<listLength;i++){
			if(i!=listIndex)
				m_$('m_list'+i).style.background=backgroundColor[1];
		}
	}
	var listObj=null,
		inputObj=null,
		m_listObj=null,//object
		city='',
		inputValyoupress='',//string
        isShow=false,
		isShowCity=false,//boolean
		listLength=0,
		listIndex=-1,//number
		positionFun=null,
		afterCheckedFun=null,//function
		checkedColor=['#dbe5ff','#dbe5ff'],
		backgroundColor=['#ffffff','#ffffff'];
	var obj={
		init:function(inputId,listId,cityStr){
			inputObj=m_$(inputId);
			listObj=m_$(listId);
			city=cityStr;
			listObj.innerHTML='<div id="m_list"></div>';
			m_listObj=m_$('m_list');		
			hide();
			inputObj.onkeyup=keypress;
		},
		setCity:function(s){//只有城市改变时，无需重新初始化，只重设city
			if(typeof s=='string')city=s;
			searchList();
		},
		setPositionOrStyle:function(fun){//设置列表框显示位置，接受函数为参数
			positionFun=fun;
		},
		setAfterChecked:function(fun){//设置响应点击列表元素或按回车键的函数
			afterCheckedFun=fun;
		},
		setCheckedColor:function(color){//设置列表选中状态背景色，设回默认值传入字符串‘default’
			if(color==='default')
				checkedColor[1]=checkedColor[0];
			else 
				checkedColor[1]=color;

		},
		setBackgroundColor:function(color){//设置列表背景色，设回默认值传入字符串‘default’
			if(color==='default')backgroundColor[1]=backgroundColor[0];
			else backgroundColor[1]=color;
		},
		isShowCity:function(b){
			isShowCity=b;
		},
		isClose:function(){
			closes();	
		},
		isHide:function(){
			hide();	
		}
	}
	return obj;
})();