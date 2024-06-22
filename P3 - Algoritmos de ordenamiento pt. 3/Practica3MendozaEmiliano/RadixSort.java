import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {
    public static void sort(int Array[]) {
        System.out.println("\nInput array: ");
        Utilerias.printArray(Array);

        int n = Array.length;
        Queue<Integer> Q1 = new LinkedList<Integer>();
        Queue<Integer> Q2 = new LinkedList<Integer>();
        Queue<Integer> Q3 = new LinkedList<Integer>();
        Queue<Integer> Q4 = new LinkedList<Integer>();

        int it = 1;
        for (int exp = 1; exp <= 1000; exp *= 10) {
            for (int i = 0; i < n; i++) {
                if ((Array[i] / exp) % 10 == 1) {
                    Q1.add(Array[i]);
                } else if ((Array[i] / exp) % 10 == 2) {
                    Q2.add(Array[i]);
                } else if ((Array[i] / exp) % 10 == 3) {
                    Q3.add(Array[i]);
                } else if ((Array[i] / exp) % 10 == 4) {
                    Q4.add(Array[i]);
                }
            }

            System.out.println("\nQ1: " + Q1);
            System.out.println("Q2: " + Q2);
            System.out.println("Q3: " + Q3);
            System.out.println("Q4: " + Q4);

            int sizeQ1 = Q1.size();
            int sizeQ2 = Q2.size();
            int sizeQ3 = Q3.size();
            int sizeQ4 = Q4.size();
            int index = 0;
            for (int i = 0; i < sizeQ1; i++) {
                Array[index] = Q1.remove();
                index++;
            }
            for (int i = 0; i < sizeQ2; i++) {
                Array[index] = Q2.remove();
                index++;
            }
            for (int i = 0; i < sizeQ3; i++) {
                Array[index] = Q3.remove();
                index++;
            }
            for (int i = 0; i < sizeQ4; i++) {
                Array[index] = Q4.remove();
                index++;
            }

            System.out.print("Array: ");
            Utilerias.printArray(Array);
            System.out.println("End of iteration " + (it++));
        }
        System.out.println("\nSorted array: ");
        Utilerias.printArray(Array);
    }
}
