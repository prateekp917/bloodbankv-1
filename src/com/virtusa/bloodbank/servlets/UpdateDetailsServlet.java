package com.virtusa.bloodbank.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.bloodbank.model.DonorDetail;
import com.virtusa.bloodbank.services.DonorServices;

/**
 * Servlet implementation class UpdateDetails
 */
@WebServlet("/UpdateDetails")
public class UpdateDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DonorServices dservice=new DonorServices();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDetailsServlet() {
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
		String donorname=request.getParameter("donorname");
		//String date=request.getParameter("dateofbirth");
		String dob=request.getParameter("dateofbirth");
		String pdate=request.getParameter("prevdondate");
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		//Date ddob;
		//Date pdondate;
		System.out.println(dob);
		System.out.println(pdate);
		String emailid=request.getParameter("emailid");
		String mobilenumber=request.getParameter("mobilenumber");
		String address=request.getParameter("address");
		String gender=request.getParameter("Gender");
		String bloodgroup=request.getParameter("bloodgroup");
		String aadhar=request.getParameter("aadhar");
		//try {
			//ddob = (Date)sdf.parse(dob);
			//pdondate = (Date)sdf1.parse(pdate);
			DonorDetail donor=new DonorDetail(donorname,Date.valueOf(dob),emailid,mobilenumber,address,gender,bloodgroup,aadhar,Date.valueOf(pdate));
			dservice.add(donor);
			 out.println("<script type=\"text/javascript\">");
		       out.println("alert('User Added Successfully');");
		       out.println("</script>");
		       response.sendRedirect("Login.jsp");
		//} catch (ParseException e) {
			//// TODO Auto-generated catch block
			//e.printStackTrace();
		//}		
	}

}
