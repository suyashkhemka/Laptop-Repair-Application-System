<%-- 
    Document   : ComplaintStatus
    Created on : Jun 23, 2016, 5:18:22 PM
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
            
            %>
            <table style="border:1px solid black">
                <tr>
                    <td>ComplaintID</td>
                    <td>Date</td>
                    <td>Laptop</td>
                    <td>Comments</td>
                    <td>Status</td>
                </tr>
                <tr>
                    <%
                        Bean bean=new Bean();
                         String username=(String)session.getAttribute("username");            
                         bean.status("username");
                         if(rs.next()) 
                         {
                    %>
                    <td><%=bean.rs.getInt("id")%></td>
                    <td><%=bean.rs.getString("date")%></td>
                    <td>
                        <% out.print(bean.rs.getString("brand")+" "+bean.rs.getString("series")+" "+bean.rs.getString("model"));
                        %>
                    </td>
                    <td><%=bean.rs.getString("comments")%></td>
                    <td><%=bean.rs.getString("status")%></td>
                    <td>
                        <form action='../../CONTROLLER_PROJECT/ComplaintUpdate.jsp'>
                            <input type="hidden" name='id' value="<%=bean.rs.getInt("id")%>">
                            <input type='submit' value='View'>
                            
                            
                        </form>
                    </td>
                    
                    <%
                        }
                        else
                        {
                            out.print("No records to show");
                        }
                    %>
                    
                </tr>
            </table>
            if(rs.next())
            {
                
            
            }

        
    </body>
</html>
