
package Topic_3;

public class TaxReturn 
{
double income;
String status;
//tax rates

private static final double RATE1 = 0.15;
private static final double RATE2 = 0.20;
private static final double RATE3 = 0.28;
private static final double RATE4 = 0.37;

private static final double MARRIED_BRACKET1 = 31000;
private static final double MARRIED_BRACKET2 = 51400;
private static final double MARRIED_BRACKET3 = 85670;


private static final double SINGLE_BRACKET1 = 21000;
private static final double SINGLE_BRACKET2 = 41400;
private static final double SINGLE_BRACKET3 = 75670;


/**
 * create a taxreturn for client object
 * @param anIncome taxpayer's income as a double
 * @param astatus either single or married
 */

public TaxReturn(double anIncome, String married)
{
    income = anIncome;
    status = married;
}
    
public double getTax()
{
   double tax = 0; 
   if(status.equalsIgnoreCase("Married"))
   {
       if(income <= MARRIED_BRACKET1)
       {
           tax = income*RATE1;
       }
       
       else if (income <= MARRIED_BRACKET2)
       {
           tax = RATE1*MARRIED_BRACKET1 + RATE2*(income - MARRIED_BRACKET1);
       }
       
       else if (income <= MARRIED_BRACKET3)
       {
           tax = RATE1*MARRIED_BRACKET1 + RATE2*(MARRIED_BRACKET2 - MARRIED_BRACKET1) + RATE3*(income - MARRIED_BRACKET3);
       }
       
       else
       {
           tax = RATE1*MARRIED_BRACKET1 + RATE2*(MARRIED_BRACKET2 - MARRIED_BRACKET1) + RATE3*(MARRIED_BRACKET3 - MARRIED_BRACKET2) + RATE4*(income - MARRIED_BRACKET3);
       }
       
   }
   else
   {
       //fill in
   }
    
    return tax;
}


}
