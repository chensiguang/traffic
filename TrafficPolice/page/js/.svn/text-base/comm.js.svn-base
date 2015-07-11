/**
 * zhanghq 2012/11/12
 */

function homePage(obj) {
	var url = window.location.href;
	
	if (document.all) {
		document.body.style.behavior = 'url(#default#homepage)';
		document.body.setHomePage(url);
	}
	else if (window.sidebar) {
		if (window.netscape) {
			try {
				netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
			}
			catch (e) {
				alert("该操作被浏览器拒绝，如果想启用该功能，请在地址栏内输入 about:config,然后将项 signed.applets.codebase_principal_support 值该为true");
			}
		}
		var prefs = Components.classes['@mozilla.org/preferences-service;1'].getService(Components.interfaces.nsIPrefBranch);
		prefs.setCharPref('browser.startup.homepage', url);
	}else { 
		alert('浏览器不支持该操作！');
	}

}
function addFavoite() {
	var url = window.location.href;
	try {
		window.external.addFavorite(url, "合肥市墙体材料革新和建筑节能办公室");
	} catch (e) {
		try {
			window.sidebar.addPanel("合肥市墙体材料革新和建筑节能办公室", url, "");
		} catch (e) {
			alert("加入收藏失败，请使用Ctrl+D进行添加");
		}

	}

}

function tick() {
	var today, theday;
	today = new Date();
	var d = [" 星期日", " 星期一", " 星期二", " 星期三", " 星期四", " 星期五",
			" 星期六"];
	theday = "今天是  : " + today.getFullYear() + "年" + ( today.getMonth() + 1 ) + "月"
			+ today.getDate() + "日" + d[today.getDay()];
	document.getElementById("clock").innerHTML = theday;
}
window.onload = tick;