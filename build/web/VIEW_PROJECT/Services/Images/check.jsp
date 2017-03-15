<%-- 
    Document   : check
    Created on : Jun 25, 2016, 1:26:45 AM
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
          <h1>WELCOME MR:-</h1><BR>
        <%=session.getAttribute("id")
        %>
        <br>
        <a href="logout.jsp">LOGOUT</A>
    </body>
</html>
