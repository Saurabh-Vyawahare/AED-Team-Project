/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Directory;

import Model.Faculty;
import java.util.ArrayList;

/**
 *
 * @author Ritik
 */
public class FacultyDirectory {
    ArrayList<Faculty> Facultylist;

    public FacultyDirectory() {
        
        Facultylist = new ArrayList();

    }

    public ArrayList<Faculty> getFacultylist() {
        return Facultylist;
    }

    public void setFacultylist(ArrayList<Faculty> Facultylist) {
        this.Facultylist = Facultylist;
    }
    
     
    

    
    public Faculty AddUser() {
        Faculty facultyProfile = new Faculty();
        Facultylist.add(facultyProfile);
        return facultyProfile;
    }
}
