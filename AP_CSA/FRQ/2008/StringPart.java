
package FRQ2008.Q2;


public class StringPart 
{
    private int start;
    private int length;
  
public StringPart(int start, int length)
{
    this.start = start;
    this.length = length;
}

public int getStart() {
        return start;
    }

public int getLength() {
        return length;
    }
        

public String toString()
{
        return "< " + start + " ," + length + " >";
}
    
    
}
