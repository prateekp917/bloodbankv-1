<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
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
  
* {
  box-sizing: border-box;
}

  .button{
  background-color: #b30000; 
  border: none;
  color:#4d0000;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  color:white;
  }
   #bbank{
    width: 45%;
	background: #fff;
	padding: 1em;
	margin: 2em auto;
  border-radius: 20px;
    float:left;
    height:300px;
  }
  #Bgroup{
     width: 45%;
	background: #fff;
	padding: 1em;
	margin: 2em auto;
  border-radius: 20px;
  float:right;
   height:300px;
  }
  
</style>
</head>
<!-- <body>
<div>
<center>
<div class="topnav">
  <a href="HomePage.jsp">Home</a>
  <a href="About.jsp">About</a>
  <a href="Logout">Log Out</a>
</div>
<div class="bloodgroup">
<div class="row">
   <div class="bgroup">
  <div class="column" style="background-color:#bbbb;">
   <center>
<h2>Welcome <%=session.getAttribute("username") %> </h2>
</center>
 <h3>Search for BloodBank</h3>
   <select name="selectname" size="1" style="font-size:20px;" >
    <option value="">Search</option>
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
  <br><br>
 <input type="Submit" class="button" value="submit">
</form>

 </div>
 </div>
 <div class="bloodgroup">
 <div class="column2" style="background-color:#bbbb">
 <center>
 
  <form action="/action_page.php" id=Bgroup>
    <h2>Search for BloodGroup</h2>
   <select name="selectbg" size="1" style="font-size:20px;" >
    <option value="">Search</option>
    <option value="A+">A+</option>
    <option value="B+">B+</option>
    <option value="AB+">AB+</option>
    <option value="O+">O+</option>
    <option value="O-">O-</option>
    <option value="AB-">AB-</option>
    <option value="A-">A-</option>
    <option value="B-">B-</option>
  </select>
  <br><br>
<input type="Submit" class="button" value="submit" >
</form>
    </center>
</div>
</div>
</body> 
-->
<body bgcolor=#f3d3cd>
  <div>
<center>
<div class="topnav">
  <a href="HomePage.jsp">Home</a>
  <a href="About.jsp">About</a>
  <a href="Logout">Log Out</a>
</div>
<center>
   <center>
<h2>Welcome <%=session.getAttribute("username") %> </h2>
  <form action="HospitalServlet" method="post">

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
<br>

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

<input type="Submit" class="search" value="search">
</center>
</body>
</body>
</html>