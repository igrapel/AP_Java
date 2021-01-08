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
         Account a1 = new Account(232, 900);
        System.out.println(a1);
        
        Checking a2 = new Checking(900, 10000, 50);
        System.out.println(a2);
        
        VIP_Account a3 = new VIP_Account(544, 3000, 500);
        System.out.println(a3);
        
        ArrayList<Account> cg_branch = new ArrayList<Account>();
       
        cg_branch.add(a1);
        cg_branch.add(a2);
        cg_branch.add(a3);
        
        double sum = 0;
        for(Account a : cg_branch)
        {
            sum = a.getAmount() + sum;
        }
        System.out.println("Total dollars: " + sum);
        
        Account a4 = new Checking(900, 5000, 25);
        System.out.println("Checks: " + ((Checking) a4).getChecks());
        
        
        Checking a5 = new Checking(900, 10000, 50);
        System.out.println("a5 and a2 are equal???? " + (a2.equals(a5)));
}
