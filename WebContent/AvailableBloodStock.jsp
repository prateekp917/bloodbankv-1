<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Of users</title>
</head>
<body>
<form action="/AvailableBloodStockServlet" method="get">
<center>
<h1>AVAILABLE BLOOD STOCK</h1>
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