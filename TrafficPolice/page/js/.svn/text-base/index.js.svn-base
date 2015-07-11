// JavaScript Document

jQuery.fn.limit=function(widthlength,opt){
	var setting = $.extend({
						   	'self':'li[limit]',
							'rate':51
						   },opt);
	
	var self = $(setting.self);
	self.each(function(){
			var objString = $(this).attr('title')
			
			var objLength = objString.length;
			var num = $(this).attr('limit');
			if(num == '' || num == 'undefined')
			{
				num = 15;
			}
			num = Math.round((widthlength-1024)/setting.rate) + parseInt(num);
			
			if(objLength > num+1){
				
			objString = $(this).text(objString.substring(0,num) + '...');
			}
			else
			{
				objString = $(this).text(objString);
			}
	});
}