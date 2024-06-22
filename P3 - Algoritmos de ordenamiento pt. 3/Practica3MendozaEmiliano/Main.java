import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        int option = 0;
        System.out.println("********** Select an option **********");
        System.out.println("1. Counting Sort");
        System.out.println("2. Radix Sort");
        option = stdin.nextInt();

        switch (option) {
            case 1:
                char CSInput[] = new char[20];
                for (int i = 0; i < CSInput.length; i++) {
                    System.out.print("Enter input " + (i + 1) + " [a-j]: ");
                    CSInput[i] = stdin.next().charAt(0);
                }
                CountingSort.sort(CSInput);
                break;

            case 2:
                int RSInput[] = new int[15];
                for (int i = 0; i < RSInput.length; i++) {
                    System.out.print("Enter input " + (i + 1) + ": ");
                    RSInput[i] = stdin.nextInt();
                }
                RadixSort.sort(RSInput);
                break;

            default:
                System.out.println("Invalid option");
                break;
        }
        stdin.close();
    }
}
