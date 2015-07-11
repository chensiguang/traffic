(function($) {
	function load(settings, root, child, container) {
		$.getJSON(settings.url, {
			root : root
		}, function(response) {
			function createNode(parent) {
				var current = $("<li/>").attr("id", this.id || "").html(
						"<span>" + this.text + "</span>").appendTo(parent);
				if (this.classes) {
					current.children("span").addClass(this.classes);
				}
				;
				if (this.expanded) {
					current.addClass("open");
				}
				;
				if (this.hasChildren || this.children && this.children.length) {
					var branch = $("<ul/>").appendTo(current);
					if (this.hasChildren) {
						current.addClass("hasChildren");
						createNode.call({
							text : "placeholder",
							id : "placeholder",
							children : []
						}, branch);
					}
					;
					if (this.children && this.children.length) {
						$.each(this.children, createNode, [ branch ])
					}
				}
			}
			;
			$.each(response, createNode, [ child ]);
			$(container).treeview({
				add : child
			});
		});
	}
	;
	var proxied = $.fn.treeview;
	$.fn.treeview = function(settings) {
		if (!settings || !settings.url) {
			return proxied.apply(this, arguments);
		}
		;
		var container = this;
		load(settings, "source", this, container);
		var userToggle = settings.toggle;
		return proxied.call(this, $.extend({}, settings,
				{
					collapsed : true,
					toggle : function() {
						var $this = $(this);
						if ($this.hasClass("hasChildren")) {
							var childList = $this.removeClass("hasChildren")
									.find("ul");
							childList.empty();
							load(settings, this.id, childList, container);
						}
						;
						if (userToggle) {
							userToggle.apply(this, arguments);
						}
					}
				}));
	};
})(jQuery);

function doLoadingHtmlpost(htmlUrl, obj, targetBlock, inchingTime, callBack) {
	randomseed = Math.round(Math.random() * 10000000);

	htmlUrlString = htmlUrl;
	if (htmlUrlString.indexOf('?') == -1)
		htmlUrlString += '?randomseed=' + randomseed;
	else
		htmlUrlString += '&randomseed=' + randomseed;

	if (callBack != null) {
		var arg = [];
		for ( var i = 6; i < arguments.length; i++) {
			arg.push(arguments[i]);
		}
	}

	var buffer = "";
	buffer += "<table width='100%' height='100%' border='0' cellspacing='0' cellpadding='0'>";
	buffer += "   <tr valign='middle' height='100%'> ";
	buffer += "      <td align='center'> ";
	buffer += "         <img src='page/admin/images/wait.gif'/> ";
	buffer += "      </td> ";
	buffer += "</tr>";
	buffer += "</table>";

	var buffer_error = "";
	buffer_error = "没有记录...";

	$(targetBlock).empty();// hide the target block
	$(targetBlock).html(buffer);

	$.ajax({
		url : htmlUrlString,
		type : 'post',
		dataType : 'html',
		timeout : 120000,
		cache : false,
		data : obj,
		success : function(data) {
			// alert(data);
			$(targetBlock).html(data);
			if (callBack != null)
				callBack.apply(this, arg);
		},
		error : function(request, textStatus, errorThrown) {
			$(targetBlock).html(buffer_error);
			$(targetBlock).show(inchingTime);// hide the target block
		}
	});// getting html pages

	$(targetBlock).show(inchingTime);// show the target block
}
