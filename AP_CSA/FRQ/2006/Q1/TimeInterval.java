package AP2006;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TimeInterval
{
    DateTimeFormatter dtf;
    LocalDateTime now;
    Scanner inp;
    LocalDateTime start;
    LocalDateTime end;

    public TimeInterval()
    {
        dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Start of appointment");
        inp = new Scanner(System.in);
        System.out.println("Year: ");
        int y = inp.nextInt();
        System.out.println("Month: ");
        int month = inp.nextInt();
        System.out.println("Day: ");
        int d = inp.nextInt();
        System.out.println("Hour: ");
        int h = inp.nextInt();
        System.out.println("Minute: ");
        int minute = inp.nextInt();

        start = LocalDateTime.of(y, month, d, h, minute);
        System.out.println("Start of appointment: " + dtf.format(start));
        System.out.println("End  of appointment: ");
        System.out.println("Hour: ");
        int h_end = inp.nextInt();
        System.out.println("Minute: ");
        int minute_end = inp.nextInt();
        end = LocalDateTime.of(y, month, d, h_end, minute_end);

        now = LocalDateTime.now();
        System.out.println(now);
        String date = dtf.format(now);
        System.out.println(date);

        System.out.println("You scheduled for: ");
        System.out.println("Start: " + start);
        System.out.println("End: " + end);
    }

    public boolean overlapsWith(TimeInterval interval)
    {
        if(interval.start.compareTo(this.start) == -1 && interval.start.compareTo(this.end) ==1 )
        {
            return true;
        }
        if(interval.end.compareTo(this.start) == -1 && interval.end.compareTo(this.end) ==1 )
        {
            return true;
        }
        if(interval.start.compareTo(this.start) == 1 && interval.end.compareTo(this.end) == -1 )
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        TimeInterval test = new TimeInterval();
        LocalDateTime another = LocalDateTime.of(2021, 11, 18, 11, 01);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String d = dtf.format(another);
        System.out.println(d);
        System.out.println(another.compareTo(test.now));
        System.out.println(test.now.compareTo(another));
    }
}
