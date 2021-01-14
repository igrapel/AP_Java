
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
        
        if(indexKey == -1)
        {
            return false;
        }
        
        else if(indexKey != 0 && description.substring(indexKey - 1,indexKey).equals(' ')== false)
        {
            return false;
        }
       
        else if(description.indexOf(keyword + ' ' ) == -1 && description.substring(description.length() - keyword.length() - 1).equals(keyword))
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
        
        
    
}
