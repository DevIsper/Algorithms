package spring.GR.model;

public class LinkedNode<T> {
    private T info;
    private LinkedNode<T> next;

    public LinkedNode(T info, LinkedNode<T> next) {
        this.info = info;
        this.next = next;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public LinkedNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedNode<T> next) {
        this.next = next;
    }
}
