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
	for (i = 0; i < n - 1; i++) {
		indiceMenor = i;
		for (j = i + 1; j < n; j++) {
			if (arreglo[j] < arreglo[indiceMenor])
				indiceMenor = j;
		}
		if (i != indiceMenor) {
			swap(&arreglo[i], &arreglo[indiceMenor]);
		}
		printf("\nIteracion numero %d \n", i + 1);
		printArray(arreglo, n);
	}
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
	for (i = 1; i < n; i++) {
		j = i;
		aux = a[i];
		while (j > 0 && aux < a[j - 1]) {
			a[j] = a[j - 1];
			j--;
		}
		a[j] = aux;
		printf("\nIteracion numero %d \n", i);
		printArray(a, n);
	}
}

/**
 * @brief Ordenamiento Bubble Sort
 *
 * @param a Arreglo de enteros
 * @param size Cantidad de elementos del arreglo
 */
void bubbleSort(int a[], int size) {
	int i, j, n, exchange;
	n = size;
	for (i = n - 1; i > 0; i--) {
		exchange = 0;
		for (j = 0; j < i; j++) {
			if (a[j] > a[j + 1]) {
				swap(&a[j], &a[j + 1]);
				exchange = 1;
			}
		}
		if (exchange == 0) {
			break;
		}
		printf("\nIteracion numero %d \n", i + 1);
		printArray(a, n);
	}
}

//=================Practica 2====================

/**
 * @brief Ordenamiento Heap Sort
 * 
 * @param A Arreglo de enteros
 * @param size Tamaño de la coleccion a ordenar
 */
void heapSort(int A[], int size) {
	BuildHeap(A, size);
	int i;
	for (i = size - 1; i > 0; i--) {
		swap(&A[0], &A[heapSize]);
		heapSize--;
		printf("Iteracion HS: \n");
		printArray(A, size);
		Heapify(A, 0, size);
	}
}

/**
 * @brief Ordenamiento Quick Sort
 * 
 * @param arr Arreglo de enteros
 * @param low Índice del primer elemento de la coleccion
 * @param high Índice del último elemento de la colección
 */
void quickSort(int arr[], int low, int high) {
	if (low < high) {
		int pi = partition(arr, low, high);
		printSubArray(arr, low, pi - 1);
		quickSort(arr, low, pi - 1);
		printSubArray(arr, pi + 1, high);
		quickSort(arr, pi + 1, high);
	}
}

/**
 * @brief Ordenamiento Merge Sort
 * 
 * @param A Arreglo de enteros
 * @param low Índice del primer elemento de la colección
 * @param high Índice del último elemento de la colección
 */
void mergeSort(int A[], int low, int high) {
	int mid;
	if (low < high) {
		mid = (low + high) / 2;
		mergeSort(A, low, mid);
		mergeSort(A, mid + 1, high);
		merge(A, low, mid, high);
	}
}