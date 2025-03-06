<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="styles/useraccount.css"/>
	<meta charset="ISO-8859-1">
	<title>Fuel account</title>
	
	<style type="text/css">
		body{
			font-family: Hind SemiBold;
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
    <br>
	<br>
	<br><br>
	<br>
	<br>

	<div class="container1">
	<table>
	<c:forEach var="fuel" items="${fuelDetails}">
	
	<c:set var="fid" value="${fuel.fid}"/>
	<c:set var="fuelid" value="${fuel.fuelid}"/>
	<c:set var="fquantity" value="${fuel.fquantity}"/>
	<c:set var="fprice" value="${fuel.fprice}"/>
	<c:set var="date1" value="${fuel.date1}"/>
	<c:set var="requantity" value="${fuel.requantity}"/>

	<tr>
		<td>ID</td>
		<td>${fuel.fid}</td>
	</tr>
	<tr>
		<td>Fuel ID</td>
		<td>${fuel.fuelid}</td>
	</tr>
	<tr>
		<td>Fuel Stock Quantity</td>
		<td>${fuel.fquantity}</td>
	</tr>
	<tr>
		<td>Fuel Stock Price</td>
		<td>${fuel.fprice}</td>
	</tr>
	<tr>
		<td>Transport Date</td>
		<td>${fuel.date1}</td>
	</tr>
	<tr>
		<td>Remaining Quantity</td>
		<td>${fuel.requantity}</td>
	</tr>
	</c:forEach>
	</table>
	
	<c:url value="updatefuel.jsp" var="fupdate">
		<c:param name="fid" value="${fid}"/>
		<c:param name="fuelid" value="${fuelid}"/>
		<c:param name="fquantity" value="${fquantity}"/>
		<c:param name="fprice" value="${fprice}"/>
		<c:param name="date1" value="${date1}"/>
		<c:param name="requantity" value="${requantity}"/>
	
	</c:url>
	
	</div>
	
	<div class="button-container">
	<a href="${fupdate}">
	<input type="button" name="update" value="Update My Data">
	</a>
	
	<br>
	<br>
	<br>
	<c:url value="deletefuel.jsp" var="fdelete">
		<c:param name="fid" value="${fid}"/>
		<c:param name="fuelid" value="${fuelid}"/>
		<c:param name="fquantity" value="${fquantity}"/>
		<c:param name="fprice" value="${fprice}"/>
		<c:param name="date1" value="${date1}"/>
		<c:param name="requantity" value="${requantity}"/>
	</c:url>
	<a href="${fdelete}">
	<input type="button" name="delete" value="Delete My Account">
	</a>
	</div>
	
	
</body>
</html>