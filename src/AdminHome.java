import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class AdminHome extends javax.swing.JFrame {
public static int open=0;
private JFrame currentWindow = null;
    public AdminHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        AddMenu = new javax.swing.JMenu();
        UpdateMenu = new javax.swing.JMenu();
        deleteMenue = new javax.swing.JMenu();
        AllStudentResultMenu = new javax.swing.JMenu();
        logoutMenu = new javax.swing.JMenu();
        ExitMenu = new javax.swing.JMenu();
        jMenuAllQuestion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, 1370, 770));

        AddMenu.setBackground(new java.awt.Color(204, 204, 255));
        AddMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Naivgation Bar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(51, 0, 153))); // NOI18N
        AddMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new question.png"))); // NOI18N
        AddMenu.setText("Add New Question");
        AddMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddMenu.setMargin(new java.awt.Insets(0, 5, 0, 30));
        AddMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(AddMenu);

        UpdateMenu.setBackground(new java.awt.Color(204, 204, 255));
        UpdateMenu.setBorder(null);
        UpdateMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update Question.png"))); // NOI18N
        UpdateMenu.setText("Update Question");
        UpdateMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateMenu.setMargin(new java.awt.Insets(0, 5, 0, 30));
        UpdateMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(UpdateMenu);

        deleteMenue.setBackground(new java.awt.Color(204, 204, 255));
        deleteMenue.setBorder(null);
        deleteMenue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete Question.png"))); // NOI18N
        deleteMenue.setText("Delete Question");
        deleteMenue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteMenue.setMargin(new java.awt.Insets(0, 5, 0, 30));
        deleteMenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMenueMouseClicked(evt);
            }
        });
        jMenuBar1.add(deleteMenue);

        AllStudentResultMenu.setBackground(new java.awt.Color(204, 204, 255));
        AllStudentResultMenu.setBorder(null);
        AllStudentResultMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all student result.png"))); // NOI18N
        AllStudentResultMenu.setText("All Student Result");
        AllStudentResultMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AllStudentResultMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllStudentResultMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(AllStudentResultMenu);

        logoutMenu.setBackground(new java.awt.Color(204, 204, 255));
        logoutMenu.setBorder(null);
        logoutMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout.png"))); // NOI18N
        logoutMenu.setText("Logout");
        logoutMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutMenu.setMargin(new java.awt.Insets(0, 5, 0, 30));
        logoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(logoutMenu);

        ExitMenu.setBackground(new java.awt.Color(204, 204, 255));
        ExitMenu.setBorder(null);
        ExitMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        ExitMenu.setText("Exit");
        ExitMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExitMenu.setMargin(new java.awt.Insets(0, 5, 0, 30));
        ExitMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(ExitMenu);

        jMenuAllQuestion.setBackground(new java.awt.Color(204, 204, 255));
        jMenuAllQuestion.setBorder(null);
        jMenuAllQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all questions.png"))); // NOI18N
        jMenuAllQuestion.setText("All Questions");
        jMenuAllQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuAllQuestion.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenuAllQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAllQuestionMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAllQuestion);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMenuMouseClicked
     JFrame f= new JFrame();
     f.setAlwaysOnTop(true);
     int a=JOptionPane.showConfirmDialog(f,"Do you really want to logout","Select",JOptionPane.YES_NO_OPTION);
     if(a==0){
     setVisible(false);
     new AdminLogin().setVisible(true);
     }
      
    }//GEN-LAST:event_logoutMenuMouseClicked

    private void ExitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMenuMouseClicked
       JFrame f= new JFrame();
     f.setAlwaysOnTop(true);
     int a=JOptionPane.showConfirmDialog(f,"Do you really want to exit","Select",JOptionPane.YES_NO_OPTION);
     if(a==0){
     System.exit(0);
     } 
    }//GEN-LAST:event_ExitMenuMouseClicked

    private void AddMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMenuMouseClicked
//        if(open==0){
//        new AddNewQuestion().setVisible(true);
//        open=1;
//        }
//        else{
//        JFrame jf= new JFrame();
//        jf.setAlwaysOnTop(true);
//        JOptionPane.showMessageDialog(jf, "One form is Already Open");
//        
//        
//        }
//this.dispose();
//new AddNewQuestion().setVisible(true);
 closePreviousWindow();
    currentWindow = new AddNewQuestion();
    currentWindow.setVisible(true);

    }//GEN-LAST:event_AddMenuMouseClicked

    private void UpdateMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMenuMouseClicked
//    if(open==0){
//        new UpdateQuestion().setVisible(true);
//        open=1;
//        }
//        else{
//        JFrame jf= new JFrame();
//        jf.setAlwaysOnTop(true);
//        JOptionPane.showMessageDialog(jf, "One form is Already Open");
//        
//        
//        }
//this.dispose();
//new UpdateQuestion().setVisible(true);

closePreviousWindow();
    currentWindow = new UpdateQuestion();
    currentWindow.setVisible(true);

    }//GEN-LAST:event_UpdateMenuMouseClicked

    private void jMenuAllQuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAllQuestionMouseClicked
//     if(open==0){
//        new AllQuestion().setVisible(true);
//        open=1;
//        }
//        else{
//        JFrame jf= new JFrame();
//        jf.setAlwaysOnTop(true);
//        JOptionPane.showMessageDialog(jf, "One form is Already Open");
//        
//        }
//this.dispose();
//new AllQuestion().setVisible(true);

 closePreviousWindow();
    currentWindow = new AllQuestion();
    currentWindow.setVisible(true);

    }//GEN-LAST:event_jMenuAllQuestionMouseClicked

    private void deleteMenueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMenueMouseClicked
//     if(open==0){
//        new DeleteQuestion().setVisible(true);
//        open=1;
//        }
//        else{
//        JFrame jf= new JFrame();
//        jf.setAlwaysOnTop(true);
//        JOptionPane.showMessageDialog(jf, "One form is Already Open");
//        
//        }  
//this.dispose();
// new DeleteQuestion().setVisible(true);
closePreviousWindow();
    currentWindow = new DeleteQuestion();
    currentWindow.setVisible(true);

    }//GEN-LAST:event_deleteMenueMouseClicked

    private void AllStudentResultMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllStudentResultMenuMouseClicked
//     if(open==0){
//        new AllStudentResult().setVisible(true);
//        open=1;
//        }
//        else{
//        JFrame jf= new JFrame();
//        jf.setAlwaysOnTop(true);
//        JOptionPane.showMessageDialog(jf, "One form is Already Open");
//        
//        } 
//this.dispose();
//new AllStudentResult().setVisible(true);

closePreviousWindow();
    currentWindow = new AllStudentResult();
    currentWindow.setVisible(true);

    }//GEN-LAST:event_AllStudentResultMenuMouseClicked

    private void closePreviousWindow() {
    if (currentWindow != null) {
        currentWindow.dispose(); // Close the previous window
    }
}
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AddMenu;
    private javax.swing.JMenu AllStudentResultMenu;
    private javax.swing.JMenu ExitMenu;
    private javax.swing.JMenu UpdateMenu;
    private javax.swing.JMenu deleteMenue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuAllQuestion;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu logoutMenu;
    // End of variables declaration//GEN-END:variables
}
