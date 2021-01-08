/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_9.Bank;

//add on checkes
public class Checking extends Account
{
int checks; 

//public Checking()
//{
//    super();
//    checks= 10;
//}

public Checking(int id, double amount, int checks)
{
    super(id, amount);
    this.checks = checks;
}

public void writeCheck(double d)
{
    checks--;
    this.withdrawl(d);
}

public String toString()    
{
return "This account is number " + this.getId() + " \n Amount: " + this.getAmount() + " with checks: " + checks;    
}

public String oldToString()
{
    return super.toString();
}
    
}
