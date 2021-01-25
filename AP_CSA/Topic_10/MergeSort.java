
package Mod10;


public class MergeSort 
{
private static int[] myArray;
private static int[] tempArray;
private static int z = 1;

public static void mergeSort(int[] arr)
{
    myArray= arr;
    int length = arr.length;
    tempArray = new int[length];
    setUpMerge(0, length - 1);
}

private static void setUpMerge(int lower, int higher)
{
    if(lower < higher)
    {
        int middle = lower + (higher - lower) / 2;
        setUpMerge(lower, middle);
        setUpMerge(middle + 1, higher);
        doTheMerge(lower, middle, higher);
    }
}

private static void doTheMerge(int lower, int middle, int higher)
{
    for(int i = lower; i<=higher;i++)
    {
        tempArray[i] = myArray[i];
    }
    
    int i = lower;
    int j = middle + 1;
    int k = lower;
    while(i <= middle && j <=higher)
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
    while(i <= middle)
    {
        myArray[k] = tempArray[i];
        k++;
        i++;
    }
    
        System.out.print(z + ": ");
        printArray(myArray);
        System.out.println();
        z++;
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
   int[] randArray = {16,1,24,3,5,17,8,12};
   mergeSort(randArray);
   for(int i: randArray)
   {
       System.out.print(i + "\t");
   }
}
}
