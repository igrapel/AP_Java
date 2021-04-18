import java.util.ArrayList;

public class Hexagon{

    double radius;
    double angle;
    ArrayList<Point> points = new ArrayList<Point>();

    public Hexagon(double r, int a)
    {
        radius = r;
        
        for(double i = a; i <a+2*Math.PI; i+= 2*Math.PI/6 )
        {
            double x = radius * Math.cos(i);
            double y = radius * Math.sin(i);
            Point p = new Point(x,y);
            points.add(p);

        }
    }

    public ArrayList<Point> getPoints()
    {
        return points;
    }

    public static void main(String[] args)
    {
        Hexagon hex = new Hexagon(4, 0);
        System.out.println(hex.getPoints());
    }
}
