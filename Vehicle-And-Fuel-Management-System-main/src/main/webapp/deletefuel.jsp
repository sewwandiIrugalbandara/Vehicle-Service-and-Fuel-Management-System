<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	 <link rel="stylesheet" type="text/css" href="styles/deleteu.css"/>
	<meta charset="UTF-8">
	<title>delete fuel details</title>
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
	String fid = request.getParameter("fid");
	String fuelid = request.getParameter("fuelid");
	String fquantity = request.getParameter("fquantity");
	String fprice = request.getParameter("fprice");
	String date1 = request.getParameter("date1");
	String requantity = request.getParameter("requantity");
	%>

	<h1>Fuel Account Delete</h1>

	<div class="container1">
	<form action="fdelete" method="post">
	<table>
		<tr>
			<td>ID</td>
			<td><input type="text" name="fid" value="<%= fid %>" readonly></td>
		</tr>
		<tr>
			<td>Fuel Id</td>
			<td><input type="text" name="fuelid" value="<%= fuelid %>"></td>
		</tr>
		<tr>
		<td>Fuel Stock Quantity</td>
		<td><input type="text" name="fquantity" value="<%= fquantity %>"></td>
	</tr>
	<tr>
		<td>Fuel Stock Price</td>
		<td><input type="text" name="fprice" value="<%= fprice %>"></td>
		</tr>
		<tr>
		<td>Transport Date</td>
		<td><input type="text" name="date1" value="<%= date1 %>"></td>
		</tr>
		<tr>
		<td>Remaining Fuel Quantity</td>
		<td><input type="text" name="requantity" value="<%= requantity %>"></td>
		</tr>
	
			
	</table>
	<br>
	<input type="submit" name="submit" value="Delete My Account">
	</form>
	</div>

</body>
</html>