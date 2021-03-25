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
public class Time {
    int minutesInDay;
    boolean morning;
    
    public Time(int h, int m, boolean morning)
    {
        this.morning = morning;
        
        if(morning)
        {
            minutesInDay = h*60 + m;
        }
        else
        {
            minutesInDay = (h + 12)*60 + m;
        }
    }

    public int getMinutesInDay() {
        return minutesInDay;
    }

    public boolean isMorning() {
        return morning;
    }
    
    public int minutesUntil(Time object)
    {
        return object.getMinutesInDay() - this.getMinutesInDay();
    }
    
}
