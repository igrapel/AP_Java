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
public class VIP_Account extends Account
{
/*
   VIP inherit everything from Account
-	attribute Int points;
-	     
        method:   remind about giving a special card
                  indicated that account earned award based on points

    */
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
 
     public String oldPrint()
 {
     return super.toString();
 }
 
 /*
 @override
 polymorphism
 */
 

public String toString()    
{
    return "This account is number " + this.getId() + " \t Amount: " + this.getAmount() + " with VIP Points of: " + points;    
}
}
