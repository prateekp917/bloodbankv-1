package com.virtusa.bloodbank.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginVerifierFilter
 */
@WebFilter("/LoginVerifier")
public class LoginVerifierFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginVerifierFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest hreq=(HttpServletRequest) request;
		HttpSession session=hreq.getSession();
		System.out.println("Filter Checking Login");
		if(hreq.getSession()!=null && hreq.getSession().getAttribute("userid")!=null)
		{
			System.out.println("please sign in");
			request.getRequestDispatcher("/Index.jsp").forward(request, response);
		}
		else
		{
			System.out.println("current user:"+session.getAttribute("userid"));
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
