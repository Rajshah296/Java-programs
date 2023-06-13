package prac_20;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Prac_20 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Color Selector</title></head><body>");

        out.println("<form action=\"ColorServlet\" method=\"post\">");
        out.println("<p>Select a color:</p>");
        out.println("<select name=\"color\">");
        out.println("<option value=\"red\">Red</option>");
        out.println("<option value=\"green\">Green</option>");
        out.println("<option value=\"blue\">Blue</option>");
        out.println("</select>");
        out.println("<br/><br/>");
        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form>");

        out.println("</body></html>");
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String color = request.getParameter("color");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Selected Color</title></head><body style=\"background-color: " + color + "\">");

        out.println("<p>You selected: " + color + "</p>");

        out.println("</body></html>");
    }
}
