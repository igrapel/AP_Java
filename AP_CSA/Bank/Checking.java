package Topic_9.Bank;

public class Checking extends Account
{
int checks; 

public Checking(int id, double amount, int checks)
{
    super(id, amount);
    this.checks = checks;
}

public int getChecks()
{
    return checks;
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
   
public boolean equals(Checking c)
{
   if(c == this ){
       return true;
   } 
   
   if(c.getId() == this.getId())
   {
       return true;
   }
   return false;
}
}
