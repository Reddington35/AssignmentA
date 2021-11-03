/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentA;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jredd
 */
public class Module {
    
    private String mod_name,mod_id;
    private List<Student> students = new ArrayList<Student>();
    private List<Course> courses = new ArrayList<Course>();
    private List<Module> modules = new ArrayList<Module>();
    
    // Module Constructor
    public Module(String mod_name,String mod_id){
        this.mod_name = mod_name;
        this.mod_id = mod_id;
    }
    
    // Getters and Setters 
    public String getMod_name() {
        return mod_name;
    }

    public void setMod_name(String mod_name) {
        this.mod_name = mod_name;
    }

    public String getMod_id() {
        return mod_id;
    }

    public void setMod_id(String mod_id) {
        this.mod_id = mod_id;
    }
    
    // method for adding a student to an ArrayList
    public void addStudent(Student stud){
        students.add(stud);
    }
    
    // Method for looping through courses in an Arraylist 
    // while adding modules to course
    public void setCourse(List<Course> courses) {
        
        for(Course cor: courses){
            cor.addModule(this);
        }
        this.courses = courses;
    }
    
    // toString method for module name and module ID
    public String toString(){
        return mod_name + " " + mod_id + "\n";
    }
}
