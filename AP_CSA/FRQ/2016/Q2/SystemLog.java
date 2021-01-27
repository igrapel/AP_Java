
public class SystemLog 
{
    private ArrayList<LogMessage> messageList;
    
    public SystemLog(LogMessage a)
    {
        messageList = new ArrayList<LogMessage>();
        messageList.add(a);
    }
    
    public ArrayList<LogMessage> removeMessages(String keyword)
    {
        ArrayList<LogMessage> removedMessagesList = new ArrayList<LogMessage>();
        for(LogMessage lm : messageList)
        {
            if(lm.containsWord(keyword))
            {
             removedMessagesList.add(lm);
            }
        }
        return removedMessagesList;
    }
  
}
