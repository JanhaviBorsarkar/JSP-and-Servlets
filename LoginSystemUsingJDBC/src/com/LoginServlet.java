package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginServlet  extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	//Connection con = null;
	//Statement smt = null;

	Student s = new Student();
	s.setName(request.getParameter("name"));
	s.setAddr(request.getParameter("addr"));
	
	
	List<Student> list = new ArrayList<Student>();
	
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginSystemUsingJDBC", "root", "root");
		String insertData = "insert into student(name, addr) values ('"+s.getName()+"', '"+s.getAddr()+"')";
		Statement smt = con.createStatement();
		smt.execute(insertData);
		System.out.println("Data Inserted Successfully!");
		String select = "select * from student";
		
		ResultSet rs = smt.executeQuery(select);
		
		while(rs.next())
		{
			Student stu = new Student();
			stu.setRno(rs.getInt(1));
			stu.setName(rs.getString(2));
			stu.setAddr(rs.getString(3));
			list.add(stu);
		}
		request.setAttribute("d", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
