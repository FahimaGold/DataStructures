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
public class Queue {
    private static int front, rear, size;
    private static int queue[];
    
    public Queue(int size){
        this.front = 0;
        this.rear = 0;
        this.size = size;
        this.queue = new int [size];
    }
    
    public void enaque(int element) throws Exception{
        //Queue isn't full
        if(rear <size){
            queue[rear] = element;
            rear++;
        }
        else
            throw new Exception(); 
    }
    
    
    public void dequeue(){
        //Queue isn't empty
        if(rear == front){
            System.out.println("Queue is empty");
        }
        else {
            for(int j=0; j< rear - 1; j++){
                queue[j] = queue[j+1];
                
            }
            //Storing 0 at rear indicaating theere's no element
            if(rear < size)
                queue[rear] = 0;
            rear--;
        }
    }
    
    public void displayQueueElement(){
        if(front == rear)
            System.out.println("Queue is empty");
        
        else{
            for(int j= front; j< rear;j++){
                System.out.println(queue[j]);
            }
        }
    }
}
