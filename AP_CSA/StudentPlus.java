
package Mod2;

public class Student 
{
// Attributes
    private String name;
    private double grade;
    private boolean behavior;
    
//no argument constructor    
public Student()
{
     
}

//parameterized constructor
public Student(String n, double g, boolean b)
{
    name = n;
    grade = g;
    behavior = b;
}

//overload constructor
public Student(String n, double g)
{
    name = n;
    grade=g; 
}

//methods
public void changeGrade(int g)
{
    grade = g;
}

//getter methods or accessor methods
public String getName()
{
    return name;
}
    
public double getGrade()
{
    return grade;
}

public boolean getBehavior()
{
    return behavior;
}

public void printOutStudent()
{
    System.out.println("Name: \t" + getName() + "\n " + "GPA:\t" + getGrade() 
                                 +      "\n"    + "Problem:" + getBehavior());
}

    
public static void main(String[] args)
{
    Student student1 = new Student("Aaron", 1.9, true);
    student1.printOutStudent();
    
    Student student2 = new Student("Daniel", 3.1, false);
    student2.printOutStudent();
    
    Student student3 = new Student();
    student3.printOutStudent();
    
    Student student4 = new Student("Brian", 3.0);
    student4.printOutStudent();
}
}
