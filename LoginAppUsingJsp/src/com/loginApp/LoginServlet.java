package com.loginApp;

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
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Hello");
		
		String uname = request.getParameter("t1");
		String pass = request.getParameter("t2");
		
		System.out.println("Username: " +uname);
		System.out.println("Password: " +pass);
		
		request.setAttribute("msg", "CJC");
		request.setAttribute("faculty", "Kunal sir");
		
		Student stu = new Student();
		stu.setRollno(1);
		stu.setName("ABC");
		request.setAttribute("data", stu);
		
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}
}
