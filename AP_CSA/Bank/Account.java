/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_9.Bank;

/**
 *
 * @author 323917
 */

public class Account 
{
    //Encapsulation 
    private int id;
    private double amount;
    
    public static int numOfAccounts= 0;
   
    
    /**Precondition: Customer must come from Customer class in this package
     * ID must be non-negative
     * 
     * 
     * @param i
     * @param a
     * @param c 
     */ 
    public Account(int id, double amount)
    {
        this.id = id;
        this.amount = amount;
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
        amount -= .05;
    }
    
    public void deposit(double w)
    {
        amount += w;
        amount -= .05;
    }
   
    /*
    @override
    */
    
    //Known as polymorphism
    public String toString()    
    {
       return "This account is number " + id + " \n Amount: " + amount;    
    }
    
    
    public static void p(Object o)
    {
        System.out.println(o);
    }
    
}
