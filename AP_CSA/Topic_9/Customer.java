/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod9;


public class Customer 
{
     private String name;
     private int ssn;
     private Account account;
     private static int numOfCustomers = 0;
    
 
public Customer(String n, int s, Account a)
{
    name= n;
    ssn = s;
    account = a;
    numOfCustomers++;
    
}

/**
 * Post-condition: Every customer needs a name and SSN
 * 
 */
public Customer(String n, int s)
{
    name= n;
    ssn = s;
    account = new Account();
    numOfCustomers++;
    
}   

public static int getNumOfCustomers()
{
    return numOfCustomers;
}

public String getName()
{
    return name;
}

public int getSsn()
{
    return ssn;
}



public Account getAccount()
{
    return account;
}

public void attachAccount(Account a)
{
    account = a;
}
//@override
public String toString()
{
    return "This is customer " + name + " \nwith SSN" + ssn + " \nwith account \n" + this.getAccount().toString();
}
}
