/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypanels;
import singaleton.MyLib;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author V
 */
public class AdminReg extends javax.swing.JPanel {

    /**
     * Creates new form AdminReg
     */
    public AdminReg() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        confirm = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        T3 = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        T6 = new javax.swing.JTextField();
        T1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(51, 102, 255));
        name.setText("Confirm Password");
        add(name);
        name.setBounds(190, 500, 142, 22);

        contact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contact.setForeground(new java.awt.Color(51, 102, 255));
        contact.setText("Contact");
        add(contact);
        contact.setBounds(190, 320, 60, 20);

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(51, 102, 255));
        email.setText("Email");
        add(email);
        email.setBounds(190, 380, 42, 22);

        password.setBackground(new java.awt.Color(153, 204, 255));
        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(51, 102, 255));
        password.setText("Password");
        add(password);
        password.setBounds(190, 440, 74, 30);

        confirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirm.setForeground(new java.awt.Color(51, 102, 255));
        confirm.setText("Name");
        add(confirm);
        confirm.setBounds(190, 210, 50, 30);

        address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        address.setForeground(new java.awt.Color(51, 102, 255));
        address.setText("Address");
        add(address);
        address.setBounds(190, 260, 70, 30);

        T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T3ActionPerformed(evt);
            }
        });
        add(T3);
        T3.setBounds(350, 320, 260, 30);

        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });
        add(T2);
        T2.setBounds(350, 260, 260, 30);

        T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T4ActionPerformed(evt);
            }
        });
        add(T4);
        T4.setBounds(350, 380, 260, 30);

        T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T5ActionPerformed(evt);
            }
        });
        add(T5);
        T5.setBounds(350, 440, 260, 30);

        T6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T6ActionPerformed(evt);
            }
        });
        add(T6);
        T6.setBounds(350, 500, 260, 30);

        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });
        add(T1);
        T1.setBounds(350, 210, 260, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("Register");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(230, 550, 130, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setText("Admin Registration");
        add(jLabel1);
        jLabel1.setBounds(220, 130, 310, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T3ActionPerformed

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2ActionPerformed

    private void T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T4ActionPerformed

    private void T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T5ActionPerformed

    private void T6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T6ActionPerformed

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name=T1.getText();
        String address=T2.getText();
        String contact=T3.getText();
        String Email=T4.getText();
        String pass=T3.getText();
        String confirm=T4.getText();
        String msg="";
        if(name==null || name.trim().equals(""))
        {
            msg="Enter Name";
            T1.requestFocus();
        }
        else if(address==null || address.trim().equals(""))
        {
            msg="Enter Address";
            T2.requestFocus();
        }
        else if(contact==null || contact.trim().equals(""))
        {
            msg="Enter Contact";
            T3.requestFocus();
        }
        else if(Email==null || Email.trim().equals(""))
        {
            msg="Enter Email";
            T4.requestFocus();
        }
        else if(pass==null || pass.trim().equals(""))
        {
            msg="Enter Password";
            T3.requestFocus();
        }
        else if(confirm==null || confirm.trim().equals(""))
        {
            msg="Enter Confirm Password";
            T4.requestFocus();
        }
        else if(pass.equals(confirm)==false)
        {
            msg="Password Not Match";
            T3.setText("");
            T4.setText("");
            T3.requestFocus();
        }

        else
        {
            try
            {
                Connection cn=new MyLib().getConnection();
                String sql="insert into admindata values(?,?,?,?)";
                String sql1="insert into logindata values(?,?,?)";
                PreparedStatement p1=cn.prepareStatement(sql);
                PreparedStatement p2=cn.prepareStatement(sql1);
                p1.setString(1,name);
                p1.setString(2,address);
                p1.setString(3,contact);
                p1.setString(4,Email);

                p2.setString(1,Email);
                p2.setString(2,pass);
                p2.setString(3,"Admin");

                int a=p1.executeUpdate();
                int b=p2.executeUpdate();
                if(a==1 && b==1)
                {
                    msg="Data Saves And Login Is Created";
                    T1.setText("");
                    T2.setText("");
                    T3.setText("");
                    T4.setText("");
                    T3.setText("");
                    T4.setText("");
                    T1.requestFocus();

                }
                else if(a==1)
                {
                    msg="Only Data is saved";
                }
                else if(b==1)
                {
                    msg="Only Login is Created";
                }
                else
                {
                    msg="No Data is saved & No login is created";
                }
            }
            catch(Exception e)
            {
                msg=""+e;
            }

        }
        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JLabel address;
    private javax.swing.JLabel confirm;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel password;
    // End of variables declaration//GEN-END:variables
}
