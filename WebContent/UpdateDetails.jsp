<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Details</title>
<style>
h3{
  font-family: Calibri; 
  font-size: 25pt;         
  font-style: normal; 
  font-weight: bold; 
  color:SlateBlue;
  text-align: center; 
  text-decoration: underline
}

table{
  font-family: Calibri; 
  color:white; 
  font-size: 11pt; 
  font-style: normal;
  font-weight: bold;
  text-align:; 
  background-color: SlateBlue; 
  border-collapse: collapse; 
  border: 2px solid navy
}
table.inner{
  border: 0px
}
</style>
</head>
<body>
<form action="UpdateDetails" method="post">
<h3>Update Personal Details</h3> 
<table align="center" cellpadding = "10">
<tr>
<td>DONOR NAME</td>
<td><input type="text" name="donorname" maxlength="20"/>
</td>
</tr>
<tr>
<td>DATE OF BIRTH</td>
<td>
<input type="date" name="dateofbirth"/>
</td>
</tr>
<!----- Email Id ---------------------------------------------------------->
<tr>
<td>EMAIL ID</td>
<td><input type="text" name="emailid" maxlength="100" /></td>
</tr>
 
<!----- Mobile Number ---------------------------------------------------------->
<tr>
<td>MOBILE NUMBER</td>
<td>
<input type="text" name="mobilenumber" maxlength="10" />
(10 digit number)
</td>
</tr>
  


<!----- Address ---------------------------------------------------------->
<tr>
<td>ADDRESS <br /><br /><br /></td>
<td><textarea name="address" rows="4" cols="30"></textarea></td>
</tr>
  
  <!----- Gender ----------------------------------------------------------->
<tr>
<td>GENDER</td>
<td>
Male <input type="radio" name="Gender" value="Male" />
Female <input type="radio" name="Gender" value="Female" />
</td>
</tr>
 
 
<!----- Blood Group ---------------------------------------------------------->
<tr>
<td>BLOOD GROUP</td>
<td><input type="text" name="bloodgroup" maxlength="5" />

</td>
</tr>
 
<!----- Pin Code ---------------------------------------------------------->
<tr>
<td>AADHAR NUMBER</td>
<td><input type="text" name="aadhar" size= 12 maxlength="12" />
</td>
</tr>
<tr>
<td>PREVIOUS DONATION DATE</td>
<td>
<input type="date" name="prevdondate"/>
</td>
</tr>
<!----- Submit and Reset ------------------------------------------------->
<tr>
<td colspan="2" align="center">
<input type="submit" value="Submit">
</td>
</tr>
</table>
</form>
</body>
</html>