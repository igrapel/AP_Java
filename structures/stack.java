
public class Stack 
{
 private String[] myStack;
 private int size;   
 private int top;   
    
 //constructor 
 public Stack(int s)
 {
     size = s;
     myStack = new String[size];
     top = -1;
 }
 
 public String getURL(int i)
 {
     return myStack[i];
 }
 
 public void push(String url)
 {
     top++;
     myStack[top] = url;
     System.out.println("You just accessed URL: " + url);
 }
 
 public String pop()
 {
     String toPop = myStack[top];
     top--;
     System.out.println("Popping: " + toPop);
     return toPop;
 }
 
 public boolean isEmpty()
 {
     if(top==-1)
     {
         return true;
     }
     else
     {
         return false;
     }
 }
 
 public boolean isFull()
 {
     if(top== size-1)
     {
         return true;
     }
     else
     {
         return false;
     }
 }
}
