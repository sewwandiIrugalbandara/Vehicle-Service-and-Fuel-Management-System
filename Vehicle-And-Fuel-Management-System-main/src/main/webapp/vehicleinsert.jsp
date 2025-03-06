<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    
     <link rel="stylesheet" type="text/css" href="styles/signup.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <meta charset="UTF-8">
    <title>vehicle Insert - Vehicle Service Management</title>
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
   
   <form id="myForm" action="vehicleinsert" method="post">
  Vehicle Type <input type="text" id="vtype" name="vtype" required><br>
  Vehicle Owner Name <input type="text" id="voname" name="voname" required><br>
  Vehicle Owner Phone Number <input type="text" id="vophone" name="vophone" required><br>
  Service Type <input type="text" id="servicetype" name="servicetype" required><br>
  Vehicle Number <input type="text" id="vnumber" name="vnumber" required><br>
  <input type="submit" name="submit" value="Create vehicle">
	</form>
	
	<script>
  
  function validateForm() {
    const vtype = document.getElementById("vtype").value;
    const voname = document.getElementById("voname").value;
    const vophone = document.getElementById("vophone").value;
    const servicetype = document.getElementById("servicetype").value;
    const vnumber = document.getElementById("vnumber").value;

    if (vtype.trim() === "" || voname.trim() === "" || servicetype.trim() === "" || vnumber.trim() === "") {
      alert("All fields are required");
      return false; 
    }

  
    if (vophone.trim() === "" || !/^\d{10}$/.test(vophone.trim())) {
      alert("Please enter a valid 10-digit phone number");
      return false; 
    }

    return true; 
  }

 
  document.getElementById("myForm").onsubmit = validateForm;
</script>

    
</body>
</html>
    