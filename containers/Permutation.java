package Week2;
import java.util.Random;
//import edu.princeton.cs.algs4.StdRandom;
//import edu.princeton.cs.algs4.StdOut;
//import edu.princeton.cs.algs4.StdIn;

/**
 *
 * @author ilan
 */
public class Permutation 
{

   public static void main(String[] args)
   {
       int numOfStrings = Integer.parseInt(args[0]);
       //int numOfStrings = 4;
       int k = 0;
       String[] strings = new String[numOfStrings];
       
       while (k < numOfStrings)
            {
            String s = StdIn.readString();  
            strings[k] = s;
            k++;
            }
       StdRandom.shuffle(strings);
       for(String s : strings)
       {
           StdOut.println(s);
       }
    }
}
