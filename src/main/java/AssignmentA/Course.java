/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentA;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author jredd
 */
public class Course {
    private String course_name;
    private List<Module> modules = new ArrayList<Module>();
    private List<Student> students = new ArrayList<Student>();
    private DateTime start_date,end_date;
    
    // Course Constructor
    public Course(String course_name,DateTime start_date,DateTime end_date){
        this.course_name = course_name;
        this.start_date = start_date;
        this.end_date = end_date;
        
    }
    
    // Getters and Setters
    public String getCourse_name() {
        return course_name;
    }
    
    public DateTime getStart_date() {
        return start_date;
    }

    public void setStart_date(DateTime start_date) {
        this.start_date = start_date;
    }

    public DateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(DateTime end_date) {
        this.end_date = end_date;
    }
    
     public List<Module> getModules() {
        return modules;
    }
    
    // method for adding a module to an ArrayList
    public void addModule(Module mod){
        modules.add(mod);
    }
    
    // method for adding a Student to an ArrayList
    public void addStudent(Student stud){
        students.add(stud);
    }
    
    // toString method for course name wit start and end date of registration
    public String toString(){
        return course_name + "/n" + start_date + "/n" + end_date;
    }  
}
