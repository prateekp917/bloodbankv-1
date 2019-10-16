<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
    <%@page import="java.util.ArrayList" %>
    <%@page import="java.util.List" %>
    <%@page import="com.virtusa.bloodbank.model.BloodStock" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Blood Stock Details</title>
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
<form action="/AvailableBloodStockServlet" method="get">
<center>
<h1>AVAILABLE BLOOD STOCK</h1>
<table align="center">
<table border="1">
<tr>
<th>STOCK ID</th>
<th>Blood Type</th>
<th>Expiry Date</th>
<th>HGB Count</th>
<th>RBC Count</th>
<th>WBC Count</th>
<th>Platelets Count</th>
<th>MCV Count</th>
<th>DONOR ID</th>
<th>Allergies</th>
</tr>
<c:forEach var="blood" items="${bloodlist}">
<tr>
<td>${blood.stock_id}</td>
<td>${blood.bloodtype}</td>
<td>${blood.expdate}</td>
<td>${blood.hgb}</td>
<td>${blood.rbc}</td>
<td>${blood.wbc}</td>
<td>${blood.platelets}</td>
<td>${blood.mcv}</td>
<td>${blood.donor_id}</td>
<td>${blood.allergies}</td>
</tr>
</c:forEach>
</table>
</center>
</form>
</body>
</html>