package percolation;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

//to run command line from one above percolation directory: 
//
//java -cp ./percolation/algs4.jar; percolation.PercolationStats 25 90


PercolationStats {

    private double[] fractionOpen;
   
    // perform independent trials on an n-by-n grid
    public PercolationStats(int num, int trials)
    {
        if(num <=0 || trials <=0)
        {
            throw new IllegalArgumentException("Grid needs to be greater than 0");
        }
        
        fractionOpen = new double[trials];
        
        for(int i = 0; i < trials;i++)
        {
            int countOpen = 0;    
            Percolation test = new Percolation(num);
            while(!test.percolates()) 
            {
                int row = StdRandom.uniform(num) + 1;  
                int col = StdRandom.uniform(num) + 1; 
              
                if(!test.isOpen(row, col))
                {
                    countOpen++; 
                    test.open(row, col);
                }
            }
                fractionOpen[i] = (double)countOpen / (num*num);
        }
    }

    // sample mean of percolation threshold
    public double mean()
    {
        return StdStats.mean(fractionOpen);
    }

    // sample standard deviation of percolation threshold
    public double stddev()
    {
        return StdStats.stddev(fractionOpen);
    }

    // low endpoint of 95% confidence interval
    public double confidenceLo()
    {
        return mean() - 1.96 * stddev() / Math.sqrt(fractionOpen.length);
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi()
    {
        return mean() + 1.96 * stddev() / Math.sqrt(fractionOpen.length);
    }

//   // test client (see below)
   public static void main(String[] args)
   {
       int num = Integer.parseInt(args[0]);
       int trials = Integer.parseInt(args[1]);
       
         PercolationStats stats = new PercolationStats(num, trials);
       
       //PercolationStats stats = new PercolationStats(14, 25);

        System.out.println("mean                    = " + stats.mean());
        System.out.println("stddev                  = " + stats.stddev());
        System.out.println("95% confidence interval = "
                + stats.confidenceLo() + ", "
                + stats.confidenceHi());
   }

}
