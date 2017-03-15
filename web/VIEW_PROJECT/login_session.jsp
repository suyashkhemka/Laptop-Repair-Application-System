<%-- 
    Document   : login_session
    Created on : Jun 25, 2016, 12:57:39 AM
    Author     : Smruti Ranjan
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
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String person=request.getParameter("person");
        Bean bean=new Bean();
        if(username.equals("admin") && password.equals("admin"))
        {
            out.print("14");
        
        }
        
        else if(person.equals("user"))
        {
             
            int i=bean.authenticate(username,password,person);
            out.print(i);
        
             if(i==1)
        {
            session.setAttribute("username",username);
            
            
            response.sendRedirect("User/Homepage_user.jsp");
        }
             else
             {
                 response.sendRedirect("login_session.html");
             }
                }
        else if(person.equals("tech"))
        {
            
            int i=bean.authenticate(username,password,person);
            out.print(i);
             if(i==1)
            {
            session.setAttribute("username",username);
           
            
            response.sendRedirect("#");
            }
             else
             {
                 response.sendRedirect("login_session.html");
             }
        }
       
        %>
    </body>
</html>
