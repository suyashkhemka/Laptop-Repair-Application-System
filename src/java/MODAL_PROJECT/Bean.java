/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODAL_PROJECT;
import MODAL_PROJECT.ConnectionClass;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Suyash
 */
public class Bean 
{
    String firstname;
    String lastname;
    String emailid;
    long contactnumber;
    String address;
    String brand;
    String series;
    String model;
    String type;
    String delivery;
    String comments;
    String date;
    String username;
    public ResultSet rs=null;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
    

    public String getDelivery() {
        return delivery;
    }

    public String getDate() {
        return date;
    }

    public ResultSet getRs() {
        return rs;
    }

    
    
    
    public String getComments() {
        return comments;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmailid() {
        return emailid;
    }

    public long getContactnumber() {
        return contactnumber;
    }

    public String getAddress() {
        return address;
    }

    public String getBrand() {
        return brand;
    }

    public String getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }
   
    
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public void setContactnumber(long contactnumber) {
        this.contactnumber = contactnumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
    
    
    public int save(Bean bean) throws SQLException
    {
        String msg=null;
        int id=100;
        ConnectionClass cc = new ConnectionClass();
        cc.createConnection();
        try
        {
        int x=cc.stmt.executeUpdate("insert into newcomplaint(id,firstname,lastname,emailid,contactnumber,address,brand,series,model,type,delivery,comments,date,username,status)values(null,'"+bean.getFirstname()+"','"+bean.getLastname()+"','"+bean.getEmailid()+"','"+bean.getContactnumber()+"','"+bean.getAddress()+"','"+bean.getBrand()+"','"+bean.getSeries()+"','"+bean.getModel()+"','"+bean.getType()+"','"+bean.getDelivery()+"','"+bean.getComments()+"','"+bean.getDate()+"','"+username+"','open')");
        if(x>0)
        {
            
            rs=cc.stmt.executeQuery("select max(id) from newcomplaint");
            while(rs.next())
            {
                id=rs.getInt("id");
            }
                
        }
        cc.con.close();        
        }
        catch(Exception ex)
        {
            msg=ex.getMessage();
            
        }
        
        cc.con.close();
        return id;
    }
    
    public void status(String username)
    {
        rs=null;
        ConnectionClass cc=new ConnectionClass();
        cc.createConnection();
        ArrayList list=new ArrayList();
        try
        {
            rs=cc.stmt.ExecuteQuery("select complaintid,date,brand,series,model,comments,status from newcomplaint where username='"+session.getAttribute("username")+"' order by id desc");
            while(rs.next())
            {
                
            }
        
        }
        catch(Exception e4)
        {
                    System.out.print(e4.getMessage());
        }
    }
    public int authenticate(String username,String password,String person)
    {
       
        rs=null;
        int i=4;
        ConnectionClass cc=new ConnectionClass();
        cc.createConnection();
        try
        {
            rs=cc.stmt.executeQuery("select * from authenticate where username='"+username+"' and password='"+password+"' and person='"+person+"' ");
        
        if(rs.next())
        {
            i=1;
        }
        }
                catch(Exception e4)
        {
                    System.out.print(e4.getMessage());
        }
                return i;

    }
    public static void main(String args[])
    {
        
        
    }
}
