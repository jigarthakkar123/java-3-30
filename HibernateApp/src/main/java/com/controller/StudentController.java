package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Student;
import com.dao.StudentDao;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert"))
		{
			Student student=new Student();
			student.setFname(request.getParameter("fname"));
			student.setLname(request.getParameter("lname"));
			student.setEmail(request.getParameter("email"));
			student.setMobile(request.getParameter("mobile"));
			StudentDao.insertStudent(student);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("edit"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			Student student=StudentDao.getStudent(id);
			request.setAttribute("s", student);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update"))
		{
			Student student=new Student();
			student.setId(Integer.parseInt(request.getParameter("id")));
			student.setFname(request.getParameter("fname"));
			student.setLname(request.getParameter("lname"));
			student.setEmail(request.getParameter("email"));
			student.setMobile(request.getParameter("mobile"));
			StudentDao.insertStudent(student);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("delete"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			StudentDao.deleteStudent(id);
			response.sendRedirect("show.jsp");
		}
	}

}
