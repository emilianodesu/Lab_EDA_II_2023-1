#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "ordenamientos.h"
#include "utilidades.h"
#define TAM 10000 // 50, 100, ... , 10 000

int main(int argc, char const *argv[]) {
    int opcionA, opcionB;
    int arreglo[TAM];
    srand((unsigned)time(NULL));

    printf("-----Selecciona una opcion-----\n");
    printf("1. Insertion Sort\n");
    printf("2. Selection Sort\n");
    printf("3. Bubble Sort\n");
    scanf("%d", &opcionA);
    printf("\n-----Selecciona el tipo de llenado del arreglo-----\n");
    printf("1. Numeros aleatorios (0-999)\n");
    printf("2. Ingresar numeros manualmente\n");
    scanf("%d", &opcionB);

    if (opcionB == 1) {
        for (size_t i = 0; i < TAM; i++) {
        arreglo[i] = rand() % 1000;
        }
    } else if (opcionB == 2) {
        for (size_t i = 0; i < TAM; i++) {
            printf("Ingresa el numero %d: ", i+1);
            scanf("%d", &arreglo[i]);
        }
        
    } else {
        printf("\nOpcion invalida. Se usaran numeros aleatorios\n");
        for (size_t i = 0; i < TAM; i++) {
        arreglo[i] = rand() % 1000;
        }
    }

    switch (opcionA) {
    case 1:
        printf("\n-----Utilizando Insertion Sort-----");
        // printf("\nEl arreglo es:\n");
        // printArray(arreglo, TAM);

        insertionSort(arreglo, TAM);
        // printf("\nEl arreglo final ordenado es:\n");
        // printArray(arreglo, TAM);
        break;

    case 2:
        printf("\n-----Utilizando Selection Sort-----");
        // printf("\nEl arreglo es:\n");
        // printArray(arreglo, TAM);

        selectionSort(arreglo, TAM);
        // printf("\nEl arreglo final ordenado es:\n");
        // printArray(arreglo, TAM);
        break;

    case 3:
        printf("\n-----Utilizando Bubble Sort-----");
        // printf("\nEl arreglo es:\n");
        // printArray(arreglo, TAM);

        bubbleSort(arreglo, TAM);
        // printf("\nEl arreglo final ordenado es:\n");
        // printArray(arreglo, TAM);
        break;

    default:
        printf("\nOpcion invalida");
        break;
    }

    return 0;
}