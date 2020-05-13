
package modified2020;
import java.util.ArrayList;

public class OnlinePurchaseManager
{
/** An ArrayList of purchased Gizmo objects, instantiated in the constructor. */
private ArrayList<Gizmo> purchases;
/** Returns the number of purchased Gizmo objects that are electronic and are
* manufactured by maker, as described in part (a).
*/

public OnlinePurchaseManager(Gizmo a, Gizmo b, Gizmo c, Gizmo d, Gizmo e)
{
    purchases.add(a);
    purchases.add(b);
    purchases.add(c);
    purchases.add(d);
    purchases.add(e);
}
public int countElectronicsByMaker(String maker)
{ 
    int count = 0;
    for(Gizmo g : purchases)
    {
        if(g.getMaker().equalsIgnoreCase(maker) && g.isElectronic())
        {
            count++;
        }
    }
    return count;
}

public boolean hasAdjacentEqualPair()
{
    for (int i = 0; i < purchases.size() - 1; i++)
            {
                if(purchases.get(i).equals(purchases.get(i + 1)))
                {
                    return true;
                }
            }
    return false;
}

//testing execution
public static void main(String[] args)
{
    Gizmo p1 = new Gizmo("Brandy", true);
    Gizmo p2 = new Gizmo("Dons", false);
    Gizmo p3 = new Gizmo("Dons", true);
    Gizmo p4 = new Gizmo("Brandy", false);
    Gizmo p5 = new Gizmo("Brandy", true);
    
    OnlinePurchaseManager test = new OnlinePurchaseManager(p1, p2, p3, p4, p5);
   
  
}
}

/*
The Gizmo class would need to create a new variable for price. 
The OnlinPurchaseManager would need a lowestPrice Variable.
public Gizmo getCheapestGizmoByMaker(String maker)
{

}

*/
