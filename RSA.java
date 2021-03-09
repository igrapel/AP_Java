import java.util.ArrayList;
import java.math.BigInteger;

public class RSA 
{
 int p;
 int q;
 int public_key_modulus;
 int phi;
 ArrayList<Integer> keys;
 ArrayList<Integer> private_keys;
 
 public RSA(int prime1, int prime2)
 {
     p = prime1;
     q = prime2;
     public_key_modulus = p*q;
     phi = (p-1)*(q-1);
 }
    
 public static int gcf(int a, int b)
    {
        int greatestFactor = 1;
       
       if(a%b == 0)
       {
           greatestFactor = b;
           return greatestFactor;
       }
       else
       {
        int remainder = a % b;
        greatestFactor = gcf(b, remainder);
       }
       
       return greatestFactor;
    }
 
 public ArrayList<Integer> possible_public_keys()
 {
     keys = new ArrayList<Integer>();
     
     for(int i = 2; i < phi; i++)
     {
         int factor = gcf(phi,i);
         if(factor == 1)
         {
             keys.add(i);
         }
     }
     return keys;
 }
 
 
//Basic Equation:
//Private Key * Public Key Exponent mod phi = 1 $
 public ArrayList<Integer> private_key_generator(int public_key_exp, int distance)
 {
     private_keys = new ArrayList<Integer>();
     for(int i = 1; i < distance; i++)
     {
            if(i*public_key_exp%this.phi == 1)
            {
                private_keys.add(i);
            }
     }
     return private_keys;
 }

 public BigInteger encrypt(int n, int publicK)
 {
    BigInteger mod = BigInteger.valueOf(public_key_modulus); 
    BigInteger biginteger = BigInteger.valueOf(n);
    BigInteger encrypted = biginteger.pow(publicK);
    encrypted = encrypted.mod(mod);
    return encrypted;
 }

 public BigInteger decrypt(int encrypted, int privateKey)
 {
    BigInteger biginteger = BigInteger.valueOf(encrypted);
    BigInteger answer = biginteger.pow(privateKey);
    BigInteger modulus = BigInteger.valueOf(public_key_modulus);
    answer = answer.mod(modulus);
    return answer;  
 }
 
public static void main(String[] args) 
{
    int theNum = 2;
    RSA transmission = new RSA(5, 11);
    transmission.possible_public_keys();
    System.out.println(transmission.keys);
    System.out.println(transmission.private_key_generator(7, 200));
    System.out.println("Plain: " + theNum + "\nEncrypted: " + transmission.encrypt(theNum, 7));
    System.out.println("Unencrypted: " + transmission.decrypt(18, 23));
}
    
}
