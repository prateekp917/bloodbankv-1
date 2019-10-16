<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BloodBank and Hospital Portal</title>
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
<h3>Welcome <%=session.getAttribute("username") %> </h3>
<form action="HospitalServlet" method="post">
<div class="button dropdown"> 
  <select id="bloodgroup" name="selectbg">
  	<option value="Select">Select</option>
     <option value="A+">A+</option>
     <option value="A-">A-</option>
     <option value="B+">B+</option>
    <option value="B-">B-</option>
    <option value="AB+">AB+</option>
    <option value="AB-">AB-</option>
    <option value="O+">O+</option>
    <option value="O-">O-</option>
  </select>
</div><br>
<div class="button dropdown"> 
  <select id="bloodbankname" name="selectname">
  	<option value="Select">Select</option>
     <option value="Sharadha Bloodbank">Sharadha Bloodbank</option>
     <option value="Vivekananda BloodBank">Vivekananda BloodBank</option>
     <option value="Harpreet BloodBank">Harpreet BloodBank</option>
    <option value="Rangaraja BloodBank">Rangaraja BloodBank</option>
    <option value="Balaji BloodBank">Balaji BloodBank</option>
    <option value="AnuPama BloodBank">AnuPama BloodBank</option>
    <option value="MotherTheresa BloodBank">MotherTheresa BloodBank</option>
    <option value="Government BloodBank">Government BloodBank</option>
    <option value="Sandy BloodBank">Sandy BloodBank</option>
    <option value="Godslove BloodBank">Godslove BloodBank</option>
    <option value="Sri Venkateswara Blood Bank">Sri Venkateswara Blood Bank</option>
  </select>
</div>
<input type="Submit" class="search" value="search">
</center>
</body>
</html>