
package FRQ2016.Q2;

public class LogMessage 
{
    private String machineId;
    private String description;
    
    public LogMessage(String message)
    {
        int indexColon = message.indexOf(':');
        machineId = message.substring(0, indexColon);
        description = message.substring(indexColon + 1);
    }  
    
    public boolean containsWord(String keyword)
    {
        int indexKey = description.indexOf(keyword);
        int descriptionLength = description.length();
        int keywordLength = keyword.length();
        
        if(indexKey == -1)
        {
            System.out.println("Test 1");
            return false;
        }
        
        else if(indexKey != 0 && description.substring(indexKey - 1,indexKey).equals(' ')== false)
        {
            return false;
        }
       
        else if(indexKey != (descriptionLength - keywordLength) && description.substring(indexKey + keywordLength, indexKey + keywordLength + 1).equals(" "))
        {
            return false;
        }
        else
        {return true;}
    }
    
    public String getMachineId()
        {return machineId;}
        
    public String getDescriptionId()
        {return description;}   
        
    public static void main(String[] args)
    {
        LogMessage test = new LogMessage("Server1: file not find on disk DSK!");
        System.out.println(test.containsWord("Server1"));
    }
    
}
