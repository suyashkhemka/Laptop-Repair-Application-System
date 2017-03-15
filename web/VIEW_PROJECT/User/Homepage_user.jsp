<%-- 
    Document   : Homepage_user
    Created on : Jun 28, 2016, 1:32:44 PM
    Author     : Suyash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="Header_user.html" %>
        
        <h1>Welcome Mr. <%=session.getAttribute("username")%></h1>
        
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <%@include file="Footer_user.html" %>
    </body>
</html>
