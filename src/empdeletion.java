
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akhilesh Mosale
 */
public class empdeletion extends javax.swing.JFrame {

    /**
     * Creates new form empdeletion
     */
    public empdeletion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("EMPLOYEE DELETION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(154, 11, 263, 29);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("EMPLOYEE ID ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(92, 84, 113, 18);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(209, 85, 194, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("YES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(175, 421, 67, 31);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("NO");
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 421, 61, 31);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("BACK");
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 0, 81, 31);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Verify");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(413, 77, 85, 31);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(75, 126, 423, 249);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Are you sure that you want to Delete this record ?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(92, 381, 387, 22);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\SQL\\dbms project\\Screenshots\\6.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 580, 500);

        setBounds(0, 0, 590, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String number=jTextField1.getText();
        int existing=0;
        try
        {
            Connection myConn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","root");
            Statement myStat=(Statement) myConn.createStatement();
            ResultSet myRs=myStat.executeQuery("Select * from employee");
            while(myRs.next())
            {
                if(myRs.getString("EmployeeID").equals(number))
                existing++;
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        if(existing==0)
            JOptionPane.showMessageDialog(null,"Number not found");
        else
        {
            jTextArea1.setEnabled(true);
            jLabel1.setEnabled(true);
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            jTextField1.setEnabled(false);
            jButton3.setEnabled(false);
            jLabel1.setEnabled(true);

            try
            {
                Connection myConn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","root");
                Statement myStat=(Statement) myConn.createStatement();
                ResultSet myRs=myStat.executeQuery("Select * from employee where EmployeeID='"+number+"'");
                while(myRs.next())
                {
                    jTextArea2.append("Employee ID:  " + myRs.getString("EmployeeID") + "\nLast Name:  " + myRs.getString("Lname") + "\nFirst Name:  " + myRs.getString("Fname") + "\nPosition ID:  " + myRs.getString("PositionID") + "\nQualification ID:  " + myRs.getString("QualID") + "\nDepartment ID:  " + myRs.getString("DeptID") + "\nSalary:  " + myRs.getString("Salary") + "\nCommission:  " + myRs.getString("Commission") + "\nHire Date:  " + myRs.getString("HireDate") + "\nBirth Date:  " + myRs.getString("BirthDate"));
                }

            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String number2=jTextField1.getText();
        try
            {
                java.sql.Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","root");
                java.sql.Statement myStat=myConn.createStatement();
                PreparedStatement pst=myConn.prepareStatement("delete from employee where EmployeeID='"+number2+"'");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Deleted record Successfully");

            }
            catch(Exception e){
                e.printStackTrace();
            }                            // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(empdeletion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empdeletion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empdeletion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empdeletion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empdeletion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}