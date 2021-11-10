/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic6;


public class Group 
{
    private String[] courses = {"Biology", "Chemistry", "Physics"};
    public Student[] group;
    
    public Group(int num)
    {
        group = new Student[num];
    }
    
    public void fillGroup(int i, Student s)
    {
        group[i] = s;
    }
    
    /**
    Pre-condition: group.length > 0
    Post-condition: method returns reference to Student object with highest GPA. 
    */
    public Student topStudent()
    {
        double max = group[0].getGpa();
        Student maxStudent = group[0];
        for(int i = 1; i < group.length;i++)
        {
            if(group[i].getGpa()> max)
            {
                max = group[i].getGpa();
                maxStudent = group[i];
            }
        }
        return maxStudent;
    }
    
    public void removeLast()
    {
        int groupLength = group.length - 1;
        Student[] copy = new Student[group.length - 1];
        for(int i = 0 ; i < group.length - 1; i++)
        {
            copy[i] = group[i];
        }
        group = new Student[groupLength];
       group = copy;
//        for(int i = 0; i < groupLength; i++)
//        {
//            group[i] = copy[i];
//        }  
    }
    
    private void printArray()
    {
        for(int i = 0; i < group.length; i++)
        {
            System.out.println(group[i].getId());
        }
    }
    
    public boolean requiredCourses()
    {
        int counterB = 0;
        int counterC = 0;
        int counterP = 0;
        
        for(int i = 0; i < group.length; i++)
        {
            String c = group[i].getCourse();
            if(c.equals(courses[0]))
            {
                counterB++;
            }
            else if(c.equals(courses[1]))
            {
                counterC++;
            }
            else if(c.equals(courses[2]))
            {
                counterP++;
            }
            else{
                
            }
        }
        boolean allCourses = true;
        if(counterB==0)
        {
            System.out.println("You are missing a Biology student");
            allCourses = false;
        }
        if(counterC==0)
        {
            System.out.println("You are missing a Chemistry student");
            allCourses = false;
        }
        if(counterP==0)
        {
            System.out.println("You are missing a Physics student");
            allCourses = false;
        }
        return allCourses;
    }
    
    public static void main(String[] args)
    {
        Group g1 = new Group(3);
        double[] kateGrades = {3.2, 2.2, 1.2, 0.3};
        double[] bobGrades = {3.3, 2.3, 3.9, 4.0};
        double[] jayGrades = {2.2, 3.3, 3.4, 3.9};
        Student kate = new Student("1233", "Chemistry", kateGrades);
        Student bob = new Student("2009", "Chemistry", bobGrades);
        Student jay = new Student("3211", "Art History", jayGrades);
        g1.fillGroup(0, jay);
        g1.fillGroup(1, bob);
        g1.fillGroup(2, kate);
        
        System.out.println("Check group 1: ");
        System.out.println(g1.requiredCourses());
        
        System.out.println("Group 1, Top Student's ID: " + g1.topStudent().getId());
        
        Group g2 = new Group(3);
        Student kate2 = new Student("12233", "Chemistry", kateGrades);
        Student bob2 = new Student("22009", "Chemistry", bobGrades);
        Student jay2 = new Student("32311", "Art History", jayGrades);
        g2.fillGroup(0, jay2);
        g2.fillGroup(1, bob2);
        g2.fillGroup(2, kate2);
        
        Student g2Max = g2.topStudent();
        System.out.println("G2's Top student: " + g2Max.getId());
        
        g2Max.setGpa();
        System.out.print("Top GPA: " + g2Max.getGpa());
        g2.removeLast();
        g2.printArray();
        
        for(Student s : g1.group)
        {
            s.setGpa();
            System.out.println(s.getGpa());
        }
        
        for(Student s : g1.group)
        {
            System.out.println(s.getGpa());
        }
        
        double[] LeaGrades = {1.2, 2.0, 1.2, 3.1};
//won't change:        
//for(double g : LeaGrades)
//        {
//            g += .5;
//            System.out.println(g);
//        }
    for(int i = 0; i < 4; i++)
    {
    LeaGrades[i] += .5;    
    System.out.println(LeaGrades[i]);
    }
        System.out.println("Out of loop: ");
        for(double g : LeaGrades)
        {
            System.out.println(g);
        }
        System.out.println("Lea " + LeaGrades);
        boolean a = true;
        boolean b = false; 
        boolean c = false;
        boolean d = true;
        System.out.println("Test: " + (a && b || c || d));
    }
    
}
