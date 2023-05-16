package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.problem.AbortCompilation;

import com.bean.Emp;
import com.dao.EmpDao;

@WebServlet("/EmpController")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("insert"))
		{
			Emp e=new Emp();
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setEmail(request.getParameter("email"));
			e.setMobile(request.getParameter("mobile"));
			e.setAddress(request.getParameter("address"));
			e.setGender(request.getParameter("gender"));
			EmpDao.insertEmp(e);
			//request.setAttribute("msg", "Data Inserted Successfully");
			//response.sendRedirect("insert.jsp");
			request.getRequestDispatcher("show.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("edit")) 
		{
			int id=Integer.parseInt(request.getParameter("id"));
			Emp emp=EmpDao.getEmp(id);
			request.setAttribute("e", emp);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update"))
		{
			Emp e=new Emp();
			e.setId(Integer.parseInt(request.getParameter("id")));
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setEmail(request.getParameter("email"));
			e.setMobile(request.getParameter("mobile"));
			e.setAddress(request.getParameter("address"));
			e.setGender(request.getParameter("gender"));
			EmpDao.updateEmp(e);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("delete"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			EmpDao.deleteEmp(id);
			response.sendRedirect("show.jsp");
		}
	}

}
