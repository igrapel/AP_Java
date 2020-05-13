package modified2020;

public class CheckDigit
{
/** Returns the check digit for num
* Precondition: The number of digits in num is between one and six, inclusive.
* num >= 0
*/  
    
    //creates a  digit based on modulo for any input number
public static int getCheck(int num)
{ 
int checkDigit = num % 7;
return checkDigit;   
}
/** Returns true if numWithCheckDigit is valid, or false otherwise,
* as described in part (a)
*/
public static boolean isValid(int numWithCheckDigit)
{
    int lastNumber = numWithCheckDigit % 10;
    int firstNumbers = numWithCheckDigit / 10;
    
    if(getCheck(firstNumbers) == lastNumber)
    {
        return true;
    }
    
    else 
    { 
        return false;
    }
}
//test execution
 public static void main(String[] args)
    {
        System.out.println(isValid(2041));
        
        
    }
 
}
