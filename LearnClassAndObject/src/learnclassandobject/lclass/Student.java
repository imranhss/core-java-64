/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnclassandobject.lclass;

/**
 *
 * @author Admin
 */
public class Student {
    
    String name; 
    String email;
    double marks;

    public Student() {
    }

    public Student(String name, String email, double marks) {
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public Student(String name) {
        this.name = name;
    }
    
    
    
    
    
    public String getResult(){
        if(marks>=33){
            return name+" Pass "+ marks;
        }
        else{
            return  name+" Fail "+ marks;
        }   
    
    }
    
    
    
    
//    public  void setMarks(){
//    
//    
//    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    
}
