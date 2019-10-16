<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Donor Portal</title>
</head>
<body bgcolor="#F3D3CD">
<style>
body {
	background:  #F3D3CD;
	font-family: 'Open Sans', sans-serif;


  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}
	.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
 
}

.topnav a.active {
  background-color:#4CAF50;
  color: white;
  
}
</style>
<div class="topnav">
  <a href="HomePage.jsp">Home</a>
  <a href="About.jsp">About</a>
  <a href="Logout">Log Out</a>
</div>
</center>
<h3>Welcome Donor User <%=request.getAttribute("username") %> </h3>

</body>
</html>