/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic6;

/**
 *
 * @author 323917
 */
public class ALU 
{
  byte[] register = new byte[8];
  //no constructor: The register will default to 0000000
    
  public void setRegister(int i, byte v)
  {
      register[i] = v;
  }
  
  public void convertDecimal(int n)
  {
      int place = 128;
      int bit = 0;
      int num = n;
      while(0<place)
      {
          if(num >= place)
          {
              register[bit] = 1;
              num%=place;
          }
          else
          {
              register[bit] = 0;
          }
          bit++;
          place /=2;
      }
  }
  
  public void print()
  {
      for(byte b : register)
      {
          System.out.print(b);
      }
      System.out.println();
  }
  
  public static void main(String[] arg)
  {
      ALU test = new ALU();
      test.convertDecimal(70);
      test.print();
      
  }
    
}
