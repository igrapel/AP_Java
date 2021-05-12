import java.util.ArrayList;

public class WordPairList
{
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<allPairs>();
        for(int i = 0; i < words.length-1; i++)
        {
            for(int j = i + 1; j < words.length)
            {
                allPairs(new WordPair(words[i], words[j]))
            }
        }

        public int numMatches()
        {
            int matches = 0;
            for(WordPair wp : allPairs)
            {
                if(wp.getFirst() == wp.getSecond())
                {
                    matches++;
                }
            }
            return matches;
        }

    }

}
