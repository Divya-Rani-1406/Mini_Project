package Project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class WelcomeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	PrintWriter pw=response.getWriter();
	response.setContentType("text/html");
	
	String name=request.getParameter("name");
	String password=request.getParameter("pword");
	String s="";
	
	if(name==s  || password==s)
	{
		pw.println("<html><body bgcolor=\"yellow\"><script type=\"text/javascript\">");
	    pw.println("alert('Invalid Name or Password');");
	    pw.println("</script></body></html>");
	    pw.println("<html><body><center><form action=\"index.html\">");
	    pw.println("<button onclick=\"index.html\">Back");
	    pw.println("</button></center></form></body></html>");
	    
	}
	
	else {
		RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
		rd.include(request, response);
	}
	}

}
