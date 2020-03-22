/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mscsapplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author pc
 */
public class MSCSApplication {
  
    
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = new int[]{2, 2, 1, 1};
      
        char [] b = new char []{'A', 'B', 'C'};
       // System.out.print("Something: "+ b[2]);
        boolean isIt = false;
       // int res= isOlympic(a);
       
        //System.out.print("isOlympic is "+ res);
        //isIt = isPalindrom("doudoud");
        //System.out.println("" + isIt);
      Stack<String> stack = new Stack<String>();  
stack.push("Loal");  
stack.push("London");  
stack.push("Algeria");  
stack.push("Somewhere");  
stack.push("Kinda");  
stack.pop();  
Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}
   int index = 3;
   
   System.out.println("index value --index is ==> " + --index);
       
    }
    
}
