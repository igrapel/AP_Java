/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic6;


public class Student 
{
    String id;
    String course;
    double gpa;
    double[] grades;

    public Student(String id, String course, double[] g) {
        this.id = id;
        this.course = course;
        this.grades = g;
    }
    
    public void setGpa()
    {
        double sum = 0;
//        for(int i = 0; i < grades.length; i++)
//        {
//            sum += grades[i];
//        }
         for(double g : grades)
         {
             sum+= g;
         }
        
        this.gpa = sum / grades.length;
    }

    public String getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public double getGpa() {
        return gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    
}
