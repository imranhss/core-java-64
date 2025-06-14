<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <h1>
            <% 
                String name= "Rahim Khan ";
                
                LocalDate myObj = LocalDate.now(); // Create a date object
                out.println(myObj); // Display the date on the page
                out.println(name);
            %>
        </h1>

    </body>
</html>
