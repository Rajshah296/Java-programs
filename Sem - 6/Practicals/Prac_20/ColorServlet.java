import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ColorServlet extends HttpServlet{

        public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
            String selectedColor = req.getParameter("color");
            String htmlContent = "<html><head><title>ColorServlet</title></head><body style='background-color: " + selectedColor+";'>";
            htmlContent += "<div style='text-align: center; padding-top: 200px;'><h2>You selected " + selectedColor + "</h2></div>";
            htmlContent += "</body></html>";
            res.getWriter().println(htmlContent);
    }

}