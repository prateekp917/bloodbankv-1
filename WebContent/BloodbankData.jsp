<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BloodBank Portal</title>
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
</head>
<body>
<div>
<center>
<div class="topnav">
  <a href="HomePage.jsp">Home</a>
  <a href="About.jsp">About</a>
  <a href="Logout">Log Out</a>
</div>
<form action="/BloodBankServlet" method="get">
<center>
<h1>Blood Stock available</h1>
<table align="center">
<table border="1">
<thead>
<tr>
<th scope="col">STOCK ID</th>
<th scope="col">BLOOD TYPE</th>
<th scope="col">EXPIRY DATE</th>
</tr>
 </thead>
<c:forEach var="stock" items="${stocklist}">
<tr>
<td>${stock.stock_id}</td>
<td>${stock.bloodtype}</td>
<td>${stock.expdate}</td>
</tr>
</c:forEach>
</table>
</center>
</form>
</body>
</body>
</html>