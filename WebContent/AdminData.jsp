<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Portal</title>
</head>
<body bgcolor="#F3D3CD">
<div class="topnav">
  <a href="HomePage.jsp">Home</a>
  <a href="About.jsp">About</a>
  <a href="Logout">Log Out</a>
</div>
<div>
<center>
<h3>Welcome Admin User <%=request.getAttribute("username") %> </h3>
</center>
</div>
<div>
<style>
body {
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
      th, td {
        padding: 10px;
        border: 1px solid #666;
        background-color:#f8f8f8 ;
      }
      table th{
     background-color:#e91640;
      }
      .admin{
      position:relative;
      top:100px;
      }
    </style>
    
    
    <form action="/AdminServlet" method="post">
 <table style="width:10%; margin:30px auto;class:admin;border-collapse:collapse;">
 <center>
      <tr>
        <th>DATA</th>
      </tr>
      <tr>
        <td><a href="ListOfUsersServlet">List Of Users</a></td>
      </tr>
      <tr>
        <td><a href="AvailableBloodStockServlet">Available Blood Stock</a></td>
        </tr>
        <tr>
        <td><a href="ListOfDonorsServlet">List Of Donors</a></td>
      </tr>
      </center>

    </table>
</div>
</body>
</html>