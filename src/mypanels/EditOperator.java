/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypanels;

import singaleton.MyLib;
import java.sql.*;
import javax.swing.JOptionPane;
public class EditOperator extends javax.swing.JPanel {

    /**
     * Creates new form EditOperator
     */
    public EditOperator() {
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

        jLabel1 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        Show = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        T6 = new javax.swing.JTextField();
        T7 = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cancle = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Email");
        add(jLabel1);
        jLabel1.setBounds(140, 80, 50, 31);

        T1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(T1);
        T1.setBounds(210, 80, 240, 40);

        Show.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Show.setForeground(new java.awt.Color(51, 153, 0));
        Show.setText("Show");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });
        add(Show);
        Show.setBounds(460, 80, 80, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Contact");
        add(jLabel2);
        jLabel2.setBounds(120, 260, 80, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Designation");
        add(jLabel3);
        jLabel3.setBounds(90, 200, 120, 31);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Joining Date");
        add(jLabel4);
        jLabel4.setBounds(90, 360, 100, 31);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Address");
        add(jLabel5);
        jLabel5.setBounds(120, 310, 70, 31);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Name");
        add(jLabel6);
        jLabel6.setBounds(140, 160, 60, 31);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Email");
        add(jLabel7);
        jLabel7.setBounds(140, 410, 50, 31);

        T2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(T2);
        T2.setBounds(210, 160, 240, 30);

        T3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(T3);
        T3.setBounds(210, 200, 240, 30);

        T4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(T4);
        T4.setBounds(210, 250, 240, 30);

        T5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(T5);
        T5.setBounds(210, 310, 240, 30);

        T6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(T6);
        T6.setBounds(210, 350, 240, 30);

        T7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        T7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T7ActionPerformed(evt);
            }
        });
        add(T7);
        T7.setBounds(210, 400, 240, 30);

        save.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        save.setForeground(new java.awt.Color(0, 153, 0));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        add(save);
        save.setBounds(90, 480, 110, 31);

        delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 0, 0));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        add(delete);
        delete.setBounds(230, 480, 110, 31);

        cancle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancle.setText("Cancel");
        cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleActionPerformed(evt);
            }
        });
        add(cancle);
        cancle.setBounds(380, 480, 110, 31);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 204));
        jLabel8.setText("Edit Operator");
        add(jLabel8);
        jLabel8.setBounds(190, 20, 230, 42);
    }// </editor-fold>//GEN-END:initComponents

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        // TODO add your handling code here:
        String msg= "";
        try
        {
            String email= T1.getText();
            Connection cn=new MyLib().getConnection();
            String sql="select * from oprtdata where email=?";
            PreparedStatement p1=cn.prepareStatement(sql);
            p1.setString(1, email);
            ResultSet r1=p1.executeQuery();
            if(r1.next())
            {
                String a,b,c,d,e,f;
                a=r1.getString("name");
                b=r1.getString("designation");
                c=r1.getString("contact");
                d=r1.getString("address");
                e=r1.getString("joining_date");
                f=r1.getString("email");

                T2.setText(a);
                T3.setText(b);
                T4.setText(c);
                T5.setText(d);
                T6.setText(e);
                T7.setText(f);
            }
        }
        catch(Exception e)
        {
            msg="error"+e;
        }

    }//GEN-LAST:event_ShowActionPerformed

    private void T7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T7ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_T7ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String name,designation,contact,address,joining_date,email;
        name=T2.getText();
        designation=T3.getText();
        contact=T4.getText();
        address=T5.getText();
        joining_date=T6.getText();
        email=T7.getText();

        String msg="";
        try
        {
            Connection cn=new MyLib().getConnection();
            String sql="update oprtdata set name=?,designation=?,contact=?,address=?,joining_date=? where email=?";
            PreparedStatement p1=cn.prepareStatement(sql);
            p1.setString(1, name);
            p1.setString(2, designation);
            p1.setString(3, contact);
            p1.setString(4, address);
            p1.setString(5, joining_date);
            p1.setString(6, email);

            int a=p1.executeUpdate();
            if(a==1)
            {
                msg="data Edit is susessfull";
                T1.setText("");
                T2.setText("");
                T3.setText("");
                T4.setText("");
                T5.setText("");
                T6.setText("");
                T7.setText("");
                T1.requestFocus();
            }
            else
            {
                msg="data not Edit";
            }
        }
        catch(Exception e)
        {
            msg=""+e;
        }
        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        String email=T1.getText();
        String msg="";
        try
        {
            Connection cn=new MyLib().getConnection();
            String sql="delete from oprtdata where email=?";
            String sql1="delete from logindata where email=?";

            PreparedStatement p1=cn.prepareStatement(sql);
            PreparedStatement p2=cn.prepareStatement(sql1);
            p1.setString(1, email);
            p2.setString(1, email);

            int a=p1.executeUpdate();
            int b=p2.executeUpdate();

            if(a==1 && b==1)
            {
                msg="data is deleted";
                T1.setText("");
                T2.setText("");
                T3.setText("");
                T4.setText("");
                T5.setText("");
                T6.setText("");
                T7.setText("");
                T1.requestFocus();
            }
            else
            {
                msg="data not delete";
            }

        }
        catch(Exception e)
        {
            msg=""+e;
        }
        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_deleteActionPerformed

    private void cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Show;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JTextField T7;
    private javax.swing.JButton cancle;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
