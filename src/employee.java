
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class employee extends javax.swing.JFrame {

    /**
     * Creates new form Student
     */
    public employee() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                             EMPLOYEE ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 30, 500, 29);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 91, 100, 18);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Position ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 144, 82, 18);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Department ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 205, 111, 18);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(337, 110, 85, 18);

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Qualification ID:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(335, 190, 111, 18);

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Salary:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(337, 233, 85, 18);

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hire Date:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(335, 284, 85, 18);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Commission:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 264, 98, 18);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(139, 92, 178, 20);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(139, 145, 178, 20);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(139, 206, 178, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(466, 191, 231, 20);

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Date Of Birth:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 323, 99, 18);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(562, 410, 89, 32);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(466, 113, 231, 20);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(466, 234, 231, 20);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(139, 264, 178, 20);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(467, 410, 89, 32);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(466, 285, 231, 20);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(139, 324, 178, 20);

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(335, 323, 73, 18);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(466, 324, 231, 20);

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Last Name");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(337, 151, 85, 18);
        getContentPane().add(jTextField13);
        jTextField13.setBounds(466, 152, 231, 20);
        getContentPane().add(jTextField14);
        jTextField14.setBounds(140, 372, 177, 20);

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Dependent ID:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 371, 104, 18);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\SQL\\dbms project\\Screenshots\\2.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 770, 490);

        setBounds(0, 0, 788, 528);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String empid=jTextField1.getText();
        String fname=jTextField7.getText();
        String lname=jTextField13.getText();
        String posid=jTextField2.getText();
        String qualid=jTextField5.getText();
        String deptid=jTextField3.getText();
        
        String salary=jTextField8.getText();
        String comm=jTextField9.getText();
        String hiredate=jTextField10.getText();
        String dob=jTextField11.getText();
        String password=jTextField2.getText();
        String depid=jTextField14.getText();
       
        int empty=0,existing=0,existing2=0,existing3=0,existing4=0,existing5=0,existing6=0;
        if(empid.length()==0&&fname.length()==0&&lname.length()==0&&depid.length()==0&&posid.length()==0&&password.length()==0&&qualid.length()==0&&deptid.length()==0&&salary.length()==0&&comm.length()==0&&hiredate.length()==0&&dob.length()==0)
        {
            empty++;
        }
        try
        {
            Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","root");
            Statement myStat=myConn.createStatement();
            
            ResultSet myRs2=myStat.executeQuery("Select * from position1");
            
            while(myRs2.next())
            {
                if(myRs2.getString("PositionID").equals(posid))
                existing2++;
            }
            

        }
        catch(Exception e){
            e.printStackTrace();
        }
        try
        {
            Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","root");
            Statement myStat=myConn.createStatement();
            ResultSet myRs=myStat.executeQuery("Select * from employee");
            
            while(myRs.next())
            {
                if(myRs.getString("EmployeeID").equals(empid))
                existing++;
            }
            

        }
        catch(Exception e){
            e.printStackTrace();
        }
        try
        {
            Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","root");
            Statement myStat=myConn.createStatement();
            
            ResultSet myRs3=myStat.executeQuery("Select * from qualification");
            
            while(myRs3.next())
            {
                if(myRs3.getString("QualID").equals(qualid))
                existing3++;
            }
            

        }
        catch(Exception e){
            e.printStackTrace();
        }
        try
        {
            Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","root");
            Statement myStat=myConn.createStatement();
            
            ResultSet myRs4=myStat.executeQuery("Select * from department");
            
            while(myRs4.next())
            {
                if(myRs4.getString("DeptID").equals(deptid))
                existing4++;
            }
           

        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        try
        {
            Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","root");
            Statement myStat=myConn.createStatement();
            
            ResultSet myRs6=myStat.executeQuery("Select * from dependent");
            
            while(myRs6.next())
            {
                if(myRs6.getString("DependentID").equals(depid))
                existing6++;
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        if(empty==0){
            if(existing==0){
                if(existing2!=0){
                    if(existing3!=0){
                        if(existing4!=0){
                            
                                if(existing6!=0){
            try{

                Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","root");
                PreparedStatement myStat=myConn.prepareStatement("insert into employee values('"+empid+"','"+lname+"','"+fname+"','"+posid+"','"+qualid+"','"+deptid+"','"+salary+"','"+comm+"','"+hiredate+"','"+dob+"','"+depid+"')");
                PreparedStatement myStat2=myConn.prepareStatement("insert into empvalid values('"+empid+"','"+password+"')");
                myStat.executeUpdate();
                myStat2.executeUpdate();
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
                jTextField1.setText("");jTextField11.setText("");
                jTextField2.setText("");jTextField7.setText("");
                jTextField3.setText("");jTextField8.setText("");
               jTextField9.setText("");
                jTextField5.setText("");jTextField10.setText("");
                jTextField14.setText("");jTextField13.setText("");
            }
            catch(Exception e){
                e.printStackTrace();
            }
                            }
                                else{
                                    JOptionPane.showMessageDialog(null,"Enter a valid Dependent ID");
                                }
                        
                    }  
                        else{
                            JOptionPane.showMessageDialog(null,"Enter a valid Department ID");
                        }
                }
                    else{
                        JOptionPane.showMessageDialog(null,"Enter a valid Qualification ID");
                    }
            }
                else{
                    JOptionPane.showMessageDialog(null,"Enter a valid Position ID");
                }
             }

            else{
                JOptionPane.showMessageDialog(null,"INVALID! Employee Already Exists!");
                jTextField1.setText("");jTextField11.setText("");
                jTextField2.setText("");jTextField7.setText("");
                jTextField3.setText("");jTextField8.setText("");
                jTextField9.setText("");
                jTextField5.setText("");jTextField10.setText("");
                jTextField14.setText("");jTextField13.setText("");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Enter all the credentials");
        }           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        mainpage obj=new mainpage();
        obj.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
