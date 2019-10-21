package com.virtusa.bloodbank.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.bloodbank.DonorDetailDAO;
import com.virtusa.bloodbank.DonorDetailInterface;
import com.virtusa.bloodbank.services.DonorServices;

/**
 * Servlet implementation class UpdateDonorInfo
 */
@WebServlet("/UpdateDonorInfo")
public class UpdateDonorInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DonorServices dservice=new DonorServices();
	DonorDetailInterface ddao=new DonorDetailDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDonorInfo() {
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
		HttpSession session = request.getSession();
		long donorid=(Long)session.getAttribute("donid");
		//session.setAttribute("did",donorid);
		String email=(String) request.getParameter("Email_Id");
		String mobileno=(String) request.getParameter("Mobile_Number");
		String addr=(String) request.getParameter("Address");
		Date prevdondate=Date.valueOf(request.getParameter("Prev_Donate_date"));
		int check=dservice.update(email, mobileno, addr, prevdondate,donorid);
		PrintWriter out = response.getWriter();
		if(check==1)
		{
				out.println("<script type=\"text/javascript\">");
		       out.println("alert('Updated Successfully');");
		       out.println("location='UpdateDonorInfo.jsp';");
		       out.println("</script>");
		       //response.sendRedirect("DonorServlet.java");
		request.getRequestDispatcher("/DonorServlet").forward(request, response);
		}
		else
		{
			out.println("<script type=\"text/javascript\">");
		       out.println("alert('Updation failed');");
		       out.println("location='UpdateDonorInfo.jsp';");
		       out.println("</script>");
		}
		
	}

}
