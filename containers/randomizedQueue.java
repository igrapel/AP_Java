package Week2;

import java.util.Iterator;
import java.util.Random;
//import edu.princeton.cs.algs4.StdRandom;
//import edu.princeton.cs.algs4.StdOut;
//import edu.princeton.cs.algs4.StdIn;


public class RandomizedQueue<Item> implements Iterable<Item> {
    private Item[] q;
    private int N = 0;

    public RandomizedQueue()
    { q = (Item[]) new Object[1]; }

    public boolean isEmpty()
    { return N == 0; }

    // return the number of items on the randomized queue
    public int size()
    {
        return N;
    }

    private void resize(int capacity)
    {
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < N; i++)
        {
            copy[i] = q[i];
        }
        q = copy;
    }
    // add the item
    public void enqueue(Item item)
    {
        if (null == item)
        {
            throw new java.util.NoSuchElementException("Enqueued a null item!");
        }
        if(N == q.length) resize(2 * N);
        q[N++] = item;
    }
    
    private void shiftAftRemove(int remIndex )
    {
        
        for ( int i = remIndex ; i < q.length - 1 ; i++ )
            {
            q[ i ] = q[ i + 1 ] ; 
            }
    }
    
    // remove and return a random item
    public Item dequeue()
    {
        if(N == 0)
        {
            throw new java.util.NoSuchElementException("Dequeued an empty array...");
        }
        if (N > 0 && N == q.length/4) resize(q.length/2);
        
        int randomIndex = StdRandom.uniform(N);
        Item chosenItem = q[randomIndex];
        shiftAftRemove(randomIndex);
        
//        Item chosenItem = q[randomIndex];
//        q[randomIndex] = null;
        
        
        N--;
        return chosenItem;
    }
     
    // return a random item (but do not remove it)
    public Item sample()
    {
         if(N == 0)
        {
            throw new java.util.NoSuchElementException();
        }
        
        int randomIndex = StdRandom.uniform(N);
        
        Item chosenItem = q[randomIndex];
        
//alternate 
//        StdRandom.shuffle(q);
//        return q[0];
        return chosenItem;
    }

   
   // iterator experiment
    public Iterator<Item> iterator()
    {   
        return new randomIterator(); 
    }
    
    private class randomIterator implements Iterator<Item>
    {
    private int i = 0;      
    private final Item[] shuffledQ = (Item[]) new Object[N]; 
    
    private randomIterator()
    {
        for(int ind = 0; ind < N; ind++)
        {
            shuffledQ[ind] = q[ind];
        }
        
        StdRandom.shuffle(shuffledQ);
    }
    
    public boolean hasNext() { return i < N; }
    public void remove() { throw new UnsupportedOperationException(); }
    public Item next()
    {
        if(!hasNext())
        {
           throw new java.util.NoSuchElementException();
        }
         return shuffledQ[i++];
    }
 }    
 
    // unit testing (required)
    public static void main(String[] args)
    {
         RandomizedQueue<String> rq = new RandomizedQueue<String>();

        System.out.println("-isempty " + rq.isEmpty());

        rq.enqueue("Go");
        rq.enqueue("to");
        rq.enqueue("store");
        rq.enqueue("buy");
        rq.enqueue("me");
        rq.enqueue("some");
        rq.enqueue("quinoa");
        rq.enqueue("please");
        System.out.println("-initial " + rq.size());

        System.out.println("-dequeue " + rq.dequeue());

        System.out.println("-dequeued size " + rq.size());

        System.out.println("-sample " + rq.sample());
        System.out.println("-sample " + rq.sample());
        System.out.println("-sample " + rq.sample());
//
        System.out.println("-random iterator");
        for (String s : rq) {
            System.out.println(s);
        }

//        System.out.println("-random iterator one more time");
//        for (String s : rq) {
//            System.out.println(s);
//        }
//        
        int n = 5;
        RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
        
        for (int i = 0; i < n; i++)
            queue.enqueue(i);
        for (int a : queue) {
            for (int b : queue)
                StdOut.print(a + "-" + b + " ");
                StdOut.println();
            }
         
    }

}
