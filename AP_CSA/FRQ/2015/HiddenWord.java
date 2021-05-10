public class HiddenWord
{
    String word;

    public HiddenWord(String w)
    {
        word = w;
    }

    public String getHint(String s)
    {
        String result = "";
        for(int i = 0; i < s.length(); i++)
        {
            String letter = s.substring(i, i + 1);
            if(s.indexOf(letter, i) == word.indexOf(letter, i))
            {
                result += letter;
            }
            else if(word.indexOf(letter) != -1)
            {
                result += "+";
            }
            else
            {
                result += "*";
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        HiddenWord test = new HiddenWord("HARPS");
        System.out.println(test.getHint("HELSO"));
    }
}
