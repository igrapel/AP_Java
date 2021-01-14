
package FRQ2016.Q1;

public class RandomLetterChooser extends RandomStringChooser
{
  public RandomLetterChooser(String str)
  {
      super(getSingleLetters(str));
  }
  
  public static String[] getSingleLetters(String str)
  {
     String[] arrayString = new String[str.length()];
     for(int i = 0; i < str.length();i++)
     {
         arrayString[i]= str.substring(i, i + 1);
     }
     return arrayString;
  }
  
  public static void main(String[] args)
  {
      RandomLetterChooser rcl = new RandomLetterChooser("CoralGables");
      for(int i = 0; i < 15; i++)
      {
          System.out.print(rcl.getNext() + '\t');
      }
  }
    
}
