public class CountingSort {

    public static void sort(char Array[]) {
        System.out.println("\nInput array: ");
        System.out.println(Array);

        int n = Array.length;
        int max = Utilerias.findMax(Array);
        int count[] = new int[max];
        Utilerias.fillZeros(count);

        char range = (char) (max + 96);
        System.out.println("\nRange: [a-" + range + "]");

        for (int j = 0; j < n; j++) {
            char element = Array[j];
            int elem = element - 97;
            count[elem]++;
        }
        System.out.println("\nCount: ");
        Utilerias.printArray(count);

        for (int i = 1; i < max; i++) {
            count[i] = count[i] + count[i - 1];
        }
        System.out.println("Sum: ");
        Utilerias.printArray(count);

        char output[] = new char[n];
        char t;
        int pos;
        System.out.println("\nIterations: ");
        for (int j = n - 1; j >= 0; j--) {
            t = Array[j];
            pos = t - 97;
            output[count[pos] - 1] = t;
            count[pos]--;
            System.out.println(output);
        }
        System.out.println("\nSorted array: ");
        System.out.println(output);
    }
}
