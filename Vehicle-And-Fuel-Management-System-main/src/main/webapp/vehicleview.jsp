<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    
     <link rel="stylesheet" type="text/css" href="styles/login.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Vehicle Details - Vehicle Service Management</title>
</head>
<body>
	 <div class="container">
      
		<div class="navbar"> 
		<img src="logo.png" class="logo1">
		<nav> 
			<ul> 
				<li><a href="home2.jsp">Home</a></li>
            <li><a href="contactus.jsp">Contact Us</a></li>
            <li><a href="aboutus.jsp">About Us</a></li>
          
				
			</ul>
		</nav>
    </div>
    </div>
    <div class="container1">
        <form action="vehicleaccount" method="post">
            <h2>Vehicle Details View</h2>
            <div class="input-container">
                <label for="vnumber">Vehicle Number:</label>
                <input type="text" id="vnumber" name="vnumber" required>
             </div>
            <button type="submit">View</button>
        </form>
    </div>
</body>
</html>
    