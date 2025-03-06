package fuel;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/fdelete")
public class detelefuel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       
		String fid = request.getParameter("fid");
		boolean isTrue;
		
		isTrue = fueldbutil.deletefuel(fid);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("fuelinsert.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<fuel> fuelDetails = fueldbutil.getfuelDetails(fid);
			request.setAttribute("fuelDetails", fuelDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("reportaccount.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}

	}