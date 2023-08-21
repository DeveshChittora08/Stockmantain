
package app;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import mypanels.*;
 import java.sql.*;
import singaleton.MyLib;
public class WhareHouse extends JFrame
{
    private JMenuBar bar;
    private JMenu f1,f2,f3;
    private JMenuItem f1m1,f1m2,f1m3;
    
    private JMenuItem f2m1,f2m2,f2m3,f2m4,f2m5;
    private JMenu f21,f22;
    
    private JMenuItem f3m1,f3m2,f3m3,f3m4,f3m5;
    
    private CardLayout CL;
    Container ct;
    
    //panels
    AdminReg admreg;
   
    OperatorReg oprtreg;
    EditItem edititem;
    StockIn stkin;
    StockIssue stkissue;
    ItemReg itmreg;
    EditOperator editoprt;
    Search search;
    
    //home panels
    JPanel home;
    Login lgn;
    Welcome wel;
    CardLayout CL2;
    
    public WhareHouse()
    {
        //Home Pannel
        home=new JPanel();
        CL2=new CardLayout();
        home.setLayout(CL2);
        lgn=new Login();
        wel=new Welcome();
        home.add(wel,"wel");
        home.add(lgn,"lgn");
    //Define pannel
    admreg=new AdminReg();
     oprtreg=new OperatorReg();
     edititem=new EditItem();
     stkin=new StockIn();
     stkissue=new StockIssue();
     itmreg=new ItemReg();
     editoprt=new EditOperator();
     search=new Search();
     
     //Define container
     ct=getContentPane();
     //define all componants;
     Font ft=new Font("Arial", 0, 24);
     bar=new JMenuBar();
     f1=new JMenu("Home");f1.setFont(ft);
     f1m1=new JMenuItem("Welcome");f1m1.setFont(ft);
     f1m2=new JMenuItem("Login");f1m2.setFont(ft);
     f1m3=new JMenuItem("Exit");f1m3.setFont(ft);
     
     f2=new JMenu("Admin");f2.setFont(ft);
     f21=new JMenu("New");f21.setFont(ft);
     f22=new JMenu("show");f22.setFont(ft);
     f2m1=new JMenuItem("Admin");f2m1.setFont(ft);
     f2m2=new JMenuItem("Operator");f2m2.setFont(ft);
     f2m3=new JMenuItem("Admin");f2m3.setFont(ft);
     f2m4=new JMenuItem("Operator");f2m4.setFont(ft);
     f2m5=new JMenuItem("Change Password");f2m5.setFont(ft);
     
     
     f3=new JMenu("Item");f3.setFont(ft);
     f3m1=new JMenuItem("Add");f3m1.setFont(ft);
     f3m2=new JMenuItem("Show");f3m2.setFont(ft);
     f3m3=new JMenuItem("Search");f3m3.setFont(ft);
     f3m4=new JMenuItem("Issue");f3m4.setFont(ft);
     f3m5=new JMenuItem("Deposit");f3m5.setFont(ft);
     
     CL=new CardLayout();
     ct.setLayout(CL);
     
     //Add Components to contaiber
     
        setJMenuBar(bar);
        bar.add(f1);
        bar.add(f2);
        bar.add(f3);
        
        f1.add(f1m1);
        f1.add(f1m2);
        f1.add(f1m3);
        
        f2.add(f21);
        f2.add(f22);
        f2.add(f2m5);
        f21.add(f2m1);
        f21.add(f2m2);
        f22.add(f2m3);
        f22.add(f2m4);
        
        
        f3.add(f3m1);
        f3.add(f3m2);
        f3.add(f3m3);
        f3.add(f3m4);
        f3.add(f3m5);
        
        //add all panels
        
        ct.add(home,"home");
        ct.add(admreg,"admreg");
        ct.add(oprtreg,"oprtreg");
        ct.add(editoprt,"editoprt");
        ct.add(itmreg,"itmreg");
        ct.add(edititem,"edititem");
        ct.add(stkin,"stkin");
        ct.add(stkissue,"stkissue");
        ct.add(search,"Search");
        
        //add listener
        f1m1.addActionListener(new A());
        f1m2.addActionListener(new A());
        f1m3.addActionListener(new A());
        f2m1.addActionListener(new A());
        f2m2.addActionListener(new A());
        f2m4.addActionListener(new A());
        f3m1.addActionListener(new A());
        f3m2.addActionListener(new A());
        f3m3.addActionListener(new A());
        f3m5.addActionListener(new A());
        f3m4.addActionListener(new A());
        
        
        //button of login and welcome
        lgn.jButton1.addActionListener(new B());
        lgn.jButton2.addActionListener(new B());
        wel.jButton1.addActionListener(new B());
        wel.jButton2.addActionListener(new B());
         
        //Disable Component
        f2.setEnabled(false);
        f3.setEnabled(false);;
        
    }
    class B implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //Finde responsible source
        JButton bt=(JButton) e.getSource();
        if(bt==wel.jButton1)
        {
            CL2.show(home, "lgn");
        }
        else if(bt==wel.jButton2)
            {
                System.exit(0);
            }
            else if(bt==lgn.jButton1)
            {
                String email=lgn.jTextField1.getText();
                String pass=lgn.jPasswordField1.getText();
                String usertype=new MyLib().check_login(email,pass);
                if(usertype.equalsIgnoreCase("no"))
                {
                  JOptionPane.showMessageDialog(null, "Invalid Email Or Password");
                  lgn.jTextField1.setText("");
                  lgn.jPasswordField1.setText("");
                  lgn.jTextField1.requestFocus();
                }
                else
                {
                    f3.setEnabled(true);
                    lgn.jTextField1.setText("");
                    lgn.jPasswordField1.setText("");
                    wel.jButton1.setVisible(false);
                    CL2.show(home, "wel");
                    f1m2.setText("Logout");
                    
                    if(usertype.equalsIgnoreCase("admin"))
                    {
                        f2.setEnabled(true);
                    }
                }
            }
            else
            {
                CL2.show(home, "wel");
            }
        }
        
    }
    class A implements ActionListener
    {
          public void actionPerformed(ActionEvent e)
          {
              JMenuItem mi=(JMenuItem) e.getSource();
              
              if(mi==f1m1)
              {
                  CL.show(ct, "home");
                  CL2.show(home, "wel");
              }
              else if(mi==f1m2)
              {
                  String str=f1m2.getText();
                  if(str.equalsIgnoreCase("Login"))
                  {
                      CL.show(ct, "lgn");
                      CL2.show(home, "lgn");
                  }
                  else
                  {
                      f1m2.setText("Login");
                      f2.setEnabled(false);
                      f3.setEnabled(false);
                      wel.jButton1.setVisible(true);
                      CL.show(ct, "home");
                      CL2.show(home,"wel");
                  }
              }
              else if(mi==f1m3)
              {
                  System.exit(0);
              }
              else if(mi==f2m1)
              {
                  CL.show(ct, "admreg");
              }
              else if(mi==f2m2)
              {
                  CL.show(ct, "oprtreg");
              }
              else if(mi==f2m4)
              {
                  CL.show(ct, "editoprt");
              }
              else if(mi==f3m1)
              {
                  CL.show(ct, "itmreg");
              }
              else if(mi==f3m2)
              {
                  CL.show(ct, "edititem");
              }
              else if(mi==f3m5)
              {
                  CL.show(ct, "stkin");
              }
              else if(mi==f3m4)
              {
                  CL.show(ct, "stkissue");
              }
              else if(mi==f3m3)
              {
                  CL.show(ct, "Search");
              }
    
          }
    }
    
    public static void main(String[] args) {
        WhareHouse obj=new WhareHouse();
        obj.setSize(1100,1100);
        obj.setVisible(true);
        
        obj.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent e)
           {
               System.exit(0);
           }
        
        });
        
    }
    
}
