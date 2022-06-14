package TDA;

public class DoubleLinkedList<E> extends LinkedList<E> {
    private DoubleNode<E> last;
    private DoubleNode<E> first;

    public DoubleLinkedList() {
        super();
    }

    public DoubleLinkedList(E root) {
        add(root);
    }

    // Metodos para la resolucion del laboratorio
    public boolean add(E e) {
        if (this.first == null) { // Si la lista esta vacia
            this.first = new DoubleNode<E>(e);
            this.last = this.first;
            size++;
            return true;
        }
        // Agrega el nuevo nodo al final de la lista 
        DoubleNode<E> node = new DoubleNode<E>(e, null, this.last);
        this.last.setNext(node);
        this.last = node;
        size++;
        return true;
    }

    public E set(int index, E element) {
        if (index < 0 || index >= this.size()) // Si el index no corresponde a un nodo de la lista
            throw new IndexOutOfBoundsException();
        int i = 0;
        //comprueba si se quiere caminar desde el primer nodo o el ultimo para cambiar el nodo deseado 
        if (index < size / 2) {
            if (index == 0) {
                E data = this.first.getData();
                this.first.setData(element);
                return data;
            }
            index--;
            DoubleNode<E> tmp = this.first;
            while (i < index) {
                tmp = tmp.getNext();
                i++;
            }
            E data = tmp.getNext().getData();
            tmp.getNext().setData(element);
            return data;
        } else {
            if(index == size - 1) {
                E data = this.last.getData();
                this.last.setData(element);
                return data;
            }
            index = size - index - 2;
            DoubleNode<E> tmp = this.last;
            while (i < index) {
                tmp = tmp.getPrev();
                i++;
            }
            E data = tmp.getPrev().getData();
            tmp.getPrev().setData(element);
            return data;
        }
    }

    public E get(int index) {
        if (index < 0 || index >= this.size()) // Si el index no corresponde a un nodo de la lista
            throw new IndexOutOfBoundsException();
        int i = 0;
        //comprueba si se quiere caminar desde el primer nodo o el ultimo para obtener el nodo deseado
        if (index < size / 2) {
            DoubleNode<E> tmp = this.first;
            while (i < index) {
                tmp = tmp.getNext();
                i++;
            }
            return tmp.getData();
        } else {
            DoubleNode<E> tmp = this.last;
            index = size - index - 1;
            while (i < index) {
                tmp = tmp.getPrev();
                i++;
            }
            return tmp.getData();
        }

    }

    public String toString() {
        String txt = "";
        for (DoubleNode<E> tmp = this.first; tmp != null; tmp = tmp.getNext()) {
            txt += tmp.getData().toString() + " ";
        }
        return txt;
    }

    // Este metodo imprime la lista caminando desde el ultimo nodo 
    public String printPrev() {
        String txt = "";
        for (DoubleNode<E> tmp = this.last; tmp != null; tmp = tmp.getPrev()) {
            txt += tmp.getData().toString() + " ";
        }
        return txt;
    }

    //Fin metodos Laboratorio

    public void add(int index, E element) {
        if (this.first == null) {
            this.first = new DoubleNode<E>(element);
            this.last = this.first;
            size++;
            return;
        }
        DoubleNode<E> tmp = this.first;
        int i = 0;
        while (i < size && i < index - 1) {
            tmp = tmp.getNext();
            i++;
        }
        DoubleNode<E> node = new DoubleNode<E>(element, tmp.getNext(), tmp.getNext().getNext());
        tmp.setNext(node);
        node.getNext().setPrev(node);
        size++;

    }

    public E remove(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        DoubleNode<E> tmp = this.first;
        int i = 0;
        while (i < index) {
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
