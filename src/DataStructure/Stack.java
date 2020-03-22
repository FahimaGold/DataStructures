/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mscs;

/**
 *
 * @author pc
 */
public class Stack {
    private int size;
    private int arr[];
    private int index = 0;
    
  
    
    public Stack(int size){
        this.size = size;
        this.arr = new int [size];
    }
    
    public void push(int element){
        if(index < size){
            arr[index] = element;
            index++;
        }
        else
            System.out.println("Stack overflow");
      
    }
    
    public int pop(){
        if(arr.length > 0) {
            
            return this.arr[--index];
           
        }
        
        else{
             System.out.println("Stack is empty");
             return 0;
        }
           
        
    }
    
    public int stackSize(){
        return arr.length;
    }
    
    public boolean isEmpty(){
        if(arr.length == 0)
            return true;
        else
            return false;
    }
    
    public boolean isFull(){
        if(index == size)
            return true;
        else
            return false;
    }
}
