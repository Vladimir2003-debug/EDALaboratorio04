package Examples;
import java.util.Scanner;
/**
 * Example2
 */
public class Example2 {
    public static void main(String[] args) {
        int tamano;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el tamaño del arreglo: ");
        tamano = teclado.nextInt();

        int arreglo[] = generarPeorCaso(tamano);
        imprimirArreglo(arreglo);
        System.out.println();
        insertionSort(arreglo);
        imprimirArreglo(arreglo);
        System.out.println(arreglo[0]);
    }

    /**
     * InsertionSort
     * 
     * @param a la lista que se va a ordenar
     */
    public static void insertionSort(int[] A) {
        int key;
        int i;
        for (int j = 1; j < A.length; j = j + 1) {
            key = A[j];
            // Insertar A[j] en la secuencia ordenada A[1..j-1]
            i = j - 1;
            while (i > -1 && A[i] > key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            System.out.println(A);
            A[i + 1] = key;
        }
    }

    /**
     * Metodo que imprime un arreglo
     * 
     * @param lista el arreglo que se va a imprimir
     */
    public static void imprimirArreglo(int[] lista) {
        System.out.println("");
        for (int x = 0; x < lista.length; x++) {
            System.out.print(lista[x] + " ");
        }
    }

    /**
     * Metodo que genera el peor caso
     * 
     * @param t el tamano del arreglo
     * @return el arreglo que se va a generar
     */
    public static int[] generarPeorCaso(int t) {
        int[] lista = new int[t];
        for (int i = 0; i < t; i++) {
            lista[i] = t - i;
        }
        return lista;
    }
}