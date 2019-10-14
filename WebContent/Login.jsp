<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <body>
    <style>
      body {
  background-color: #eee;
  font-family: 'Nunito', sans-serif;
  margin: 0;
  padding: 0;
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
  display: inline-block;
  background-color:#e91640;
  height: 50px;
  width: 40%;
  border-radius: 5px;
  text-align: center;
  vertical-align: middle;
  line-height: 50px;  
  color: black;
}

.login-button:hover {
  background-color: #ddd;
  color: black;
}

a {
  text-decoration: none;
}

    </style>
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
<input type="Submit" value="submit">
</form>
</center>

  
  </body>
  </html>