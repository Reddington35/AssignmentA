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
public class Student {
    
    // member variables
    private String first_name,surname,username;
    private int age;
    private String dob;
    private int id;
    private List<Module> modules = new ArrayList<Module>();
    private Course course;
    
    // Student Constructor 
    public Student(String first_name,String surname,int age,String dob,int id){
        this.first_name = first_name;
        this.surname = surname;
        this.age = age;
        this.dob = dob;
        this.id = id;
    }
    
    // method used to concatenate surname with age
    public String getUsername(){
        username = surname + age;
        return username;
    }
    
    // Getters and Setters
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public List<Module> getModules() {
        return modules;
    }
    
    // Method for adding student to module using an ArrayList
    public void setModules(List<Module> modules) {
        
        for(Module mod: modules){
            mod.addStudent(this);
        }
        this.modules = modules;
    }
    
    public Course getCourse() {
        return course;
    }
    
    // Method for adding Student to Course
    public void setCourse(Course course) {
        this.course = course;
        this.course.addStudent(this);       
    }
    
    public String printDate(Course course){
       return course.getCourse_name() + " "
                + course.getStart_date().getDayOfMonth() 
                + "/" + course.getStart_date().getMonthOfYear() + "/" 
                + course.getStart_date().getYear() +  " to " 
                + course.getEnd_date().getDayOfMonth() 
                + "/" + course.getEnd_date().getMonthOfYear() + "/"
                + course.getEnd_date().getYear();
    }
    
    // Method for displaying Data for student registration system 
    public void displayStudent(){
        System.out.println("Student Name: " + first_name 
                + " " + surname + "\n"
                + "Username: " + getUsername() 
                + "\n" + "Age: " + age 
                + "\n" + "D.O.B: " + dob + "\n" 
                + "Student Number: "
                +id + "\n" + printDate(getCourse()) + "\n");          
    } 
}
