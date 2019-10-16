<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
    <%@page import="java.util.ArrayList" %>
    <%@page import="java.util.List" %>
    <%@page import="com.virtusa.bloodbank.model.DonorDetail" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Of Donors</title>
</head>
<body bgcolor="#F3D3CD">
<style>
      body {
  font-family: "Open Sans", sans-serif;
  line-height: 1.25;
}

table {
  border: 1px solid #ccc;
  border-collapse: collapse;
  margin: 20;
  padding: 0;
  width: 80%;
  table-layout: fixed;
  
}

table caption {
  font-size: 1.5em;
  margin: .5em 0 .75em;
}

table tr {
  background-color:#f8f8f8 ;
  border: 1px solid #ddd;
  padding: .35em;
}

table th,
table td {
  padding: .625em;
  text-align: center;
}

table th {
  font-size: .85em;
  letter-spacing: .1em;
  text-transform: uppercase;
  background-color:#e91640
}

@media screen and (max-width: 600px) {
  table {
    border: 0;
  }

  table caption {
    font-size: 1.3em;
  }
  
  table thead {
    border: none;
    clip: rect(0 0 0 0);
    height: 1px;
    margin: -1px;
    overflow: hidden;
    padding: 0;
    position: absolute;
    width: 1px;
  }
  
  table tr {
    border-bottom: 3px solid #ddd;
    display: block;
    margin-bottom: .625em;
  }
  
  table td {
    border-bottom: 1px solid #ddd;
    display: block;
    font-size: .8em;
    text-align: right;
  }
  
  table td::before {
    /*
    * aria-label has no advantage, it won't be read inside a table
    content: attr(aria-label);
    */
    content: attr(data-label);
    float: left;
    font-weight: bold;
    text-transform: uppercase;
  }
  
  table td:last-child {
    border-bottom: 0;
  }
}
    </style>
<form action="/ListOfDonorsServlet" method="get">
<center>
<h1>List Of Donors</h1>
<table align="center">
<table border="1">
<thead>
<tr>
<th scope="col">Donor ID</th>
<th scope="col">Donor name</th>
<th scope="col">Date Of Birth</th>
<th scope="col">Email</th>
<th scope="col">Phone Number</th>
<th scope="col">Address</th>
<th scope="col">Gender</th>
<th scope="col">Bloodgroup</th>
<th scope="col">Aadhar Card Number</th>
<th scope="col">Previous Donate Date</th>
</tr>
 </thead>
<c:forEach var="dusers" items="${donorlist}">
<tr>
<td>${dusers.donor_id}</td>
<td>${dusers.donor_name}</td>
<td>${dusers.email}</td>
<td>${dusers.date_of_birth}</td>
<td>${dusers.phone_number}</td>
<td>${dusers.address}</td>
<td>${dusers.gender}</td>
<td>${dusers.blood_group}</td>
<td>${dusers.aadhar_card_number}</td>
<td>${dusers.prev_donate_date}</td>
</tr>
</c:forEach>
</table>
</center>
</form>
</body>
</html>