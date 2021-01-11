
package FRQ.Y2016.Q1;

import java.util.ArrayList;

public class RandomStringChooser 
{
    private ArrayList<String> wordAL = new ArrayList<String>();
    
    public RandomStringChooser(String[] words)
    {
        for(int i = 0; i < words.length; i++)
        {
            wordAL.add(words[i]);
        }
    }
    
    public String getNext()
    {
        if(wordAL.size() < 1)
        {
            return "NONE";
        }
        else
        {
        int indexToRemove = (int)(Math.random()*wordAL.size());
        String wordToRemove = wordAL.remove(indexToRemove);  
        return wordToRemove;
        }  
    }
    public static void main(String[] args)
    {
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for (int k = 0; k < 6; k++)
        {
        System.out.print(sChooser.getNext() + " ");
        }
    }
   
    
}
