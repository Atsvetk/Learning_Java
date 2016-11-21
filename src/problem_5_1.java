import java.util.Scanner;

public class problem_5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 0 < N < 30: ");
        int n = scan.nextInt();
        int number = 1;

        boolean err = false;
        if ((n < 0) || (n > 30)) {
            System.out.println("Wrong N!");
            err = true;
        }
        if (!err) {
            number = number << n;
            System.out.println("2 raised to the power " + n + " equals " + number);
        }
    }
}
