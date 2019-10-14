package com.virtusa.bloodbank.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.bloodbank.UsersListDAO;
import com.virtusa.bloodbank.UsersListDAOImpl;
import com.virtusa.bloodbank.model.UsersList;
import com.virtusa.bloodbank.services.AdminsService;

/**
 * Servlet implementation class ListOfUsersServlet
 */
@WebServlet("/ListOfUsersServlet")
public class ListOfUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdminsService adminservice =new AdminsService();
	UsersListDAO dao= new UsersListDAOImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListOfUsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<UsersList> list = adminservice.findAll();
		//String username=(String) request.getSession().getAttribute("username");
		request.setAttribute("userslist",list );
		System.out.println(list);
		request.getRequestDispatcher("/ListOfUsers.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpSession session=request.getSession(false);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
