package Ejercicios;
import TDA.DoubleLinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        int tamano;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el tamaño máximo del último arreglo: ");
        tamano = teclado.nextInt();

        ArrayList<DoubleLinkedList<Integer>> casos = new ArrayList<DoubleLinkedList<Integer>>();
        for (int n = 1; n <= tamano; n++) {
            casos.add(generarPeorCasoInt(n));
        }
        Iterator<DoubleLinkedList<Integer>> puntero = casos.iterator();
        while (puntero.hasNext()) {
            System.out.println(insertionSort(puntero.next()));
        }
    }

    /**
     * Metodo que ordena una lista con el metodo de insercion
     * 
     * @param lista la lista que se va a ordenar
     * 
     */
    public static <E extends Comparable<E>> long insertionSort(DoubleLinkedList<E> lista) {
        E key;
        int i;
        long nano_startTime = System.nanoTime();
        for (int j = 1; j < lista.size(); j++) {
            key = lista.get(j);
            i = j - 1;
            while (i > -1 && lista.get(i).compareTo(key) > 0) {
                lista.set(i + 1, lista.get(i));
                i--;
            }
            lista.set(i + 1, key);
        }
        long nano_endTime = System.nanoTime();
        return nano_endTime - nano_startTime;

    }

    /**
     * Metodo que genera elpero caso a abse de enteros dentro de una lista
     * doblemente enlazada
     * 
     * @param t el tamano del arreglo
     * @return el arreglo que se va a generar
     */
    public static DoubleLinkedList<Integer> generarPeorCasoInt(int t) {
        DoubleLinkedList<Integer> myList = new DoubleLinkedList<Integer>();
        for (int i = t; i > -1; i--)
            myList.add(i);
        return myList;
    }
}
