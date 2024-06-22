package Practica1Eda2;

public class Principal {
    
    public static void main(String args[]){  
        int[] arr1 = {92, 48, 69, 15, 9, 25, 11, 71, 45, 12, 96, 101, 20, 99, 32, 64, 3, 50, 88, 77}; 
        int[] arr2 = {29, 84, 96, 51, 90, 52, 11, 17, 54, 21, 80, 44, 2, 23, 46, 5, 66, 33, 99, 1}; 

        System.out.println("Arreglos Originales");  
        Utilerias.imprimirArreglo(arr1);
        Utilerias.imprimirArreglo(arr2);
        
        Insercion.insertionSort(arr1);

        Seleccion seleccion = new Seleccion();   
        seleccion.selectionSort(arr2);  

        System.out.println("Arreglos ordenados");  
        Utilerias.imprimirArreglo(arr1);
        Utilerias.imprimirArreglo(arr2);
    }  
}
