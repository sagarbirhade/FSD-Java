package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.Dao.EmployeeDao;
import com.entity.Employee;

/**
 * Servlet implementation class EmployeeRegister
 */

//@WebServlet("/EmployeeRegister")
public class EmployeeRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRegister() {
        super();
        // TODO Auto-generated constructor stub
    }
   private EmployeeDao emp;
   @Override
public void init() throws ServletException {
	// TODO Auto-generated method stub
	//super.init();
	    emp =new EmployeeDao();
}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: Get Method ").append(request.getContextPath());
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		String empid = request.getParameter("empid");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		
		Employee e = new Employee();
		e.setEmpid(Integer.parseInt(empid));
		e.setFirstName(firstname);
		e.setLastName(lastname);
		e.setUserName(username);
		e.setPassword(password);
		e.setAddress(address);
		e.setContact(contact);
		
		
		try {
			int result = emp.register(e);
			if(result> 0) {
				response.sendRedirect("welcome.jsp");
				System.out.println("Passed");
			}
			else {
				response.sendRedirect("register_employee.jsp");
				System.out.println("Failed");
			}
			
		}catch (ClassNotFoundException | SQLException j) {
			// TODO: handle exception
		}

	}

}
