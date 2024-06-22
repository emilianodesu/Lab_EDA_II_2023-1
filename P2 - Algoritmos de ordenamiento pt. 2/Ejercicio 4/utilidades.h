void swap(int* a, int* b);
void printArray(int arr[],int size);
void printSubArray(int arr[],int low, int high);

//Practica 2
int heapSize;
void Heapify(int A[], int i, int size, unsigned long long int* counter_ptr);
void BuildHeap(int A[], int , unsigned long long int* counter_ptr);
int partition(int arr[], int low, int high, unsigned long long int* counter_ptr);
void merge(int A[], int left, int mid, int right, unsigned long long int* counter_ptr);
