package percolation;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

//to run from command line, one folder above percolation directory:

// java -cp ./percolation/algs4.jar; percolation.PercolationVisualizer percolation/input20.txt

public class Percolation {
    boolean[][] grid;
    WeightedQuickUnionUF quf;
    int size;
    int openSiteCount = 0;
    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n)
    {
       size = n;
       if (n < 1) 
       {
        throw new java.lang.IllegalArgumentException("IllegalArgument");
       }
        
       grid = new boolean[size + 2][size + 2];
       quf = new WeightedQuickUnionUF ((size + 2)*(size + 2));
       
       //open virtual bottom
       grid[0][0] = true;
       //open virtual top  xyTo1D
       grid[size + 1][size + 1]= true;
    }
    
    private int xyTo1D(int row, int col) 
    {      
        int completeRows = row;
        return completeRows * size + col;
    }
    
    // opens the site (row, col) if it is not open already
    public void open(int row, int col)
    {
        checkIndices(row, col);
        if(!grid[row][col])
        {
            grid[row][col] = true; 
            connectOpens(row, col);
            openSiteCount++;
        }
    }

    private void connectOpens(int  row, int col)
    {
        //if bottom row, union to virtual bottom
        if(row == size)
        {
            quf.union(xyTo1D(row, col), xyTo1D(0, 0));
        }
        
        //if top row, union to virtual top
        if(row == 1)
        {
            quf.union(xyTo1D(row, col), xyTo1D(size + 1, size + 1));
        }
        
        // if isn't bottom row and cell under is open
        if (row != size && isOpen(row + 1, col))
        {
        quf.union(xyTo1D(row, col), xyTo1D(row + 1, col));
        }
        
        // if isn't top row and cell above is opened
        if (row != 1 && isOpen(row - 1, col))
        {
        quf.union(xyTo1D(row, col), xyTo1D(row - 1, col));
        }
        
        // if cell to left is opened
        if (col != 1 && isOpen(row, col-1))
        {
        quf.union(xyTo1D(row, col), xyTo1D(row, col-1));
        }
        
        // if cell to right is opened
        if (col != size && isOpen(row, col+1))
        {
        quf.union(xyTo1D(row, col), xyTo1D(row, col+1));
        }
    }
    // is the site (row, col) open?
    public boolean isOpen(int row, int col)
    {
        checkIndices(row, col);
        return grid[row][col];   
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col)
    {
        checkIndices(row, col);
        return quf.find(xyTo1D(row, col)) == quf.find(xyTo1D(size + 1, size + 1));
    }

    // returns the number of open sites
    public int numberOfOpenSites()
    {
        return openSiteCount;
    }

    // does the system percolate?
    public boolean percolates()
    {
        return quf.find(xyTo1D(0, 0)) == quf.find(xyTo1D(size + 1, size + 1));
    }
    
    private void checkIndices(int row, int col)
    {
        if (row < 1 || row > size) 
        {
        throw new IndexOutOfBoundsException("row index i out of bounds");
        }
        
        if (col < 1 || col > size) 
        {
        throw new IndexOutOfBoundsException("row index i out of bounds");
        }
    }
    
    // test client (optional)
    public static void main(String[] args)
    {
       Percolation test = new Percolation(5);
//       test.open(1, 2);
//       test.open(2, 2);
       //test.open(3, 2);
       
       test.open(1,1);
       test.open(2,1);
       test.open(3,1);
       test.open(3,2);
       test.open(4,2);
       test.open(5,2);
       System.out.println(test.percolates());
       //System.out.println(test.isFull(2, 2));
    }
}
