/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Y2012;
import java.util.ArrayList; // import the ArrayList class

/**
 *
 * @author ilan
 */
public class ClimbingClub {
    /** The list of climbs completed by members of the club.
 * Guaranteed not to be null. Contains only non-null references.
 */
 private ArrayList<ClimbInfo> climbList;
 /** Creates a new ClimbingClub object. */
 public ClimbingClub()
 { climbList = new ArrayList<ClimbInfo>(); } 
 
 public ArrayList<ClimbInfo> getClimbList()
 {
     return climbList;
 }
 
  /** Adds a new climb with name peakName and time climbTime to the list of climbs.
 * @param peakName the name of the mountain peak climbed
 * @param climbTime the number of minutes taken to complete the climb
 */
 public void addClimb(String peakName, int climbTime)
 { /* to be implemented in part (a) with ClimbInfo objects in the order they were added */
 /* to be implemented in part (b) with ClimbInfo objects in alphabetical order by name */
     ClimbInfo newClimb = new ClimbInfo(peakName, climbTime);
     climbList.add(newClimb);
 } 
 
  public void addClimb(String peakName, int climbTime, boolean t)
 { /* to be implemented in part (a) with ClimbInfo objects in the order they were added */
 /* to be implemented in part (b) with ClimbInfo objects in alphabetical order by name */
    ClimbInfo newClimb = new ClimbInfo(peakName, climbTime);
    int index = 0;
    while(index < climbList.size() && this.climbList.get(index).getName().compareTo(newClimb.getName()) < 0)
    {
    index++;
    }
    if(this.climbList.size() <= index)
    {
    climbList.add(newClimb);
    }
    else
    {
    climbList.add(index, newClimb);  
    }
  }
 
 public static void main(String[] args)
 {
 ClimbingClub hikerClub = new ClimbingClub();
 hikerClub.addClimb("Monadnock", 274, true);
 hikerClub.addClimb("Whiteface", 301, true);
 hikerClub.addClimb("Algonquin", 225, true);
 hikerClub.addClimb("Monadnock", 344, true); 
 
 for(ClimbInfo climb : hikerClub.getClimbList())
 {
     System.out.println(climb.getName());
 }
     
 }
    
}
