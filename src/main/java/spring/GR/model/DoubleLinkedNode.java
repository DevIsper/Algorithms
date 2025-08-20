package spring.GR.model;

public class DoubleLinkedNode {

    private Object info;
    private DoubleLinkedNode previous;
    private DoubleLinkedNode next;

    public DoubleLinkedNode(Object info, DoubleLinkedNode previous, DoubleLinkedNode next) {
        this.info = info;
        this.previous = previous;
        this.next = next;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public DoubleLinkedNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleLinkedNode previous) {
        this.previous = previous;
    }

    public DoubleLinkedNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedNode next) {
        this.next = next;
    }
}
