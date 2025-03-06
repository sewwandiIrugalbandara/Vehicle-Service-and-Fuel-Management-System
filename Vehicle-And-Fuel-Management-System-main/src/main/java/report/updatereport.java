package report;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updatereport")
public class updatereport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String rid = request.getParameter("rid");
		String reportid = request.getParameter("reportid");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		boolean isTrue;
		
		isTrue = reportdbutil.updatereport(rid, reportid, title,content);
		
		if(isTrue == true) {
			
			List<report> reportDetails = reportdbutil.getreportDetails(rid);
			request.setAttribute("reportDetails", reportDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("reportaccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<report> reportDetails = reportdbutil.getreportDetails(rid);
			request.setAttribute("reportDetails", reportDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("reportaccount.jsp");
			dis.forward(request, response);
		}
	}

}