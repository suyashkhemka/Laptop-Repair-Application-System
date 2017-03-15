<%-- 
    Document   : help
    Created on : Jun 20, 2016, 3:44:19 AM
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
        <table border="2px" width="500px">
           <div>
      <table border="1px" width="1300px">
          <tr>
       <td> <div id="header">
           <%@include file="header.html" %>
           </div></td>
      </tr>
      </table>
           <table border="1px" width="500px">
       <tr>
        <td><div id="content">                                   
           <%@include file="content.html" %>                   
            </div> </td>
       </tr>
       </table>
    </body>
</html>
