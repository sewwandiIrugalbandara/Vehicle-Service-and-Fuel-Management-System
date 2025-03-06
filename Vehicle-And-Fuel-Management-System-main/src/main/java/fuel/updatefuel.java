package fuel;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet("/fupdate")
public class updatefuel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fid = request.getParameter("fid");
		String fuelid = request.getParameter("fuelid");
		String fquantity = request.getParameter("fquantity");
		String fprice = request.getParameter("fprice");
		String date1 = request.getParameter("date1");
		String requantity = request.getParameter("requantity");
		
		boolean isTrue;
		
		isTrue = fueldbutil.updatefuel(fid,fuelid,fquantity,fprice,date1,requantity);
		
		if(isTrue == true) {
			
			List<fuel> fuelDetails = fueldbutil.getfuelDetails(fid);
			request.setAttribute("fuelDetails",fuelDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("fuelaccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<fuel> fuelDetails = fueldbutil.getfuelDetails(fid);
			request.setAttribute("fuelDetails",fuelDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("fuelaccount.jsp");
			dis.forward(request, response);
		}
	}

}