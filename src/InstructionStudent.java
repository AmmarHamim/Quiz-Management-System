import javax.swing.JOptionPane;

public class InstructionStudent extends javax.swing.JFrame {
public String rollNo;
    
    public InstructionStudent() {
        initComponents();
    }
     public InstructionStudent(String rollNo1) {
        initComponents();
        jTextArea1.setEditable(false);
        rollNo=rollNo1;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnStartExam = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index student.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel2.setText("Instruction");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 12, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 1066, 10));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("During the exam:\n\n1.The student may not use his or her textbook, course notes or recieve help from\n   a proctor or any outside source.\n\n2. Student must complete the exam within 10 minutes. \n\n3. Student must not stop the session and then return to it. this is specially important\n    in the online environment where the system will \"time out\" and not allow the student\n    or you to re-enter the exam.\n\n     Exam Duration:10 minute\n     All the Best !");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 1060, 541));

        btnStartExam.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnStartExam.setText("START QUIZ/EXAM");
        btnStartExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartExamActionPerformed(evt);
            }
        });
        getContentPane().add(btnStartExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 673, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages background student.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartExamActionPerformed

        setVisible(false);
        new QuizExamStudent(rollNo).setVisible(true);
    }//GEN-LAST:event_btnStartExamActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructionStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStartExam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
