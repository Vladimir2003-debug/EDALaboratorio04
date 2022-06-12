package TDA;

public class DoubleNode<E> extends Node<E> {
    protected DoubleNode<E> next;
    protected DoubleNode<E> prev;

    public DoubleNode(E data) {
        super(data);
    }

    public DoubleNode(E data, DoubleNode<E> next, DoubleNode<E> prev) {
        super(data);
        this.next = next;
        this.prev = prev;
    }

    public DoubleNode<E> getNext() {
        return this.next;
    }

    public void setNext(DoubleNode<E> next) {
        this.next = next;
    }

    public DoubleNode<E> getPrev() {
        return this.prev;
    }

    public void setPrev(DoubleNode<E> prev) {
        this.prev = prev;
    }
}
