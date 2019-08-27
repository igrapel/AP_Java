
package classes;

public class Circle   //class declaration
{
    private double radius; //instance variable
    
    public Circle()  //no argument constructor
    {
        //the radius will be 0.0
    }
    
    public Circle(double rad) //parameterized constructor
    {
        radius = rad;
    }
    
    public double getRadius() //Accessor Method
    {
        return radius;
    }
    
    public void setRadius(double rad)   //mutator method
    {
        radius = rad;  //radius set
    }
    
    public double getArea()  //method to calculate area
    {
        return 3.14159 * radius * radius;   //compute area
    }
}
