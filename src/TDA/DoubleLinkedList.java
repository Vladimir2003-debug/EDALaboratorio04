package TDA;

public class DoubleLinkedList<E> extends LinkedList<E>{
    private DoubleNode<E> last;
    private DoubleNode<E> first;

    public DoubleLinkedList() {
        super();
    }

    public DoubleLinkedList(E root) {
        add(root);
    }

    public boolean add(E e) {
        if(this.first == null) {
            this.first = this.last = new DoubleNode<E>(e);
            size++;
            return true;
        }

        this.last = new DoubleNode<E>(e, null, this.last);
        return true;
    }

    public void add(int index, E element) {
        if(this.first == null) {
            this.first = this.last = new DoubleNode<E>(element);
            size++;
            return;
        }
        DoubleNode<E> tmp = this.first;
        int i = 0;
        while(i < size && i < index - 1) {
            tmp = tmp.getNext();
            i++;
        }
        DoubleNode<E> node = new DoubleNode<E>(element, tmp.getNext(), tmp.getNext().getNext());
        tmp.setNext(node);
        node.getNext().setPrev(node); 
        size++;       

        
    }

    public E remove(int index) {
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        DoubleNode<E> tmp = this.first;
        int i = 0;
        while(i < index) {
            tmp = tmp.getNext();
            i++;
        }
        E data = tmp.getData();
        tmp.setNext(tmp.getNext().getNext());
        tmp.getNext().setPrev(tmp.getNext().getPrev());
        size--;
        return data;
    }

    public boolean remove(Object o) {
        return super.remove(o);
    }

}
