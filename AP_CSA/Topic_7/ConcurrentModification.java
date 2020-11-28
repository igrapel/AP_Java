/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod7;
import java.util.*;  
  
public class ConcurrentModification {  
  
    public static void main(String[] args) {  
        ArrayList<String> students = new ArrayList<String>();  
  
        students.add("Ian");  
        students.add("Greta");  
        students.add("Eva");  
     //  add in after first round  students.add("Eva"); 
        students.add("Mandy");  
        students.add("Joe");  
        students.add("Eva"); 

     
       for(String name : students)
       {
         if(name.equals("Eva"))
         {students.remove(name);}
       }
     
     
     System.out.println(students);

         for(int i = 0; i < students.size(); i++)
         {
              if(students.get(i).equals("Eva"))
              {students.remove(i);}
         }
  
     System.out.println(students);
        }  
  
    }  
