<%-- 
    Document   : welcome
    Created on : May 7, 2023, 10:28:59 AM
    Author     : Hello
--%>
<%@page import = "java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = request.getParameter("userName");
            String pass = request.getParameter("userPass");
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("Select * from login where username='"+name+"' and password='"+pass+"'");
                if(rs.next())
                {
                    out.println("Logged In Successfully<br>");
                    out.println("Welcome "+name);
                }
                else
                   out.println("Wrong User Name or Password");
            }
            catch(Exception e)
            {
                out.print(e);
            }
        %>
    </body>
</html>
