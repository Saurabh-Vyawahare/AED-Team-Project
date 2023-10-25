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
    String course1;
    String course2;
    String semester;
    
    public String getCourse1() {
        return course1;
    }

    public void setCourse1(String course1) {
        this.course1 = course1;
    }

    public String getCourse2() {
        return course2;
    }

    public void setCourse2(String course2) {
        this.course2 = course2;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    

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

}
