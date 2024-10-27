package servlet_task1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		long phone = Long.parseLong(req.getParameter("phone"));
		
		PrintWriter printWriter = res.getWriter();
		printWriter.print("<h1>"+name+"</h1>"+"<h1>"+email+"</h1>"+"<h1>"+phone+"</h1>");
	}
}
