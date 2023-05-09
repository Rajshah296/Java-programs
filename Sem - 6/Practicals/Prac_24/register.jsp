<%-- 
    Document   : register.jsp
    Created on : May 8, 2023, 8:30:18 PM
    Author     : Hello
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <% 
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String mail = request.getParameter("mail");
            String pass = request.getParameter("pass");
            String cpass = request.getParameter("cpass");

            if (!pass.equals(cpass)) {
                out.println("Passwords do not match");
                return;
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root", "");
            
            String sql = "INSERT INTO user (fname, lname, email, password) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, fname);
            statement.setString(2, lname);
            statement.setString(3, mail);
            statement.setString(4, pass);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                out.println("<p class=\"h2 w-100 text-center mt-2 mb-4\">Registered Successfully!</p>");
            } else {
                out.println("Failed to insert data");
            }

            conn.close();
            out.println("<div class=\"h2 w-100 text-center\"><a  href=\"login.jsp\">LOGIN</a></div>");
        %>
        
    </body>
</html>

