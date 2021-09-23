
package topic3;


public class TaxReturn 
{
    private double income;
    private boolean married;
    private int ssn;
    private String password;
    private String admin = "1234";
    
    private static final double RATE_1 = 0.15;
    private static final double RATE_2 = 0.20;
    private static final double RATE_3 = 0.28;
    
    private static final double SINGLE_BRACKET_1 = 21000;
    private static final double SINGLE_BRACKET_2 = 41400;
    private static final double SINGLE_BRACKET_3 = 75670;

    private static final double MARRIED_BRACKET_1 = 31000;
    private static final double MARRIED_BRACKET_2 = 51400;
    private static final double MARRIED_BRACKET_3 = 85670;
    
    
    public TaxReturn(double inc, boolean m, int id, String pw)
    {
        income = inc;
        married = m; 
        ssn = id;
        password = pw;
    }
    
    public TaxReturn(double inc, int id)
    {
        income = inc;
        married = false; 
        ssn = id;
    }
    
    public double getTax(String pw)
    {
        if(password.equals(pw) || admin.equals(pw))
        {
        double finalTax = 0;
        
        if(married)
        {
           if(income <= MARRIED_BRACKET_1)
           {
               
           }
           else if(income <= MARRIED_BRACKET_2)
           {
               //if you are here - you earn between b1 and b2
               finalTax = RATE_1 * (income - MARRIED_BRACKET_1);
           }
           
           else if(income <= MARRIED_BRACKET_3)
           {
               //if you are here - you earn between b2 and b3
               finalTax = RATE_1 * (MARRIED_BRACKET_2 - MARRIED_BRACKET_1)
                       + RATE_2 * (income - MARRIED_BRACKET_2);
           }
           else
           {
               //if you are here - you earn more than bracket 3
               finalTax = RATE_1 * (MARRIED_BRACKET_2 - MARRIED_BRACKET_1)
                       + RATE_2 * (MARRIED_BRACKET_3 - MARRIED_BRACKET_2)
                       + RATE_3 * (income - MARRIED_BRACKET_3);
           }
        }
        
        else
        {
            if(income <= SINGLE_BRACKET_1)
           {
               
           }
           else if(income <= SINGLE_BRACKET_2)
           {
               //if you are here - you earn between b1 and b2
               finalTax = RATE_1 * (income - SINGLE_BRACKET_1);
           }
           
           else if(income <= SINGLE_BRACKET_3)
           {
               //if you are here - you earn between b2 and b3
               finalTax = RATE_1 * (SINGLE_BRACKET_2 - SINGLE_BRACKET_1)
                       + RATE_2 * (income - SINGLE_BRACKET_2);
           }
           else
           {
               //if you are here - you earn more than bracket 3
               finalTax = RATE_1 * (SINGLE_BRACKET_2 - SINGLE_BRACKET_1)
                       + RATE_2 * (SINGLE_BRACKET_3 - SINGLE_BRACKET_2)
                       + RATE_3 * (income - SINGLE_BRACKET_3);
           } 
            
        }
      
        return finalTax;
        }
        return -1;
    }
            
}
