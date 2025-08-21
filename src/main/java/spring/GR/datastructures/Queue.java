package spring.GR.datastructures;

import spring.GR.model.LinkedNode;

public class Queue<T> {

    private LinkedNode<T> front;
    private LinkedNode<T> rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(T info) {
        var newNode = new LinkedNode<>(info, null);

        if(isEmpty()) {
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }

        var temp = front;
        front = front.getNext();
        if(front == null) rear = null;
        size--;
        return temp.getInfo();
    }

//    public T dequeue() {
//        if (isEmpty()) {
//            throw new IllegalStateException("Queue is empty!");
//        }
//
//        if (front.getNext() == null) {
//            var temp = front.getInfo();
//            front = rear = null;
//            return temp;
//        }
//
//        var temp = front.getInfo();
//        front = front.getNext();
//        return temp;
//    }

    public T rear() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }

        return rear.getInfo();
    }

    public T front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }

        return front.getInfo();
    }

    public int size() {
        return size;
    }
}
