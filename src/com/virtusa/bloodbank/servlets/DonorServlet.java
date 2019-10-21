
package com.virtusa.bloodbank.servlets;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.bloodbank.model.DonorDetail;
import com.virtusa.bloodbank.model.UsersList;
import com.virtusa.bloodbank.services.DonorServices;

/**
 * Servlet implementation class UserDataServlet
 */
@WebServlet("/DonorServlet")
public class DonorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DonorServices dservices=new DonorServices();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String username=(String) session.getAttribute("username");
		request.setAttribute("username", username);
		long did=dservices.findID(username);
		//long did=u.getUser_id();
		session.setAttribute("id",did);
		DonorDetail donor=dservices.findById(did);
		String name=donor.getDonor_name();
		session.setAttribute("dname",name);
		Date dob=donor.getDate_of_birth();
		session.setAttribute("ddob",dob);
		String email=donor.getEmail();
		session.setAttribute("demail", email);
		String phone_number=donor.getPhone_number();
		session.setAttribute("dphoneno", phone_number);
		String address=donor.getAddress();
		session.setAttribute("daddr", address);
		String gender=donor.getGender();
		session.setAttribute("dgender", gender);
		String aadhar=donor.getAadhar_card_number();
		session.setAttribute("daadhar", aadhar);
		String bloodgroup=donor.getBlood_group();
		session.setAttribute("dbgroup", bloodgroup);
		Date prevdondate=donor.getPrev_donate_date();
		session.setAttribute("dprevddate",prevdondate);

		request.getRequestDispatcher("/DonorData.jsp").forward(request, response);
	}

}
