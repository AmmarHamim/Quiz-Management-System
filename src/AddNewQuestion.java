
import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddNewQuestion extends javax.swing.JFrame {

    
    public AddNewQuestion() {
        initComponents();
        try{
        Connection con=ConnectionProvider.getCon();
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery("select count(ID) from question");
        if(rs.next()){
        int id =rs.getInt(1);
        id=id+1;
        String str =String.valueOf(id);
        Idnumber.setText(str);
        }
        else{
        Idnumber.setText("1");
        }
        
        
        }
        catch(Exception e){
            
        JFrame jf=new JFrame();
       
         jf.setAlwaysOnTop(true); 
         JOptionPane.showMessageDialog(jf,e);
        }
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        Idnumber = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        qq = new javax.swing.JTextField();
        op1 = new javax.swing.JTextField();
        op2 = new javax.swing.JTextField();
        op3 = new javax.swing.JTextField();
        op4 = new javax.swing.JTextField();
        ans = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(150, 183));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 80, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new question.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 7, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ADD NEW QUESTION");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 30, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 1060, 9));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Question ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 100, -1, -1));

        Idnumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Idnumber.setForeground(new java.awt.Color(204, 0, 0));
        Idnumber.setText("00");
        getContentPane().add(Idnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 100, 54, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Question:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 146, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Option1:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 195, 85, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Option2:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 244, 85, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Option3:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 293, 85, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Option4:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 342, 85, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Answer:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 394, 85, -1));

        qq.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qqActionPerformed(evt);
            }
        });
        getContentPane().add(qq, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 143, 703, -1));

        op1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 192, 703, -1));

        op2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 241, 703, -1));

        op3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 290, 703, -1));

        op4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(op4, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 339, 703, -1));

        ans.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 391, 703, -1));

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));

        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 457, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages background admin.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 1060, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       AdminHome.open=0; 
       setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void qqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qqActionPerformed
        
    }//GEN-LAST:event_qqActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
    String id = Idnumber.getText();
    String name = qq.getText().trim();
    String opt1 = op1.getText().trim();
    String opt2 = op2.getText().trim();
    String opt3 = op3.getText().trim();
    String opt4 = op4.getText().trim();
    String answer = ans.getText().trim();

    // Check if any field is empty
    if (name.isEmpty() || opt1.isEmpty() || opt2.isEmpty() || opt3.isEmpty() || opt4.isEmpty() || answer.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields must be filled!", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (!(answer.equals(opt1) || answer.equals(opt2) || answer.equals(opt3) || answer.equals(opt4))) {
    JOptionPane.showMessageDialog(this, "Answer must match one of the options!", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}
    

    // Confirmation before saving
    int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to save this question?", 
                                                 "Confirm Save", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    
    if (response == JOptionPane.YES_OPTION) {
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("INSERT INTO question (ID, Name, Opt1, Opt2, Opt3, Opt4, Answer) VALUES (?, ?, ?, ?, ?, ?, ?)");
            
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, opt1);
            ps.setString(4, opt2);
            ps.setString(5, opt3);
            ps.setString(6, opt4);
            ps.setString(7, answer);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Question added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
            new AddNewQuestion().setVisible(true);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
      qq.setText("");
      op1.setText("");
      op2.setText("");
      op3.setText("");
      op4.setText("");
      ans.setText("");
      
    }//GEN-LAST:event_btnclearActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Idnumber;
    private javax.swing.JTextField ans;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField op1;
    private javax.swing.JTextField op2;
    private javax.swing.JTextField op3;
    private javax.swing.JTextField op4;
    private javax.swing.JTextField qq;
    // End of variables declaration//GEN-END:variables
}
