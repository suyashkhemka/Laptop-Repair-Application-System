<%-- 
    Document   : AfterComplaint
    Created on : Jun 24, 2016, 6:31:18 PM
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
        <%@include file="Header_user.html" %><br><br><br><br>
        <h3>Complaint Submitted Successfully.<br>Complaint id=</h3>
        <%=
            request.getParameter("id")
        %>
        <h3>Check <em style="color:blue">Status</em> tab for follow up.</h3>
        <br><br><br><br><%@include file="Footer_user.html" %>
    </body>
</html>
