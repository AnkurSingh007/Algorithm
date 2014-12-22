/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankur
 */
public class StackClass {
    private int[] elements;
    private int size = 0;
    public StackClass(){
        this.elements = new int[16];
    }
    public StackClass(int capacity){
        this.elements = new int[capacity];
    }
    public boolean isEmpty(){
        if(size == 0)return true;
        else return false;
    }
    public void push(int value){
        if(size == elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[++size] = value;
    }
    public int peek(){
        return elements[size];
    }
    public int pop(){
        return elements[size--];
    }
    public int getSize(){
        return size;
    }
}

   
