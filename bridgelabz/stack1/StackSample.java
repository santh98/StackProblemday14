package com.bridgelabz.stack1;

public class StackSample <T> {

    LinkedList<T> linkedList = new LinkedList<T>();

    public void add(T data){
        linkedList.add(data);
    }
    public  void show(){
        linkedList.show();
    }
    public void pop(T data){

        T element;
        element = linkedList.element(data);
    }
}
