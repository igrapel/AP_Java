package Barrons.Diagnostic;

public class ArrayUtil
{
    /** Reverses elements of array arr.
     * Precondition: arr.length > 0.
     * Postcondition: The elements of arr have been reversed.
     * @param arr the array to manipulate
     */
    public static void reverseArray(int[] arr)
    {
        int j = arr.length-1;
        for(int i = 0; i < arr.length/2; i++, j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }


    public static void main(String[] args)
    {
        int[] test = {3,4,5,6,7};
        reverseArray(test);
        for(int x : test)
        {
            System.out.println(x);
        }

    }
//Other methods are not shown.
}



