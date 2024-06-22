#include "utilidades.h"
#include <stdio.h>

/**
 * @brief Intercambia el contenido de dos referencias en memoria con datos tipo int
 *
 * @param a Primer elemento que se desea intercambiar
 * @param b Segundo elemento que se desea intercambiar
 */
void swap(int *a, int *b) {
    int t = *a;
    *a = *b;
    *b = t;
}

/**
 * @brief Imprime un arreglo de enteros
 *
 * @param arr Arreglo de datos tipo int
 * @param size Cantidad de elementos del arreglo
 */
void printArray(int arr[], int size) {
    int i;
    for (i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

/**
 * @brief Imprime un subarreglo de un arreglo de enteros
 *
 * @param arr Arreglo de datos tipo int
 * @param low Indice inicial del subarreglo
 * @param high Indice final del subarreglo
 */
void printSubArray(int arr[], int low, int high) {
    int i;
    printf("Sub array :  ");
    for (i = low; i <= high; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

//=================Practica 2====================
/**
 * @brief // Tamaño del heap
 * 
 */
int heapSize; 

/**
 * @brief Reordena un arreglo tal que se forma un heap
 *
 * @param A Arreglo de enteros
 * @param size Tamaño del arreglo
 */
void BuildHeap(int A[], int size) {
    heapSize = size - 1;
    int i;
    for (i = (size - 1) / 2; i >= 0; i--) {
        Heapify(A, i, size);
    }
    printf("Termin%c de construir el HEAP \n", 162);
}

/**
 * @brief Recursivamente, intercambia un nodo con su padre si el padre es menor
 *
 * @param A Arreglo de enteros
 * @param i Índice para recorrer los nodos del heap
 * @param size Tamaño o cantidad de elementos del heap
 */
void Heapify(int A[], int i, int size) {
    int l = 2 * i + 1;
    int r = 2 * i + 2;
    int largest;

    if (l <= heapSize && A[l] > A[i])
        largest = l;
    else
        largest = i;
    if (r <= heapSize && A[r] > A[largest])
        largest = r;
    if (largest != i) {
        swap(&A[i], &A[largest]);
        printArray(A, size);
        Heapify(A, largest, size);
    }
}

/**
 * @brief Toma el último elemento como pivote y lo coloca en su posición final
 * 
 * @param arr Arreglo de enteros
 * @param low Índice del primer elemento de la colección
 * @param high Índice del último elemento de la colección
 * @return int Índice de la posición final del pivote
 */
int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    printf("Pivote: %d   \n ", pivot);
    int j, i = (low - 1);
    for (j = low; j <= high - 1; j++) {
        if (arr[j] <= pivot) {
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i + 1], &arr[high]);
    return (i + 1);
}

/**
 * @brief Trabaja con dos sub arreglos del arreglo original, utiliza memoria adicional
 * para ordenar los elementos en otro arreglo del tamaño de ambas particiones.
 * Por último reinserta los elementos en el arreglo original de menor a mayor.
 * 
 * @param A Arreglo de enteros
 * @param left Índice del primer elemento del primer sub arreglo
 * @param mid Índice del último elemento del primer sub arreglo
 * @param right Índice del último elemento del segundo sub arreglo
 */
void merge(int A[], int left, int mid, int right) {
    int A2[right];
    int i, j, k;
    k = 0;
    i = left;
    j = mid + 1;
    while (i <= mid && j <= right) {
        if (A[i] < A[j])
            A2[k++] = A[i++];
        else
            A2[k++] = A[j++];
    }
    while (i <= mid)
        A2[k++] = A[i++];
    while (j <= right)
        A2[k++] = A[j++];
    for (i = right; i >= left; i--)
        A[i] = A2[--k];
}