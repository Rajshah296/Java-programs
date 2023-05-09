<%-- 
    Document   : grades
    Created on : May 6, 2023, 9:16:07 PM
    Author     : Hello
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <%!
            // function to calculate grade based on marks
            String getGrade(int mark) {
                if(mark >= 85)
                    return "AA";
                else if(mark >= 75)
                    return "AB";
                else if(mark >= 65)
                    return "BB";
                else if(mark >= 55)
                    return "BC";
                else if(mark >= 45)
                    return "CC";
                else if(mark >= 40)
                    return "CD";
                else if(mark >= 35)
                    return "DD";
                else
                    return "FF";
            }
        %>

        <%
           String name = request.getParameter("name");
           int mark1 = Integer.parseInt(request.getParameter("mark1"));
           int mark2 = Integer.parseInt(request.getParameter("mark2"));
           int mark3 = Integer.parseInt(request.getParameter("mark3"));
           int mark4 = Integer.parseInt(request.getParameter("mark4"));
           int mark5 = Integer.parseInt(request.getParameter("mark5"));
           int avg = (Math.round(mark1+mark2+mark3+mark4+mark5))/5;
           
           out.println("Name: " + name + "<br>");
           out.println("Grades<br>");
           out.println("AJAVA : " + getGrade(mark1) + "<br>");
           out.println("MCAD : " + getGrade(mark2) + "<br>");
           out.println("NMA : " + getGrade(mark3) + "<br>");
           out.println("PPUD : " + getGrade(mark4) + "<br>");
           out.println("PROJECT : " + getGrade(mark5) + "<br>");
           out.println("Total Grade : "+getGrade(avg) + "<br>");
        %>
    </body>
</html>
