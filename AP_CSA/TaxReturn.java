package Topic_3;

import javax.swing.*;

public class TaxReturn
{
    private double income;
    private String status;
    private int ssn;
   
    private static final double RATE_1 = 0.15;
    private static final double RATE_2 = 0.20;
    private static final double RATE_3 = 0.28;
    private static final double RATE_4 = 0.37;

    private static final double SINGLE_BRACKET_1 = 21000;
    private static final double SINGLE_BRACKET_2 = 41400;
    private static final double SINGLE_BRACKET_3 = 75670;
    private static final double SINGLE_BRACKET_4 = 91340;

    private static final double MARRIED_BRACKET_1 = 31000;
    private static final double MARRIED_BRACKET_2 = 51400;
    private static final double MARRIED_BRACKET_3 = 85670;
    private static final double MARRIED_BRACKET_4 = 101340;

    /*
    * Create taxReturn for client object
    * @param income taxpayer's income as double
    * @param status taxpayer's marital status as String
    */

    public TaxReturn(double income, String status, int ssn)
    {
        this.income = income;
        this.status = status;
        this.ssn = ssn;
    }
   
    public double getTax()
    {
        double tax = 0;

        if (status.equalsIgnoreCase("married") || status.equalsIgnoreCase("m") )
        {
            if (income <= MARRIED_BRACKET_1)
            {
                tax = income * RATE_1;
            }
            else if (income <= MARRIED_BRACKET_2)
            {
                tax = RATE_1 * MARRIED_BRACKET_1 + RATE_2 * (income - MARRIED_BRACKET_1);
            }
            else if (income <= MARRIED_BRACKET_3)
            {
                tax = RATE_1 * MARRIED_BRACKET_1 + RATE_2 * (MARRIED_BRACKET_2 - MARRIED_BRACKET_1) +
                        RATE_3 * (income - MARRIED_BRACKET_2);
            }
            else
            {
                tax = RATE_1 * MARRIED_BRACKET_1 + RATE_2 * (MARRIED_BRACKET_2 - MARRIED_BRACKET_1) +
                        RATE_3 * (MARRIED_BRACKET_3 - MARRIED_BRACKET_2) +
                        RATE_4 * (income - MARRIED_BRACKET_4);
            }
        }
        else if((status.equalsIgnoreCase("single") || status.equalsIgnoreCase("s") ))
        {
            if (income <= SINGLE_BRACKET_1)
            {
                tax = income * RATE_1;
            }
            else if (income <= SINGLE_BRACKET_2)
            {
                tax = RATE_1 * SINGLE_BRACKET_1 + RATE_2 * (income - SINGLE_BRACKET_1);
            }
            else if (income <= SINGLE_BRACKET_3)
            {
                tax = RATE_1 * SINGLE_BRACKET_1 + RATE_2 * (SINGLE_BRACKET_2 - SINGLE_BRACKET_1) +
                        RATE_3 * (income - SINGLE_BRACKET_2);
            }
            else
            {
                tax = RATE_1 * SINGLE_BRACKET_1 + RATE_2 * (SINGLE_BRACKET_2 - SINGLE_BRACKET_1) +
                        RATE_3 * (SINGLE_BRACKET_3 - SINGLE_BRACKET_2) +
                        RATE_4 * (income - SINGLE_BRACKET_4);
            }
        }
        else{
            System.out.println("It looks like you have a marital status input error");
        }
   
        return tax;
    }
    
    public int getSSN()
    {
        return ssn;
    }
    
    //@override
    public boolean equals(TaxReturn c)
    {
        return (this.getSSN()==c.getSSN()) && (this.income == c.income);
    }
}
