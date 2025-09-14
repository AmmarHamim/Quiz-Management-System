import Project.ConnectionProvider;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class QuizExamStudent extends javax.swing.JFrame {
    
     private Map<String, String> userAnswers = new HashMap<>();
      private Map<String, String> selectedAnswers = new HashMap<>();
public String questionId="1";
public String answer;
public int minute=0;
public int second=0;
public int marks=0;
//int totalQuestions = 0;
public void answerCheck(){
marks = 0; // Reset marks before checking all answers

//    try {
//        Connection con = ConnectionProvider.getCon();
//        Statement st = con.createStatement();
//
//        for (String qId : selectedAnswers.keySet()) {
//            ResultSet rs = st.executeQuery("SELECT * FROM question WHERE id='" + qId + "'");
//            if (rs.next()) {
//                String correctAnswer = rs.getString(7);
//                String userAnswer = selectedAnswers.get(qId);
//                if (userAnswer != null && userAnswer.equals(correctAnswer)) {
//                    marks++;
//                }
//            }
//            rs.close();
//        }
//
//        st.close();
//        con.close();
//    } catch (Exception e) {
//        JOptionPane.showMessageDialog(null, e);
//    }


    marks = 0;
    for (int i = 1; i <= totalQuestions; i++) {
        String qId = String.valueOf(i);
        String userAnswer = selectedAnswers.get(qId); // Tracked via a Map
        if (userAnswer != null && userAnswer.equals(getCorrectAnswer(qId))) {
            marks++;
        }
    }
}

private String getCorrectAnswer(String qId) {
    try {
        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT answer FROM question WHERE id='" + qId + "'");
        return rs.next() ? rs.getString(1) : "";
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        return "";
    }


}

private String getUserAnswerForQuestion(String questionId) {
    return userAnswers.getOrDefault(questionId, null);
}

int totalQuestions = 0;
public void question(){
try{
            Connection con =ConnectionProvider.getCon();
            Statement st= con.createStatement();
            
           if (totalQuestions == 0) {
            ResultSet rsCount = st.executeQuery("SELECT COUNT(*) FROM question");
            if (rsCount.next()) {
                totalQuestions = rsCount.getInt(1);
            }
        }
            
          ttlqq.setText(""+totalQuestions);
            ResultSet rs1= st.executeQuery("SELECT *FROM question where id='"+questionId+"'");
            while(rs1.next()){
            quesNo.setText(rs1.getString(1)); //18 question number
            demoo.setText(rs1.getString(2)); //20 question demo
            jRadioButton1.setText(rs1.getString(3));
            jRadioButton2.setText(rs1.getString(4));
            jRadioButton3.setText(rs1.getString(5));
            jRadioButton4.setText(rs1.getString(6));
            answer=rs1.getString(7);
            }
            
        String selectedAnswer = selectedAnswers.get(questionId);
        jRadioButton1.setSelected(jRadioButton1.getText().equals(selectedAnswer));
        jRadioButton2.setSelected(jRadioButton2.getText().equals(selectedAnswer));
        jRadioButton3.setSelected(jRadioButton3.getText().equals(selectedAnswer));
        jRadioButton4.setSelected(jRadioButton4.getText().equals(selectedAnswer));
//            ttlqq.setText(""+totalQuestions);
             int qId = Integer.parseInt(questionId);
    previous.setVisible(qId > 1);

    // Ensure Next button is visible unless it's the last question
    btnNext.setVisible(qId < totalQuestions);
            
            if (Integer.parseInt(questionId) >= totalQuestions) {
            btnNext.setVisible(false);
        } else {
            btnNext.setVisible(true);
        }
            
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        
        }

}

public void submit(){
//String rollNo=rroll.getText();
//answerCheck();
//try{
//           Connection con =ConnectionProvider.getCon();
//           Statement st= con.createStatement();
//           st.executeUpdate("update student set marks='"+marks+"'where rollNo='"+rollNo+"'");
//           String marks1=String.valueOf(marks);
//           setVisible(false);
//           new SuccessfullySubmited(marks1).setVisible(true);
//          
//}
//catch(Exception e){
//       JOptionPane.showMessageDialog(null,e);
//   }


String rollNo = rroll.getText();
answerCheck();
    try {
        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
        st.executeUpdate("UPDATE student SET marks='" + marks + "' WHERE rollNo='" + rollNo + "'");
        String marks1 = String.valueOf(marks);
        setVisible(false);
        new SuccessfullySubmited(marks1).setVisible(true);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }

}

    
    public QuizExamStudent() {
        initComponents();
    }
    
    Timer time;
    public QuizExamStudent(String rollNo) {
        initComponents();
        question();
        rroll.setText(rollNo);//jroll15
//        ttlqq.setText(""+totalQuestions);
        //for date
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date= new Date();
        datee.setText(dFormat.format(date));
        //1st question and student details
        try{
            Connection con =ConnectionProvider.getCon();
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("SELECT *FROM student where rollNo='"+rollNo+"'");
            while(rs.next()){
            namee.setText(rs.getString(2)); //name16
            
            }
            ResultSet rs1= st.executeQuery("SELECT *FROM question where id='"+questionId+"'");
            while(rs1.next()){
            quesNo.setText(rs1.getString(1)); //18 question number
            demoo.setText(rs1.getString(2)); //20 question demo
            jRadioButton1.setText(rs1.getString(3));
            jRadioButton2.setText(rs1.getString(4));
            jRadioButton3.setText(rs1.getString(5));
            jRadioButton4.setText(rs1.getString(6));
            answer=rs1.getString(7);
            }
            
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        
        }
        // for time
        setLocationRelativeTo(this);
        time=new Timer(1000,new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        secc.setText(String.valueOf(second));//7 sec
        minn.setText(String.valueOf(minute));//6 min
        
        if(second==60){
        second=0;
        minute++;
        if(minute==10){
        time.stop();
//        answerCheck();
        submit();
        }
        }
        second++;
        
        }
        
        });
        time.start();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        minn = new javax.swing.JLabel();
        secc = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        datee = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rroll = new javax.swing.JLabel();
        namee = new javax.swing.JLabel();
        ttlqq = new javax.swing.JLabel();
        quesNo = new javax.swing.JLabel();
        demoo = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index student.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 50)); // NOI18N
        jLabel2.setText("welcome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("Total Time:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText("10 minute");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setText("Taken Time:");

        minn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        minn.setForeground(new java.awt.Color(153, 0, 0));
        minn.setText("00");

        secc.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        secc.setForeground(new java.awt.Color(153, 0, 0));
        secc.setText("00");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setText("Date:");

        datee.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        datee.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 521, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datee, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(minn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(datee))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(minn)
                                    .addComponent(secc)))
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setText("Roll Number:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setText("Name:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setText("Total Question:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setText("Question Number:");

        rroll.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        rroll.setText("1995");

        namee.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        namee.setText("Tahrima Afrin");

        ttlqq.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ttlqq.setText("10");

        quesNo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        quesNo.setText("00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namee))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(rroll))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quesNo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ttlqq)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rroll))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(namee))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ttlqq))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(quesNo))
                .addContainerGap(382, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 660));

        demoo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        demoo.setText("Question Demo?");
        getContentPane().add(demoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 175, -1, -1));

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 240, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 316, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 391, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 461, -1, -1));

        btnNext.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Next.png"))); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 620, -1, -1));

        previous.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        previous.setText("Previous");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });
        getContentPane().add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages background student.jpg"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -40, 1400, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
