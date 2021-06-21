import java.util.Arrays;
import java.util.ArrayList;

public class BruteCollinearPoints {
    private final ArrayList<LineSegment> lines = new ArrayList<LineSegment>();

    public BruteCollinearPoints(Point[] points)    // finds all line segments containing 4 points
    {
        if (points == null) {
            throw new IllegalArgumentException("Null Values.");
        }
        for (Point p : points) {
            if (p == null) {
                throw new IllegalArgumentException("Null Values.");
            }
        }
        
        Arrays.sort(points);
        for (int a = 0; a <= points.length - 4; a++) {
            for (int b = a + 1; b <= points.length - 3; b++) {
                for (int c = b + 1; c <= points.length - 2; c++) {
                    /**
                    System.out.println(("Iteration: "));
                    System.out.println("First Point:  " +points[a]);
                    System.out.println("Second Point:  " +points[b]);
                    System.out.println("Third Point:  " +points[c]);
                    //System.out.println("Fourth Point: " + points[d]);
                    System.out.println("Second Slope:" + points[a].slopeTo(points[b]));
                    System.out.println("Third Slope:" + points[a].slopeTo(points[c]));
                    //System.out.println("Fourth Slope:" + points[a].slopeTo(points[d]));**/
                    if (points[a].slopeTo(points[b]) == points[a].slopeTo(points[c]))
                    {
                        for (int d = c + 1; d <= points.length - 1; d++)
                        {
                            /**
                            System.out.println(("Iteration: "));
                            System.out.println("First Point:  " +points[a]);
                            System.out.println("Second Point:  " +points[b]);
                            System.out.println("Third Point:  " +points[c]);
                            System.out.println("Fourth Point: " + points[d]);
                            System.out.println("Second Slope:" + points[a].slopeTo(points[b]));
                            System.out.println("Third Slope:" + points[a].slopeTo(points[c]));
                            System.out.println("Fourth Slope:" + points[a].slopeTo(points[d]));**/
                            if (points[a].slopeTo(points[c]) == points[a].slopeTo(points[d]))
                            {
                                /** System.out.println("Last Loop: ");
                                System.out.println("First Point:  " +points[a]);
                                System.out.println("Fourth Point: " + points[d]);
                                System.out.println("Third Slope:" + points[a].slopeTo(points[c]));
                                System.out.println("Fourth Slope:" + points[a].slopeTo(points[d]));**/
                                LineSegment line = new LineSegment(points[a], points[d]);
                                lines.add(line);
                            }
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
    public LineSegment[] segments()                // the line segments
    {
        LineSegment[] linesArray = new LineSegment[lines.size()];
        lines.toArray(linesArray);
        return linesArray;
    }

    /**
     * Unit tests the Point data type.
     */
    public static void main(String[] args) {
        /* YOUR CODE HERE */
        /** Point[] testPoints = new Point[10];

        testPoints[1] = new Point(20000,21000);
        testPoints[2] = new Point(3, 91);
        testPoints[3] = new Point(-3, -1);
        testPoints[4] = new Point(3000, 7000);
        testPoints[5] = new Point(10000, 0);
        testPoints[6] = new Point(0, 10000);
        testPoints[7] = new Point(7000,3000);
        testPoints[8] = new Point(3000, 4000);
        testPoints[9] = new Point(14000, 15000);
        testPoints[0] = new Point(6000, 7000);

        BruteCollinearPoints test = new BruteCollinearPoints(testPoints);
        System.out.println(test.numberOfSegments());

        LineSegment[] lines = test.segments();

        for(LineSegment ls : lines)
        {
            System.out.println(ls);
        }

    }**/
}
}
