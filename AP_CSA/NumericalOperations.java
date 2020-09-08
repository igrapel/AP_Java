
package Mod1;
import java.util.Scanner;

public class Operations 
{
    public static void main(String[] args)
    {
        int num1, num2;
        int add, sub, mult, div, modulus;
        
        Scanner input1 = new Scanner(System.in);
        System.out.println("Give me number 1: ");
        num1 = input1.nextInt();
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Give me number 2: ");
        num2 = input2.nextInt();
        
        System.out.println("You chose numbers: " + 
                num1 + " and " + num2);
        
        add= num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        modulus = num1 % num2;
        
        System.out.println("Your sum is: " + add);
        System.out.println("Your difference is: " + sub );
        System.out.println("Your product is: " + mult );
        System.out.println("Your quotient is: " + div);
        System.out.println("Your remainder is: " + modulus);
        
        //fix the division error
        System.out.println("Fix the division error: " + 10/3);
        System.out.println("Fix the division error: " + 10.0/3);
        System.out.println("Fix the division error: " + 10/3.0);
        System.out.println("Fix the division error: " + (double)10/3);
        
        // casting double to an int
        System.out.println("Casting double to int " + (int)4.9999);
        
        double toRound = -4.9;
        //casting double to int with a mathematical round
        System.out.println("Fix the division error: " + (int)(toRound - .5));
    }
}
