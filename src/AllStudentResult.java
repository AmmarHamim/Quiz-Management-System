import java.sql.*;
import Project.ConnectionProvider;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class AllStudentResult extends javax.swing.JFrame {

    
    public AllStudentResult() {
        initComponents();
        try{
        Connection con =ConnectionProvider.getCon();
            Statement st= con.createStatement();    
        
            ResultSet rs= st.executeQuery("SELECT *FROM student");
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        filter = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();
        print = new javax.swing.JButton();
        stat = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clearsheet = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(150, 183));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all student result.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 40)); // NOI18N
        jLabel2.setText("all student Result");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 12, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 890, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText("Filter Student By Marks");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        filter.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        filter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterKeyReleased(evt);
            }
        });
        getContentPane().add(filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 130, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 870, 370));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, 60));

        print.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        stat.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        stat.setText("Overall Statistics");
        stat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statActionPerformed(evt);
            }
        });
        getContentPane().add(stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, -1, -1));

        delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        clearsheet.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        clearsheet.setText("Clear Sheet");
        clearsheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearsheetActionPerformed(evt);
            }
        });
        getContentPane().add(clearsheet, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages background admin.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        AdminHome.open=0;
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void filterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterKeyReleased
        int marks=0;
        try {
        if (!filter.getText().trim().isEmpty()) {
            marks = Integer.parseInt(filter.getText().trim());
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
        return; // Stop execution if input is invalid
    }
        
        try{
        Connection con =ConnectionProvider.getCon();
//            Statement st= con.createStatement();

         String query = "SELECT * FROM student WHERE marks >= ?";
        
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, marks);
        
        ResultSet rs = pst.executeQuery();
        
//            ResultSet rs= st.executeQuery("SELECT *FROM student where marks is >="+marks+"");
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        }
        catch(Exception e){
        JFrame jf= new JFrame();
        jf.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(jf, e);
        
        }
    }//GEN-LAST:event_filterKeyReleased
       
    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        
        try {
        // Check if the table has data
        if (jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No data available to print!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create a PrinterJob instance
        PrinterJob printerJob = PrinterJob.getPrinterJob();

        // Set the printable content to the JTable
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return NO_SUCH_PAGE;
                }

                // Translate the graphics context to fit the page format
                Graphics2D g2d = (Graphics2D) graphics;
                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                
                
                 String currentDate = java.time.LocalDate.now().toString(); // Get current date (in yyyy-mm-dd format)
                g2d.setFont(new Font("Arial", Font.PLAIN, 12));
                g2d.drawString("Date: " + currentDate, 20, 20); // Position the date at coordinates (20, 20)

                

                // Print the table (replace 'reportTable' with your JTable variable name)
                jTable1.printAll(graphics);
                return PAGE_EXISTS;
            }
        });

        // Display the print dialog to the user
        if (printerJob.printDialog()) {
            // Print the table if the user confirms
            printerJob.print();
        } else {
            JOptionPane.showMessageDialog(this, "Printing cancelled.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (PrinterException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error while printing: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_printActionPerformed

    
    
    private void statActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statActionPerformed
         this.setVisible(false);
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    try {
        Connection con = ConnectionProvider.getCon();
        String query = "SELECT Name, Marks FROM student";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            String studentName = rs.getString("Name");
            int marks = rs.getInt("Marks");
            dataset.addValue(marks, "Marks", studentName);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error fetching data: " + e.getMessage(), 
            "Database Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Create Bar Chart
    JFreeChart barChart = ChartFactory.createBarChart(
        "Student Marks Overview",  // Chart title
        "Student Name",           // X-axis label
        "Marks",                  // Y-axis label
        dataset,                  // Dataset
        PlotOrientation.VERTICAL,
        true,                     // Show legend
        true,                     // Show tooltips
        false
    );

    // Customize chart appearance
    CategoryPlot plot = barChart.getCategoryPlot();
    plot.setBackgroundPaint(Color.WHITE);
    plot.setRangeGridlinePaint(Color.BLACK);
    
    // Customize bar color
    BarRenderer renderer = (BarRenderer) plot.getRenderer();
    Color barColor = new Color(79, 129, 189);  // Nice blue color

//Color barColor = new Color(79, 129, 189);


    renderer.setSeriesPaint(0, barColor);

    // Create and display chart in a new frame
    ChartPanel chartPanel = new ChartPanel(barChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
    
    JFrame chartFrame = new JFrame("Student Statistics");
    chartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    chartFrame.getContentPane().add(chartPanel);
    chartFrame.pack();
    chartFrame.setLocationRelativeTo(this);  // Center relative to main window
    
    
    chartFrame.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosed(java.awt.event.WindowEvent e) {
            // Make AllStudentResult frame visible again
            setVisible(true);
        }
    });
    
    chartFrame.setVisible(true);
    
        
        
    }//GEN-LAST:event_statActionPerformed

    private void clearsheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearsheetActionPerformed
        // TODO add your handling code here:
        
        // Ask for admin password before deleting
    String enteredPassword = JOptionPane.showInputDialog(this, "Enter admin password to clear the table:", "Authentication", JOptionPane.WARNING_MESSAGE);

    if (enteredPassword == null || !enteredPassword.equals("adminclear")) { // Change "admin123" to your actual password
        JOptionPane.showMessageDialog(this, "Incorrect password! Operation cancelled.", "Access Denied", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Confirm before deleting
    int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete ALL records?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
    if (confirmation != JOptionPane.YES_OPTION) {
        return;
    }

    // Database connection details
    String url = "jdbc:mysql://localhost:3306/qems";  
    String user = "root";  
    String password = "8118";  

    try {
        // Load MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Try-with-resources to auto-close connection
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            // Execute delete query
            String deleteSQL = "DELETE FROM student";  // Deletes all rows but keeps the table
            int rowsAffected = stmt.executeUpdate(deleteSQL);

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "All records deleted successfully!");

                // Clear JTable
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);  // Removes all rows from the table model
            } else {
                JOptionPane.showMessageDialog(this, "Table is already empty.", "No Data", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } catch (ClassNotFoundException e) {
        JOptionPane.showMessageDialog(this, "MySQL JDBC Driver not found!", "Driver Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error deleting records: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_clearsheetActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int selectedRow = jTable1.getSelectedRow();
    
    if (selectedRow == -1) {  // No row selected
        JOptionPane.showMessageDialog(this, "Please select a record to delete!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get RollNo from the selected row (assuming it's in the first column)
    String rollNo = jTable1.getValueAt(selectedRow, 0).toString();  

    // Confirmation dialog before deleting
    int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
    if (confirmation != JOptionPane.YES_OPTION) {
        return;
    }

    // Database connection details
    String url = "jdbc:mysql://localhost:3306/qems";  // Adjust database name if different
    String user = "root";  // Change according to your database user
    String password = "8118";  // Add password if applicable

    try {
        // Establish connection
        Connection con = DriverManager.getConnection(url, user, password);
        
        // Prepare delete query
        String sql = "DELETE FROM student WHERE RollNo = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, rollNo);

        // Execute the delete query
        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Record deleted successfully!");

            // Remove deleted row from JTable
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "No record found with RollNo: " + rollNo, "Not Found", JOptionPane.WARNING_MESSAGE);
        }

        // Close connections
        pst.close();
        con.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error deleting record: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_deleteActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllStudentResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton clearsheet;
    private javax.swing.JButton delete;
    private javax.swing.JTextField filter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton print;
    private javax.swing.JButton stat;
    // End of variables declaration//GEN-END:variables
}
