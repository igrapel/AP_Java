
package Week2;
import java.util.*;
import java.lang.NullPointerException;


public class Deque<Item> implements Iterable<Item> {

private Item item;
private Node first;
private Node last;
private int count;

private class Node
{
    Item item = null;
    Node behind = null;
    Node forward = null;
} 
    
// construct an empty deque
public Deque()
{
    first = new Node();
    last = first;
    count = 0;
}
    
// is the deque empty?
public boolean isEmpty()
{ return count == 0; }

// return the number of items on the deque
public int size()
{ return count; }

// add the item to the front
public void addFirst(Item item)
{
    if(item == null)
    {
        throw new IllegalArgumentException();
    }
    
    Node oldFirst = first;
    first = new Node();
    first.item = item;
    first.behind = oldFirst;
    oldFirst.forward = first;
    count++;
    if(count == 1)
    {
        last = first;
    }
}
        
// add the item to the back
public void addLast(Item item)
{
    if(item == null)
    {
        throw new IllegalArgumentException();
    }
    
    Node oldLast = last;
    last.item = item;
    oldLast.behind = last;
    last.forward = oldLast;
    count++;
}

// remove and return the item from the front
public Item removeFirst()
{
    if(count == 0)
    {
         throw new NoSuchElementException();
    }
    
    Node removedFirst = first;
    first = first.behind;
    first.forward = null;
    count--;
    return removedFirst.item;
    
}

    // remove and return the item from the back
public Item removeLast()
{
    if(count == 0)
    {
         throw new NoSuchElementException();
    }
    
    Node removedLast = last;
    last = last.forward;
    last.behind = null;
    count--;
    return removedLast.item;
}

//return an iterator over items in order from front to back
public Iterator<Item> iterator()
{ return new ListIterator(); }
    
private class ListIterator implements Iterator<Item>
{
    private Node current = first;
    public boolean hasNext() { return current.behind != null; }
    public void remove() { throw new UnsupportedOperationException(); }
    public Item next()
    {
        Item item = current.item;
        current = current.behind;
        return item;
    }
 }    
  

    // unit testing (required)
    public static void main(String[] args)
    {
       //Deque <String> test = new Deque<>();
       
//       while (!StdIn.isEmpty())
//        {
//            String s = StdIn.readString();
//            if (s.equals("-")) StdOut.print(test.removeFirst());
//            else test.addFirst(s);
//        } 
//       
//       Iterator iterator = test.iterator(); 
//  
//       System.out.println("List elements : "); 
//  
//       while (iterator.hasNext())
//       {
//          System.out.print(iterator.next() + " "); 
//          System.out.println();  
//       }

        int n = 5;
        Deque<Integer> queue = new Deque<Integer>();
        for (int i = 0; i < n; i++)
            queue.addFirst(i);
        for (int a : queue) {
            for (int b : queue)
                StdOut.print(a + "-" + b + " ");
                StdOut.println();
    }
}
}
