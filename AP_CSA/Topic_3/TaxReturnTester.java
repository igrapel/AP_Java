/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic3;


public class Topic3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      TaxReturn kateB = new TaxReturn(33000, false, 19222, "loveCSA");
      System.out.println("Kate's tax: " + kateB.getTax("1234"));
        
    }
    
}
