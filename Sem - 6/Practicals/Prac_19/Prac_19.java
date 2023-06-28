import java.io.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class Prac_19 extends HttpServlet {
    private int counter;
    @Override
    public void init() throws ServletException{
        counter = 0;
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        counter++;
        response.setContentType("text/html");
        response.getWriter().println("<html><body><h1>Page accessed "+ counter + "times.</h1><h2>Today's date : "+new Date()+"</h2></body></html>");
    }
}