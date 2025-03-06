package report;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/reportinsert")
public class reportinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String reportid = request.getParameter("reportid");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		boolean isTrue;
		
		isTrue = reportdbutil.insertreport(reportid, title,content);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("vsuccess.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("vunsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
