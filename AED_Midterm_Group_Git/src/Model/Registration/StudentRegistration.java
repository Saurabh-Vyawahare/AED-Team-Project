/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Registration;

import javax.swing.JComboBox;

/**
 *
 * @author Saurabh Vyawahare
 */
public class StudentRegistration {
    
    String studentname;
    int totalCourseCredits;
    int totalCost;
    String Program;
    int totalCredits;
    
    private JComboBox<String> jComboBoxSemester;
    private JComboBox<String> jComboBoxCourse1;
    private JComboBox<String> jComboBoxCourse2;

    public String getName() {
        return studentname;
    }

    public void setName(String name) {
        this.studentname = name;
    }

    public int getTotalCourseCredits() {
        return totalCourseCredits;
    }

    public void setTotalCourseCredits(int totalCourseCredits) {
        this.totalCourseCredits = totalCourseCredits;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public JComboBox<String> getjComboBoxSemester() {
        return jComboBoxSemester;
    }

    public void setjComboBoxSemester(JComboBox<String> jComboBoxSemester) {
        this.jComboBoxSemester = jComboBoxSemester;
    }

    public JComboBox<String> getjComboBoxCourse1() {
        return jComboBoxCourse1;
    }

    public void setjComboBoxCourse1(JComboBox<String> jComboBoxCourse1) {
        this.jComboBoxCourse1 = jComboBoxCourse1;
    }

    public JComboBox<String> getjComboBoxCourse2() {
        return jComboBoxCourse2;
    }

    public void setjComboBoxCourse2(JComboBox<String> jComboBoxCourse2) {
        this.jComboBoxCourse2 = jComboBoxCourse2;
    }
    
    
}
