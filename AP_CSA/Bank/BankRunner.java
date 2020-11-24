/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_5;

import static Topic_5.Account.p;

/**
 *
 * @author 323917
 */
public class BankRunner {
    
    public static void p(Object o)
    {
        System.out.println(o);
    }
    public static  void  main(String[] args)
    {
        Account a1 = new Account(8, 1000, null);
        System.out.println(a1.getAmount());
        
        //p(a1.amount);
        
        Account a4 = new Account(10, 400000, null);
        Customer Dan = new Customer("Dan", 123, a1);
        
        Customer Kathie = new Customer("Kathie", 233, a4);
        
        Account a2 = new Account(34, 9000, Dan);
        
        Account a3 = new Account();
        
        a1.deposit(4000);
        a1.withdrawl(900);
        
        Customer Ben = new Customer("Ben", 23332);
        
        p("The accounts in this bank number: " + Account.getNumOfAccounts());
        p(Kathie);
        
        Account a5 = new Account(323, 991, null);
        a5.attachCustomer(Ben);
        Ben.attachAccount(a5);
        p("This is the account number: " + Account.getNumOfAccounts());
        
        Account ben = new Account(10,15, null);
        Employee MrS = new Employee();
        System.out.println("Ben's before penalty amount " + ben.getAmount());
        Employee.chargeFee(ben, 20);
        System.out.println("Ben's after penalty amount " + ben.getAmount());
        
        Account a6 = new Account(10, 1000, null);
        Account a7 = new Account(11, 2000, null);
        Account betterFund = null;
        
        Account chosenFund = null;
        chosenFund = Employee.chooseBestAccount(betterFund, a6, a7);
        
        p("Amount for higher account is " + chosenFund.getAmount());
        
        System.out.println("VIP Accounts");
        System.out.println("-----------------");
        
        Account[] vip = new Account[7];
        
        vip[0] = a1;
        vip[1] =a2;
        vip[2] = a3;
        vip[3] =a4;
        vip[4] = a5;
        vip[5] = a6;

        for(Account a : vip)
        {
            System.out.println(a);
        }
        
        
    }
    
}
