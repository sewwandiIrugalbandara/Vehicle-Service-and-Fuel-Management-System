<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="styles/useraccount.css"/>
	<meta charset="ISO-8859-1">
	<title>vehicle account</title>
	
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
	<c:forEach var="vehicle" items="${vehicleDetails}">
	
	<c:set var="vid" value="${vehicle.vid}"/>
	<c:set var="vtype" value="${vehicle.vtype}"/>
	<c:set var="voname" value="${vehicle.voname}"/>
	<c:set var="vophone" value="${vehicle.vophone}"/>
	<c:set var="servicetype" value="${vehicle.servicetype}"/>
	<c:set var="vnumber" value="${vehicle.vnumber}"/>
	
	<tr>
		<td>Vehicle ID</td>
		<td>${vehicle.vid}</td>
	</tr>
	<tr>
		<td>Vehicle Type</td>
		<td>${vehicle.vtype}</td>
	</tr>
	<tr>
		<td>Vehicle Owner Name</td>
		<td>${vehicle.voname}</td>
	</tr>
	<tr>
		<td>Vehicle Owner Phone</td>
		<td>${vehicle.vophone}</td>
	</tr>
	<tr>
		<td> Service Type</td>
		<td>${vehicle.servicetype}</td>
	</tr>
	
	

	</c:forEach>
	</table>
	
	<c:url value="updatevehicle.jsp" var="vupdate">
		<c:param name="vid" value="${vid}"/>
		<c:param name="vtype" value="${vtype}"/>
		<c:param name="voname" value="${voname}"/>
		<c:param name="vophone" value="${vophone}"/>
		<c:param name="servicetype" value="${servicetype}"/>
		<c:param name="vnumber" value="${vnumber}"/>
	</c:url>
	
	</div>
	
	<div class="button-container">
	<a href="${vupdate}">
	<input type="button" name="update" value="Update My Data">
	</a>
	
	<br>
	<br>
	<br>
	<c:url value="deletevehicle.jsp" var="vdelete">
		<c:param name="vid" value="${vid}"/>
		<c:param name="vtype" value="${vtype}"/>
		<c:param name="voname" value="${voname}"/>
		<c:param name="servicetype" value="${servicetype}"/>
		<c:param name="vnumber" value="${vnumber}"/>
	</c:url>
	<a href="${vdelete}">
	<input type="button" name="delete" value="Delete My Account">
	</a>
	</div>
	
	
</body>
</html>