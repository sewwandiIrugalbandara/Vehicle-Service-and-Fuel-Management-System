package vehicle;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class vehicleaccount
 */
@WebServlet("/vehicleaccount")
public class vehicleaccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String vnumber = request.getParameter("vnumber");
		
			List<vehicle> vehilceDetails = vehicledbutil.getvehicle(vnumber);
			request.setAttribute("vehicleDetails", vehilceDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("vehicleaccount.jsp");
			dis.forward(request, response);
		
		
	}

}
