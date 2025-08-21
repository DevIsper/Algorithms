package spring.GR.datastructures;

import spring.GR.model.LinkedNode;

public class LinkedList<T> {

    private LinkedNode<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(T info) {
        var newNode = new LinkedNode<>(info, null);
        if(isEmpty()) {
            head = newNode;
        } else {
            var temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(newNode);
        }

        size++;
    }

    public T pop() {
        if(isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }

        var temp = head;
        if(head.getNext() == null) {
            head = null;
            size--;
            return temp.getInfo();
        } else {

            while (temp.getNext().getNext() != null) {
                temp = temp.getNext();
            }

            var temp2 = temp.getNext().getInfo();
            temp.setNext(null);
            size--;
            return temp2;
        }
    }

    public void insert(int i, T info) {
        if(isEmpty()) {
            push(info);
            System.out.println("List was empty. Inserted into the first node.");
            return;
        }

        if(i > size - 1) {
            System.out.printf("List is smaller than %d. Inserting in the last position.", i);
            push(info);
            return;
        }

        var newNode = new LinkedNode<>(info, null);

        if (i <= 0) {
            newNode.setNext(head);
            head = newNode;
            size++;
            return;
        }

        var temp = head;

        for (int j = 0; j < i - 1; j++) {
            temp = temp.getNext();
        }

        var temp2 = temp;
        temp = temp.getNext();


        newNode.setNext(temp);
        temp2.setNext(newNode);
        size++;
    }

    public void remove(int i) {
        if (isEmpty()) {
            throw new IllegalStateException("Empty list!");
        }

        if (i <= 0) {
            head = head.getNext();
        } else {
            if (i > size - 1) {
                throw new IllegalStateException("Removal position outside of list.");
            }

            var temp = head;
            for (int j = 0; j < i - 1; j++) {
                temp = temp.getNext();
            }

            var toRemove = temp.getNext();
            temp.setNext(toRemove.getNext());
        }

        size--;
    }

//    public void remove(int i) {
//        if(isEmpty()) {
//            throw new IllegalStateException("Empty list!");
//        }
//
//        if(i <= 0) {
//            head = head.getNext();
//        } else {
//            var temp = head;
//
//            for (int j = 0; j < i - 1; j++) {
//                temp = temp.getNext();
//            }
//
//            var temp2 = temp;
//            if( temp.getNext().getNext() != null) {
//                temp = temp.getNext().getNext();
//                temp2.setNext(temp);
//            } else {
//                temp2.setNext(null);
//            }
//        }
//
//        size--;
//    }

    public T elementAt(int i) {
        if(isEmpty()) {
            throw new IllegalStateException("Empty list!");
        }

        if (i > size - 1 || i < 0) {
            throw new IllegalStateException("Searching outside the list!");
        }

        var temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.getNext();
        }

        return temp.getInfo();
    }

    public int size() {
        return size;
    }

    public void printList() {
        var temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.getInfo());
            if (temp.getNext() != null) {
                System.out.print(", ");
            }
            temp = temp.getNext();
        }
        System.out.println("]");
    }
}
