<%-- 
    Document   : ComplaintUpdate
    Created on : Jun 24, 2016, 7:51:16 PM
    Author     : Suyash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@page import="MODAL_PROJECT.Bean" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int id=request.getParameter("id");
            Bean bean=new Bean();
            bean.status(id);
        %>
    </body>
</html>
