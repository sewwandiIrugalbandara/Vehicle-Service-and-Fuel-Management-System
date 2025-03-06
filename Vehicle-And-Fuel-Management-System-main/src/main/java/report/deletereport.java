package report;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/deletereport")
public class deletereport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
	String rid = request.getParameter("rid");
	boolean isTrue;
	
	isTrue = reportdbutil.deletereport(rid);
	
	if (isTrue == true) {
		RequestDispatcher dispatcher = request.getRequestDispatcher("reportinsert.jsp");
		dispatcher.forward(request, response);
	}
	else {
		
		List<report> reportDetails = reportdbutil.getreportDetails(rid);
		request.setAttribute("reportDetails", reportDetails);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("reportaccount.jsp");
		dispatcher.forward(request, response);
	}
	
	
	
}

}