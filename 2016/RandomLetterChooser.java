/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRQ.Y2016.Q1;

public class RandomLetterChooser extends RandomStringChooser
{
/** Constructs a random letter chooser using the given string str.
* Precondition: str contains only letters.
*/
public RandomLetterChooser(String str)
{ 
    super(getSingleLetters(str));
   
}

/** Returns an array of single-letter strings.
* Each of these strings consists of a single letter from str. Element k
* of the returned array contains the single letter at position k of str.
* For example, getSingleLetters("cat") returns the
* array { "c", "a", "t" }.
*/
public static String[] getSingleLetters(String str)
{ 
String[] arrayString = new String[str.length()];
for(int i = 0; i< str.length(); i++)
{
    arrayString[i] = str.substring(i, i+1);
}
    return arrayString;
}

public static void main(String[] args)
{
RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
for (int k = 0; k < 4; k++)
{
System.out.print(letterChooser.getNext());
}
}
}
