package vehicle;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/deletevehicle")
public class deletevehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String vid = request.getParameter("vid");
		boolean isTrue;
		
		isTrue = vehicledbutil.deletevehicle(vid);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("vehicleinsert.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<vehicle> vehicleDetails = vehicledbutil.getvehicleDetails(vid);
			request.setAttribute("vehicleDetails", vehicleDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("vehicleaccount.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}

}