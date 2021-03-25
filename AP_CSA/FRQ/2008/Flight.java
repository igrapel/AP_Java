/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRQ2008.Q1;

/**
 *
 * @author 323917
 */
public class Flight {
    Time departure;
    Time arrival;
    
    public Flight(Time d, Time a)
    {
        departure = d;
        arrival = a;
    }

    public Time getDeparture() {
        return departure;
    }

    public Time getArrival() {
        return arrival;
    }
    
    
    public static void main(String[] args) {
        Time t1 = new Time(1,0,false);
        Time t2 = new Time(2, 15, false);
        
        System.out.println(t1.getMinutesInDay());
        System.out.println("Time until: " + t1.minutesUntil(t2));
    }
    
}
