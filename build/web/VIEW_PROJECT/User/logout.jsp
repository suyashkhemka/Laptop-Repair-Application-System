<%-- 
    Document   : logout
    Created on : Jun 25, 2016, 1:13:40 AM
    Author     : Smruti Ranjan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <%
          session.removeAttribute("username");
         
          response.sendRedirect("logout.html");
      %>
    </body>
</html>
