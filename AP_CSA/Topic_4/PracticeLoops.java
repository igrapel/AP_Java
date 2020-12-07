/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceloops;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author mtsguest
 */
public class PracticeLoops {

    /**
     * @param args the command line arguments
     */
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
       
      //practiceWhileLoop();
     practiceDoWhileLoop();
     //   practiceForLoop();
        //  practiceCountingBy2();
              
    }
    
    
    public static void practiceWhileLoop()
    {
        String userAnswer;
        int counter = 0;
        double average;
        double total = 0;
        double eachGrade;
        
        System.out.println("Do you have any grades to enter? ");
        userAnswer = keyboard.nextLine();
        
        while (userAnswer.equalsIgnoreCase("yes"))
        {
            System.out.println("What is the grade? ");
            eachGrade = keyboard.nextDouble();
            keyboard.nextLine();
            total = total + eachGrade;
            counter++;
            
            
            System.out.println("Do you have any more grades to enter? ");
            userAnswer = keyboard.nextLine();
        }
        
        if (counter == 0)
        {
            average = 0;
        }
        else
        {
             average = total / counter;
        }
       
        System.out.println("The total grades is " + total + " and the average for " + counter + " grades is " + average);
                
        
        
        
        
        
        
        
        
        
    }
    
    public static void practiceDoWhileLoop()
    {
        
        String userAnswer;
        int counter = 0;
        double average;
        double total = 0;
        double eachGrade;
        
//        System.out.println("Do you have any grades to enter? ");
//        userAnswer = keyboard.nextLine();
        
        do
        {
            System.out.println("What is the grade? ");
            eachGrade = keyboard.nextDouble();
            keyboard.nextLine();
            total = total + eachGrade;
            counter++;
            
            
            System.out.println("Do you have any more grades to enter? ");
            userAnswer = keyboard.nextLine();
            
        }  while (userAnswer.equalsIgnoreCase("yes"));
        
       
        
        average = total / counter;
        
        DecimalFormat df = new DecimalFormat("##0.00");
       
        System.out.println("The total grades is " + total + " and the average for " + counter + " grades is " + df.format(average));
                
        
        
    }
    
    public static void practiceForLoop()
    {
               
        int userAnswer;
       
        double average;
        double total = 0;
        double eachGrade;
        
        System.out.println("How many grades do you wish to enter? ");
        userAnswer = keyboard.nextInt();
        keyboard.nextLine();
        
        for (int i = 0; i < userAnswer; i++)
        {
            System.out.println("What is the grade? ");
            eachGrade = keyboard.nextDouble();
            keyboard.nextLine();
            total = total + eachGrade;
                      
        }  
        
       
        if (userAnswer > 0)
        {
             average = total / userAnswer;
        }
        else
        {
            average = 0;
        }
           
        
        DecimalFormat df = new DecimalFormat("##0.00");
       
        System.out.println("The total grades is " + total + " and the average for " + userAnswer + " grades is " + df.format(average));
                
        
        
    }
    
    
    public static void practiceCountingBy2()
    {
        System.out.println("Up to what positive number do you wish to count to? ");
        int countLimit = keyboard.nextInt();
        keyboard.nextLine();
        
        for (int i = countLimit; i >= 0; i = i- 2)
        {
            System.out.print(i + " ");
        }
        
        System.out.println("The end.");
        
        
        
    }
    
}
