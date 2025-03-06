<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="styles/updateu.css"/>
	<meta charset="UTF-8">
	<title>Update Vehicle</title>
	<style type="text/css">
		table {
  			border-collapse: collapse;
		}

		table, th, td {
		  border: 1px solid black;
		}
	</style>
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
	

	<%
		String vid = request.getParameter("vid");
		String vtype = request.getParameter("vtype");
		String voname = request.getParameter("voname");
		String vophone = request.getParameter("vophone");
		String servicetype = request.getParameter("servicetype");
		String vnumber = request.getParameter("vnumber");
	%>
	
	<div class="container1">
	<form action="updatevehicle" method="post">
	<table>
		<tr>
			<td>Vehicle ID</td>
			<td><input type="text" name="vid" value="<%= vid %>" readonly></td>
		</tr>
		<tr>
			<td>Vehicle Type</td>
			<td><input type="text" name="vtype" value="<%= vtype %>"></td>
		</tr>
		<tr>
		<td>Vehicle Owner Name</td>
		<td><input type="text" name="voname" value="<%= voname %>"></td>
	</tr>
	<tr>
		<td>Vehicle Owner Phone number</td>
		<td><input type="text" name="vophone" value="<%= vophone %>"></td>
	</tr>
	<tr>
		<td>Service type</td>
		<td><input type="text" name="servicetype" value="<%= servicetype %>"></td>
	</tr>
	<tr>
		<td>Vehicle Number</td>
		<td><input type="text" name="vnumber" value="<%= vnumber %>"></td>
	</tr>		
	</table>
	<br>
	<input type="submit" name="submit" value="Update My Data">
	</form>
	</div>

</body>
</html>