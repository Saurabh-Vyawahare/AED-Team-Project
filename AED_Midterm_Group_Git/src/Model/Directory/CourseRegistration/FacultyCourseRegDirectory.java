/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Directory.CourseRegistration;

import Model.Registration.StudentRegistration;
import java.util.ArrayList;
import Model.Registration.FacultyRegistration;

/**
 *
 * @author Saurabh Vyawahare
 */
public class FacultyCourseRegDirectory {
    
    ArrayList<FacultyRegistration> facultyCourseRegList;
    
    public FacultyCourseRegDirectory(){
        facultyCourseRegList = new ArrayList();
    }

    public ArrayList<FacultyRegistration> getFacultyCourseRegList() {
        return facultyCourseRegList;
    }

    public void setFacultyCourseRegList(ArrayList<FacultyRegistration> facultyCourseRegList) {
        this.facultyCourseRegList = facultyCourseRegList;
    }
    
    public FacultyRegistration addFacultyReg(){
        
        FacultyRegistration facultyRegProfile = new FacultyRegistration();
        facultyCourseRegList.add(facultyRegProfile);
        return facultyRegProfile;
    }
}
