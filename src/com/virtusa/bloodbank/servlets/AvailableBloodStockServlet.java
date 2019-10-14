package com.virtusa.bloodbank.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.bloodbank.model.BloodStock;
import com.virtusa.bloodbank.model.UsersList;
import com.virtusa.bloodbank.services.HospitalBloodbankService;

/**
 * Servlet implementation class AvailableBloodStockServlet
 */
@WebServlet("/AvailableBloodStockServlet")
public class AvailableBloodStockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HospitalBloodbankService hbservice=new HospitalBloodbankService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AvailableBloodStockServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<BloodStock> list = hbservice.findAll();
		//String username=(String) request.getSession().getAttribute("username");
		request.setAttribute("bloodlist",list );
		System.out.println(list);
		request.getRequestDispatcher("/AvailableBloodStock.jsp").forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
