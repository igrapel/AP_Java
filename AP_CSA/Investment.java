package Topic_4;

public class Investment
{
    int years;
    double balance;
    double rate;
    
    /**
     * constructs an investment objects from balance and rate
     * @param aBalance the balance
     * @param aRate    the interest rate
     */
    
    public Investment(double aBalance, double aRate)
    {
        balance = aBalance;
        rate = aRate;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public int getYears()
    {
        return years;
    }
    
    public void waitForBalance(double targetBalance)
    {
        while(balance < targetBalance)
        {
            years++;
            double interest = balance * rate / 100;
            balance = balance + interest;
        }
    }
    
    public void waitYears(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            double interest = balance * rate / 100;
            balance = balance + interest;
        }
        years = years + n;
    }
    
}