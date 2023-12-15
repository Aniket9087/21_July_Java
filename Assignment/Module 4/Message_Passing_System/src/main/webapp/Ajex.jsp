<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>  
var request=new XMLHttpRequest();  
function searchInfo()
{  
	var fname=document.vinform.name.value;  
	var url="AjaxSearch.jsp?val="+fname;  
  	try
  	{  
		request.onreadystatechange=function()
		{  
			if(request.readyState==4)
			{  
				var val=request.responseText;  
				document.getElementById('tops').innerHTML=val;  
			}  
		}  
		request.open("GET",url,true);  
		request.send();  
	}
  	catch(e)
  	{
  		alert("Unable to connect to server");
  	}  
}  
</script>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajax Search Example</title>
</head>
<body>
<h1>Search Client</h1>  
<form name="vinform">  
	<input type="text" name="fname" onkeyup="searchInfo()">  
</form>  
<span id="tops"></span>  
</body>  
</body>
</html>