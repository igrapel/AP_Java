

public class Customer 
{
     private String name;
     private int ssn;
     private Account account;
     private static int customerNumber =0;
 
public Customer(String n, int s, Account a)
{
    name= n;
    ssn = s;
    account = a;
    customerNumber++;
}

/**
 * Post-condition: Every customer needs a name and SSN
 * 
 */
public Customer(String n, int s)
{
    name= n;
    ssn = s;
    account = null;
    customerNumber++;
}   

public String getName()
{
    return name;
}

public int getSsn()
{
    return ssn;
}

public int getCustomerNumber()
{
    return customerNumber;
}

public Account getAccount()
{
    return account;
}

//@override
public String toString()
{
    return "This is customer: " + this.getName() + " with the ID: " + this.getSsn();
}
}
