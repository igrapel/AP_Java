package variables;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Operations 
{
    public static void main(String[] args) { 
	 
		int num1, num2; 
		 
		int add, sub, multi, div, modulus; 
		Scanner scan = new Scanner (System.in); 
		System.out.print("What is the first number? "); 
		num1 = scan.nextInt(); 
		System.out.print("What is the second number? "); 
		num2 = scan.nextInt(); 
		 
		add = num1 + num2; 
		 
		sub = num1 - num2; 
		 
		multi = num1*num2; 
		 
		div = num1/num2; 
		 
		modulus = num1%num2; 
		 
		System.out.println("The addition of " + num1 + " and " + num2 + " is " + add); 
		 
		System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + sub); 
		 
		System.out.println("The multiplication of " + num1 + " and " + num2 + " is " +  
		 
		multi); 
		 
		System.out.println("The division of " + num1 + " and " + num2 + " is " + div); 
		 
		System.out.println("The modulus of " + num1 + " and " + num2 + " is " +  
		 
		modulus); 
                
                //with casting
                
                System.out.println(num1 / num2);
                System.out.println(1.0 / 3);
                System.out.println(1 / 3.0);
                System.out.println((double) 1 / 3);
 
                
                System.out.println(Integer.MIN_VALUE);
                System.out.println(Integer
                        .MAX_VALUE);
                System.out.println(Integer.MIN_VALUE - 1);
                System.out.println(Integer.MAX_VALUE + 1);
	} 
    
    
}