//      answerCheck();

    int qId = Integer.parseInt(questionId);
    qId++;
    questionId = String.valueOf(qId);
    question();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        int a= JOptionPane.showConfirmDialog(null, "do you really want to Submit","select",JOptionPane.YES_NO_OPTION);
        if(a==0){
        answerCheck();
        submit();
       }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
//        if(jRadioButton1.isSelected()){
//        jRadioButton2.setSelected(false);
//        jRadioButton3.setSelected(false);
//        jRadioButton4.setSelected(false);
//        }

        if (jRadioButton1.isSelected()) {
        userAnswers.put(questionId, jRadioButton1.getText());
        selectedAnswers.put(questionId, jRadioButton1.getText());
        
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
    }
      
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
//     if(jRadioButton2.isSelected()){
//        jRadioButton1.setSelected(false);
//        jRadioButton3.setSelected(false);
//        jRadioButton4.setSelected(false);
//        }   

         if (jRadioButton2.isSelected()) {
        userAnswers.put(questionId, jRadioButton2.getText());
        selectedAnswers.put(questionId, jRadioButton2.getText());
        jRadioButton1.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        
    }

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
//      if(jRadioButton3.isSelected()){
//        jRadioButton1.setSelected(false);
//        jRadioButton2.setSelected(false);
//        jRadioButton4.setSelected(false);
//        }   

         if(jRadioButton3.isSelected()) {
        userAnswers.put(questionId, jRadioButton3.getText());
        selectedAnswers.put(questionId, jRadioButton3.getText());
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton4.setSelected(false);
        
    }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
//        if(jRadioButton4.isSelected()){
//        jRadioButton1.setSelected(false);
//        jRadioButton2.setSelected(false);
//        jRadioButton3.setSelected(false);
//        }  
           
         if (jRadioButton4.isSelected()) {
        userAnswers.put(questionId, jRadioButton4.getText());
        selectedAnswers.put(questionId, jRadioButton4.getText());
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
    }

    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        // TODO add your handling code here:
        
        // Ensure the questionId is not less than 1
     int qId = Integer.parseInt(questionId);

    if (qId > 1) {
        questionId = String.valueOf(qId - 1); // Move to the previous question
        question(); // Load previous question
    }

    // Show Previous button if not the first question
    previous.setVisible(qId > 1);

    // Ensure Next button is always visible when going back
    btnNext.setVisible(true);
    }//GEN-LAST:event_previousActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                question();
                new QuizExamStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel datee;
    private javax.swing.JLabel demoo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel minn;
    private javax.swing.JLabel namee;
    private javax.swing.JButton previous;
    private javax.swing.JLabel quesNo;
    private javax.swing.JLabel rroll;
    private javax.swing.JLabel secc;
    private javax.swing.JLabel ttlqq;
    // End of variables declaration//GEN-END:variables
}
