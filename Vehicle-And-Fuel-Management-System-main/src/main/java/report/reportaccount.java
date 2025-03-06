package report;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/reportaccount")
public class reportaccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String reportid = request.getParameter("reportid");
		
			List<report> reportDetails = reportdbutil.getreport(reportid);
			request.setAttribute("reportDetails", reportDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("reportaccount.jsp");
			dis.forward(request, response);
		
		
	}

}
