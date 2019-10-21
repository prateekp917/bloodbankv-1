<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Donor Portal</title>
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
  .contact{
      position: absolute;
  bottom: 0;
  width: 100%;
  height: 2.5rem;  
  }
body {
	background:  #F3D3CD;
	font-family: 'Nunito', sans-serif;
  	margin: 0;
  	padding: 0;
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
.form-container {
  display: block;
  margin: 10vh auto; /* 10% = Middle of Page */
  width: 700px;
  border: 2px solid #eee;
  border-radius: 20px;
  background-color: rgba(82, 109, 100,0.2);
}

#form-title {
  display: block;
  height: 100px;
  text-align: center;
  padding-top: 50px;
  font-size: 2.5em;
}

label {
  display: inline-block;
  width: 25%;
  padding-left: 50px;
}
.update {
  margin-top: 50px;
  margin-left: 190px;
  margin-bottom: 50px;
}
.update-button {
  position: relative;
  display: inline-block;
  background-color:#e91640;
  height: 50px;
  width: 40%;
  border-radius: 5px;
  text-align: center;
  vertical-align: middle;
  line-height: 50px;  
  color: black;
}

.update-button:hover {
  background-color: #fff;
  color: black;
}

a {
  text-decoration: none;
}
     table, th, td {
  border: 0px solid black;
  
}
th, td {
  border:0px;
  padding: 20px;
  text-align: left;
</style>
</head>
<body>
<div class="topnav">
  <a href="HomePage.jsp">Home</a>
  <a href="About.jsp">About</a>
  <a href="Login.jsp">Log Out</a>
</div>

<div class="form-container">
  
  <div id="form-title">Welcome <%=request.getAttribute("username") %></div>
    <% long donorid=(Long)session.getAttribute("id");%>
	<% session.setAttribute("did",donorid);%>
<table style="width:100%">
  <tr>
    <th>Donor ID:</th>
    <td colspan="2"><%=session.getAttribute("id") %></td>
  </tr>
  <tr>
    <th>Donor Name:</th>
    <td colspan="2"><%=session.getAttribute("dname") %></td>
  </tr>
  <tr>
    <th>Date Of Birth:</th>
    <td colspan="2"><%=session.getAttribute("ddob") %></td>
  </tr>
   <tr>
    <th>E-mail:</th>
    <td colspan="2"><%=session.getAttribute("demail") %></td>
  </tr>
  <tr>
  <th>Phone Number:</th>
  <td colspan="2"><%=session.getAttribute("dphoneno") %></td>
  </tr>
  <tr>
  <th>Address:</th>
  <td colspan="2"><%=session.getAttribute("daddr") %></td>
  </tr>
  <tr>
  <th>Gender:</th>
  <td colspan="2"><%=session.getAttribute("dgender") %></td>
  </tr>
  <tr>
  <th>Blood Group:</th>
   <td colspan="2"><%=session.getAttribute("dbgroup") %></td>
  </tr>
  <tr>
  <th>Aadhar card Number:</th>
   <td colspan="2"><%=session.getAttribute("daadhar") %></td>
  </tr>
  <tr>
  <th>Previous Donate Date:</th>
   <td colspan="2"><%=session.getAttribute("dprevddate") %></td>
  </tr>
  </table>
 <div class="update">
    <a href="UpdateDonorInfo.jsp"><div class="update-button">Update</div></a>
</div>
</body>
</html>