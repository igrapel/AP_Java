import java.text.DecimalFormat;

public class Point {
    double x;
    double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        DecimalFormat df = new DecimalFormat("##.##");
        return "( " + df.format(this.x) + ", " + df.format(this.y) + ") ";
    }
}
