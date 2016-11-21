import java.util.Scanner;

public class problem_5_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = scan.nextInt();
        int result_2 = n >> 1;
        int result_4 = n >> 2;
        int result_8 = n >> 3;

        System.out.println(n + " divide 2 equals " + result_2);
        System.out.println(n + " divide 4 equals " + result_4);
        System.out.println(n + " divide 8 equals " + result_8);
    }
}
