/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Y2012;

/**
 *
 * @author ilan
 */
public class ClimbInfo {
    String peakName;
    int climbTime;
    
 /** Creates a ClimbInfo object with name peakName and time climbTime.
 * @param peakName the name of the mountain peak
 * @param climbTime the number of minutes taken to complete the climb
 */
    public ClimbInfo(String peakName, int climbTime)
    { 
        this.peakName = peakName; 
        this.climbTime = climbTime;
    } 
    
     /** @return the name of the mountain peak
 */
 public String getName()
 { return peakName; }
 /** @return the number of minutes taken to complete the climb
 */
 public int getTime()
 { return climbTime;}
 // There may be instance variables, constructors, and methods that are not shown.
}
