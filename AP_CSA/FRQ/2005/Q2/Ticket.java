import java.util.UUID;

public abstract class Ticket
{
    private static int sequence = 0;
    private int serialNumber;

    public Ticket()
    {
        serialNumber = getNextSerialNumber();
    }

    public abstract double getPrice();

    public String toString()
    {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    private static int getNextSerialNumber()
    {
        sequence++;
        return sequence;
    }
}
