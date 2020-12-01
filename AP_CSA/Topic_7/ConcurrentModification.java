
package Topic_7;
import java.util.ArrayList;

public class ConcurrentModificationE 
{

public static void main(String[] args)
{
    ArrayList<String> students = new ArrayList<String>();
    
    
    students.add("James");
    students.add("Eva");
    students.add("Smith");
    students.add("Smith");
    
    
    students.add("Jennifer");
   students.add("Smith");
    
    //Exception: IndexoutofBoundsError
    //System.out.println(students.get(students.size()));
    
    //Remove evas from list - wrong way - concurrent modification exception
//    for(String name : students)
//    {
//        if(name.equals("Eva"))
//        {
//            students.remove(name);
//        }
//    }
    System.out.println("Before removing Smith");
    System.out.println("___________________");
    for(String name : students)
    {
        System.out.println(name);
    }
    System.out.println("___________________");
    System.out.println("After Removing Smith");
    System.out.println("___________________");
    //logic error
    for(int i = 0; i < students.size(); i++)
    {
        if(students.get(i).equals("Smith"))
        {
            students.remove(i);
            //fixes logic error
            i--;
        }
    }
    
    for(String name : students)
    {
        System.out.println(name);
    }
    
}

}
