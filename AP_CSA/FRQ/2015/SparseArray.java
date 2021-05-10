import java.util.ArrayList;

public class SparseArray
{
    private int numRows;
    private int numCols;

    private ArrayList<SparseEntryArray> entries;

    public SparseArray()
    { entries = new ArrayList<SparseEntryArray>();}

    public int getNumCols() {
        return numCols;
    }

    public int getNumRows() {
        return numRows;
    }

    public int getValueAt(int row, int col)
    {
        for(SparseEntryArray e : entries)
        {
            if(e.getRow() == row && e.getCol() == col)
            {
                return e.getValue();
            }
        }
    }

    public void removeColumn(int col)
    {
        numRows--;
        for(int i = 0; i < entries.size(); i++)
        {
            SparseEntryArray currentE = entries.get(i);
            if(entries.get(i).getCol() == col)
            {
                entries.remove(i);
                i--;
            }
            else if(entries.get(i).getCol() > col)
            {
                entries.set(i, new SparseEntryArray(currentE.getRow(), currentE.getCol() - 1, currentE.getValue());
            }
            else
            {

            }
        }
    }
}
