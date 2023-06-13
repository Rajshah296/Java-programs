package prac_19;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Prac_19 extends HttpServlet {
    private int counter;

    public void init() throws ServletException {
        // Get the initial value of the counter from the deployment descriptor
        String initial = getInitParameter("initial");
        try {
            counter = Integer.parseInt(initial);
        } catch (NumberFormatException e) {
            counter = 0;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Increment the counter
        counter++;

        // Set the response content type
        response.setContentType("text/html");

        // Write the response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Counter Servlet</h1>");
        out.println("<p>This servlet has been accessed " + counter + " times since its loading.</p>");
        out.println("<p>Today's date is: " + new Date() + "</p>");
        out.println("</body></html>");
    }
}