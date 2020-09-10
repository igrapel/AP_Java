import java.util.Scanner;

public class Compounding 
{
   public static void main(String[] args)
    {
    int salary;
    
    Scanner input1 = new Scanner(System.in);
    System.out.println("What is base salary? ");
    salary = input1.nextInt();
        
    System.out.println("Your base salary is: " + salary);
      
    salary += 15000;
    System.out.println("Your salary with signing bonus is: " + salary);
    
    salary -= 10000;
    System.out.println("Your salary with signing bonus after donation is: " + salary);
    
    salary *= .80;
    System.out.println("Your salary with signing bonus after donation after taxes is: " 
                              + salary);
    
    salary /= 3;
    System.out.println("Each account will receive a deposit of:  " 
                              + salary);
    
    
    salary %= 10;
    System.out.println("The last digit of your deposit amount is: " + salary);
    
    
    
    }
}
