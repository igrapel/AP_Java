
package classes;

public class Student 
{
    String name;
    int age;
    boolean gender;
    
    String major;
    int gradYear;
    double gpa;
    
 public Student(String theName, boolean theGender, int theAge) 
 {
     name = theName;
     gender = theGender;
     age = theAge;
 }
 
 public Student(String theName, boolean theGender, int theAge, 
                      String theMajor, int theGradYear, double theGpa)
 {
     name = theName;
     gender = theGender;
     age = theAge;
     
     major = theMajor;
     gradYear = theGradYear;
     gpa = theGpa;
 }
    
 //accessor method
 public String getPersonalInfo()
 {
     return name + " " + gender + " " + age;
 }
 
 public void setGender(boolean gender)
 {
     this.gender = gender;
 }
    
 public static void main(String[] args)
 {
     Student joan = new Student("Joan", false, 17);
     System.out.println("Display: " + joan.getPersonalInfo());
     
     joan.setGender(true);
     System.out.println("Display: " + joan.getPersonalInfo());;
 }
      
}
