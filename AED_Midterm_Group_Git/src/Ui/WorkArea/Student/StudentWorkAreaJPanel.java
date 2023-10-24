/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.WorkArea.Student;

import Model.Directory.StudentDirectory;
import javax.swing.JPanel;
import Model.Registration.StudentRegistration;
import Model.Directory.CourseRegistration.StudentCourseRegDirectory;
import Ui.WorkArea.Student.CourseWork.StudentCourseWorkRegisterJPanel;
import Ui.WorkArea.Student.CourseWork.StudentCourseWorkViewJPanel;
import java.awt.CardLayout;

/**
 *
 * @author Saurabh Vyawahare
 */
public class StudentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentWorkAreaJPanel
     */
     private StudentDirectory studentList;
     private JPanel WorkArea;
     private StudentCourseRegDirectory studentCourseRegList;
    
     public StudentWorkAreaJPanel(JPanel WorkArea, StudentDirectory studentList, StudentCourseRegDirectory studentCourseRegList) {
        this.studentList = studentList;
        this.WorkArea = WorkArea;
        this.studentCourseRegList = studentCourseRegList;
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

        btnStudentCourseWork = new javax.swing.JButton();
        btnStudentManageProfile = new javax.swing.JButton();
        btnStudentGraduationAudit = new javax.swing.JButton();
        btnStudentRegistration = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnStudentTranscript = new javax.swing.JButton();

        btnStudentCourseWork.setBackground(new java.awt.Color(102, 153, 255));
        btnStudentCourseWork.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentCourseWork.setText("Course Work View");
        btnStudentCourseWork.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStudentCourseWork.setMaximumSize(new java.awt.Dimension(200, 40));
        btnStudentCourseWork.setMinimumSize(new java.awt.Dimension(20, 23));
        btnStudentCourseWork.setPreferredSize(new java.awt.Dimension(240, 30));
        btnStudentCourseWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentCourseWorkIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnStudentManageProfile.setBackground(new java.awt.Color(102, 153, 255));
        btnStudentManageProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentManageProfile.setText("Student Manage Profile");
        btnStudentManageProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStudentManageProfile.setMaximumSize(new java.awt.Dimension(200, 40));
        btnStudentManageProfile.setMinimumSize(new java.awt.Dimension(20, 20));
        btnStudentManageProfile.setPreferredSize(new java.awt.Dimension(240, 25));
        btnStudentManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentManageProfileActionPerformed(evt);
            }
        });

        btnStudentGraduationAudit.setBackground(new java.awt.Color(102, 153, 255));
        btnStudentGraduationAudit.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentGraduationAudit.setText("Graduation Audit");
        btnStudentGraduationAudit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStudentGraduationAudit.setMaximumSize(new java.awt.Dimension(200, 40));
        btnStudentGraduationAudit.setMinimumSize(new java.awt.Dimension(20, 20));
        btnStudentGraduationAudit.setPreferredSize(new java.awt.Dimension(240, 25));
        btnStudentGraduationAudit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentGraduationAuditActionPerformed(evt);
            }
        });

        btnStudentRegistration.setBackground(new java.awt.Color(102, 153, 255));
        btnStudentRegistration.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentRegistration.setText("Course Registration");
        btnStudentRegistration.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStudentRegistration.setMaximumSize(new java.awt.Dimension(200, 40));
        btnStudentRegistration.setMinimumSize(new java.awt.Dimension(20, 20));
        btnStudentRegistration.setPreferredSize(new java.awt.Dimension(240, 25));
        btnStudentRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentRegistrationActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setText("My Student Portal");

        btnStudentTranscript.setBackground(new java.awt.Color(102, 153, 255));
        btnStudentTranscript.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentTranscript.setText("Transcript");
        btnStudentTranscript.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStudentTranscript.setMaximumSize(new java.awt.Dimension(200, 40));
        btnStudentTranscript.setMinimumSize(new java.awt.Dimension(20, 20));
        btnStudentTranscript.setPreferredSize(new java.awt.Dimension(240, 25));
        btnStudentTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentTranscriptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnStudentTranscript, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnStudentCourseWork, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(btnStudentManageProfile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStudentRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStudentGraduationAudit, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTitle)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStudentCourseWork, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudentRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStudentManageProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudentGraduationAudit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnStudentTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentCourseWorkIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentCourseWorkIdentifyResourceAssetsActionPerformed

        // TODO add your handling code here:
        StudentCourseWorkViewJPanel studentCourseWorkViewPanel = new StudentCourseWorkViewJPanel(WorkArea, studentCourseRegList);
        WorkArea.add("StudentCourseWorkViewJPanel",studentCourseWorkViewPanel);
        CardLayout layout = (CardLayout) WorkArea.getLayout();
        layout.next(WorkArea);
        //        String customername = customerNameTextField.getText();
        //        if (customername.isEmpty()) return;
        //        CustomerProfile selectedcustomer = business.getCustomerDirectory().findCustomer(customername);

        //        ProcessOrder aos = new ProcessOrder(business, selectedcustomer ,salesperson, CardSequencePanel);

        //       CardSequencePanel.add("ManageVulns", aos);
        //       ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnStudentCourseWorkIdentifyResourceAssetsActionPerformed

    private void btnStudentManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentManageProfileActionPerformed
        // TODO add your handling code here:

        //        ManageVulns aos = new  ManageVulns(businessunit, CardSequencePanel);
        // aos.setAgenda(businessunit.getRiskManagementAgenda());
        //        CardSequencePanel.add("ManageVulns", aos);
        //((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnStudentManageProfileActionPerformed

    private void btnStudentGraduationAuditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentGraduationAuditActionPerformed
        // TODO add your handling code here:

        /*       ManageSalesPersonOrders iet = new ManageSalesPersonOrders(business, CardSequencePanel);

        CardSequencePanel.add("FindResourceAsset", iet);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        */
    }//GEN-LAST:event_btnStudentGraduationAuditActionPerformed

    private void btnStudentRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentRegistrationActionPerformed
      

        //CardSequencePanel.removeAll();
        //        ManageIncidents aos = new  ManageIncidents(businessunit, CardSequencePanel);
        // aos.setAgenda(businessunit.getRiskManagementAgenda());
        //        CardSequencePanel.add("RiskAgendaObjectives", aos);
        //((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        
        StudentCourseWorkRegisterJPanel studentCourseWorkRegPanel = new StudentCourseWorkRegisterJPanel(WorkArea, studentCourseRegList);
        WorkArea.add("StudentCourseWorkRegisterJPanel",studentCourseWorkRegPanel);
        CardLayout layout = (CardLayout) WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_btnStudentRegistrationActionPerformed

    private void btnStudentTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentTranscriptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentTranscriptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStudentCourseWork;
    private javax.swing.JButton btnStudentGraduationAudit;
    private javax.swing.JButton btnStudentManageProfile;
    private javax.swing.JButton btnStudentRegistration;
    private javax.swing.JButton btnStudentTranscript;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
