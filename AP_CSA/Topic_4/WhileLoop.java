package practiceloops;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class WhileLoop 
{
   public static void main(String[] args)
   {
       DecimalFormat dollar = new DecimalFormat("0.00");
       
       //variables 
       double subtotal = 0.0;
       double tax = 0.0;
       double tip = 0.0;
       double grandtotal;
       
       //JOption input for the while loop
       String inputOne;
       
       //starts program by asking the user to enter the first amount
       //primer
       inputOne = JOptionPane.showInputDialog
               ("Enter the cost of your purchase");
       
       while(inputOne != null)
       {
           System.out.println("Purchase cost:" + inputOne);
           
           subtotal = subtotal + Double.parseDouble(inputOne);
           
           //ask  user again to enter cost
           
           inputOne = JOptionPane.showInputDialog
                   ("Enter the next purchase, or click cancel");
       }
       String tipInput;
       tipInput = JOptionPane.showInputDialog("Enter a tip percentage amount without percent" + "\nclick cancel to skip the tip.");
       
       if(tipInput != null)
       {
           tip = (Double.parseDouble(tipInput) * 0.01) * subtotal;
           
           tip = Double.parseDouble(dollar.format(tip));
       }
       
       tax = subtotal * 0.07;
       
       tax = Double.parseDouble(dollar.format(tax));
       
       grandtotal = subtotal + tip + tax;
       
       grandtotal = Double.parseDouble(dollar.format(grandtotal));
       
       JOptionPane.showMessageDialog(null, "Subtotal: $" + subtotal
       + "\nTax: $" + tax
       + "\nTip: $" + tip
       + "\n\nThe grand total is" + grandtotal);
       
       System.out.println("Tbe grandtotal is " + grandtotal);
   }
   
}
