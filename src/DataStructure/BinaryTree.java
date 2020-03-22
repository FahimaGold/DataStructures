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
public class BinaryTree {
    private Node root;
    
    //Recursive method to insertion
    private Node insert(Node currentNode, int value){
        if(currentNode == null){
            return new Node(value);
        }
        if(value < currentNode.value){
            currentNode.left = insert(currentNode.left, value);
        }
        else if(value > currentNode.value){
            currentNode.right = insert(currentNode.right, value);
          
        }
        else
            return currentNode;
       return currentNode;
    }
    
    public void add(int value) {
    root = insert(root, value);
}

   
}
