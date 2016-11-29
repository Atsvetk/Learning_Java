import java.util.Scanner;

public class Problem5_1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 0 <= N <= 30: ");
        int n = 0;
        if (scan.hasNextInt()) {
        	n = scan.nextInt();
        } else {
        	System.out.println("Invalid input!");
        	System.exit(0);
        }
        
        if (n < 0 || n > 30) {
            System.out.println("Wrong N!");
            System.exit(0);
        } else {
            System.out.println("2 raised to the power " + n + " equals " + (1 << n));
        }
    }
}
