

import javax.swing.JOptionPane;

public class ForLoops
{
    public static void main(String args[]) 
    {
    int counter = 0;
    
    //see how while loop counts
    while (counter < 11)
    {
        System.out.println("The loop number is: " + counter);
        counter++;  
    }
    
    //four loop more efficient - only two lines
    for(int i = 0; i<11; i+=2)
    {
    System.out.println("The counter number is: " + i);   
    }
    
    //For loop with input
    String input = JOptionPane.showInputDialog
              ("This is Murat's computer class: ");
    int csC = Integer.parseInt(input);
    
    for(int x = 1; x <= csC; x++)
    {
        System.out.println("Murat, why did you fail in CS class:  " + x);
    }
    
    //Looping through an array
    int[] myArray = {102, 204, 301, 335, 500};
    
    for(int i = 0; i< myArray.length; i++)
    {
        System.out.println
           ("At Miami Dade College, Byron will need assistance in class " + myArray[i]);
    }
    
     //nested loops
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Outer Loop Iteration " + i);
            
            for(int j = 1; j <= 3; j++)
            {
                System.out.println("i = " + i + "; j = " + j);
            }
        }
    
    
}
}


