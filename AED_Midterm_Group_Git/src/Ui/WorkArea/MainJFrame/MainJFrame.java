/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ui.WorkArea.MainJFrame;

import Model.Directory.StudentDirectory;
import Ui.WorkArea.Student.Registration.StudentRegistrationJPanel;
import Model.Directory.FacultyDirectory;
import Model.Directory.CourseRegistration.StudentCourseRegDirectory;
import Model.Directory.CourseRegistration.FacultyCourseRegDirectory;
import Model.Registration.FacultyRegistration;
import Model.Registration.StudentRegistration;
import Model.Faculty;
import Model.Student;
import Ui.WorkArea.Faculty.Registration.FacultyRegistrationJPanel;
import Ui.WorkArea.FacultyWorkArea.FacultyWorkAreaJPanel;
import java.awt.CardLayout;

import Ui.WorkArea.Student.Registration.StudentRegistrationJPanel;
import Ui.WorkArea.Student.StudentWorkAreaJPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author Saurabh Vyawahare
 */
public class MainJFrame extends javax.swing.JFrame {
    String storedPassword;
    private StudentDirectory studentList;


    /**
     * Creates new form MainJFrame
     */
    private FacultyDirectory facultyDirectory;
    private StudentCourseRegDirectory studentCourseRegList;
    private FacultyCourseRegDirectory facultyCourseRegList;
    Student student;
    public MainJFrame() {
        this.facultyDirectory = new FacultyDirectory();
        this.studentList = new StudentDirectory();
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

        SplitPane = new javax.swing.JSplitPane();
        ControlPanel = new javax.swing.JPanel();
        lblLoginID = new javax.swing.JLabel();
        txtLoginID = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnStudentRegistration = new javax.swing.JButton();
        btnProfessorRegistration = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        WorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setDividerLocation(150);

        ControlPanel.setBackground(new java.awt.Color(197, 212, 230));

        lblLoginID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginID.setText("Login ID:");

        lblPassword.setText("Password:");

        btnStudentRegistration.setText("Student Registration");
        btnStudentRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentRegistrationActionPerformed(evt);
            }
        });

        btnProfessorRegistration.setText("Professor Registration");
        btnProfessorRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfessorRegistrationActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLoginID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLoginID)
                            .addComponent(txtPassword))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblPassword)
                        .addGap(47, 47, 47))))
            .addComponent(btnProfessorRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE)
            .addComponent(btnStudentRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnLogin)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblLoginID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLoginID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(btnStudentRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProfessorRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        SplitPane.setLeftComponent(ControlPanel);

        WorkArea.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentRegistrationActionPerformed
           StudentRegistrationJPanel userpanel = new StudentRegistrationJPanel(WorkArea,studentList);
           WorkArea.add("StudentRegistrationJPanel",userpanel);
           CardLayout layout = (CardLayout) WorkArea.getLayout();
           layout.next(WorkArea);
    }//GEN-LAST:event_btnStudentRegistrationActionPerformed

    private void btnProfessorRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfessorRegistrationActionPerformed
        // TODO add your handling code here:
           FacultyRegistrationJPanel panel  = new FacultyRegistrationJPanel(WorkArea, facultyDirectory);
           WorkArea.add("FacultyRegistrationJPanel",panel);
           CardLayout layout = (CardLayout)WorkArea.getLayout();
           layout.next(WorkArea);       
    }//GEN-LAST:event_btnProfessorRegistrationActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtLoginID.getText();
        String password = txtPassword.getText();
        System.out.println(password);
        Faculty findfaculty = findFaculty(username) ; 
        
        Student findstudent = findStudent(username);
        
        System.out.println(findfaculty);
        
        
            if(findfaculty != null ){
                if(password.equals(storedPassword) ){
                
                    FacultyWorkAreaJPanel userpanel = new FacultyWorkAreaJPanel(WorkArea,facultyDirectory);
                    WorkArea.add("FacultyWorkAreaJPanel",userpanel);
                    CardLayout layout = (CardLayout) WorkArea.getLayout();
                    layout.next(WorkArea);
                    
                    
                    txtLoginID.setText("");
                    txtPassword.setText("");
                    
                    
                }
                else
                    JOptionPane.showMessageDialog(this,"Invalid Password");
            }
            
            else if (findstudent != null) {
        // Validate student's password
        if (password.equals(findstudent.getPassword())) {
            // Student login logic here
            // For example, create a StudentWorkAreaJPanel
            StudentWorkAreaJPanel userpanel = new StudentWorkAreaJPanel(WorkArea, studentList, studentCourseRegList);
            WorkArea.add("StudentWorkAreaJPanel", userpanel);
            CardLayout layout = (CardLayout) WorkArea.getLayout();
            layout.next(WorkArea);

            txtLoginID.setText("");
            txtPassword.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Password");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Invalid UserName/EmailID");
    }
              
                 
            
            
            /*else if (findstudent!= null && findfaculty == null){
                     
                    StudentWorkAreaJPanel userpanel = new StudentWorkAreaJPanel(WorkArea,studentList);
                     WorkArea.add("StudentWorkAreaJPanel",userpanel);
                     CardLayout layout = (CardLayout) WorkArea.getLayout();
                     layout.next(WorkArea);
                
                
        
            
            
            
            
        }*/
            
    }//GEN-LAST:event_btnLoginActionPerformed
     
    
    
    
    public Faculty findFaculty(String username) {
    for (Faculty pro : facultyDirectory.getFacultylist()) {
        if (pro.getUsername().equals(username)) {
            storedPassword = pro.getPassword();
            return pro;
        }
    }
    return null;
}   
    
    //Value coming null from this function whereas it should be returing the student value
    
    public Student findStudent(String username) {
    for (Student stu : studentList.getStudentList()) {
        if (stu.getLoginid().equals(username)) {
            storedPassword = stu.getPassword();
        System.out.println("LoginID for findStudent "+stu.getLoginid());
            return stu;
        }
    }
    return null;
}  
    
    
    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnProfessorRegistration;
    private javax.swing.JButton btnStudentRegistration;
    private javax.swing.JLabel lblLoginID;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtLoginID;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}