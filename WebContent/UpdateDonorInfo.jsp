<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
    body {
	background-color:#f3d3cd;
	font-family: 'Open Sans', sans-serif;
	font-weight: 300;
}

    h3{
  font-family: Calibri; 
  font-size: 25pt;         
  font-style: normal; 
  font-weight: bold; 
  color:black;
  text-align: center; 
}
.updatebutton {
  position: relative;
  top:20px;
  display: inline-block;
  background-color:#e91640;
  height: 50px;
  width: 40%;
  border-radius: 5px;
  text-align: center;
  vertical-align: middle;
  line-height: 50px;  
  color: #ecf0f1;
  margin-bottom: 80px;
  font-weight: bold;
 }

table{

  font-family: Calibri; 
  color:black; 
  font-size: 11pt; 
  font-style: normal;
  font-size: 1em;
  font: inherit;
  text-align:; 
  background-color: white; 
  border-collapse: collapse; 
 
   border-radius: 20px;
}
    label {
	display: inline-block;
	width: 40%;
}
table.inner{
margin: top:20px;
  border: 0px
}
    input[type=text],
input[type=password],
    textarea,
select{
	border: none;
	padding: 0.5em;
	background-color: #ecf0f1;
	font: inherit;
	float: left;
	width: 80%;
}

textarea {
	max-width: 80%;
	min-width: 50%;
}
    </style>

<title>Update Details</title>
</head>
<body>
<form action="UpdateDonorInfo" method ="post">
<h3>Update Personal Details</h3> 
<table align="center" cellpadding = "20">
<tr>

<% long donorid=(Long)session.getAttribute("did");%>
	<% session.setAttribute("donid",donorid);%>
<!----- Email Id ---------------------------------------------------------->
<tr>
<td>Email ID</td>
<td><input type="text" name="Email_Id" maxlength="100" /></td>
</tr>
 
<!----- Mobile Number ---------------------------------------------------------->
<tr>
<td>Mobile Number</td>
<td>
<input type="text" name="Mobile_Number" maxlength="10" />
</td>
</tr>
  


<!----- Address ---------------------------------------------------------->
<tr>
<td>Address <br /><br /><br /></td>
<td><textarea name="Address" rows="4" cols="10"></textarea></td>
</tr>
  
<!----- Date Of Birth -------------------------------------------------------->
<tr>
<td>Previous Donation Date</td>
 
<td>
<input type="Date" name="Prev_Donate_date">
</td>
</tr> 
 

<!----- Submit and Reset ------------------------------------------------->
<tr>
<td colspan="2" align="center">
<input type="submit" value="Update" class="updatebutton">

</td>
</tr>
</table>
 
</form>
 
</body>
</html>