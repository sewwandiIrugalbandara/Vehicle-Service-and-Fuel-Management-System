<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="styles/contactus.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <meta charset="UTF-8">
    <title>Vehicle service and fuel station management System</title>
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
    
    <header>
        <h1>Contact Us</h1>
        <p>Feel free to get in touch with us for any inquiries or feedback.</p>
    </header>

    <main>
        <section class="contact-form">
            <h2>Send us a message</h2>
            <form action="submit_contact.php" method="post">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required>

                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>

                <label for="message">Message:</label>
                <textarea id="message" name="message" rows="4" required></textarea>

                <button type="submit">Submit</button>
            </form>
        </section>

        <section class="contact-info">
            <h2>Contact Information</h2>
            <address>
                <p><strong>PowerGrid Innovations</strong></p>
                <p>123 Main Street</p>
                <p>colombo, 10</p>
                <p>Email: info@PowerGridInnovations.com</p>
                <p>Phone: +1 (123) 456-7890</p>
            </address>
        </section>
    </main>

    <footer>
        <p>&copy; 2023 PowerGrid Innovations. All rights reserved.</p>
    </footer>
    
    
    
    
</body>
</html>
