package Topic_9.Bank;


public class VIP_Account extends Account
{
    
 int points;
 
 public VIP_Account()
 {
     super();
     points = 1;
 }

 public VIP_Account(int i, double a,int p)
 {
     super(i, a);
     points = p;
 }
 
 public int getPoints()
 {
     return points;
 }
 
 public void setPoints(int p)
 {
     points = p;
 }
 
 public boolean checkPoints(int cutoff)
 {
     if(points > cutoff )
     {
         return true;
     }
     else
     {
         return false;
     }
 }
 
     public String oldPrint()
 {
     return super.toString();
 }

public String toString()    
{
    return "This account is number " + this.getId() + " \t Amount: " + this.getAmount() + " with VIP Points of: " + points;    
}
}
