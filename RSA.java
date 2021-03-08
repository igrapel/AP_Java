/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_10;

import java.util.ArrayList;

public class RSA 
{
 int p;
 int q;
 int public_key_modulus;
 int phi;
 ArrayList<Integer> keys;
 
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
 
 public ArrayList<Integer> private_key_generator(int key)
 {
     
     
 }
 
    public static void main(String[] args) {
        RSA transmission = new RSA(5, 11);
        transmission.possible_public_keys();
        System.out.println(transmission.keys);
    }
    
}
