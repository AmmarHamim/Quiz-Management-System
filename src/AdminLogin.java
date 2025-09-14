import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class AdminLogin extends javax.swing.JFrame {

    
    public AdminLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnadminlogin = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 190, 95, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 280, -1, -1));

        txtuser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 230, 290, -1));

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 320, 290, -1));

        btnadminlogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnadminlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        btnadminlogin.setText("Login");
        btnadminlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnadminlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, -1, -1));

        btnback.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.png"))); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 440, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox1.setText("Show password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 370, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login Background.PNG"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnadminloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminloginActionPerformed
       if(txtuser.getText().equals("admin")&&jPasswordField1.getText().equals("123")){
          setVisible(false);
          new AdminHome().setVisible(true);
       }
       else{
       ImageIcon icon=new ImageIcon("Incorrect Password.png");
       JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size: 10px\">Incorrect<br>Username or Password</b></html>","Show",JOptionPane.INFORMATION_MESSAGE,icon);
       }
         
    }//GEN-LAST:event_btnadminloginActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       if (jCheckBox1.isSelected()) {
     jPasswordField1.setEchoChar((char) 0); 
     } 
    else {
     jPasswordField1.setEchoChar('*'); 
     }  
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        setVisible(false);
        new Index().setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadminlogin;
    private javax.swing.JButton btnback;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
