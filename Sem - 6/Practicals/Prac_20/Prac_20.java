import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Prac_20 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Color Selector</title></head><body>");

        out.println("<form action=\"ColorServlet\" method=\"GET\">");
        out.println("<p>Select a color:</p>");
        out.println("<select name=\"color\">");
        out.println("<option value=\"red\">Red</option>");
        out.println("<option value=\"green\">Green</option>");
        out.println("<option value=\"blue\">Blue</option>");
        out.println("<option value=\"Pink\">Pink</option>");
        out.println("<option value=\"Orange\">Orange</option>");
        out.println("</select>");
        out.println("<br/><br/>");
        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form>");

        out.println("</body></html>");
    }
}
