package Ejercicios;
import TDA.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista = generarPeorCasoInt(5);
        System.out.println(lista);
        System.out.println(insertionSort(lista));
        System.out.println("Lista ordenada");
        System.out.println(lista);
    }


    public static<E extends Comparable<E>> long insertionSort(LinkedList<E> list){
        long start = System.nanoTime();
        for(int i = 1; i < list.size(); i++){
            E key = list.get(i);
            int j = i - 1;
            System.out.println(list);
            while(j >= 0 && list.get(j).compareTo(key) > 0){
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
        long end = System.nanoTime();
        return end - start;
    }
    
    public static LinkedList<Integer> generarPeorCasoInt(int t){
        LinkedList<Integer> myList = new LinkedList<Integer>();
        for(int i = t; i > -1; i--)
            myList.add(i);
        return myList;
    }

}
