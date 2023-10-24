/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.WorkArea.Student.CourseWork;

/**
 *
 * @author Saurabh Vyawahare
 */
public class StudentCourseWorkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentCourseWorkJPanel
     */
    public StudentCourseWorkJPanel() {
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

        btnCourseRegistration = new javax.swing.JButton();
        btnCourseView = new javax.swing.JButton();
        btnSearchCourse = new javax.swing.JButton();

        btnCourseRegistration.setText("Course Registration");

        btnCourseView.setText("Course View");
        btnCourseView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseViewActionPerformed(evt);
            }
        });

        btnSearchCourse.setText("Course Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCourseRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCourseView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(603, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnCourseRegistration)
                .addGap(37, 37, 37)
                .addComponent(btnCourseView)
                .addGap(40, 40, 40)
                .addComponent(btnSearchCourse)
                .addContainerGap(362, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCourseViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCourseViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourseRegistration;
    private javax.swing.JButton btnCourseView;
    private javax.swing.JButton btnSearchCourse;
    // End of variables declaration//GEN-END:variables
}
