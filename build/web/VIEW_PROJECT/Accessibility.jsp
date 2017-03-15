<%-- 
    Document   : Accessibility
    Created on : Jun 21, 2016, 12:26:29 AM
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
        <%@include file="Header.html" %><br><br><br><br>
        
        
        <form action="../CONTROLLER_PROJECT/Accessibility.jsp">
            <b>Brand:</b><br>
            <input type="radio" name="brand" value="dell">Dell<br>
            <input type="radio" name="brand" value="hp">HP<br>
            <input type="radio" name="brand" value="asus">Asus<br>
            <input type="radio" name="brand" value="compaq">Compaq<br>
            <input type="radio" name="brand" value="samsung">Samsung<br><br>
            <input type="submit" value="Find Me Service Centers">
        </form>
        <br><br><br><br><%@include file="Footer.html" %>
       </body>
</html>
