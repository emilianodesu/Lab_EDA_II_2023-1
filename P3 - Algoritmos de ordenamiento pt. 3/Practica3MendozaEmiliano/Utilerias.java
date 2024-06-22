public class Utilerias {

    public static void printArray(int[] Array) {
        for (int i : Array) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void fillZeros(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            Array[i] = 0;
        }
    }

    public static int findMax(char[] Array) {
        char t;
        int temp, max = 0;
        for (int i = 0; i < Array.length; i++) {
            t = Array[i];
            temp = t - 96;
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

}
