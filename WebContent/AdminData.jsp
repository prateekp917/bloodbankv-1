<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Portal</title>
</head>
<body>
<div>
<h3>Welcome Admin User <%=request.getAttribute("username") %> </h3>
</div>
<div>
<style>
      th, td {
        padding: 10px;
        border: 1px solid #666;
      }
    </style>
    <form action="/AdminServlet" method="post">
 <table style="width:10%; margin:30px auto; border-collapse:collapse;">
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

    </table>
</div>
</body>
</html>