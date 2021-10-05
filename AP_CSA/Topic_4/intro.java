
package topic4;
import javax.swing.JOptionPane;

/**
 *
 * @author 323917
 */
public class Topic4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
//        String inp = JOptionPane.showInputDialog("Give me a number");
//        int myNum = Integer.parseInt(inp);
//        
//        //while Loop
//        while(myNum > 0)
//        {
//            System.out.println("Countdown: " + myNum);
//            myNum--;
//        }
//        
//        //for loop
//        for(int i = -10; i <= myNum; i+=3)
//        {
//            System.out.println("My for loop is: " + i);
//        }
        
        double myTotal = getProducts();
        System.out.println("The total is: " + myTotal);
    }
    
    public static double getProducts()
    {
        String userAnswer;
        int counter;
        double average;
        double total = 0;
        double eachProduct;
        
        userAnswer = JOptionPane.showInputDialog("Do you have a product? ");
        while(userAnswer.equalsIgnoreCase("Yes"))
        {
            String costString = JOptionPane.showInputDialog("How much was the item? ");
            eachProduct = Double.parseDouble(costString);
            total += eachProduct;
            String followUp = JOptionPane.showInputDialog("Do you have another product? ");
            if(followUp.equalsIgnoreCase("no"))
            {
                return total;
            }
        }
        
        return total;
    }
    
}
