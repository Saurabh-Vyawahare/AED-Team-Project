/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.WorkArea.Student.CourseWork;

import Model.Directory.CourseRegistration.StudentCourseRegDirectory;
import Model.Registration.StudentRegistration;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Ui.WorkArea.Student.CourseWork.StudentCourseWorkTableViewJPanel;

/**
 *
 * @author Saurabh Vyawahare
 */
public class StudentCourseWorkViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentCourseWorkListJPanel
     */
    
    private JPanel WorkArea;
    private StudentCourseRegDirectory studentCourseRegList;

    public StudentCourseWorkViewJPanel(JPanel WorkArea, StudentCourseRegDirectory studentCourseRegList) {
        
        this.studentCourseRegList = studentCourseRegList;
        this.WorkArea = WorkArea;
        initComponents();
        
        populateTable();
        
    }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblCourse.getModel();
        dtm.setRowCount(0);
        
        for(StudentRegistration studentReg: studentCourseRegList.getStudentCourseRegList()){
            Object[] row = new Object[4];
            row[0] = studentReg;
            row[1] = studentReg.getjComboBoxCourse1();
            row[2] = studentReg.getjComboBoxCourse2();
            row[3] = studentReg.getjComboBoxSemester();
            
            dtm.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtStudentName = new javax.swing.JTextField();
        txtPendingCredits = new javax.swing.JTextField();
        lblPendingCredits = new javax.swing.JLabel();
        btnViewSemester = new javax.swing.JButton();
        txtProgram = new javax.swing.JTextField();
        lblProgram = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        lblStudentName = new javax.swing.JLabel();

        txtStudentName.setEnabled(false);

        lblPendingCredits.setText("Pending Credits");

        btnViewSemester.setText("View Semester");
        btnViewSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSemesterActionPerformed(evt);
            }
        });

        txtProgram.setEnabled(false);

        lblProgram.setText("Program");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitle.setText("Course View");

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Semester", "Course 1", "Course 2", "Total Credits"
            }
        ));
        jScrollPane1.setViewportView(tblCourse);

        lblStudentName.setText("Student Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProgram))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProgram)
                            .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPendingCredits)
                        .addGap(39, 39, 39)
                        .addComponent(txtPendingCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnViewSemester)))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentName)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProgram)
                    .addComponent(txtProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPendingCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPendingCredits)
                    .addComponent(btnViewSemester))
                .addContainerGap(213, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSemesterActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblCourse.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", WARNING_MESSAGE);
        }
        
        else{
            StudentRegistration studentReg = studentCourseRegList.getStudentCourseRegList().get(selectedRow);
            
            StudentCourseWorkTableViewJPanel studentCourseWorkTableViewPanel = new StudentCourseWorkTableViewJPanel(WorkArea, studentReg, studentCourseRegList);
            WorkArea.add("AdminViewJPanel", studentCourseWorkTableViewPanel);
            CardLayout layout = (CardLayout) WorkArea.getLayout();
            layout.next(WorkArea);
            
        }
    }//GEN-LAST:event_btnViewSemesterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewSemester;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPendingCredits;
    private javax.swing.JLabel lblProgram;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTextField txtPendingCredits;
    private javax.swing.JTextField txtProgram;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables
}