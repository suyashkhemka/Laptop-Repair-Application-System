<%-- 
    Document   : Newcomplaint
    Created on : Jun 22, 2016, 6:32:27 PM
    Author     : Suyash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="Styling_user.jsp">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="Header_user.html" %><br><br><br><br>
        <h1>Enter the details</h1>
        <form action="../../CONTROLLER_PROJECT/Newcomplaint.jsp" method='post'>
            <table>
                <tr>
                    <td>First Name</td>
                    <td><input type='text' name='firstname' required autofocus ></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type='text' name='lastname' required ></td>
                </tr>
                <tr>
                    <td>Email id</td>
                    <td><input type='email' name='emailid' required></td>
                </tr>
                <tr>
                    <td>Contact Number</td>
                    <td><input maxlength="10"  name='contactnumber'  required></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type='text' name='address' required></td>
                </tr>
                <tr>
                    <td>Brand</td>
                    <td><input type='text' name='brand' required></td>
                </tr>
                <tr>
                    <td>Series</td>
                    <td><input type='text' name='series' required></td>
                </tr>
                <tr>
                    <td>Model</td>
                    <td><input type='text' name='model' required></td>
                </tr>
                <tr> 
                    <td>Complaint Type</td>
                    <td><input list="types" name="type"></td>
                        <datalist id="types">
                        <option value="RAM" default>
                        <option value="Screen">
                        <option value="Hard Disk">
                        <option value="CD-ROM">
                        <option value="(Other)">
                        </datalist>
  
                <tr>
                    <td><input type='checkbox' name='delivery' value="normal">Normal</td>
                    <td><input type='checkbox' name='delivery' value="urgent">Urgent <em>(500Rs. Extra)</em></td>
                </tr>
                <tr>
                    <td>Comments</td>
                    <td><textarea name="comments" rows="10" cols="30"></textarea></td>
                    
                </tr>
                <tr>
                    
                    <td ><input type='hidden' name='date' value='<%= new java.util.Date() %>' /></td>
                    <td ><input type='hidden' name='username' value='<%= (String)session.getAttribute("username") %>' /></td>
                    </tr>
                    <tr>
                
                    <td></td>
                
                <td><input type='submit' value='Login' /></td>
                </tr>
                
            </table>                          
        </form>
        
        <br><br><br><br><%@include file="Footer_user.html" %>
    </body>
</html>
