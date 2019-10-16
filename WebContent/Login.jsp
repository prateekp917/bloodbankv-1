<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <body bgcolor="#F3D3CD">
    <style>
      body {

  font-family: 'Nunito', sans-serif;
  margin: 0;
  padding: 0;
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
  .contact{
      position: absolute;
  bottom: 0;
  width: 100%;
  height: 2.5rem;  
  }
  
.form-container {
  display: block;
  margin: 10vh auto; /* 10% = Middle of Page */
  width: 500px;
  border: 2px solid #eee;
  border-radius: 20px;
  background-color: rgba(82, 109, 100,0.2);
}

#form-title {
  display: block;
  height: 100px;
  text-align: center;
  padding-top: 50px;
  font-size: 2.5em;
}

label {
  display: inline-block;
  width: 25%;
  padding-left: 50px;
}

.text-input {
  height: 35px;
  width: 250px;
  border-radius: 5px;
  border: 0;
  font-size: 1em;
  padding-left: 10px;
  
}

.login {
  margin-top: 50px;
  margin-left: 190px;
  margin-bottom: 50px;
}

.login-button {
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
  color: black;
  margin-bottom: 80px;
  font-weight: bold;
 }

.login-button:hover {
  background-color: #ddd;
  color: black;
}

a {
  text-decoration: none;
}
.two p {
  font-family: 'Lato';
  font-size: 18px;
  font-weight: 300;
  line-height: 32px;
}
.two {
  margin: 0px auto;
  width: 500px;
}

.two a {
  font-family: 'Lato';
  text-decoration: none;
  font-size: 18px;
  color: #000;
  font-weight: 300;
  margin: 0 2px;
  position: relative;
}

.two a:before {
  position: absolute;
  margin: 0 auto;
  top: 100%;
  left: 0;
  width: 100%;
  height: 2px;
  background-color: #000;
  content: '';
  opacity: .3;
  -webkit-transform: scaleX(.9);
  transition-property: opacity, -webkit-transform;
  transition-duration: .3s;
}

.two a:hover:before {
  opacity: 1;
  -webkit-transform: scaleX(1);
}

    </style>
 <div class="topnav">
  <a href="Homepage.jsp">Home</a>
  <a href="About.jsp">About</a>
  <a href="Login.jsp">Login</a>
</div>
    
<p> ${errorMessage } </p>
<form action="Login" method="post">
<div class="form-container">
  
  <div id="form-title"> Login</div>

  <label>Username</label>
    <input type="text" class="text-input" name="username">
  <p>
    <label>Password</label> 
     <input type="password" class="text-input" name="password">
  </p>
  <center>
  <select name="usertype">
  <option value="Admin">Admin</option>
  <option value="Donor">Donor</option>
  <option value="Bloodbank">Blood Bank</option>
  <option value="Hospital">Hospital</option>
</select><br>
<input type="Submit" class="login-button" value="LOGIN">
<div class="two">
<a href="Registration.jsp"><font color="black">New User? Click here to register</font></a>
</div>
</form>
</center>

  
  </body>
  </html>