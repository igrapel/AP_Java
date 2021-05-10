public class DiverseArray
{
    public DiverseArray()
    {

    }

    public static int arraySum(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] rowSums(int[][] arr2D)
    {
        int[] rowSums = new int[arr2D.length];
        for(int i = 0; i< arr2D.length; i++)
        {
            int sum = 0;
            for(int j = 0; j < arr2D[i].length; j++)
            {
                sum += arr2D[i][j];
            }
            rowSums[i] = sum;
        }
        return rowSums;
    }
}
