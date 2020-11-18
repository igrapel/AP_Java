
package Topic_6;

public class array_exercises 
{
    public static void printArray(int[] a)
    {
       for(int element : a)
       {
           System.out.println(element);
       }
    }
    
    public static void printArray(String[] a)
    {
       for(String element : a)
       {
           System.out.print(element);
       }
    }
   
    
    public static void main(String args[])
    {
       // 1. Create an array of multiples from 5 to 10k
        int[] arr_fives = new int[2001];
        for(int i = 0; i < arr_fives.length; i++)
        {
            arr_fives[i] = i*5;
        }
        
        // 2. Array up to 100, every fifth elemtn is 777
        int[] arr_lucky7 = new int[100];
        for(int i = 0; i < arr_lucky7.length; i++)
        {
            if(i%5 == 0)
            {
                arr_lucky7[i]= 777;
            }
            
            else
            {
                arr_lucky7[i] = i;
            }
        }
        
        // 6. Create array that holds 100 random dice rolls
        int[] die100 = new int[100];
        for(int i = 0; i < die100.length; i++)
        {
            die100[i] = (int)(Math.random()*6 + 1);
            
        }
        
        
        // 7. Simulate SAT scores for 10 students. Mean 500 and SD 80
        int[] satSim = new int[10];
        for(int i = 0; i < satSim.length; i++)
        {
            satSim[i] = (int)(Math.random()*50 + 500);
        }
        
         //8. Use String arrays to create a checker board
         String[] rowEven = new String[8];
         String[] rowOdd = new String[8];
         
         for(int i = 0; i < rowEven.length; i++)
         {
             if(i%2 == 0)
             {
                rowEven[i] = "X";
                rowOdd[i] = "0";
             }
             else
             {
                 rowEven[i] = "O";
                rowOdd[i] = "X";
             }
             
         }
        
         for(int i = 0; i < 7; i++)
         {
             if(i%2 == 0)
             {
                 printArray(rowEven);
             }
             else
             {
                 printArray(rowOdd);
             }
             System.out.println();
         }
        
        
       
        
    }
    
    
}
