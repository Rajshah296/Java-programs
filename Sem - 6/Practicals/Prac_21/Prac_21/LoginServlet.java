package Prac_21;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("authenticated") == null) {
            out.println("<html><head><title>Login Form</title></head><body>");
            out.println("<p>Please login:</p>");
            out.println("<form action=\"login\" method=\"post\">");
            out.println("<label for=\"username\">Username:</label>");
            out.println("<input type=\"text\" id=\"username\" name=\"username\">");
            out.println("<br/><br/>");
            out.println("<label for=\"password\">Password:</label>");
            out.println("<input type=\"password\" id=\"password\" name=\"password\">");
            out.println("<br/><br/>");
            out.println("<input type=\"submit\" value=\"Submit\">");
            out.println("</form>");
            out.println("</body></html>");
        } else {
            out.println("<html><head><title>Login Form</title></head><body>");
            out.println("<p>Welcome, " + session.getAttribute("username") + "</p>");
            out.println("<p><a href=\"logout\">Logout</a></p>");
            out.println("</body></html>");
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("Raj".equals(username) && "Password".equals(password)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("authenticated", true);
            session.setAttribute("username", username);

            Cookie cookie = new Cookie("username", username);
            cookie.setMaxAge(3600); // set the cookie age to 1 hour
            response.addCookie(cookie);

            response.sendRedirect("login");
        } else {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid username or password.");
        }
    }
}
