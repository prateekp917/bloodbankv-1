package com.virtusa.bloodbank.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.bloodbank.UsersListDAO;
import com.virtusa.bloodbank.model.BloodStock;
import com.virtusa.bloodbank.model.UsersList;
import com.virtusa.bloodbank.services.HospitalBloodbankService;

/**
 * Servlet implementation class BloodBankServlet
 */
@WebServlet("/BloodBankServlet")
public class BloodBankServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HospitalBloodbankService hbservice=new HospitalBloodbankService();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BloodBankServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession();
		String username=(String) request.getSession().getAttribute("username");
		System.out.println(username);
		long bankid=hbservice.findID(username);
		System.out.println(bankid);
		String bankname=hbservice.findBankname(bankid);
		System.out.println(bankname);
		List<BloodStock> list = hbservice.findstockbbank(bankname);
		request.setAttribute("stocklist",list);
		System.out.println(list);
		request.getRequestDispatcher("/BloodbankData.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
