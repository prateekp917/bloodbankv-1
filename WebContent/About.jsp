<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <body bgcolor="#F3D3CD">
    <style>
    
      body {
      margin:0;
  font-family: "Open Sans", sans-serif;
  line-height: 1.25;
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
 /* .contact{
      position: absolute;
  bottom: 0;
  width: 100%;
  height: 2.5rem;  
  }*/


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
    <div class="topnav">
  <a href="HomePage.jsp">Home</a>
  <a href="About.jsp">About</a>
  <a href="Login.jsp">Login</a>
</div>
    
    <h3 style="font-family:Comic Sans MS;" >About</h3>
    <p style="text-align:center;">
      Rakt Kosh was established in Chennai,Tamilnadu in October 2001.
    </p>
    <p style="text-align:center;">
 1628 English physician William Harvey discovers the circulation of blood. Shortly afterward, the earliest known blood transfusion is attempted. 1665 The first recorded successful blood transfusion occurs in England: Physician Richard Lower keeps dogs alive by transfusion of blood from other dogs.
      The first blood bank was established in Kolkata, West Bengal in March 1942 at the All India Institute of Hygiene and Public Health and was managed by the Red Cross.The donors were mostly government employees and people from the Anglo-Indian community who donated blood for a humanitarian cause.
    </p>
      
      


<table align="center">
  
  <caption>Types of Blood</caption>
  <thead>
    <tr>
      <th scope="col">bloodtype</th>
      <th scope="col">donate blood to</th>
      <th scope="col">receive blood from</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <td data-label="bloodtype">A+</td>
      <td data-label="Donate blood to">A+,AB+</td>
      <td data-label="Receive blood from">A+,A-,O+,O- </td>
   
    </tr>
    <tr>
       <td data-label="bloodtype">O+</td>
      <td data-label="Donate blood to">O+,A+,B+,AB+</td>
      <td data-label="Receive blood from">O+,O- </td>
    </tr>
    <tr>
      <td data-label="bloodtype">B+</td>
      <td data-label="Donate blood to">B+,AB+</td>
      <td data-label="Receive blood from">B+,B-,O+,O- </td>
      
    </tr>
    <tr>
     <td data-label="bloodtype">AB+</td>
      <td data-label="Donate blood to">AB+</td>
      <td data-label="Receive blood from">Everyone</td>
    </tr>
     <tr>
     <td data-label="bloodtype">A-</td>
      <td data-label="Donate blood to">A+,A-,AB+,AB-</td>
      <td data-label="Receive blood from">A-,O-</td>
    </tr>
     <tr>
     <td data-label="bloodtype">O-</td>
      <td data-label="Donate blood to">Everyone</td>
      <td data-label="Receive blood from">O-</td>
    </tr>
     <tr>
     <td data-label="bloodtype">B-</td>
      <td data-label="Donate blood to">B+,B-,AB+,AB-</td>
      <td data-label="Receive blood from">B-,O-</td>
    </tr>
     <tr>
     <td data-label="bloodtype">AB-</td>
      <td data-label="Donate blood to">AB+,AB-</td>
      <td data-label="Receive blood from">AB-,A-,B-,O-</td>
    </tr>
    
  </tbody>
</table>
  </body>
</html>
