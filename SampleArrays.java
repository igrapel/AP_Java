
package arrays;


public class SampleArrays 
{
    String[] Cs = {"Paul", "Pierre", "Omar", "Alexy", "Byron"};
    //print out names in reverse
     public static double[] randomArray(int size, double mean, double sd)
        {
            double[] randArray = new double[size];
            for(int i = 0; i <randArray.length; i++)
            {
                randArray[i] = (Math.random() * (sd/.25) + mean - (sd/.25));
            }
            return randArray;
        }
     
     public static void printArray(double[] arr)
     {
         for(double element : arr)
         {
             System.out.println(element);
         }
     }
    public static void main(String[] args)
    {
       
        
        
//    double[] arr1 = new double[2000];
//    for(int i = 0; i < arr1.length ; i++)
//    {
//        arr1[i] = (double)(i)/2;
//    }
//    //for all loop
//    
//        for(double element : arr1)
//        {
//            System.out.println(element);
//        }
    
//        int[] arr2 = new int[50];
//        for(int i = 0; i < arr2.length; i++)
//        {
//            if(i%2 == 1)
//            {
//                arr2[i] =   (int)(2.5 *i - 12.5);
//            }
//            for(int oddIndex : arr2)
//            {
//                System.out.println(oddIndex);
//            }
//            
//        }
        //10 Random numbers 
        
//        double[] arr3 = new double[10];
//        for(int i = 0; i < arr3.length; i++)
//        {
//            arr3[i] = Math.random();
//        }
//        for(double rand: arr3)
//        {
//            System.out.println(rand);
//        }
//        
//        // we want a mean of 175 and a SD of 250
//        int[] arr4 = new int[100000];
//        for(int i = 0; i<arr4.length; i++)
//        {
//            arr4[i] = (int)(Math.random()*1000) -325;
//        }
//        
//        for(int SAT : arr4)
//        {
//            System.out.println(SAT);
//        }
//        
//        int max = arr4[0];
//        
//        for(int m : arr4)
//        {
//            if(m > max)
//            {
//                max = m;
//            }
//        }
//        
//        double sum = 0;
//         for(int n : arr4)
//        {
//            sum = sum + n;
//        }
//         double mean = sum/arr4.length;
//        System.out.println("Joaqy's max verbal score is: " + max);
//        System.out.println("Joaqy's mean verbal score is: " + mean);
        
        String[] board = new String[64];
        for(int i = 0; i< board.length; i++)
            if(i%2 == 0)
            {
                board[i] = "X";
            }
        
            else
            {
                board[i] = "O";
            }
        // board array looks like XOXOXOXOXOXO

        for(int i = 0; i < 8; i++)
        {
            if(i%2 == 0)  //for the odd rows
            {
                for(int j = 0; j < 8; j++)
                {
                    System.out.print(board[j]);
                }
                System.out.print("\n");
            }
            else
                {
                for(int j = 0; j < 8; j++)
                {
                    System.out.print(board[j+1]);
                }
                System.out.print("\n");
            }
            
        }
//        for(int i = 0; i<20; i++)
//        {
//        System.out.println(randomArray(20, 500, 100)[i]);
//        }
printArray(randomArray(20, 500, 100));
    }
}
