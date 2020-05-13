package modified2020;

public class Gizmo
{
    String maker;
    boolean electronic;
    
    public Gizmo(String maker, boolean electronic)
    {
        this.maker = maker;
        this.electronic = electronic;
    }
 /** Returns the name of the manufacturer of this Gizmo. */
    public String getMaker()
    {
    return maker;
    }
 /** Returns true if this Gizmo is electronic, and false
otherwise.
 */
    public boolean isElectronic()
    { 
    return true;
    }
 /** Returns true if this Gizmo is equivalent to the Gizmo
object
 * represented by the parameter, and false otherwise.
 */
    
    
public boolean equals(Object object){
    // creates equals method that returns equal if BOTH maker and electronic value are same
    
  if(this == object) return true;//if both of them points the same address in memory

  if(!(object instanceof Gizmo)) return false; // if "that" is not a People or a childclass

  Gizmo thatObject = (Gizmo)object; // than we can cast it to People safely

  return thatObject.getMaker().equalsIgnoreCase(this.getMaker()) && thatObject.isElectronic()==this.isElectronic();
  
}
}
