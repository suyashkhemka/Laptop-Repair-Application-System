<%-- 
    Document   : Newcomplaint
    Created on : Jun 22, 2016, 9:07:00 PM
    Author     : Suyash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@page import="MODAL_PROJECT.Bean" %>
    </head>
    <body>
        <%
            Bean bean=new Bean();
            
            bean.setFirstname(request.getParameter("firstname"));
            bean.setLastname(request.getParameter("lastname"));
            bean.setEmailid(request.getParameter("emailid"));
            bean.setContactnumber(Long.parseLong(request.getParameter("contactnumber")));
            bean.setAddress(request.getParameter("address"));
            bean.setBrand(request.getParameter("brand"));
            bean.setSeries(request.getParameter("series"));
            bean.setModel(request.getParameter("model"));
            bean.setType(request.getParameter("type"));
            bean.setDelivery(request.getParameter("delivery"));
            bean.setComments(request.getParameter("comments"));
            bean.setDate(request.getParameter("date"));
            bean.setUsername(request.getParameter("username"));
            
            int id=bean.save(bean); 
            
            
            %>
            
            <jsp:forward page="../VIEW_PROJECT/User/AfterComplaint.jsp" >
                <jsp:param name="id" value="${id}"></jsp:param>
            </jsp:forward>
            
            
           
                   

        
    
    </body>
</html>
