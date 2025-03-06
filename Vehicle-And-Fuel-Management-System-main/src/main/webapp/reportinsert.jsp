<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    
     <link rel="stylesheet" type="text/css" href="styles/signup.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <meta charset="UTF-8">
    <title>new report</title>
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
   
   <form action="reportinsert" method="post">
		New Report Id <input type="text" id="reportid" name="reportid" required><br>
		Title <input type="text" id="title" name="title" required><br>
		Content <input type="text" id="content" name="content" required><br>
	
		
		<input type="submit" name="submit" value="Create Report">
	</form>
	
	<script>
  
  function validateForm() {
    const reportid = document.getElementById("reportid").value;
    const title = document.getElementById("title").value;
    const content = document.getElementById("content").value;
 

    if (reportid.trim() === "" || title.trim() === "" || content.trim() === "") {
      alert("All fields are required");
      return false; 
    }

  
    return true; 
  }

 
  document.getElementById("myForm").onsubmit = validateForm;
</script>
    
</body>
</html>
    