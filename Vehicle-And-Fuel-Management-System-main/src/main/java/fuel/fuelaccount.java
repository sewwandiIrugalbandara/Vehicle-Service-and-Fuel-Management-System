package fuel;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/fuelaccount")
public class fuelaccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String fuelid = request.getParameter("fuelid");
		
			List<fuel> fuelDetails = fueldbutil.getfuel(fuelid);
			request.setAttribute("fuelDetails", fuelDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("fuelaccount.jsp");
			dis.forward(request, response);
		
		
	}

}
