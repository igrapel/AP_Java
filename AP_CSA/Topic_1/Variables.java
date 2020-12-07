
package variables;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Variables {

    public static void main(String[] args) 
    {
        String car;
        double milesDriven;
        int gallonsUsed;
        double milesPerGallon;
        
//        Scanner key = new Scanner(System.in);
        
//        System.out.println("Enter Car Name:");
//        car = key.nextLine();
//        
//        System.out.println("Enter the miles driven");
//        milesDriven = key.nextDouble();
//        
//        System.out.println("Enter the gasoline used");
//        gallonsUsed = key.nextInt();
//        
//        System.out.println("You entered " + car + ", " + milesDriven + ", " + gallonsUsed + ".");
//        
        car = JOptionPane.showInputDialog("Enter the car maker");
        
        String input;
        
        input = JOptionPane.showInputDialog("Enter the miles driven.");
        milesDriven = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter the Gallons used");
        gallonsUsed = Integer.parseInt(input);
        
        milesPerGallon = milesDriven / gallonsUsed;
        
        System.out.println("Your miles per gallon is: " + milesPerGallon);
        
        
        
        
        
    }
    
}
