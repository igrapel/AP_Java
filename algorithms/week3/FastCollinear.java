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

        for (int i = 0; i <= points.length - 4; i++)
        {
            // System.out.println("Loop" + i);
            // System.out.println("Origin Point: " + points[i]);

            int count = 0;
            int indexPoint = 1;
            Arrays.sort(points, points[i].slopeOrder());

            /** for(Point p : points)
            {
                System.out.println(p);
            } */

            while (indexPoint <= (points.length - 2))
            {
                // System.out.println("Slope: " + index_point + ": " + points[0].slopeTo(points[index_point]));
                if (points[0].slopeTo(points[indexPoint]) == points[0].slopeTo(points[indexPoint +1]))
                {
                    // System.out.println("Here");
                    count++;
                }
                if (points[0].slopeTo(points[indexPoint]) != points[0].slopeTo(points[indexPoint +1]) && (count >= 2))
                {
                    LineSegment line = new LineSegment(points[0], points[indexPoint]);
                    lines.add(line);
                    count = 0;
                }
                indexPoint++;
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
        /** Point[] testPoints = new Point[10];

        testPoints[0] = new Point(6000, 7000);
        testPoints[1] = new Point(20000,21000);
        testPoints[2] = new Point(3, 91);
        testPoints[3] = new Point(-3, -11);
        testPoints[4] = new Point(3000, 7000);
        testPoints[5] = new Point(10000, 0);
        testPoints[6] = new Point(0, 10000);
        testPoints[7] = new Point(7000,3000);
        testPoints[8] = new Point(3000, 4000);
        testPoints[9] = new Point(14000, 15000);


        FastCollinearPoints test = new FastCollinearPoints(testPoints);
        System.out.println(test.numberOfSegments());

        LineSegment[] lines = test.segments();

        for (LineSegment ls : lines)
        {
            System.out.println(ls);
        }

    }**/
}
}
