<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<style>
html,body,div,span,applet,object,iframe,h1,h2,h3,h4,h5,h6,p,blockquote,pre,a,abbr,acronym,address,big,cite,code,del,dfn,em,img,ins,kbd,q,s,samp,small,strike,strong,sub,sup,tt,var,b,u,i,center,dl,dt,dd,ol,ul,li,fieldset,form,label,legend,table,caption,tbody,tfoot,thead,tr,th,td,article,aside,canvas,details,embed,figure,figcaption,footer,header,hgroup,menu,nav,output,ruby,section,summary,time,mark,audio,video{border:0;font-size:100%;font:inherit;vertical-align:baseline;margin:0;padding:0}article,aside,details,figcaption,figure,footer,header,hgroup,menu,nav,section{display:block}body{line-height:1}ol,ul{list-style:none}blockquote,q{quotes:none}blockquote:before,blockquote:after,q:before,q:after{content:none}table{border-collapse:collapse;border-spacing:0}

* {
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	-ms-box-sizing: border-box;
	-o-box-sizing: border-box;
	box-sizing: border-box;
}

body {
	background: #3498db;
	font-family: 'Open Sans', sans-serif;
	font-weight: 300;
}

#registration {
	width: 480px;
	background: #fff;
	padding: 1em;
	margin: 2em auto;
}

h1 {
	font-size: 2em;
	font-weight: 400;
	text-align: center;
	margin-bottom: 1em;
}

p {
	padding: 0.5em 0;
}

p:after {
	content: '';
	display: block;
	clear: both;
}

label {
	display: inline-block;
	width: 40%;
}

input[type=text],
input[type=password],
textarea,
select{
	border: none;
	padding: 0.5em;
	background-color: #ecf0f1;
	font: inherit;
	float: right;
	width: 50%;
}

textarea {
	max-width: 50%;
	min-width: 50%;
}

button {
	border: none;
	background: #3498db;
	width: 100%;
	padding: 1em 0;
	font: inherit;
	color: #ecf0f1;
	font-weight: 400;
}

#errorMessages {
	width: 480px;
	margin: 2em auto;
	background-color: #ecf0f1;
	overflow: hidden;
}

#errorMessages li {
	padding: 1em;
	background-color: #e74c3c;
	color: #ecf0f1;
	font-weight: 400;
	margin: 0 1em;
	margin-bottom: 1em;
}

#errorMessages li:first-child {
	margin-top: 1em;
}
</style>
<form action="RegistrationServlet" id="registration" method="post">
		<h1>Registration</h1>

		<p>
			<label for="username">Username:</label>
			<input type="text" id="username" name="username" />
		</p>

		<p>
			<label for="password1">Password:</label>
			<input type="password" id="password1" name="password1" />
		</p>

		<p>
			<label for="password2">Confirm Password:</label>
			<input type="password" id="password2" name="password2" />
		</p>
		<p>
			<select name="usertype">
 		 	<option value="Admin">Admin</option>
  			<option value="Donor">Donor</option>
  			<option value="Bloodbank">Blood Bank</option>
 			<option value="Hospital">Hospital</option>
			</select><br>
		</p>
		<p>
			<button type="Submit" id="register">Register!</button>
		</p>

	</form>

	<div id="errorMessages"></div>
</body>
</html>