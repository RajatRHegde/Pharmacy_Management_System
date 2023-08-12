/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy;

import java.sql.*;
import javax.swing.*;
public class Login_cust extends javax.swing.JFrame {

    /**
     * Creates new form Login_cust
     */
    public Login_cust() {
        initComponents();
    }
    String Userid;
     void Login_cust()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","Raj2002");
            Statement St=Con.createStatement();
            ResultSet Rs=St.executeQuery("Select * from pharmadb.admintbl where AName='"+Username.getText()+"' and APassword='"+Password.getText()+"'");
            if(Rs.next())
            {
                if("ADMIN".equals(Rs.getString("ARole")))
                {
                    JOptionPane.showMessageDialog(this,"Invalid User name or Password");
                }
                else if("PHARMACIST".equals(Rs.getString("ARole")))
                {
                    JOptionPane.showMessageDialog(this,"Invalid User name or Password");
                }
                else if("CUSTOMER".equals(Rs.getString("ARole")))
                {
                    JOptionPane.showMessageDialog(this,"Welcome to CUSTOMER");
                        
                    Customer cs=new Customer();
                    Userid=Rs.getString("AId");
                    cs.CustId.setText(Userid);  
                    cs.CustName.setText(Username.getText().toString());
//                    cs.uid=Userid;
//                    cs.uname=Username.toString();
                    cs.setVisible(true);
                    
                    this.dispose();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Invalid User name or Password");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     //Login lg=new Login();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JButton();
        LoginBtn = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Customer_login = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Signup = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 3, 36)); // NOI18N
        jLabel1.setText("VRR PHARMACY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 330, 70));

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel2.setText("LOGIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 101, 45));
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 229, 35));

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel3.setText("User Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 135, 35));

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel4.setText("Password  :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, 35));

        ClearBtn.setBackground(new java.awt.Color(204, 255, 255));
        ClearBtn.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        ClearBtn.setText("CLEAR");
        ClearBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ClearBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        jPanel1.add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 120, 50));

        LoginBtn.setBackground(new java.awt.Color(204, 255, 255));
        LoginBtn.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        LoginBtn.setText("LOGIN");
        LoginBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBtnMouseClicked(evt);
            }
        });
        jPanel1.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 110, 50));

        exit.setFont(new java.awt.Font("Trajan Pro", 0, 36)); // NOI18N
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, -1, 60));

        jLabel6.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel6.setText("( CUSTOMER )");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 150, 30));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("TO LOGIN AS CUSTOMER");

        Customer_login.setBackground(new java.awt.Color(255, 255, 255));
        Customer_login.setFont(new java.awt.Font("Trajan Pro", 3, 20)); // NOI18N
        Customer_login.setForeground(new java.awt.Color(0, 153, 0));
        Customer_login.setText("( ADMIN / PHARMACIST )");
        Customer_login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Customer_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Customer_loginMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("CLICK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Customer_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Customer_login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 525, 550, 60));
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 230, 35));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("TO CREATE ACCOUNT");

        Signup.setFont(new java.awt.Font("Trajan Pro", 3, 20)); // NOI18N
        Signup.setForeground(new java.awt.Color(0, 153, 0));
        Signup.setText("SIGNUP");
        Signup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("CLICK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Signup)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 595, 390, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pharmacy-wallpaper-HD34.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1210, 760));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        Username.setText("");
        Password.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void LoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseClicked
        Login_cust();

    }//GEN-LAST:event_LoginBtnMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void Customer_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Customer_loginMouseClicked
        //lg.setVisible(true);
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Customer_loginMouseClicked

    private void SignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupMouseClicked
        new Signup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignupMouseClicked

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
            java.util.logging.Logger.getLogger(Login_cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_cust().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel Customer_login;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel Signup;
    public javax.swing.JTextField Username;
    private javax.swing.JLabel exit;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
