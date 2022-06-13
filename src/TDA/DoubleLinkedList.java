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
            this.first = new DoubleNode<E>(e);
            this.last = this.first;
            size++;
            return true;
        }
        DoubleNode<E> node = new DoubleNode<E>(e, null, this.last);
        this.last.setNext(node);
        this.last = node;
        size++;
        return true;
    }

    public E set(int index, E element){
        if(index < 0 || index >= this.size())
            throw new IndexOutOfBoundsException();
        if(index == 0) {
            E data = this.first.getData();
            this.first.setData(element);
            return data;
        }
        int i = 0;
        index--;
        DoubleNode<E> tmp = this.first;
        while (i < index) {
            tmp = tmp.getNext();
            i++;
        }
        E data = tmp.getNext().getData();
        tmp.getNext().setData(element);
        return data;
    }

    public E get(int index) {
        if(index < 0 || index >= this.size())
            throw new IndexOutOfBoundsException();
        int i = 0;
        DoubleNode<E> tmp = this.first;
        while(i < index) {
            tmp = tmp.getNext();
            i++;
        }
        return tmp.getData();
    }

    public void add(int index, E element) {
        if(this.first == null) {
            this.first = new DoubleNode<E>(element);
            this.last = this.first;
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

    public String toString() {
        String txt = "";
        for(DoubleNode<E> tmp = this.first ; tmp != null; tmp = tmp.getNext()) {
            txt += tmp.getData().toString() + " ";
        }
        return txt;
    }
    public String printPrev(){
        String txt = "";
        for(DoubleNode<E> tmp = this.last ; tmp != null; tmp = tmp.getPrev()) {
            txt += tmp.getData().toString() + " ";
        }
        return txt;
    }
}
