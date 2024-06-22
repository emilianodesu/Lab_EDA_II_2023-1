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
