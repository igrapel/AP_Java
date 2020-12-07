
package Mod7;
import java.util.*;

public class Searches 
{
/*
    Method that returns random numbers
    @param min lowest possible int
    @param max highest possible int
    
    @return random int
    */
    public static int getRandom(int min, int max)
    {
        int rand = (int)(Math.random()*(max - min) + 1 + min);
        return rand;
    }
    
    /**
     * 
     * @param al which is a declared arraylist
     * @param n which is the size of the arraylist
     * @return void - popu;ate declared arraylist
     */
    public static void populateAL(ArrayList<Integer> al, int n)
    {
        for(int i = 0; i < n; i++)
        {
            int randNum = getRandom(-10, 50);
            al.add(randNum);
        }
    }
    
     /**
     * 
     * @param al which is a declared arraylist
     * @param n which is the size of the arraylist
     * @return void - popu;ate declared arraylist with numbers in order
     */
    public static void populateOrderedAL(ArrayList<Integer> al, int n)
    {
        for(int i = 0; i < n; i++)
        {
            int randNum = getRandom(3*(i - 1), 3*i);
            al.add(randNum);
        }
    }
    
    /*
     @para arraylist of int
     @para int that we are searching for
    
     @return the index of the int or negative -1
    */
    public static int getIndexLinear(ArrayList<Integer> al, int num)
    {
        for(int i = 0; i < al.size(); i++)
        {
            if(al.get(i) == num)
            {
                return i;
            }
        }
        return -1;
    }
    
  /*
     @para arraylist of int
     @para int that we are searching for
    
     @return the index of the int or negative -1
     pre-requisite: ArrayList is in order
    
    */
    
    public static int binarySearch(ArrayList<Integer> al, int n)
    {
       int leftIndex = 0;
       int rightIndex = al.size()-1;
       int count = 0; 
       while(leftIndex <=rightIndex)
       {
         int middleIndex = leftIndex + (rightIndex - leftIndex)/2;
         count++;
         System.out.println("Loop: " + count + " \t" + "Left: " + al.get(leftIndex) + "\t"
                 + "\t" + "\t" + "Middle: " + al.get(middleIndex) + "\t" + 
                         "Right: " + al.get(rightIndex));
         for(int i = leftIndex; i <= rightIndex;i++)
         {
              System.out.print(al.get(i) + ", ");
         }
         System.out.println();
         if(al.get(middleIndex) == n)
         {
             return middleIndex;
         }
           
         else if (n > al.get(middleIndex))
         {
             leftIndex = middleIndex + 1;
         }
         
         else
         {
             rightIndex = middleIndex -1;
         }
       }
       //not there
       return -1;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> myAL = new ArrayList<Integer>();
       // populateAL(myAL, 100000000);
       //populateOrderedAL(myAL, 15);
//        for(int n : myAL)
//        {
//            System.out.println(n);
//        }

        int[] arrayInt = {2, 3, 5, 10, 12, 13, 15, 18, 20, 29, 41, 100};
        //convert array to arraylist
        for(int i = 0; i < arrayInt.length; i++)
        {
            myAL.add(arrayInt[i]);
        }
        //not on CSA curriculum
        double startTime = System.currentTimeMillis();
        
        System.out.println(binarySearch(myAL, 12));
        
        double endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
        System.out.println(myAL);
    }
}
