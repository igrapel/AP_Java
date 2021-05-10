public class SparseEntryArray
{
    private int row;
    private int col;

    private int value;

    public SparseEntryArray(int r, int c, int v)
    {
        row = r;
        col = c;
        value = v;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getValue() {
        return value;
    }
}
