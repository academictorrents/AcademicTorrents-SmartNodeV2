package smartnode.web;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doGet(req, resp);
		
		
		String something = "";
		something = req.getParameter("anything");
		
		
		PrintWriter out = resp.getWriter();
		
		out.println("Hello World " + something);
		
		if ("admin".equals(something)){
			out.println("Hello Admin!");
			
			
			out.println(req.getParameterNames().nextElement());
			
			
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doPost(req, resp);
		
		
		
		String something = "";
		something = req.getParameter("sometext");
		
		
		
		
		PrintWriter out = resp.getWriter();
		
		out.println("Hello World, Thank you for posting " + something);
		
		
		//if (something.equals("admin")){
		//	out.println("Hello Admin!");
		//}
		
		if ("admin".equals(something)){
			out.println("Hello Admin!");
		}
	}
	
}
