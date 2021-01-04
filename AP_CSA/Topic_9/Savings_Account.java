/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod9;

/**
 *
 * @author ilan
 */
public class Savings_Account extends Account
{
//Savings_Account is-a Account
    
double rate;
public Savings_Account()
{
    super(); 
}

public Savings_Account(int id, double amount, Customer customer, double rate)
{
    super(id, amount, customer);
    this.rate = rate;
}

public void addInterest()
{
    double interest = this.getAmount()*(1+this.rate);
    this.deposit(interest);
}

//polymorphism
 /*
 @override
 */

 public String getInfo()    
    {
       boolean customerAttached;
       if(this.getCustomer()==null)
       {
           customerAttached = false;
       }
       else
       {
           customerAttached = true;
       }
       
       return "This account is number " + this.getId() + " \n Amount: " + this.getAmount() +
               "\n Current Interest Rate: " + rate +
               "\n Customer Information Updated: " + customerAttached;    
    }
}
