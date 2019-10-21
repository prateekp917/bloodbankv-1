package com.virtusa.bloodbank.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.bloodbank.UsersListDAO;
import com.virtusa.bloodbank.UsersListDAOImpl;
import com.virtusa.bloodbank.model.UsersList;
import com.virtusa.bloodbank.services.AdminsService;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsersListDAO dao=new UsersListDAOImpl();
	AdminsService adservice=new AdminsService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();

		String username=request.getParameter("username");
		String password1=request.getParameter("password1");
		String password2=request.getParameter("password2");
		String usertype=request.getParameter("usertype");
		if(password1.equals(password2))
		{
			UsersList user=new UsersList(username, password1, usertype);
			adservice.add(user);
			   out.println("<script type=\"text/javascript\">");
		       out.println("alert('User Added Successfully');");
		       out.println("</script>");
		       if(usertype.equals("Donor"))
		    	   response.sendRedirect("UpdateDetails.jsp");
		       else 
		    	   response.sendRedirect("Login.jsp");    
		}
		//request.getRequestDispatcher("/Registration.jsp").forward(request, response);
	}

}
