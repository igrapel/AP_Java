public class Mountain
{

public static boolean isIncreasing(int[] array, int stop)
{
    for(int i = 0; i < stop; i++)
    {
        if(array[i]>array[i+1])
        {
            return false;
        }
    }
    return true;
}

public static boolean isDecreasing(int[] array, int start)
{
    for(int j = start; j < array.length-1; j++)
    {
        if(array[j] < array[j+1])
        {
            return false;
        }
    }
    return true;
}

public static int getPeakIndex(int[] array)
{
   
for(int i = 1; i < array.length - 1;i++)
{
    if(array[i] > array[i-1] && array[i] > array[i+1])
        return i;
}

return -1;
}

public static boolean isMountain(int[] array)
{
    

    for(int i = 0; i < array.length - 1; i++)
    {
        if(isIncreasing(array, i) && isDecreasing(array, i))
        {
            return true;
        }
    }
    return false;
}

public static void main(String[] args)
{
    int[] arr = {11, 22, 33, 22, 11};
    System.out.println(getPeakIndex(arr));

}
}
