
package classes;


public class Time {
    int hour, minute;
    double second;

    public Time() {
        hour = 0;
        minute = 0;
        second = 0.0;
    }

    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public void setTime(int x, int y, double z)
    {
        hour = x;
        minute = y;
        second=z;
    }

    public static void main(String[] args) {

        // one way to create and initialize a Time object
        Time t1 = new Time(11, 12, 1.1);
        t1.setTime(0, 0, 0);
        printTime(t1);
        t1.hour = 11;
        t1.minute = 8;
        t1.second = 3.14159;
        System.out.println(t1);

        // another way to do the same thing
        Time t2 = new Time(11, 8, 3.14159);
        System.out.println(t2);
        printTime(t2);
   
    }
     public static void printTime(Time t) {
        System.out.println(t.hour + ":" + t.minute + ":" + t.second);
    }
}
