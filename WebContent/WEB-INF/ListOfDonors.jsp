<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Of Donors</title>
</head>
<body>
<form action="/ListOfDonorsServlet" method="get">
<center>
<h1>Users List</h1>
<table border="1">
<tr>
<th>Donor ID</th>
<th>Donor name</th>
<th>Date Of Birth</th>
<th>Email</th>
<th>Phone Number</th>
<th>Address</th>
<th>Gender</th>
<th>Bloodgroup</th>
<th>Aadhar Card Number</th>
<th>Previous Donate Date</th>
</tr>
<c:forEach var="dusers" items="${donorlist}">
<tr>
<td>${dusers.donor_id}</td>
<td>${dusers.donor_name}</td>
<td>${dusers.email}</td>
<td>${dusers.date_of_birth}</td>
<td>${dusers.phone_number}</td>
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