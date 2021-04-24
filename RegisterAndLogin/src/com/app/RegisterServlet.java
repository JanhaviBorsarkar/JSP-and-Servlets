package com.app;

import java.io.IOException;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		System.out.println("Register");
		
		String fname = req.getParameter("t3");
		String lname = req.getParameter("t4");
		String email = req.getParameter("t5");
		String uname = req.getParameter("t1");
		String pass = req.getParameter("t2");
		String cpass = req.getParameter("t6");
		
		System.out.println("First Name: " +fname);
		System.out.println("Last Name: " +lname);
		System.out.println("Email: " +email);
		System.out.println("Username: " +uname);
		System.out.println("Password: " +pass);
		
		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		rd.forward(req, res);
		
		
	}
}
