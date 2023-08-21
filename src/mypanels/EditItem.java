/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypanels;
import singaleton.MyLib;
import java.sql.*;
import javax.swing.JOptionPane;
public class EditItem extends javax.swing.JPanel {

    /**
     * Creates new form EditItem
     */
    public EditItem() {
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
        ShowBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        T3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        CancleBtn = new javax.swing.JButton();
        T4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        T5 = new javax.swing.JTextField();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Item Name");
        add(jLabel1);
        jLabel1.setBounds(40, 60, 90, 22);
        add(T1);
        T1.setBounds(150, 60, 180, 30);

        ShowBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ShowBtn.setForeground(new java.awt.Color(0, 153, 0));
        ShowBtn.setText("Show");
        ShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBtnActionPerformed(evt);
            }
        });
        add(ShowBtn);
        ShowBtn.setBounds(350, 60, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Name");
        add(jLabel2);
        jLabel2.setBounds(80, 140, 45, 22);
        add(T2);
        T2.setBounds(150, 140, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Type");
        add(jLabel3);
        jLabel3.setBounds(80, 200, 39, 22);
        add(T3);
        T3.setBounds(150, 200, 180, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Description");
        add(jLabel4);
        jLabel4.setBounds(40, 300, 87, 22);

        SaveBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(0, 153, 0));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        add(SaveBtn);
        SaveBtn.setBounds(50, 460, 110, 30);

        DeleteBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(204, 0, 0));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        add(DeleteBtn);
        DeleteBtn.setBounds(170, 460, 110, 30);

        CancleBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        CancleBtn.setText("Cancle");
        add(CancleBtn);
        CancleBtn.setBounds(300, 460, 120, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        T4.setViewportView(jTextArea1);

        add(T4);
        T4.setBounds(150, 310, 190, 96);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Quantity");
        add(jLabel5);
        jLabel5.setBounds(60, 260, 70, 22);

        T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T5ActionPerformed(evt);
            }
        });
        add(T5);
        T5.setBounds(150, 260, 180, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void ShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowBtnActionPerformed
        // TODO add your handling code here:
        String msg= "";
        try
        {
            String item_name= T1.getText();
            Connection cn=new MyLib().getConnection();
            String sql="select * from itemdata where item_name=?";
            PreparedStatement p1=cn.prepareStatement(sql);
            p1.setString(1, item_name);
            ResultSet r1=p1.executeQuery();
            if(r1.next())
            {
                String a,b,c,d;
                a=r1.getString("item_name");
                b=r1.getString("type");
                c=r1.getString("qty");
                d=r1.getString("description");

                T2.setText(a);
                T3.setText(b);
                
                T5.setText(c);
                
                jTextArea1.setText(d);

            }
        }
        catch(Exception e)
        {
            msg="error"+e;
        }
    }//GEN-LAST:event_ShowBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String item_name,type,desc,qty;

        item_name=T2.getText();
        type=T3.getText();
        qty=T5.getText();
        desc=jTextArea1.getText();
        String msg="";
        try
        {
            Connection cn=new MyLib().getConnection();
            String sql="update itemdata set item_name=?,type=?,qty=?,description=? where item_name=?";
            PreparedStatement p1=cn.prepareStatement(sql);
            p1.setString(1,item_name);
            p1.setString(2,type);
            p1.setString(3,qty);
            p1.setString(4, desc);
            p1.setString(5,item_name);

            int a=p1.executeUpdate();
            if(a==1)
            {
                msg="Item Saved ";
                T1.setText("");
                T2.setText("");
                T3.setText("");
                T5.setText("");
                jTextArea1.setText("");
                T1.requestFocus();
            }
            else
            {
                msg="Item not saved";
            }

        }
        catch(Exception e)
        {
            msg=""+e;
        }

        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancleBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton ShowBtn;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JScrollPane T4;
    private javax.swing.JTextField T5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
