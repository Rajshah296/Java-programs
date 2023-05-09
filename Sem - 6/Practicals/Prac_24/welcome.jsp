<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    </head>
    <body>
        <% 
    int flag = 0;
    String name = request.getParameter("fname");
    String pass = request.getParameter("pass");
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root", "");
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("Select * from user where fname='"+ name + "' and password= '" + pass+"'");
    if(rs.next())
    {
        flag = 1;
    }
    else
        out.println("Your username or password is wrong");
    if(flag == 1)
    {
        //display user profile
        String fname = rs.getString("fname");
        String lname = rs.getString("lname");
        String email = rs.getString("email");
        String password = rs.getString("password");
        
        out.println("<div class=\"container border border-5 border-black\" style=\"width: 30%; padding: 1rem; margin-top: 2rem;\">");
        out.println("<p class=\"h2 text-center mt-2 mb-4\">Welcome "+ fname +"!</p>");
        out.println("<p class=\"h3 text-center mt-2 mb-4\">User Profile</p>");
        out.println("<p><strong>Name:</strong> "+fname+" "+lname+"</p>");
        out.println("<p><strong>Email:</strong> "+email+"</p>");
        out.println("<p><strong>Password:</strong> "+password+"</p>");
        out.println("</div>");
    }
%>


    </body>
</html>
