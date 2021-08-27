package topic1;
import java.util.Scanner;
/**
 *
 * @author 323917
 */
public class Operations 
{
    public static void main(String[] args)
    {
        int num1, num2;
        int add, sub, multi, div, modulus;
          
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first number: ");
        num1 = scan.nextInt();
        System.out.println("What is your second number: ");
        num2 = scan.nextInt();
        
        add = num1 + num2;
        sub = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;
        modulus = num1 % num2;
      
        System.out.println("Thee addition of " + num1 + " and " + num2 + " = " + add);
        System.out.println("Thee difference  " + num1 + " and " + num2 + " = " + sub);
        System.out.println("Thee product of " + num1 + " and " + num2 + " = " + multi);
        System.out.println("Thee quotient of " + num1 + " and " + num2 + " = " + div);
        System.out.println("Thee remainder of " + num1 + " and " + num2 + " = " + modulus);
       
        //Casting
        System.out.println(1.0 / 3); //double/int gives double
        System.out.println(1 / 3.0); //int /double gives a double
        System.out.println(1 / 3); //int/int gives int
        System.out.println((double)(1/3)); //cast the quotient as a double
        System.out.println(((double)1/3)); //should act like (1.0 / 3)
        System.out.println(4.0/3);
        System.out.println(4/3); //returns an int
        System.out.println(4/3.0); //returns a double
        System.out.println((int)1.9999);
        
        //What is my maximum int?
        int largest = Integer.MAX_VALUE; //add 1 for over flow
        int smallest = Integer.MIN_VALUE;
        System.out.println("My largest int: " + largest);
        System.out.println("My smallest int: " + smallest);
        
        final int test = 10;
        System.out.println(test);
        //int test = 20; gives error because of final
        System.out.println(test);
    }
}
