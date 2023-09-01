import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Prac_20 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String htmlContent = "<html><head><title>Color Selector</title></head><body><form action=\"ColorServlet\" method=\"GET\"><p>Select a color:</p><select name=\"color\"><option value=\"red\">Red</option><option value=\"green\">Green</option><option value=\"blue\">Blue</option><option value=\"Pink\">Pink</option><option value=\"Orange\">Orange</option></select><br/><br/><input type=\"submit\" value=\"Submit\"></form></body></html>";

        response.getWriter().println(htmlContent);
    }
}
