package spring.GR.model;

public class DoubleLinkedNode<T> {

    private T info;
    private DoubleLinkedNode<T> previous;
    private DoubleLinkedNode<T> next;

    public DoubleLinkedNode(T info, DoubleLinkedNode<T> previous, DoubleLinkedNode<T> next) {
        this.info = info;
        this.previous = previous;
        this.next = next;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public DoubleLinkedNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleLinkedNode<T> previous) {
        this.previous = previous;
    }

    public DoubleLinkedNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleLinkedNode<T> next) {
        this.next = next;
    }
}
