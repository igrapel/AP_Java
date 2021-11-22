package AP2006;

public class Appointment
{

    private TimeInterval time;

    public TimeInterval getTime()
    {

        return time;
    }

    public boolean conflictsWith(Appointment other)
    {
        if(this.getTime().overlapsWith(other.getTime()))
        {
            return true;
        }
        else {return false;}
    }
}
