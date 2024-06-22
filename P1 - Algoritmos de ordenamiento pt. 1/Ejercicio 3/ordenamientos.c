#include "ordenamientos.h"
#include "utilidades.h"
#include <stdio.h>

/**
 * @brief Ordenamiento Selection Sort
 * 
 * @param arreglo Arreglo de enteros
 * @param n Cantidad de elementos del arreglo
 */
void selectionSort(int arreglo[], int n) {
	int indiceMenor, i, j;
	unsigned long long int ops = 0;
	for (i = 0; i < n - 1; i++) {
		indiceMenor = i;
		for (j = i + 1; j < n; j++) {
			ops++;
			if (arreglo[j] < arreglo[indiceMenor])
				indiceMenor = j;
		}
		ops++;
		if (i != indiceMenor) {
			ops++;
			swap(&arreglo[i], &arreglo[indiceMenor]);
		}
		// printf("\nIteracion numero %d \n", i + 1);
		// printArray(arreglo, n);
	}
	printf("\nNo. de operaciones: %llu\n", ops);
}

/**
 * @brief Ordenamiento Insertion Sort
 * 
 * @param a Arreglo de enteros
 * @param n Cantidad de elementos del arreglo
 */
void insertionSort(int a[], int n) {
	int i, j, k;
	int aux;
	unsigned long long int ops = 0;
	for (i = 1; i < n; i++) {
		j = i;
		aux = a[i];
		while (j > 0 && aux < a[j - 1]) {
			ops++;
			a[j] = a[j - 1];
			ops++;
			j--;
		}
		ops++;
		a[j] = aux;
		// printf("\nIteracion numero %d \n", i);
		// printArray(a, n);
	}
	printf("\nNo. de operaciones: %llu\n", ops);
}

/**
 * @brief Ordenamiento Bubble Sort
 * 
 * @param a Arreglo de enteros
 * @param size Cantidad de elementos del arreglo
 */
void bubbleSort(int a[], int size) {
	int i, j, n, exchange;
	unsigned long long int ops = 0;
	n = size;
	for (i = n - 1; i > 0; i--) {
		exchange = 0;
		for (j = 0; j < i; j++) {
			ops++;
			if (a[j] > a[j + 1]) {
				ops++;
				swap(&a[j], &a[j + 1]);
				exchange = 1;
			}
		}
		ops++;
		if (exchange == 0) {
			break;
		}
		// printf("\nIteracion numero %d \n", i + 1);
		// printArray(a, n);
	}
	printf("\nNo. de operaciones: %llu\n", ops);
}
