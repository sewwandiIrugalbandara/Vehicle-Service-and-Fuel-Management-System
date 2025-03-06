<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    
     <link rel="stylesheet" type="text/css" href="styles/signup.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <meta charset="UTF-8">
    <title>Login - Vehicle Service Management</title>
</head>
<body>
	 <div class="container">
      
		<div class="navbar"> 
		<img src="logo.png" class="logo1">
		<nav> 
			<ul> 
				<li><a href="home1.jsp">Home</a></li>
            <li><a href="contactus.jsp">Contact Us</a></li>
            <li><a href="aboutus.jsp">About Us</a></li>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="signup.jsp">Sign Up</a></li> 
				
			</ul>
		</nav>
    </div>
    </div>
   
   <form action="insert" method="post">
		Name <input type="text" id="name" name="name" required><br>
		Email <input type="text" id="email" name="email" required><br>
		Phone Number <input type="text" id="phone" name="phone" required><br>
		User Name <input type="text" id="uid" name="uid" required><br>
		Password <input type="password" id="psw" name="psw" required><br>
		
		<input type="submit" name="submit" value="Create user">
	</form>
	
	<script>
  
  function validateForm() {
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const phone = document.getElementById("phone").value;
    const uid = document.getElementById("uid").value;
    const psw = document.getElementById("psw").value;

    if (name.trim() === "" || email.trim() === "" || uid.trim() === "" || psw.trim() === "") {
      alert("All fields are required");
      return false; 
    }

  
    if (phone.trim() === "" || !/^\d{10}$/.test(phone.trim())) {
      alert("Please enter a valid 10-digit phone number");
      return false; 
    }

    return true; 
  }

 
  document.getElementById("myForm").onsubmit = validateForm;
</script>

    
</body>
</html>
    