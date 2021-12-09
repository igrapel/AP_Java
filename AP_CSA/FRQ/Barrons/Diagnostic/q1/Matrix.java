package Barrons.Diagnostic;

public class Matrix
{
    private int[][] mat;
    /** Constructs a matrix of integers. */
    public Matrix (int[][] m)
    { mat = m; }
    /** Reverses the elements in each row of mat.
     * Postcondition: The elements in each row have been reversed.
     */
    public void reverseAllRows()
    {
        ArrayUtil aux = new ArrayUtil();
        for(int[] r : mat)
        {
            aux.reverseArray(r);
        }
    }
    /** Reverses the elements of mat.
     * Postcondition:
     * - The final elements of mat, when read in row-major order,
     * are the same as the original elements of mat when read
     * from the bottom corner, right to left, going upward.
     * - mat[0][0] contains what was originally the last element.
     * - mat[mat.length-1][mat[0].length-1] contains what was
     * originally the first element.
     */
    public void reverseMatrix()
    {
        reverseAllRows();
        for(int row = 0; row < mat.length/2; row++)
        {
            int[] temp = new int[mat[row].length];


            //copy rows from end into beginning
            for(int col = 0; col < mat[row].length - 1; col++)
            {
                temp[col] = mat[row][col];
                mat[row][col] = mat[mat.length - 1 - row][col];
                mat[mat.length - 1 - row][col] = temp[col];
            }
        }

    }
//Other instance variables, constructors and methods are not shown.
    public static void main(String[] args)
    {
        int[][] test = {{1,2,3,4},{5,6,7,8}, {9,10,11,12} };
        Matrix obj = new Matrix(test);
        obj.reverseMatrix();
        for(int[] r : obj.mat)
        {
            for(int c : r)
            {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }
}
