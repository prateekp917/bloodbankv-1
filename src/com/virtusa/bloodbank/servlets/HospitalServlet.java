package com.virtusa.bloodbank.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HospitalBloodBank
 */
@WebServlet("/HospitalServlet")
public class HospitalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HospitalServlet() {
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
		HttpSession session=request.getSession(false);
		String username=(String) session.getAttribute("username");
		//request.setAttribute("username", username);
		String bloodgroup=request.getParameter("selectbg");
		System.out.println(bloodgroup+" ng");
		
		String bbankname=request.getParameter("selectname");
		System.out.println(bbankname+" bname");
		if(bloodgroup.equals("Select"))
		{
			//bloodgroup=null;
			System.out.println("hello");
			session.setAttribute("search",bbankname);
		}
		else if(bbankname.equals("Select"))
		{
			//bbankname=null;
			System.out.println("hello");
			session.setAttribute("search", bloodgroup);
		}
		request.getRequestDispatcher("/SearchResultsServlet").forward(request, response);
	}

}
