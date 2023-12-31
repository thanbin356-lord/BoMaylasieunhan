/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package model;

import dao.ConnectionProvider;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.code.Student;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author zkuro
 */
public class thisinh extends javax.swing.JFrame {
    public int check = 0;
    public int ok = 0;
    public int them = 0;
    public int update = 0;
    public String temp;
    
    /**
     * Creates new form Manage
     */
    public thisinh() {
        initComponents();
        
        setTitle("Quản lý thí sinh");
        txtAddress.setEnabled(false);
        txtBang.setEnabled(false);
        txtCancuoc.setEnabled(false);
        txtName.setEnabled(false);
        txtPhonenumber.setEnabled(false);
        txtStudentId.setEnabled(false);
        txtStudentId.setEditable(false);
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
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPhonenumber = new javax.swing.JTextField();
        txtCancuoc = new javax.swing.JTextField();
        txtBang = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Quản lý thí sinh");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 790, -1));

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sv", "Tên Sv", "Bằng", "Địa chỉ", "Căn cước", "Số điện thoại"
            }
        ));
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudents);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 860, 363));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("MTS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, -1, -1));
        jPanel1.add(txtStudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 0, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Họ tên");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 46, -1, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 46, 160, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("SĐT");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 9, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Địa chỉ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 86, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("CMND/CCCD");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 49, -1, -1));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 90, 160, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 152, 798, 10));

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 168, 83, -1));

        btnDelete.setText("Xóa");
        btnDelete.setToolTipText("0");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 168, 83, -1));

        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 168, 83, -1));

        btnReset.setText("Nhập mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 168, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Bằng");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        txtPhonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhonenumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtPhonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 160, -1));

        txtCancuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCancuocActionPerformed(evt);
            }
        });
        jPanel1.add(txtCancuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 160, -1));
        jPanel1.add(txtBang, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 160, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/123456.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 860, 570));

        jLabel7.setBackground(new java.awt.Color(153, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo-tongcuc.png"))); // NOI18N
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 100));

        jButton2.setText("Xác Nhận");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 750, 100, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Illustration.png"))); // NOI18N
        jButton1.setText("Quay lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 750, -1, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/123456.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(them == 0){
            int a = JOptionPane.showConfirmDialog(null,"Bạn muốn thêm thí sinh không?","Select",JOptionPane.YES_NO_OPTION);
            if(a == 0){
                    try {
                        Connection con = ConnectionProvider.getConnection();
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select max(id) from thisinh");
                        if(rs.next()){  
                            int id = rs.getInt(1);
                            id = id+1;
                            String str = String.valueOf(id);
                            txtStudentId.setText(str);
                    }else{
                    txtStudentId.setText("1");
                    }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
                txtStudentId.setForeground(new Color(255,0,0));
                
                txtAddress.setText("");
                txtBang.setText("");
                txtCancuoc.setText("");
                txtName.setText("");
                txtPhonenumber.setText("");
                
                
                txtAddress.setEnabled(true);
                txtBang.setEnabled(true);
                txtCancuoc.setEnabled(true);
                txtName.setEnabled(true);
                txtPhonenumber.setEnabled(true);
                txtStudentId.setEnabled(true);
                
                txtAddress.setEditable(true);
                txtBang.setEditable(true);
                txtCancuoc.setEditable(true);
                txtName.setEditable(true);
                txtPhonenumber.setEditable(true);
                
                check = 1;
                btnDelete.setEnabled(false);
                btnUpdate.setEnabled(false);
                them = 1;
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(txtStudentId.getText().equals("") || txtName.getText().equals("") || txtAddress.getText().equals("")|| 
           txtPhonenumber.getText().equals("") || txtBang.getText().equals("") || txtCancuoc.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Vui lòng chọn thi sinh muốn xoá!");
            }
            else{
                String id = txtStudentId.getText();
                int thongBao = JOptionPane.showConfirmDialog(null, "Bạn muốn xoá thi sinh này?","Select",JOptionPane.YES_NO_OPTION);
                if(thongBao==0){
                    try {
                        Connection con = ConnectionProvider.getConnection();
                        Statement st = con.createStatement();
                        st.executeUpdate("DELETE FROM thisinh WHERE id = "+id+"'");
                        setVisible(false);
                        new thisinh().setVisible(true);
                    } catch (Exception e) {
                    }
                }
            }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(txtStudentId.getText().equals("") || txtName.getText().equals("") || txtAddress.getText().equals("")|| 
           txtPhonenumber.getText().equals("") || txtBang.getText().equals("") || txtCancuoc.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng chọn thi sinh muốn cập nhật!");
        }
        else if (ok == 0){
            int thongbao = JOptionPane.showConfirmDialog(null, "Bạn muốn cập nhật thông tin cho thi sinh có ID = " + txtStudentId.getText() + " ?","Select",JOptionPane.YES_NO_OPTION);
            if(thongbao == 0){
                ok = 1;  
                txtName.setEditable(true);
                txtAddress.setEditable(true);
                txtPhonenumber.setEditable(true);
                txtBang.setEditable(true);
                txtCancuoc.setEditable(true);
                btnAdd.setEnabled(false);
                btnDelete.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtAddress.setText("");
        txtName.setText("");
        txtBang.setText("");
        txtPhonenumber.setText("");
        txtCancuoc.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked
        if(them==0){
            txtStudentId.setEnabled(true);
            txtName.setEnabled(true);
            txtAddress.setEnabled(true);
            txtPhonenumber.setEnabled(true);
            txtCancuoc.setEnabled(true);
            txtBang.setEnabled(true);
            
            txtStudentId.setEditable(false);
            txtName.setEditable(false);
            txtAddress.setEditable(false);
            txtPhonenumber.setEditable(false);
            txtCancuoc.setEditable(false);
            txtBang.setEditable(false);
            
            int row = tblStudents.getSelectedRow();
            if(row >= 0){
                txtStudentId.setText(tblStudents.getValueAt(row, 0).toString());
                txtStudentId.setForeground(new Color(255,0,0));
                txtName.setText(tblStudents.getValueAt(row, 1).toString());
                txtName.setForeground(new Color(0,0,0));
                txtAddress.setText(tblStudents.getValueAt(row, 2).toString());
                txtAddress.setForeground(new Color(0,0,0));
                txtPhonenumber.setText(tblStudents.getValueAt(row, 3).toString());
                txtPhonenumber.setForeground(new Color(0,0,0));
                txtCancuoc.setText(tblStudents.getValueAt(row, 4).toString());
                txtCancuoc.setForeground(new Color(0,0,0));
                txtBang.setText(tblStudents.getValueAt(row, 5).toString());
                txtBang.setForeground(new Color(0,0,0));
                
                temp = txtName.getText();
            }
        }
    }//GEN-LAST:event_tblStudentsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPhonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhonenumberActionPerformed

    private void txtCancuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancuocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCancuocActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(ok == 1){
            String id = txtStudentId.getText();
            String name = txtName.getText();
            String address = txtAddress.getText();
            String phonenumber = txtPhonenumber.getText();
            String cancuoc = txtCancuoc.getText();
            String bang = txtBang.getText();
            if(name.equals("") || address.equals("")|| phonenumber.equals("") || bang.equals("") || cancuoc.equals("") ){
                JOptionPane.showMessageDialog(null, "Điền thiếu thông tin! Vui lòng nhập đầy đủ");
            }else
                try {
                    Connection con = ConnectionProvider.getConnection();
                    Statement st = con.createStatement();
                    st.executeUpdate("update thisinh set id = '"+id+"',name=N'"+name+"',Address=N'"+address+"',phone_number=N'"+phonenumber+"',cmnd=N'"+cancuoc+"',degree=N'"+bang+"'where id='"+id+"'");
                    JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                    setVisible(false);
                    new thisinh().setVisible(true);
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        else{
            String id = txtStudentId.getText();
            String name = txtName.getText();
            String address = txtAddress.getText();
            String phonenumber = txtPhonenumber.getText();
            String cancuoc = txtCancuoc.getText();
            String bang = txtBang.getText();
            String Status = "1";
            String BangId = "1";
            String CosoId = "1";
            String CathiId = "1";
             if(name.equals("") || address.equals("")|| phonenumber.equals("") || bang.equals("") || cancuoc.equals("")){
                JOptionPane.showMessageDialog(null, "Điền thiếu thông tin! Vui lòng nhập đầy đủ");
            }else
                try {
                    Connection con = ConnectionProvider.getConnection();
                    Statement st = con.createStatement();

                    String query = "INSERT INTO thisinh (id, name, address, phone_number, cmnd, degree, status, bang_id, coso_id, cathi_id) " +
                    "VALUES ('" + id + "', N'" + name + "', N'" + address + "', N'" + phonenumber + "', N'" + cancuoc + "', N'" + bang + "', '" + Status + "', '" + BangId + "', '" + CosoId + "', '" + CathiId + "')";

                    int rowsAffected=st.executeUpdate(query);                    
                    if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            setVisible(false);
            new thisinh().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Thêm không thành công");
        }
    } catch (SQLIntegrityConstraintViolationException e) {
        JOptionPane.showMessageDialog(null, "Đã tồn tại thí sinh này");
    } catch (SQLException e) {
        e.printStackTrace(); // Handle specific SQL exceptions here
        JOptionPane.showMessageDialog(null, "Lỗi khi thêm thí sinh");
    } catch (Exception e) {
        e.printStackTrace(); // Handle other exceptions appropriately
    }
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:     
    }//GEN-LAST:event_jPanel1ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select id,name,address,phone_number,cmnd,degree from thisinh where status = 1");
            tblStudents.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        TableColumnModel tcm = tblStudents.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(10);
        tcm.getColumn(1).setPreferredWidth(70);
        tcm.getColumn(2).setPreferredWidth(100);
        tcm.getColumn(3).setPreferredWidth(100);
        tcm.getColumn(4).setPreferredWidth(100);
        tcm.getColumn(5).setPreferredWidth(20);
    }//GEN-LAST:event_formComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(thisinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(thisinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(thisinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(thisinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new thisinh().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBang;
    private javax.swing.JTextField txtCancuoc;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhonenumber;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables
}
