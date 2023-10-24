/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Directory.CourseRegistration;

import Model.Registration.StudentRegistration;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Vyawahare
 */
public class StudentCourseRegDirectory {
    
    ArrayList<StudentRegistration> studentCourseRegList;
    
    public StudentCourseRegDirectory(){
        
        studentCourseRegList = new ArrayList();
    }

    public ArrayList<StudentRegistration> getStudentCourseRegList() {
        return studentCourseRegList;
    }

    public void setStudentCourseRegList(ArrayList<StudentRegistration> studentCourseRegList) {
        this.studentCourseRegList = studentCourseRegList;
    }
    
    public StudentRegistration addStudentReg(){
        
        StudentRegistration StudentRegProfile = new StudentRegistration();
        studentCourseRegList.add(StudentRegProfile);
        return StudentRegProfile;
    }
    
}
