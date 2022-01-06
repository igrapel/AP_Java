public class Advance extends Ticket
{
    private int daysAdvance;

    public Advance(int days)
    {
        daysAdvance = days;
    }

    public double getPrice()
    {
        if(daysAdvance < 10)
        {
            return 40.0;
        }
        return 30.0;
    }
}
