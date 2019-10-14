package com.virtusa.bloodbank.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.bloodbank.UsersListDAO;
import com.virtusa.bloodbank.UsersListDAOImpl;
import com.virtusa.bloodbank.model.UsersList;

/**
 * Servlet implementation class SignInServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsersListDAO dao=new UsersListDAOImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UsersListDAO dao=new UsersListDAOImpl();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("username");
		String upassword=request.getParameter("password");
		String usertype=request.getParameter("usertype");
		UsersList user=dao.findusername(uname);
		String checkpassword=user.getPassword();
		String checkusername=user.getUsername();
		String checktype=user.getUsertype();
		if(uname.equals(checkusername)&&upassword.equals(checkpassword)&&usertype.equals(checktype))
		{
			try {
				HttpSession session=request.getSession(true);
				session.setAttribute("username",uname);
				if(usertype.equals("Donor"))
					request.getRequestDispatcher("/DonorServlet").forward(request, response);
				else if(usertype.equals("Bloodbank")||usertype.equals("Hospital"))
				{
					request.getRequestDispatcher("/HospitalBloodBank").forward(request, response);
				}
				else if(usertype.equals("Admin"))
				{
					request.getRequestDispatcher("/AdminServlet").forward(request, response);
				}
			}catch(ServletException e)
			{
				e.printStackTrace();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			request.setAttribute("errorMessage", "Wrong user or password");
			try {
				request.getRequestDispatcher("/Login.jsp").forward(request, response);
			}catch(ServletException | IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
