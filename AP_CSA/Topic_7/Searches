/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod7;
import java.util.*;  
/**
 *
 * @author ilan
 */


public class Searches {

    public static int getRandom(int a, int b)
    {
        int rand = (int)(Math.random()*b) + a;
        return rand;
        
    }
    
    public static void fillAL(ArrayList<Integer> al, int n)
    {
        for(int i = 0; i < n; i++)
        {
         int rand = getRandom(0, 1000);
         al.add(rand);      
        }
    }
    
    public static void fillSortedAL(ArrayList<Integer> al, int n)
    {
        for(int i = 0; i < n; i++)
        {
         int rand = getRandom(0 + i*10, 5);
         al.add(rand);      
        }
    }
    
    public static int findNum(ArrayList<Integer> al, int n)
    {
        for(int i = 0; i < al.size(); i++)
        {
            if(al.get(i)== n)
            {
                return i;
            }
            
        }
        
        return -1;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> randNums = new ArrayList<Integer>();
        ArrayList<Integer> sortedRandNums = new ArrayList<Integer>();
        //Fill a bunch of numbers
        fillAL(randNums, 10000000);
        
        System.out.println(randNums);
        
        long startTime = System.currentTimeMillis();
        //find linearly
        findNum(randNums, -4);
        long endTime = System.currentTimeMillis();

        System.out.println("That took " + (endTime - startTime) + " milliseconds");
        
        //Sorted ArrayList
//        fillSortedAL(sortedRandNums, 100);
//        System.out.println(sortedRandNums);
        
        
    }
    
}
