
package Mod10;

import java.util.Scanner;

public class  
{
    public static int iterationFactorial(int n)
    {
        int factorial = 1;
        for(int i = 1; i <= n; i++)
        {
            factorial = factorial * i;
        }
        return factorial;
    }
    
    public static int recursionFactorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else
        {
            return n*recursionFactorial(n-1);
        }
            
    }
    
    public static int iterationfibbonaci(int n)
    {
        int firstNum = 1;
        int secondNum = 1;
        int result = 0;
        if(n==1 || n ==2)
        {
            return 1;
        }
        else
        {
            for(int i = 3; i <=n; i++)
            {
            result = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = result;
            }  
        }
        return result;
    }
    
    public static int recursionfibbonaci(int n)
    {
        if(n==1)
        {
            return 1;
        }
        
        else if(n==2)
        {
            return 1;
        }
        
        else
        {
            return recursionfibbonaci(n-2) + recursionfibbonaci(n-1);
        }
        
    }
    
    public static void main(String[] args)
    {
        
    Scanner myFactObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter number for factorial: ");

    int input1 = myFactObj.nextInt();  // Read user input
        
    System.out.println("Iteration Answer : " + iterationFactorial(input1));
    System.out.println("Recursion Answer : " + recursionFactorial(input1));
    
    Scanner myFibObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the Fibonnaci term you want: ");
    int input2 = myFibObj.nextInt();
    
    System.out.println("Iteration Fibonacci Answer : " + iterationfibbonaci(input2));
    System.out.println("Recursion Answer : " + recursionfibbonaci(input2));
    }
    
}
