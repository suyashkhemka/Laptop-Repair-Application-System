/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODAL_PROJECT;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Suyash
 */
public class ConnectionClass
{
    Connection con=null;
    Statement stmt=null;
    public void createConnection()
    {
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","suyash123");
             stmt=con.createStatement();
        
         }
         catch(Exception e)
         {
             System.out.print(e.getMessage());
         }
         
        
    }
}

