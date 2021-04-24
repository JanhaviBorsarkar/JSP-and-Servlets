import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/log")
public class LoginServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Hello");
		
		String uname = request.getParameter("t1");
		String pass = request.getParameter("t2");
		
		System.out.println("Username: " +uname);
		System.out.println("Password: " +pass);
		
		RequestDispatcher rd = request.getRequestDispatcher("Success.html");
		rd.forward(request, response);
	}
}
