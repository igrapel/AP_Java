
package Topic_5;

public class Account 
{
    //Encapsulation 
    private int id;
    private double amount;
    private Customer customer;
    public static int numOfAccounts= 0;
   
    
    /**Precondition: Customer must come from Customer class in this package
     * ID must be non-negative
     * 
     * 
     * @param i
     * @param a
     * @param c 
     */ 
    public Account(int id, double amount, Customer customer)
    {
        this.id = id;
        this.amount = amount;
        this.customer = customer;
        numOfAccounts++;
    }
    
    /**
     * 
     * post-condition: create a Account with id, amount, and customer
     * 
     */
    public Account()
    {
        id = 999;
        amount = 0;
        customer = null;
        numOfAccounts++;
        
        
    }
   
    public static int getNumOfAccounts()
    {
        return numOfAccounts;
    }
    // getters 
    public double getAmount()
    {
        return amount;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void withdrawl(double w)
    {
        amount -= w;
    }
    
    public void deposit(double w)
    {
        amount += w;
    }
    
    public void attachCustomer(Customer c)
    {
        customer = c;
    }
    
    /*
    @override
    */
    public String toString()    
    {
       return "This account is number " + id + " \n Amount: " + amount;    
    }
    
    
    public static void p(Object o)
    {
        System.out.println(o);
    }
    
    public static  void  main(String[] args)
    {
        Account a1 = new Account(8, 1000, null);
        System.out.println(a1.getAmount());
        p(a1.getAmount());
        p(a1.amount);
        
        Customer Dan = new Customer("Dan", 123, a1);
        p(Dan.getSsn());
        a1.deposit(4000);
        a1.withdrawl(900);
        
        p("Dan has in his account " + Dan.getAccount().getAmount());
        p(a1);
        p(Dan);
        
    }
    
}
