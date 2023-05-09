import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class P19 extends GenericServlet
{
	String sCount;
	int count;
	public void init()
	{
		ServletConfig config = getServletConfig();
		sCount = config.getInitParameter("counter");
		count = Integer.parseInt(sCount);
	}
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		count++;
		out.println("No of Visitor = " + count);
		
		Date today = new Date();
		out.println(today);
		
	}
}