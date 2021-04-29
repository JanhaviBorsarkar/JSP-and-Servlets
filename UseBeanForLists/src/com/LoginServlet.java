package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= "/login")
public class LoginServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		Student stu = new Student();
		stu.setAddr("Pune");
		stu.setName("abc");
		stu.setRollno(1);
		
		Student s = new Student();
		s.setRollno(2);
		s.setName("xyz");
		s.setAddr("mumbai");
		
		List<Student> list = new ArrayList();
		list.add(s);
		list.add(stu);
		
		req.setAttribute("d", list);
		RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
		rd.forward(req, res);
	}
}
