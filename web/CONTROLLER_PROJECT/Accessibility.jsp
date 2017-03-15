<%-- 
    Document   : Accessibility
    Created on : Jun 21, 2016, 12:49:15 AM
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
        <% String brand=request.getParameter("brand");
           out.print(brand);
           
           if(brand.equalsIgnoreCase("dell"))
           {
              response.sendRedirect("Locations/Dell.jsp");
              
           }
           else if(brand.equalsIgnoreCase("hp"))
           {
               response.sendRedirect("Locations/Hp.jsp");
               
           }
           else if(brand.equalsIgnoreCase("asus"))
           {
               response.sendRedirect("Locations/Asus.jsp");
               
           }
           else if(brand.equalsIgnoreCase("compaq"))
           {
                response.sendRedirect("Locations/Compaq.jsp");
               
           }
           else if(brand.equalsIgnoreCase("samsung"))
           {
                response.sendRedirect("Locations/Samsung.jsp");
           
           }
        %>
       <%-- <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <c:choose>
            <c:when test="brand.equalsIgnoreCase("dell")">
                          
            </c:when>
            <c:when test="brand='hp'">
                <iframe src="https://www.google.com/maps/embed?pb=!1m16!1m12!1m3!1d224140.2355231734!2d77.10952671688959!3d28.62403173398738!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!2m1!1shp+delhi!5e0!3m2!1sen!2sin!4v1466449597343" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
            </c:when>
            <c:when test="brand='asus'">
              </c:when>
            <c:when test="brand='compaq'">
                <iframe src="https://www.google.com/maps/embed?pb=!1m16!1m12!1m3!1d180002.5960881902!2d77.17587693608061!3d28.60344501095954!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!2m1!1scompaq+delhi!5e0!3m2!1sen!2sin!4v1466451883315" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
            </c:when>
            <c:when test="brand='samsung'">
                <iframe src="https://www.google.com/maps/embed?pb=!1m16!1m12!1m3!1d224243.77326570396!2d77.215015295679!3d28.575498920907815!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!2m1!1ssamsung+delhi!5e0!3m2!1sen!2sin!4v1466451920162" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
            </c:when>
            <c:otherwise>
                
            </c:otherwise>
        </c:choose>--%>
    </body>
</html>
