
package FRQ2010.Q1;

import java.util.ArrayList;


public class MasterOrder 
{
    private ArrayList<CookieOrder> orders;
    
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }
    
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);
    }
    
    public int getTotalBoxes()
    {
        int sum = 0;
        for(CookieOrder o : orders)
        {
            sum += o.getNumBoxes();
        }
        return sum;
    }
    
    public int removeVariety(String cookieVar)
    {
        int removedBoxes = 0;
        for(int i = 0; i < orders.size();i++)
        {
            if(orders.get(i).getVariety().equals(cookieVar))
            {
                removedBoxes -= orders.get(i).getNumBoxes();
                orders.remove(i);
                i--;
            }
        }
        return removedBoxes;
    }
}
