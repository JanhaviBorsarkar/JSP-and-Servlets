import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/third")
public class ThirdServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Third Servlet");

		String tdata = request.getParameter("t3");
		
		HttpSession session = request.getSession(false);
		
		if(session == null)
		{
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		else
		{
			session.setAttribute("td", tdata);
			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);
		}
		
	}
}
