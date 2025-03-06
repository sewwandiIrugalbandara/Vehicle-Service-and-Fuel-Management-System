package fuel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/fuelinsert")
public class fuelinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String fuelid = request.getParameter("fuelid");
		String fquantity = request.getParameter("fquantity");
		String fprice = request.getParameter("fprice");
		String date1 = request.getParameter("date1");
		String requantity = request.getParameter("requantity");
		
		boolean isTrue;
		
		isTrue = fueldbutil.insertfuel(fuelid,fquantity,fprice,date1,requantity);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("vsuccess.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("vunsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
