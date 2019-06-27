
package practiceloops;

public class ForLoops 
{
    public static void main(String[] args)
    {
//        int counter = 0;
//        
//        while (counter < 8)
//        {
//            System.out.println("The number in this while loop is " + counter);
//            
//            counter++;
//        }
//        
//        for(int x = 0; x < 8; x++)
//        {
//            System.out.println("The number in this for loop is: " + x);
//        }
//        
        int[] myArray = {12, 33, 5, 10, 91};
        
        for(int x = 0; x < myArray.length; x++)
        {
            System.out.println("A number in the array: " + myArray[x]);
        }
    }
}


