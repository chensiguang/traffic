// JavaScript Document
var elformat = function(date){
	 	var s = date;
		
		if(typeof date == "string")
		{
			s = s.replace(/\r\n/g, "<br>&nbsp;&nbsp;");
			s = s.replace(/\r/g, "<br>");
			s = s.replace(/\n/g, "<br>");
			s= s.replace(/\t/g, "&nbsp;&nbsp;&nbsp;&nbsp;");
			s =s.replace(/ /g, "&nbsp;");
		}
		return s;
	 }