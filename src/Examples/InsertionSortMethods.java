package Examples;

/**
 * InsertionSort
 */
public class InsertionSortMethods {
	/**
	 * InsertionSort
	 * @param a la lista que se va a ordenar 
	 */
    public static void insertionSort(int[] A) {
		int key;
		int i;
		for (int j=1; j<A.length; j=j+1) {
			key = A[j];
			//Insertar A[j] en la secuencia ordenada A[1..j-1]
			i=j-1;
			while(i>-1 && A[i]>key) {
				A[i+1] = A[i];
				i = i-1;
			}
        	imprimirArreglo(A);
			A[i+1] = key;
        }		
    }

	/**
	 * Metodo que imprime un arreglo
	 * @param lista el arreglo que se va a imprimir
	 */
	public static void imprimirArreglo(int[] lista){
		System.out.println("");
		for (int x=0; x<lista.length; x++) {
			System.out.print(lista[x] + " ");
		}
	}

	/**
	 * Metodo que genera el peor caso
	 * @param t el tamano del arreglo
	 * @return el arreglo que se va a generar
	 */
	public static int[] generarPeorCaso(int t) {
		int[] lista= new int[t];
		for (int i=0; i<t; i++) {
			lista[i] = t-i;		
		}
		return lista;		
	}
}