package com.rest.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;

public class HttpServletLifeCycleExample extends HttpServlet {
	public void init(ServletConfig config) {

		System.out.println("inside the the httHttpServletExamplepse");
	}

	
	@GET
	public void callServiceMethods(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.write("service method inside the HttpServletExample ");
		out.close();
		
		  if (!(req instanceof HttpServletRequest &&
	                res instanceof HttpServletResponse)) {
	            throw new ServletException("non-HTTP request or response");
	        }

	   
	}

	public void destroy() {
		System.out.println("called destory method");
	}

}
