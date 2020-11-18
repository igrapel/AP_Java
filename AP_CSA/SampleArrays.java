/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod6;

/**
 *
 * @author ilan
 */
public class arrays {
    
     public static void printArray(double[] arr)
     {
         for(double element : arr)
         {
             System.out.println(element);
         }
     }
    
    
    public static void main(String args[])
    {
      
        
    System.out.println("I. 1000 numbers: ");
    double[] arr1 = new double[2000];
    for(int i = 0; i < arr1.length ; i++)
    {
        arr1[i] = (double)(i)/2;
    }
    //for all loop
    
        for(double element : arr1)
        {
            System.out.println(element);
        }
    System.out.println("II. Odd numbers changed ");
        int[] arr2 = new int[50];
        for(int i = 0; i < arr2.length; i++)
        {
            if(i%2 == 1)
            {
                arr2[i] =   (int)(2.5 *i - 12.5);
            }
            for(int oddIndex : arr2)
            {
                System.out.println(oddIndex);
            }
            
        }
        //10 Random numbers 
        System.out.println("III. Random Numbers: ");
        double[] arr3 = new double[10];
        for(int i = 0; i < arr3.length; i++)
        {
            arr3[i] = Math.random();
        }
        for(double rand: arr3)
        {
            System.out.println(rand);
        }
        
        System.out.println("IV. Simulate SAT distribution: ");
        // we want a mean of 175 and a SD of 250
        int[] arr4 = new int[100000];
        for(int i = 0; i<arr4.length; i++)
        {
            arr4[i] = (int)(Math.random()*1000) -325;
        }
        
        for(int SAT : arr4)
        {
            System.out.println(SAT);
        }
        
        int max = arr4[0];
        
        for(int m : arr4)
        {
            if(m > max)
            {
                max = m;
            }
        }
        
        System.out.println("V. Find sum of SATs: ");
        double sum = 0;
         for(int n : arr4)
        {
            sum = sum + n;
        }
         double mean = sum/arr4.length;
        System.out.println("Joaqy's max verbal score is: " + max);
        System.out.println("Joaqy's mean verbal score is: " + mean);
        
        
        
        
        
        
    }
    
}
