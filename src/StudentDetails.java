import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import Project.ConnectionProvider;
import java.awt.Color;
import javax.swing.JOptionPane;
public class StudentDetails extends javax.swing.JFrame {

    
    public StudentDetails() {
        initComponents();
        jTextArea1.setEditable(false);
        SimpleDateFormat dFormate=new SimpleDateFormat("dd-MM-yyyy");
        Date d=new Date();
        jLabelDate.setText(dFormate.format(d));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtRoll = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSchool = new javax.swing.JTextField();
        GenderCombobox = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index student.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 17, 72, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel2.setText("Fill Up the form");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 17, 363, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 72, 30));

        jLabelDate.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelDate.setText("jLabel4");
        getContentPane().add(jLabelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 150, 30));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, -1, -1));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 107, 64));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 1360, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setText("Roll Number:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 108, 162, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setText("Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 162, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setText("Gender:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 162, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setText("Contact Number:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setText("Email:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 162, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setText("Enter College/University");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, -1));

        txtRoll.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRollActionPerformed(evt);
            }
        });
        getContentPane().add(txtRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 105, 500, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 167, 500, -1));

        txtContactNumber.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 500, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 500, -1));

        txtSchool.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtSchool.setForeground(new java.awt.Color(153, 153, 153));
        txtSchool.setText("Enter University Name");
        txtSchool.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSchoolFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSchoolFocusLost(evt);
            }
        });
        txtSchool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSchoolActionPerformed(evt);
            }
        });
        getContentPane().add(txtSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 500, -1));

        GenderCombobox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        GenderCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        GenderCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderComboboxActionPerformed(evt);
            }
        });
        getContentPane().add(GenderCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 500, -1));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        btnSave.setText("Save & Next");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 602, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Examination Management System is managing all \nthe activities related to examination  management \nright from receipt of Enrollment Froms and \nExamination froms through the processing of \nresults and Certificates and Greading Reports\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 144, 530, 261));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages background student.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -52, 1980, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
     setVisible(false);
     new Index().setVisible(true);
     
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
     int a;  
        a = JOptionPane.showConfirmDialog(null,"Do you really want to Exit Application","Select",JOptionPane.YES_NO_OPTION);
         if (a == JOptionPane.YES_OPTION) {
        System.exit(0); 
      }   
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    String rollNo=txtRoll.getText();
    String name=txtName.getText();
    String gender=(String)GenderCombobox.getSelectedItem();
    String contactNo=txtContactNumber.getText();
    String email=txtEmail.getText();
    String CollegeName=txtSchool.getText();
    String marks="0";
    
    if (rollNo.isEmpty() || name.isEmpty() || contactNo.isEmpty() || email.isEmpty() || CollegeName.isEmpty()) {
    JOptionPane.showMessageDialog(this, "All fields must be filled!");
    return;
}
if (!email.contains("@") || !email.contains(".")) {
    JOptionPane.showMessageDialog(this, "Enter a valid email address!");
    return;
}

    
   try (Connection con = ConnectionProvider.getCon();
     PreparedStatement ps = con.prepareStatement("INSERT INTO student (RollNo, Name, Gender, ContactNo, Email, CollegeName, Marks) VALUES (?, ?, ?, ?, ?, ?, ?)")) {

    ps.setString(1, rollNo);
    ps.setString(2, name);
    ps.setString(3, gender);
    ps.setString(4, contactNo);
    ps.setString(5, email);
    ps.setString(6, CollegeName);
    ps.setString(7, marks);
    ps.executeUpdate();

    setVisible(false);
    new InstructionStudent(rollNo).setVisible(true);
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, e.getMessage());
}

    
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRollActionPerformed

    private void GenderComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderComboboxActionPerformed

    private void txtContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNumberActionPerformed

    private void txtSchoolFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSchoolFocusLost
        if(txtSchool.getText().equals("")){
            txtSchool.setText("Enter College/University Name");
            txtSchool.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_txtSchoolFocusLost

    private void txtSchoolFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSchoolFocusGained
        // TODO add your handling code here:
        if(txtSchool.getText().equals("Enter University Name")){
            txtSchool.setText("");
            txtSchool.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtSchoolFocusGained

    private void txtSchoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSchoolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSchoolActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> GenderCombobox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRoll;
    private javax.swing.JTextField txtSchool;
    // End of variables declaration//GEN-END:variables
}
