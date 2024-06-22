#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "ordenamientos.h"
#include "utilidades.h"
#define TAM 10000 //50, 100, ..., 10 000

int main(int argc, char const *argv[]) {
    int opcionA, opcionB;
    int arreglo[TAM];
    unsigned long long int ops = 0;
    unsigned long long int* ops_ptr = &ops;
    srand((unsigned)time(NULL));

    printf("-----Selecciona una opcion-----\n");
    // printf("1. Insertion Sort\n");
    // printf("2. Selection Sort\n");
    // printf("3. Bubble Sort\n");
    printf("4. Heap Sort\n");
    printf("5. QuickSort\n");
    printf("6. Merge Sort\n");
    scanf("%d", &opcionA);

    switch (opcionA) {
    // case 1:
    //     printf("\n-----Utilizando Insertion Sort-----");
    //     printf("\nEl arreglo es:\n");
    //     printArray(arreglo, TAM);

    //     insertionSort(arreglo, TAM);
    //     printf("\nEl arreglo final ordenado es:\n");
    //     printArray(arreglo, TAM);
    //     break;

    // case 2:
    //     printf("\n-----Utilizando Selection Sort-----");
    //     printf("\nEl arreglo es:\n");
    //     printArray(arreglo, TAM);

    //     selectionSort(arreglo, TAM);
    //     printf("\nEl arreglo final ordenado es:\n");
    //     printArray(arreglo, TAM);
    //     break;

    // case 3:
    //     printf("\n-----Utilizando Bubble Sort-----");
    //     printf("\nEl arreglo es:\n");
    //     printArray(arreglo, TAM);

    //     bubbleSort(arreglo, TAM);
    //     printf("\nEl arreglo final ordenado es:\n");
    //     printArray(arreglo, TAM);
    //     break;
    
    case 4:
        printf("\n-----Utilizando Heap Sort-----");
        for (size_t i = 0; i < 5; i++){
            // printf("\nEl arreglo es:\n");
            for (size_t j = 0; j < TAM; j++) {
                arreglo[j] = rand() % 1000;
            }
            // printArray(arreglo, TAM);
            heapSort(arreglo, TAM, ops_ptr);
            // printf("\nEl arreglo final ordenado es:\n");
            // printArray(arreglo, TAM);
        }
        printf("\nPromedio de operaciones con %d elementos: %llu\n", TAM, (ops)/5);
        break;
    
    case 5:
        printf("\n-----Utilizando Quick Sort-----");
        for (size_t i = 0; i < 5; i++){
            // printf("\nEl arreglo es:\n");
            for (size_t j = 0; j < TAM; j++) {
                arreglo[j] = rand() % 1000;
            }
            // printArray(arreglo, TAM);
            quickSort(arreglo, 0, TAM-1, ops_ptr);
            // printf("\nEl arreglo final ordenado es:\n");
            // printArray(arreglo, TAM);
        }
        printf("\nPromedio de operaciones con %d elementos: %llu\n", TAM, (ops)/5);
        break;
    
    case 6:
        printf("\n-----Utilizando Merge Sort-----");
        for (size_t i = 0; i < 5; i++){
            // printf("\nEl arreglo es:\n");
            for (size_t j = 0; j < TAM; j++) {
                arreglo[j] = rand() % 1000;
            }
            // printArray(arreglo, TAM);
            mergeSort(arreglo, 0, TAM-1, ops_ptr);
            // printf("\nEl arreglo final ordenado es:\n");
            // printArray(arreglo, TAM);
        }
        printf("\nPromedio de operaciones con %d elementos: %llu\n", TAM, (ops)/5);
        break;

    default:
        printf("\nOpcion invalida");
        break;
    }

    return 0;
}