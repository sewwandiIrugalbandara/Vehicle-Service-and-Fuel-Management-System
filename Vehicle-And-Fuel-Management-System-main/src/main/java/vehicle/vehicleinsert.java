package vehicle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/vehicleinsert")
public class vehicleinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String vtype = request.getParameter("vtype");
		String voname = request.getParameter("voname");
		String vophone = request.getParameter("vophone");
		String servicetype = request.getParameter("servicetype");
		String vnumber = request.getParameter("vnumber");
		
		boolean isTrue;
		
		isTrue = vehicledbutil.insertvehicle(vtype,voname, vophone, servicetype, vnumber);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("vsuccess.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("vunsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}