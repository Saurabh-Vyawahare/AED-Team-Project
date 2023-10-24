/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.WorkArea.Student.CourseWork;

import Model.Directory.CourseRegistration.StudentCourseRegDirectory;
import javax.swing.JPanel;
import Model.Registration.StudentRegistration;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Saurabh Vyawahare
 */
public class StudentCourseWorkRegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentCourseWorkRegisterJPanel
     */
    private JPanel WorkArea;
    StudentCourseRegDirectory studentCourseRegList;

    public StudentCourseWorkRegisterJPanel(JPanel WorkArea, StudentCourseRegDirectory studentCourseRegList) {
        
        this.WorkArea = WorkArea;
        this.studentCourseRegList = studentCourseRegList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtProgram = new javax.swing.JTextField();
        lblCourse1 = new javax.swing.JLabel();
        ComCourse1 = new javax.swing.JComboBox<>();
        txtTotalCredits = new javax.swing.JTextField();
        ComCourse2 = new javax.swing.JComboBox<>();
        lblTotalCredits = new javax.swing.JLabel();
        lblCourse2 = new javax.swing.JLabel();
        txtTotalCourseCredits = new javax.swing.JTextField();
        lblSemester = new javax.swing.JLabel();
        lblTotalCourseCredits = new javax.swing.JLabel();
        ComSemester = new javax.swing.JComboBox<>();
        lblTotalCost = new javax.swing.JLabel();
        txtTotalCost = new javax.swing.JTextField();
        lblProgram = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblCourse1.setText("Course 1");

        ComCourse1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Application Modeling and Design", "Data Science Engineering Methods and Tools", "Web Design and User Experience Engineering", "Neural Modeling Methods and Tools","Program Structure and Algorithms","Business Analysis and Information Engineering","Web Development Tools and Methods","Software Quality Control and Management" }));
        ComCourse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComCourse1ActionPerformed(evt);
            }
        });

        ComCourse2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Application Modeling and Design", "Data Science Engineering Methods and Tools", "Web Design and User Experience Engineering", "Neural Modeling Methods and Tools","Program Structure and Algorithms","Business Analysis and Information Engineering","Web Development Tools and Methods","Software Quality Control and Management"}));
        ComCourse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComCourse2ActionPerformed(evt);
            }
        });

        lblTotalCredits.setText("Total Credits");

        lblCourse2.setText("Course 2");

        lblSemester.setText("Semester");

        lblTotalCourseCredits.setText("Total Course Credits");

        ComSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fall 1st Year", "Spring 1st Year", "Fall 2nd Year", "Spring 2nd Year" }));
        ComSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComSemesterActionPerformed(evt);
            }
        });

        lblTotalCost.setText("Total Cost");

        lblProgram.setText("Program");

        lblName.setText("Name");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitle.setText("Course Registration");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblSemester, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCourse2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblProgram)
                                            .addGap(102, 102, 102)
                                            .addComponent(txtProgram))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lblTotalCost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblTotalCredits)
                                                    .addGap(39, 39, 39))
                                                .addComponent(lblTotalCourseCredits, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(42, 42, 42)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtTotalCourseCredits)
                                                        .addComponent(txtTotalCost)
                                                        .addComponent(ComCourse2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ComSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtTotalCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ComCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblTitle)
                                    .addGap(67, 67, 67)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(btnSave)))))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSemester)
                    .addComponent(ComSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCourse1)
                    .addComponent(ComCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCourse2)
                    .addComponent(ComCourse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalCourseCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalCourseCredits))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalCost)
                    .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProgram)
                    .addComponent(txtProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalCredits)
                    .addComponent(txtTotalCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ComCourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComCourse1ActionPerformed
        String course1 = (String) ComCourse1.getSelectedItem();
    }//GEN-LAST:event_ComCourse1ActionPerformed

    private void ComCourse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComCourse2ActionPerformed
        String course2 = (String) ComCourse2.getSelectedItem();
    }//GEN-LAST:event_ComCourse2ActionPerformed

    private void ComSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComSemesterActionPerformed
        String semester = (String) ComSemester.getSelectedItem();
    }//GEN-LAST:event_ComSemesterActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String name = txtName.getText();
        int totalCredits = Integer.parseInt(txtTotalCredits.getText());
        int totalCourseCredits = Integer.parseInt(txtTotalCourseCredits.getText());
        int totalCost = Integer.parseInt(txtTotalCost.getText());
        String program = txtProgram.getText();
        
        String course1 = (String) ComCourse1.getSelectedItem();
        String course2 = (String) ComCourse2.getSelectedItem();
        String semester = (String) ComSemester.getSelectedItem();
        
        
        StudentRegistration studentCourseReg = studentCourseRegList.addStudentReg();
        studentCourseReg.setName(name);
        studentCourseReg.setProgram(program);
        studentCourseReg.setTotalCost(totalCost);
        studentCourseReg.setTotalCourseCredits(totalCourseCredits);
        studentCourseReg.setTotalCredits(totalCredits);
        studentCourseReg.setjComboBoxCourse1(ComCourse1);
        studentCourseReg.setjComboBoxCourse2(ComCourse2);
        studentCourseReg.setjComboBoxSemester(ComSemester);
        
        JOptionPane.showMessageDialog(null,"Course Work Registeration Successfully Completed.");
        
        txtName.setText("");
        txtProgram.setText("");
        txtTotalCost.setText("");
        txtTotalCourseCredits.setText("");
        txtTotalCredits.setText("");
        
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        WorkArea.remove(this);
        CardLayout layout = (CardLayout)WorkArea.getLayout();
        layout.previous(WorkArea);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComCourse1;
    private javax.swing.JComboBox<String> ComCourse2;
    private javax.swing.JComboBox<String> ComSemester;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblCourse1;
    private javax.swing.JLabel lblCourse2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProgram;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalCost;
    private javax.swing.JLabel lblTotalCourseCredits;
    private javax.swing.JLabel lblTotalCredits;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtProgram;
    private javax.swing.JTextField txtTotalCost;
    private javax.swing.JTextField txtTotalCourseCredits;
    private javax.swing.JTextField txtTotalCredits;
    // End of variables declaration//GEN-END:variables
}
