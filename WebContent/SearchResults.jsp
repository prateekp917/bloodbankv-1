<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
     <%@page import="java.util.ArrayList" %>
    <%@page import="java.util.List" %>
    <%@page import="com.virtusa.bloodbank.model.BloodStock" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
  width: 40%;
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Results</title>
</head>
<body>
<form action="SearchResultsServlet" method="get">
<center>
<h1>Search Results</h1>
<table align="center">
<table border="1">
 <%
    System.out.println(session.getAttribute("search")+" session jsp");
	HttpSession session2=request.getSession(false);

	 String chkstr=(String)session.getAttribute("checkcond");
	 System.out.println(chkstr);
 if(chkstr.length()>5)
 {%>
 	<thead>
<tr>
<th scope="col">Stock ID</th>
<th scope="col">Blood Type</th>
<th scope="col">Expiry date</th>
</tr>
 </thead>
	 <% Object object=(session.getAttribute("namelist"));
	 List<BloodStock> list =null;
	  if(object!=null)
	  {
	 	 list = (List<BloodStock>)object;
	  }
 	for(BloodStock bs:list)
 	{%>
 	<tr>
 	<td><%=bs.getStock_id() %></td>
 	<td><%=bs.getBloodtype() %></td>
 	<td><%=bs.getExpdate() %></td>
 	</tr>		
 	<%}
 }else
 {%>
 <thead>
<tr>
<th scope="col">Blood Type</th>
<th scope="col">Blood Bank</th>
<th scope="col">Blood bank address</th>
</tr>
 </thead>
 	<% Object object=(session.getAttribute("searchlist"));
	 List<BloodStock> list =null;
	  if(object!=null)
	  {
	 	 list = (List<BloodStock>)object;
	  }
	 for(BloodStock bs:list)
	 { System.out.println(bs+" in jsp");%>
	 <tr>
 	<td><%=bs.getBloodtype() %></td>
 	<td><%=bs.getBloodbank() %></td>
 	<td><%=bs.getBaddress() %></td>
 	</tr>	
	 <%}
 }%>
 	

</table>
</center>
</form>
</body>
</html>