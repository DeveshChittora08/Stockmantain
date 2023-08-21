/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singaleton;


import java.sql.*;

public class MyLib {


     public static Connection getConnection()
             {
                  Connection cn=null ;
                 try
                 {
                Class.forName("com.mysql.jdbc.Driver");
                cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_mantain","root","");
                     
                 }
                 catch(Exception e)
                 {
                    System.out.println ("Error in getconnection "+e); 
                 } 
        
                 return cn;
      } 
        public String check_login(String email,String password)
    {
        String ut="no";
        try
        {
            Connection cn=getConnection();
            String sql="select * from logindata where email=? and password=?";
            PreparedStatement p1=cn.prepareStatement(sql);
            p1.setString(1, email);
            p1.setString(2, password);
            ResultSet r1=p1.executeQuery();
            if(r1.next())
            {
                ut=r1.getString("usertype");
            }
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, "Exception in check_login : "+e);
        }
        return ut;
    }
    
     
}

