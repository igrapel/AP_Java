package FRQ.Y2016.Q2;

public class LogMessageError 
{
    private String machineId;
    private String description;
    
    public LogMessageError(String message)
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
        
        else if(indexKey != 0 && description.substring(indexKey - 1,indexKey).equals(" ")== false)
        {
            System.out.println("Test 2");
            return false;
        }
       
        else if(indexKey != (descriptionLength - keywordLength) && !description.substring(indexKey + keywordLength, indexKey + keywordLength + 1).equals(" "))
        {
             System.out.println("Test 3" + description.substring(indexKey + keywordLength, indexKey + keywordLength + 1).equals(" "));
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
        LogMessage test = new LogMessage("Server1: file not find on this disk now");
        System.out.println(test.containsWord("disk"));
    }
    
}
