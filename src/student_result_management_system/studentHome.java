/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_management_system;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author yasee
 */
public class studentHome extends javax.swing.JFrame {

    /**
     * Creates new form studentHome
     */
    public studentHome() {
        initComponents();
    }
    public studentHome(String branch, String rollno) {
        initComponents();
        jTextField3.setText(rollno);
        jTextField4.setText(branch);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        jLabel27.setText("jLabel27");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Course Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, 97, -1));

        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 58, 97, -1));

        jLabel3.setText("Roll Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 102, 97, -1));

        jLabel4.setText("Branch");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 15, 89, -1));

        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 58, 89, -1));

        jLabel6.setText("Father Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 102, 89, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 55, 126, -1));

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 12, 126, -1));

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 99, 126, -1));

        jTextField4.setEditable(false);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 12, 126, -1));

        jTextField5.setEditable(false);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 55, 126, -1));

        jTextField6.setEditable(false);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 99, 126, -1));

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Data Structure");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 47, 98, 24));

        jLabel8.setText("Algorithm");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 101, 98, 24));

        jLabel9.setText("DBMS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 152, 98, 24));

        jLabel10.setText("OS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 205, 98, 24));

        jLabel11.setText("CN");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 255, 98, 24));

        jLabel12.setText("Total Marks");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 19, 78, -1));

        jLabel13.setText("100");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 51, 78, -1));

        jLabel14.setText("100");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 105, 78, -1));

        jLabel15.setText("100");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 156, 78, -1));

        jLabel16.setText("100");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 209, 78, -1));

        jLabel17.setText("100");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 259, 78, -1));

        jLabel18.setText("Passing Marks");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 19, 108, -1));

        jLabel19.setText("33");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 105, 99, -1));

        jLabel20.setText("33");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 51, 99, -1));

        jLabel21.setText("33");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 156, 99, -1));

        jLabel22.setText("33");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 209, 99, -1));

        jLabel23.setText("33");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 259, 99, -1));

        jLabel24.setText("Marks Obtained");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 19, 96, -1));

        jTextField7.setEditable(false);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 48, 96, -1));

        jTextField8.setEditable(false);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 153, 96, -1));

        jTextField9.setEditable(false);
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 102, 96, -1));

        jTextField10.setEditable(false);
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 206, 96, -1));

        jTextField11.setEditable(false);
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 256, 96, -1));

        jLabel25.setText("Total Marks");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 300, 108, -1));

        jTextField12.setEditable(false);
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 297, 96, -1));

        jTextField13.setEditable(false);
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 325, 96, -1));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 318, 108, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/xyz.png"))); // NOI18N
        jLabel29.setText("jLabel29");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 151, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/xyz.png"))); // NOI18N
        jLabel26.setText("jLabel26");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try{
            String rollno = jTextField3.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srm","root","Yaseen@1999");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student inner join btech_cse where student.rollno='"+rollno+"' and btech_cse.rollno='"+rollno+"'");
            if(rs.next()){
                jTextField2.setText(rs.getString(2));
                jTextField1.setText(rs.getString(4));
//                jTextField4.setText(rs.getString(3));
                jTextField5.setText(rs.getString(5));
                jTextField6.setText(rs.getString(6));
                
                jTextField7.setText(rs.getString(8));
                jTextField9.setText(rs.getString(9));
                jTextField8.setText(rs.getString(10));//dbms
                jTextField10.setText(rs.getString(11));//os
                jTextField11.setText(rs.getString(12));//cn
                int s1 = Integer.parseInt(jTextField7.getText());
                int s2 = Integer.parseInt(jTextField9.getText());
                int s3 = Integer.parseInt(jTextField8.getText());
                int s5 = Integer.parseInt(jTextField10.getText());
                int s4 = Integer.parseInt(jTextField11.getText());
                int result = s1+s2+s3+s4+s5;
                int avg = result/5;
                jTextField12.setText(String.valueOf(result));
                if(avg > 33){
                    jTextField13.setText("PASS");
                }
                else
                    jTextField13.setText("FAIL");
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new studentAdminMain().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(studentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
