package Week3;

import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author ilan
 */

public class FastCollinearPoints {
   private ArrayList<Point> points_AL = new ArrayList<Point>();
   private ArrayList<LineSegment> LineSegments = new ArrayList<LineSegment>();
   
   public FastCollinearPoints(Point[] points)
   {
    this.checkInputs(points);   
    int N = points.length;
    
    for(int i = 0; i < N; i++)
      {
       points_AL.add(points[i]);
      }
    
    for(int i = 0; i < N; i++)
    {
     Point p = points_AL.get(i);
     Collections.sort(points_AL, p.slopeOrder()); 
     
        int first;
        int second;
        int third;
        int fourth;
    
    // finds all line segments containing 4 points
    //loop through and find whether points are all same sloped
        for(first = 0; first < (N - 3); first++)
        {
        Point point1 = points_AL.get(first);
            for(second = first + 1; second < (N-2); second++)
            {
            Point point2 = points_AL.get(second);
            double slope_1_2 = point1.slopeTo(point2);
                for(third = (second + 1); third < (N-1); third++)
                {
                    Point point3 = points_AL.get(third);
                    double slope_1_3 = point1.slopeTo(point3);
                        if(slope_1_3 == slope_1_2)
                        {
                            for(fourth = (third + 1); fourth <  N; fourth++)
                            {
                                Point point4 = points_AL.get(fourth);
                                double slope_1_4 = point1.slopeTo(point4);
                                if(slope_1_4 == slope_1_2)
                                {
                                    LineSegments.add(new LineSegment(point1, point4));
                                }
                            }
                        }
                }
            }   
        }  
    }  
 }
   
   private void checkInputs(Point[] p)
  {
    if(p==null)
    {
        throw new IllegalArgumentException("No Nulls");
    }
    
    for(int i = 0; i < p.length; i++)
    {
        if(p[i]==null)
        {
            throw new IllegalArgumentException("No Nulls");
        }
    }
    
    for (int j = 0; j < points_AL.size() - 1; j++) 
    {
            if (points_AL.get(j).compareTo(points_AL.get(j + 1)) == 0) 
            {
                throw new IllegalArgumentException("Duplicate Points.");
            }
    }
  }
    
   public int numberOfSegments()
   {           
     return LineSegments.size();
   }
   
   public LineSegment[] segments()
   {    
       LineSegment[] ls = new LineSegment[LineSegments.size()];
       ls = LineSegments.toArray(ls);
       return ls;
   }

}
