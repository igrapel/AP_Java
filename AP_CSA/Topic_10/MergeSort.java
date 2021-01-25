
package Topic_10;

public class MergeSort 
{
    private static int[] myArray;
    private static int[] tempArray;
    private static int counter;
    
    public static void mergeSort(int[] arr)
    {
        myArray = arr;
        int length = arr.length;
        tempArray = new int[length];
        splitArray(0, length-1);
    }
    
    public static void splitArray(int lower, int higher)
    {
        if(lower<higher)
        {
          int middle = lower + (higher-lower)/2;
          splitArray(lower, middle);
          splitArray(middle + 1, higher);
          reMerge(lower, middle, higher);
        }
    }
    
    public static void reMerge(int lower, int middle, int higher)
    {
        //copy array into temporary array
        for(int i = 0; i <=higher; i++)
        {
            tempArray[i] = myArray[i];
        }
        
        int i = lower;
        int j = middle + 1;
        int k = lower;
        
        while(i <= middle && j<=higher)
        {
            if(tempArray[i] <= tempArray[j])
            {
                myArray[k] = tempArray[i];
                i++;
            }
            else
            {
                myArray[k] = tempArray[j];
                j++;
            }
            k++;
        }
        
        while(i<=middle)
        {
            myArray[k] = tempArray[i];
            k++;
            i++;
        }
        
        System.out.print(counter + ": ");
        printArray(myArray);
        System.out.println();
        counter++;
    }
    
   public static void printArray(int[] arr)
   {
       for(int i : arr)
       {
           System.out.print(i + "\t");
       }
   }
   
   public static void main(String[] args)
   {
    int[] randArray = {12, 1, 2, 5, -2, 0, 14};
    mergeSort(randArray);
    printArray(randArray);
       
       
       
       
   }
    
}
