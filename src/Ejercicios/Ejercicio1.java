package Ejercicios;
import TDA.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        int tamano;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el tamaño máximo del último arreglo: ");
        tamano = teclado.nextInt();

        ArrayList<LinkedList<Integer>> casos = new ArrayList<LinkedList<Integer>>();
        String archivoInsercion = "insercionLinkedList.txt";
        PrintWriter oS = new PrintWriter(archivoInsercion);

        for (int n = 1; n <= tamano; n++) {
            casos.add(generarPeorCasoInt(n));
        }
        Iterator<LinkedList<Integer>> puntero = casos.iterator();
        while (puntero.hasNext()) {
            oS.println(String.valueOf(insertionSort(puntero.next())));
        }
        oS.close();
        // plot "/Users/richarteq/eclipse-workspace/Algoritmica/insercion.txt" with
        // lines
        // JavaPlot p = new JavaPlot();
        // p.addPlot("\"/home/richart/eclipse-workspace/Algoritmica/insercion.txt\" with
        // lines");
        // p.plot();
        
    }

    public static <E extends Comparable<E>> long insertionSort(LinkedList<E> lista) {
        E key;
        int i;
        long nano_startTime = System.nanoTime();
        for (int j = 1; j < lista.size(); j++) {
            key = lista.get(j);
            i = j - 1;
            //System.out.println(lista);
            
            while (i > -1 && lista.get(i).compareTo(key) > 0) {
                lista.set(i + 1, lista.get(i));
                i--;
            }
            lista.set(i + 1, key);
        }
        long nano_endTime = System.nanoTime();
        return nano_endTime - nano_startTime;
    }
    
    public static LinkedList<Integer> generarPeorCasoInt(int t){
        LinkedList<Integer> myList = new LinkedList<Integer>();
        for(int i = t; i > -1; i--)
            myList.add(i);
        return myList;
    }

}
