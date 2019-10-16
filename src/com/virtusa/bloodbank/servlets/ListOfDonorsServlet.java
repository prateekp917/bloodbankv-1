package com.virtusa.bloodbank.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.bloodbank.DonorDetailDAO;
import com.virtusa.bloodbank.DonorDetailInterface;
import com.virtusa.bloodbank.UsersListDAO;
import com.virtusa.bloodbank.UsersListDAOImpl;
import com.virtusa.bloodbank.model.DonorDetail;
import com.virtusa.bloodbank.model.UsersList;
import com.virtusa.bloodbank.services.AdminsService;
import com.virtusa.bloodbank.services.DonorServices;

/**
 * Servlet implementation class ListOfDonorsServlet
 */
@WebServlet("/ListOfDonorsServlet")
public class ListOfDonorsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DonorServices donorservice =new DonorServices();
	DonorDetailInterface ddao= new DonorDetailDAO(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListOfDonorsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		List<DonorDetail> list = donorservice.findAll();
		//String username=(String) request.getSession().getAttribute("username");
		request.setAttribute("donorlist",list );
		System.out.println(list);
		request.getRequestDispatcher("/ListOfDonors.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
