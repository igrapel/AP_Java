
package FRQ2016.Q1;

import java.util.ArrayList;

public class RandomStringChooser 
{
private ArrayList<String> wordAL = new ArrayList<String>();

public RandomStringChooser(String[] words)
{
    for(int i = 0; i < words.length;i++)
    {
        wordAL.add(words[i]);
    }
}

public String getNext()
{
    if(wordAL.size() == 0)
    {
        return "NONE";
    }
    
    int randomIndex = (int)(Math.random()*wordAL.size());
    String removedWord = wordAL.remove(randomIndex);
    return removedWord;
}

public static void main(String[] args)
{
     String[] wordArray = {"wheels", "on", "the", "bus"};
     RandomStringChooser sChooser = new RandomStringChooser(wordArray);
    
    for(int i = 0; i < 10; i++)
    {
        System.out.print(sChooser.getNext() + "\t");
    }
}
}
