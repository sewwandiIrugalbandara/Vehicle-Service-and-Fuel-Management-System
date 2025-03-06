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
 * Servlet implementation class updatevehicle
 */
@WebServlet("/updatevehicle")
public class updatevehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String vid = request.getParameter("vid");
		String vtype = request.getParameter("vtype");
		String voname = request.getParameter("voname");
		String vophone = request.getParameter("vophone");
		String servicetype = request.getParameter("servicetype");
		String vnumber = request.getParameter("vnumber");
		
		boolean isTrue;
		
		isTrue = vehicledbutil.updatevehicle(vid, vtype, voname, vophone, servicetype, vnumber);
		
		if(isTrue == true) {
			
			List<vehicle> vehicleDetails = vehicledbutil.getvehicleDetails(vid);
			request.setAttribute("vehicleDetails", vehicleDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("vehicleaccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<vehicle> vehicleDetails = vehicledbutil.getvehicleDetails(vid);
			request.setAttribute("vehicleDetails", vehicleDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("vehicleaccount.jsp");
			dis.forward(request, response);
		}
	}

}