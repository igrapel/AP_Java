
package FRQ2008.Q2;

import java.util.ArrayList;

public class StringCoder {
   
    private String masterString;
    
    public StringCoder(String master)
    {
        masterString = master;
    }
    
    //part a
    public String decodeString(ArrayList<StringPart> parts)
    {
        String result = "";
        for(StringPart sp : parts)
        {
            int start = sp.getStart();
            int length = sp.getLength();
            result += masterString.substring(start, start+length);
        }
        return result;
    }
    
    private StringPart findPart(String str)
    {
        int index = 1;
       
        while(index < str.length() && masterString.indexOf(str.substring(0,index)) != -1)
        {
            index++;
        }
        
        if(masterString.indexOf(str) != -1)
        {
            StringPart part = new StringPart(masterString.indexOf(str) , str.length());
            return part;
        }
        else{
            int location = masterString.indexOf(str.substring(0,index - 1));
            StringPart part = new StringPart(location, index - 1);
            return part;
        }
    }
    
    public ArrayList<StringPart> encodeString(String word)
    {
        ArrayList<StringPart> parts = new ArrayList<StringPart>();
        
        int index = 0;
        while(index < word.length())
        {
            StringPart part = findPart(word);
            parts.add(part);
            word = word.substring(part.getLength());
        }
        return parts;
    }
    
    public static void main(String[] args) {
        StringCoder test = new StringCoder("sixtyzipperswerequicklypickedfromthewovenjutebag");
        System.out.println(test.findPart("over"));
        System.out.println(test.encodeString("overeager"));
    }
}
