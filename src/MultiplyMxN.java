import java.util.Scanner;

public class MultiplyMxN {
    public static void main(String[] args) {
        System.out.println("Welcome to the MxN Multiplication table app!");
        Scanner scan = new Scanner(System.in);
        int m = 0;
        do {
            System.out.print("Input integer 100 > M > 0: ");
            if (scan.hasNextInt()) {
                m = scan.nextInt();
            }
            scan.nextLine();
        } while (m <= 0);
        int n = m;
        do {
            System.out.print("Input integer 100 >= N > M: ");
            if (scan.hasNextInt()) {
                n = scan.nextInt();
            }
            scan.nextLine();
        } while (n <= m);

        System.out.printf("%7s", "");
        for (int i = m; i < n + 1; i++) {
            System.out.printf("%6d", i);
        }
        System.out.println();
        System.out.println();
        for (int i = m; i < n + 1; i++) {
            System.out.printf("%6d", i);
            System.out.print("  ");
            for (int j = m; j < n + 1; j++) {
                System.out.printf("%6d", i * j);
            }
            System.out.println();
        }
    }
}
