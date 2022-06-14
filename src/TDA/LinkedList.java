package TDA;
import java.util.Collection;
public class LinkedList<E> implements TDAList<E> {
    protected Node<E> root;
    protected int size;


    public LinkedList(){
        this.root = null;
        this.size = 0; 
    }
    
    public LinkedList(E root) {
        add(root);
    }

    //Metodos principales para la resolucion del laboratorio

    public boolean add(E e) {
        if(root == null) { // Si la lista esta vacia
            root = new Node<E>(e);
            size++;
            return true;
        }
        Node<E> tmp = this.root;
        while (tmp.getNext() != null) { // Busca el ultimo nodo
            tmp = tmp.getNext();
        }
        tmp.setNext(new Node<E>(e)); // Agrega el nuevo nodo
        size++; // Incrementa el tamaño de la lista
        return true;
    }

    public E get(int index) {
        if(index < 0 || index >= this.size()) // Si el index no corresponde a un nodo de la lista
            throw new IndexOutOfBoundsException();
        int i = 0;
        Node<E> tmp = this.root;
        while(i < index) { // Busca el nodo correspondiente al index
            tmp = tmp.getNext();
            i++;
        }
        return tmp.getData();
    }

    public E set(int index, E element) {
        if(index < 0 || index >= this.size()) // Si el index no corresponde a un nodo de la lista
            throw new IndexOutOfBoundsException();
        if(index == 0) {// si se quiere cambiar el primer elemento de la lista
            E data = root.getData();
            this.root.setData(element);
            return data; 
        }
        // cambiar un nodo de la lista    
        int i = 0;
        index--;
        Node<E> tmp = this.root;
        while (i < index) { // Busca el nodo correspondiente al index
            tmp = tmp.getNext();
            i++;
        }
        E data = tmp.getNext().getData();
        tmp.setNext(new Node<E>(element, tmp.getNext().getNext())); // Cambia el nodo
        return data;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        String txt = "";
        for(Node<E> tmp = this.root; tmp != null; tmp = tmp.getNext()) {
            txt += tmp.getData() + " ";
        }
        return txt;
    }

    //Fin de los metodos principales para el laboratorio

    public void add(int index, E element) {
        int i = 0;
        Node<E> tmp = this.root; 
        while (i < index) {
            tmp = tmp.getNext();
            i++;
        }
        size++;
        tmp.setNext(new Node<E>(element, tmp.getNext()));

    }

    public boolean addAll(Collection<? extends E> c) {
        
        return false;
    }

    public boolean addAll(Collection<? extends E> c, int index) {
        return false;
    }

    public void clear() {
        this.root = null;
        this.size = 0;        
    }

    public boolean contains(Object o) {
        for(Node<E> tmp = this.root; tmp != null; tmp = tmp.getNext()) {
            if(tmp.getData().equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        
        return false;
    }



    public int indexOf(Object o) {
        int i = 0;
        for(Node<E> tmp = this.root ; tmp != null; tmp = tmp.getNext()) {
            if(tmp.getData().equals(o)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int lastIndexOf(Object o) {

        return 0;
    }

    public E remove(int index) {
        if(index > this.size || index < 0) 
            throw new IndexOutOfBoundsException();
        Node<E> tmp = this.root;
        int i = 0;
        while(tmp != null && i < index) {
            tmp = tmp.getNext();
            i++;
        }
        if(tmp == null)
            throw new IndexOutOfBoundsException();
        E data = tmp.getData();
        tmp.setNext(tmp.getNext().getNext());
        this.size--;
        return data;
    }

    public boolean remove(Object o) {

        Node<E> tmp = this.root;
        while(tmp != null) {
            if(tmp.getData().equals(o)) {
                tmp.setNext(tmp.getNext().getNext());
                this.size--;
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public TDAList<E> subList(int fromIndex, int toIndex) {
        Node<E> tmp = this.root;
        int i = 0;
        while(i < fromIndex) {
            tmp = tmp.getNext();
            i++;
        }
        TDAList<E> subList = new LinkedList<E>(tmp.getData());
        while(tmp != null && i < toIndex) {
            tmp = tmp.getNext();
            subList.add(tmp.getData());
            i++;
        }
        
        return subList;

    }

}
