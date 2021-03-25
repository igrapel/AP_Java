
package FRQ2008.Q1;
import java.util.ArrayList;

public class Trip 
{
private ArrayList<Flight> flights = new ArrayList<Flight>();

public Trip(Flight f1) {
        flights.add(f1);
    }

public Trip(Flight f1, Flight f2) {
        flights.add(f1);
        flights.add(f2);
    }

    public Trip(Flight f1, Flight f2, Flight f3) {
        flights.add(f1);
        flights.add(f2);
        flights.add(f3);
    }
    
    public Trip(Flight f1, Flight f2, Flight f3, Flight f4) {
        flights.add(f1);
        flights.add(f2);
        flights.add(f3);
        flights.add(f4);
    }
    
     public Trip(Flight f1, Flight f2, Flight f3, Flight f4, Flight f5) {
        flights.add(f1);
        flights.add(f2);
        flights.add(f3);
        flights.add(f4);
        flights.add(f5);
    }

    public int getDuration()
    {
    if(flights.size()<1)
    {
        return 0;
    }
    else
    {
       Time d = flights.get(0).getDeparture();
       Time a = flights.get(flights.size() - 1).getArrival();
       return d.minutesUntil(a);
    }
   
        
    }
    
    public int getShortestLayover()
    {
        if(flights.size() < 2)
        {
            return -1;
        }
        
        int minLayover = Integer.MAX_VALUE;
        for(int i = 0; i < flights.size() - 1;i++)
        {
            int layOver = flights.get(i).getArrival().minutesUntil(flights.get(i+1).getDeparture());
            if(layOver < minLayover)
            {
              minLayover = layOver;  
            }  
        }
        return minLayover;
    
    }
    
    public static void main(String[] args) {
     //   Time t1 = new Time(3, 15, true);
        Time t2 = new Time(4, 15, true);
        Time t3 = new Time(4, 25, true);
        Time t4 = new Time(6, 15, true);
        Flight d1 = new Flight(new Time(3, 15, true), t2);
        Flight a2 = new Flight(t3, t4 );
        Trip myTrip = new Trip(d1, a2);
        
        System.out.println(myTrip.getDuration());
        System.out.println(myTrip.getShortestLayover());
    }
}
