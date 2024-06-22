import java.util.Random;

public class Main {
    public static void main(String args[]) {
        // Declara e inicializa un arreglo de 20 elementos
        // agrega las instruccuones para utilizar el ordenamiento Quick sort
        // imprime el arreglo ordenado

        int arreglo[] = new int[20];
        Random rand = new Random(); 
        
        for (int i = 0; i<arreglo.length; ++i) {
            arreglo[i] = rand.nextInt(1000);
        }

        System.out.println("El arreglo es: ");
        Utilerias.printArray(arreglo);
        
        // System.out.println("Probando Quick Sort");
        // Quicksort.QuickSort(arreglo, 0, 19);
        // System.out.println("El arreglo ordenado: ");
        // Utilerias.printArray(arreglo);

        System.out.println("Probando Merge Sort");
        MergeSort myMerge = new MergeSort();
        myMerge.sort(arreglo, 0, 19);
        System.out.println("El arreglo ordenado: ");
        Utilerias.printArray(arreglo);
    }
}