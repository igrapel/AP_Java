package Topic_2;
import java.lang.*; 

public class Point 
{
  private double x;
  private double y;
  
  public Point(double par_x, double par_y)
  {
      x = par_x;
      y = par_y;
  }
  
  public double getX()
  {
      return x;
  }
    
  public double getY()
  {
      return y;
  }
  
  public double getSlope(Point p)
  {
      // delt_Y / delt_x
      return (y - p.getY()) / (x-p.getX()); 
  }
  
  public double getDistance(Point p)
  {
      // sqrt(deltX^2 +deltY^2)
      double delt_X = x - p.getX();
      double delt_Y = y - p.getY();
      double delt_x_squared = Math.pow(delt_X, 2);
      double delt_y_squared = Math.pow(delt_Y, 2);
      return Math.sqrt(delt_x_squared + delt_y_squared);
  }
  
   public static void main(String[] args)
    {
     /**
      * Create two points. Check the slope between
      */
       Scanner input1 = new Scanner(System.in);
       System.out.println("Give me x1: ");
       double x1 = input1.nextDouble();
       
       Scanner input2 = new Scanner(System.in);
       System.out.println("Give me y1: ");
       double y1 = input2.nextDouble();
        
       Point p1 = new Point(0,0);
       Point p2 = new Point(x1, y1);
        
       System.out.println("The slope from your point to x1, y1: " + p1.getSlope(p2));
        
       System.out.println("The slope from your point to x2, y2: " + p1.getSlope(new Point(4,3)));
        
        
       /**
        * Calculating distance
        */
       
       System.out.println("The distance from your point to x1, y1: " + p1.getDistance(p2));
        
       System.out.println("The distance from your point to x2, y2: " + p1.getDistance(new Point(4, 6)));
       
       //Random numbers
       
       double myRand = (int) (Math.random()*-100-100) ;
        
       System.out.println("A random number between 0 and 6: " + myRand);
       
    }
    
}
