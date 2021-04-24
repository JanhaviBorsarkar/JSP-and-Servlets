package com.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Login");
		
		String uname = request.getParameter("t1");
		String pass = request.getParameter("t2");
		
		List<Student> students = new ArrayList<Student>();
		
		Student student = new Student();
		student.setRollno(1);
		student.setName("ABC");
		student.setCls("CJC");
		student.setBatch(130);
		student.setAddr("Pune");
		
		students.add(student);
		
		if(uname.equals("admin") && pass.equals("root")) 
		{
			System.out.println("-----------------------------------------------------------------------------");
			System.out.printf("%10s %10s %10s %10s %10s", "Rollno", "Name", "Class", "Batch", "City");
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------");
			for(Student stu: students)
			{
				System.out.format("%10s %10s %10s %10d %10s",
			       stu.getRollno(), stu.getName(), stu.getCls(), stu.getBatch(), stu.getAddr());
			    System.out.println();
			}
			System.out.println("-----------------------------------------------------------------------------");
		
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
			rd.forward(request, response);
		}
	}
}
