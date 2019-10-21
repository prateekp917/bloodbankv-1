package com.virtusa.bloodbank.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.bloodbank.model.BloodStock;
import com.virtusa.bloodbank.model.UsersList;
import com.virtusa.bloodbank.services.HospitalBloodbankService;

/**
 * Servlet implementation class SearchResultsServlet
 */
@WebServlet("/SearchResultsServlet")
public class SearchResultsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HospitalBloodbankService hbservice=new HospitalBloodbankService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchResultsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String check=(String)request.getAttribute("search");
		HttpSession session=request.getSession(false);
		
		String check=(String) session.getAttribute("search");
		System.out.println(check);
		session.setAttribute("checkcond", check);
		if(check.length()>5)
		{
			List<BloodStock> list = hbservice.findstockbbank(check);
			System.out.println(list);
			session.setAttribute("namelist",list );
			//System.out.println(list);
		}
		else if(check.length()<5)
		{
			System.out.println("else if");
			List<BloodStock> list = hbservice.findBldtype(check);
			System.out.println(list);
			session.setAttribute("searchlist",list);
			System.out.println(list);
		}	
		/*String bgtype=(String) request.getAttribute("btype");
		String bldbnkname=(String) request.getAttribute("bbankname");
		if(!bgtype.equals("Select"))
		{
			System.out.println(bgtype);
			List<BloodStock> list = hbservice.findBldtype(bgtype);
			request.setAttribute("searchlist",list );
			System.out.println(list);
		//}
		//else if(!bldbnkname.equals("select"))
		//{
			System.out.println(bldbnkname);
			List<BloodStock> list = hbservice.findstockbbank(bldbnkname);
			request.setAttribute("namelist",list );
			System.out.println(list);
			
		}*/
		request.getRequestDispatcher("/SearchResults.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
