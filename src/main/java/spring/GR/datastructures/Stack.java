package spring.GR.datastructures;

import spring.GR.model.LinkedNode;

public class Stack<T> {
    private LinkedNode<T> top;
    private int size;


    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(T info) {
        top = new LinkedNode<>(info, top);
        size++;
    }

    public T pop() {
        if(top == null) {
            throw new IllegalStateException("Stack is Empty!");
        }

        var topValue = top.getInfo();
        top = top.getNext();
        size--;
        return topValue;
    }

    public T peek() {

        if(top == null) {
            throw new IllegalStateException("Stack is Empty!");
        }

        return top.getInfo();
    }

    public boolean isEmpty() {
        return top == null;
    }

    // O(1)
    public int size() {
        return size;
    }

    // O(n)
//    public int size() {
//        if(top == null) {
//            return 0;
//        }
//
//        int i = 0;
//        var aux = top;
//
//        while (aux != null) {
//            i++;
//            aux = aux.getNext();
//        }
//
//        return i;
//    }

}
