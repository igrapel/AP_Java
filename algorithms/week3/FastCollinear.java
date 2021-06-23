import java.util.ArrayList;
import java.util.Arrays;

public class FastCollinearPoints {
    private final ArrayList<LineSegment> lines = new ArrayList<LineSegment>();
    public FastCollinearPoints(Point[] points)     // finds all line segments containing 4 or more points
    {

        if (points == null)
        {
            throw new IllegalArgumentException("Null Values.");
        }
        for (Point p : points)
        {
            if (p == null)
            {
                throw new IllegalArgumentException("Null Values.");
            }
        }

        Point[] orderedPoints = new Point[points.length];
        for (int i = 0; i < points.length; i++)
        {
            orderedPoints[i] = points[i];
        }
        Arrays.sort(orderedPoints);
        for (int i = 0; i <= points.length - 2; i++)
        {
            if (orderedPoints[i].compareTo(orderedPoints[i+1]) == 0) { throw new IllegalArgumentException("Duplicate Values."); }
        }

        Point[] orderedPointsSlope = new Point[points.length];
        for (int i = 0; i < points.length; i++)
        {
            orderedPointsSlope[i] = points[i];
        }
        Arrays.sort(orderedPointsSlope);

        for (int i = 0; i <= points.length - 4; i++)
        {
            /** System.out.println("Loop: " + i);
             System.out.println("Origin Point: " + orderedPoints[i]);
             for(Point p : orderedPoints)
             {
             System.out.println(p);
             }*/
            int count = 0;
            int indexPoint = 1;
            Arrays.sort(orderedPointsSlope);
            Arrays.sort(orderedPointsSlope, orderedPoints[i].slopeOrder());
            /** System.out.println("Slope Sort");
             for(Point p : orderedPointsSlope)
             {
             System.out.println(p);
             }*/
            Point min = orderedPointsSlope[0];
            while (indexPoint <= (points.length - 2))
            {
                // System.out.println("Slope: " + indexPoint + ": " + orderedPointsSlope[0].slopeTo(orderedPointsSlope[indexPoint]));

                if (orderedPointsSlope[0].slopeTo(orderedPointsSlope[indexPoint]) == orderedPointsSlope[0].slopeTo(orderedPointsSlope[indexPoint +1]))
                {
                    if (orderedPointsSlope[indexPoint].compareTo(min) < 1)
                    {
                        min = orderedPointsSlope[indexPoint];
                    }
                    // System.out.println("Here");
                    count++;
                }
                if (orderedPointsSlope[0].slopeTo(orderedPointsSlope[indexPoint]) != orderedPointsSlope[0].slopeTo(orderedPointsSlope[indexPoint +1])
                        && (count >= 2))
                {
                    // System.out.println("Min: " + min);
                    if (min.compareTo(orderedPointsSlope[indexPoint]) == 0 || min.compareTo(orderedPointsSlope[0]) == 0)
                    {
                        LineSegment line = new LineSegment(orderedPointsSlope[0], orderedPointsSlope[indexPoint]);
                        lines.add(line);
                        count = 0;
                    }
                }
                indexPoint++;
                if (indexPoint == points.length - 1 && count >= 2)
                {
                    {
                        // System.out.println("Min: " + min);
                        if (min.compareTo(orderedPointsSlope[indexPoint]) == 0 || min.compareTo(orderedPointsSlope[0]) == 0)
                        {
                            LineSegment line = new LineSegment(orderedPointsSlope[0], orderedPointsSlope[indexPoint]);
                            lines.add(line);
                            count = 0;
                        }
                    }
                }
            }
        }
    }

    public int numberOfSegments()        // the number of line segments
    {
        return lines.size();
    }
    public LineSegment[] segments()   // the line segments
    {
        LineSegment[] linesArray = new LineSegment[lines.size()];
        lines.toArray(linesArray);
        return linesArray;
    }

    public static void main(String[] args)
    {
        /** Point[] testPoints = new Point[8];
         testPoints[0] = new Point(10000, 0);
         testPoints[1] = new Point(0,10000);
         testPoints[2] = new Point(3000, 7000);
         testPoints[3] = new Point(7000, 3000);
         testPoints[4] = new Point(20000, 21000);
         testPoints[5] = new Point(3000,4000);
         testPoints[6] = new Point(14000, 15000);
         testPoints[7] = new Point(6000, 7000);
         FastCollinearPoints test = new FastCollinearPoints(testPoints);
         System.out.println(test.numberOfSegments());
         LineSegment[] lines = test.segments();
         for (LineSegment ls : lines)
         {
         System.out.println(ls);
         }*/

    }
}
