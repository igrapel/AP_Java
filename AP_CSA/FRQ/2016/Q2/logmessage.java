package FRQ.Y2016.Q2;

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
        
        if(description.indexOf(" " + keyword + " ") != -1)
        {
        return true;            
        }
        else if(indexKey == 0 && 
                ((description.indexOf(keyword + " ") != -1) || (keyword.length() == description.length())))
        {
        return true;
        }
        else if(description.substring(descriptionLength - keywordLength -1).equals(" " + keyword))
        {
        return true;
        }
        else
        {
        return false;    
        }
    }
       
    public String getMachineId()
        {return machineId;}
        
    public String getDescriptionId()
        {return description;}   
        
    public static void main(String[] args)
    {
        LogMessage test = new LogMessage("Server1:disk");
        System.out.println(test.containsWord("disk"));
    }
    
}
