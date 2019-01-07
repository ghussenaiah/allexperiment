<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AJAX calls using Jquery in Servlet</title>
        <script src="http://code.jquery.com/jquery-latest.js">   
        </script>
        <script>
            $(document).ready(function() {      
            /* 1. default function */
                $('#submit').click(function(event) {
                	
                	/* 2.fire on button click or instead of click change is also available drop down selection*/
                    var username=$('#user').val();
                	
                	/*  read value from text box*/
                 $.get('ActionServlet',{user:username},function(responseText) {
                	 
                	 /* response from servelet class */
                        $('#welcometext').text(responseText);     
                	 
                	 /* assign value to  div tag */
                    });
                });
            });
        </script>
</head>
</html><body>
<form id="form1">
<h1>AJAX Demo using Jquery in JSP and Servlet</h1>;

Enter your Name:<input type="text" id="user"/>
<input type="button" id="submit" value="Ajax Submit">

<br/>
<div id="welcometext">
</div>
</form>
</body>
</html>