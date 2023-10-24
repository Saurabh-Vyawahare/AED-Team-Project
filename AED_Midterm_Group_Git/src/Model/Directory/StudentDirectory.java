/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Directory;

import Model.Student;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Vyawahare
 */
public class StudentDirectory {
    
    ArrayList<Student> studentList;
    
    public StudentDirectory(){
        
        studentList = new ArrayList();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    public Student addStudent(){
        
        Student studentProfile = new Student();
        studentList.add(studentProfile);
        return studentProfile;
    }
}
