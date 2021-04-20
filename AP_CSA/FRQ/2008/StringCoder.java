
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
        int location = masterString.indexOf(str.substring(0,index));
        
        while(index < str.length() && masterString.indexOf(str.substring(0,index + 1)) != -1)
        {
            index++;
        }
        
        StringPart part = new StringPart(location, index);
        return part;
    }
    
    public ArrayList<StringPart> encodeString(String word)
    {
        ArrayList<StringPart> parts = new ArrayList<StringPart>();
        
        while(word.length() > 0)
        {
            StringPart part = findPart(word);
            word = word.substring(part.getLength());
            parts.add(part);
        }
        return parts;
    }
    
    public static void main(String[] args) {
        StringCoder test = new StringCoder("sixtyzipperswerequicklypickedfromthewovenjutebag");
        System.out.println(test.findPart("over"));
        System.out.println(test.encodeString("overeager"));
    }
}
