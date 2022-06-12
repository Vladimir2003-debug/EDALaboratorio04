package TDA;
import java.util.Collection;
public interface TDAList<E> {
    /**
     * Agrega un elemento al final de la lista
     * @param e El elemento que se ingresa
     * @return true si se agrego correctamente, false si no
     * @throws UnsupportedOperationException Si este metodo no es soportado por la lista
     * @throws ClassCastException Si el elemento no es de la misma clase que los elementos de la lista
     * @throws IllegalArgumentException Si aluna caracteristica de la clase impide que se agrege a la lista
     * @throws NullPointerException Si la lista no permite nulos
     */
    boolean add(E e);

    /**
     * Agrega un elemento en la posicion indicada
     * @param index La posicion en la que se agregara el elemento
     * @param element El elemento que se agrega
     * @throws UnsupportedOperationException Si este metodo no es soportado por la lista
     * @throws ClassCastException Si el elemento no es de la misma clase que los elementos de la lista
     * @throws IllegalArgumentException Si aluna caracteristica de la clase impide que se agrege a la lista
     * @throws NullPointerException Si la lista no permite nulos
     */ 
    void add(int index, E element);

    /**
     * Agrega todos los elementos de la coleccion indicada al final de la lista
     * @param c La lista de elemento que se va aa ingresar
     * @return true Si se agrego correctamente, false si no
     * @throws UnsupportedOperationException Si este metodo no es soportado por la lista
     * @throws ClassNotFoundException Si la clase de los elementos de la lista no es compatible con la lista
     * @throws NullPointerException Si la lista es null
     * @throws IllegalArgumentException Si alguna caracteristica de la clase impide que se agrege a la lista
     */
    boolean addAll(Collection<? extends E> c);

    /**
     * Agrega todos los elementos de la coleccion indicada en la posicion indicada
     * @param c La lista que se va a ingresar
     * @param index La posicion en la que se agregaran los elementos
     * @return true si se agrego correctamente, false si no
     * @throws UnsupportedOperationException Si este metodo no es soportado por la lista
     * @throws ClassCastException Si el elemento no es de la misma clase que los elementos de la lista
     * @throws NullPointerException Si la lista es null
     * @throws IllegalArgumentException Si alguna caracteristica de la clase impide que se agrege a la lista
     */    
    boolean addAll(Collection<? extends E> c, int index);

    /**
     * Elimina todos los elementos de la lista
     * @throws UnsupportedOperationException Si este metodo no es soportado por la lista
     */
    void clear();

    /**
     * Comprueba si el objeto esta dentro de la lista
     * @param o El objeto que se va a comprobar
     * @return true si esta, false si no    
     * @throws ClassCastException Si el objeto no es de la misma clase que los elementos de la lista
     * @throws NullPointerException Si el obejto ingresado es null
     */ 
    boolean contains(Object o);

    /**
     * Comprueba si la lista contiene todos los elementos de la coleccion indicada
     * @param c La coleccion que se va a comprobar
     * @returns true si la lista esta dentro, false si no
     * @throws ClassCastException Si el tipo de clase es incompatible con la lista
     * @throws NullPointerException Si la lista es null
     */ 
    boolean containsAll(Collection<?> c);

    /**
     * Compara el objeto especifico con la lista, Ambas listas deben de ser del mismo tamaño
     * @param o El objeto a comparar con esta lista
     * @return true si son iguales, false si no
     */
    boolean equals(Object o);

    /**
     * Retorna el elemento en la posicion indicada
     * @param index La posicion del elemento que se va a retornar
     * @return El elemento en la posicion indicada
     */
    E get(int index);

    /**
     *Retorna el index de la primera ocurrencia o -1 si no se encuentra
     * @param o El objeto que se va a buscar
     * @returns El index de la primera ocurrencia o -1 si no se encuentra
     * @throws ClassCastException Si el objeto no es de la misma clase que los elementos de la lista
     * @throws NullPointerException Si el objeto ingresado es null 
     */
    int indexOf(Object o);

    /**
     * Retorna verdadero si la lista esta vacia, falso si no
     * @returns true si la lista esta vacia, false si no
     */
    boolean isEmpty();

    /**
     * Retorna el index de la ultima ocurrencia o -1 si no se encuentra
     * @param o El objeto que se va a buscar
     * @returns El index de la ultima ocurrencia o -1 si no se encuentra
     */ 
    int lastIndexOf(Object o);

    /**
     * Elimina el objeto en la posicion indicada
     * @param index La posicion del objeto que se va a eliminar
     * @returns El objeto que se elimino
     * @throws UnsupportedOperationException Si este metodo no es soportado por la lista
     * @throws IndexOutOfBoundsException Si el index es menor que 0 o mayor que el tamaño de la lista
     */ 
    E remove(int index);

    /**
     * Elimina la primera aparicion del objeto de la lista , si no aparece no se elimina nada
     * @param o El elemento a ser eliminado
     * @returns true si se elimino, false si no
     * @throws ClassCastException Si la clase es incompatible con la lista
     * @throws UnsupportedOperationException Si este metodo no es soportado por la lista
     * @throws NullPointerException Si el objeto ingresado es null
     */ 
    boolean remove(Object o);

    /**
     * Elimina todos los elementos de la lista que se encuentren en la coleccion indicada
     * @param c La coleccion que se va a eliminar
     * @returns true si se elimino, false si no
     * @throws UnsupportedOperationException Si este metodo no es soportado por la lista
     * @throws ClassCastException Si la clase es incompatible con la lista
     * @throws NullPointerException Si la lista es null
     */ 
    boolean removeAll(Collection<?> c);

    /**
     * Reemplaza el objeto en la pocicion indicada
     * @param index La pocicion que se va a remplazar
     * @param element El elemento con el que se va a remplazar
     * @returns El elemento que se remplazo
     * @throws UnsupportedOperationException Si este metodo no es soportado por la lista
     * @throws IndexOutOfBoundsException Si el index es menor que 0 o mayor que el tamaño de la lista
     * @throws ClassCastException Si el elemento no es de la misma clase que los elementos de la lista
     * @throws NullPointerException Si el elemento ingresado es null
     * @throws IllegalArgumentException Si alguna caracteristica de la clase impide que se agrege a la lista
     * 
     */
    E set(int index, E element);

    /**
     * Devuelve el tamaño de la lista
     * @returns El tamaño de la lista
     */
    int size();

    /** 
     * Copia los elementos de la lista en un array en el rango indicado
     * @param fromIndex El indice del elemento desde el cual se va a copiar
     * @param toIndex El indice del elemento hasta el cual se va a copiar
     * @returns La lista copiada 
     * @throws IndexOutOfBoundsException Si el indice de inicio es menor que 0 o mayor que el tamaño de la lista
     */
    TDAList<E> subList(int fromIndex, int toIndex);

}
