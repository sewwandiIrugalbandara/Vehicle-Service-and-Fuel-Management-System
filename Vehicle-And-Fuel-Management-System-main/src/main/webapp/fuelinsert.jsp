<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    
     <link rel="stylesheet" type="text/css" href="styles/signup.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <meta charset="UTF-8">
    <title>Fuel Details insert</title>
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
   
   <form action="fuelinsert" method="post">
		Fuel Id <input type="text" id="fuelid" name="fuelid"required><br>
		Fuel Stock Quantity <input type="text" id="fquantity" name="fquantity"required><br>
		Fuel Stock Price <input type="text" id="fprice" name="fprice"required><br>
		Transport Date <input type="date" id="date1" name="date1"required><br>
		Remaining Fuel Quantity <input type="text" id="requantity" name="requantity"required><br>
		
		<input type="submit" name="submit" value="Create fuel">
	</form>
	
	<script>
  
  function validateForm() {
    const fuelid = document.getElementById("fuelid").value;
    const fquantity = document.getElementById("fquantity").value;
    const fprice = document.getElementById("fprice").value;
    const date1 = document.getElementById("date1").value;
    const requantity = document.getElementById("requantity").value;

    if (fuelid.trim() === "" || fquantity.trim() === "" || fprice.trim() === "" || fprice.trim() === "" || date1.trim() === "" || requantity.trim() === "" ) {
      alert("All fields are required");
      return false; 
    }

  
    return true; 
  }

 
  document.getElementById("myForm").onsubmit = validateForm;
</script>
    
</body>
</html>
    