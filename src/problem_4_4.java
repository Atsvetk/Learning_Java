import java.util.Scanner;

public class problem_4_4 {
    public static void main(String[] args) {
        int[] A = new int[]{1, -5, 6, 4, 0, 1, -1, -5, 6, 6, 4, 3, 0, -5};
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the desired number: ");
        int a = scan.nextInt();
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i]==a) {
                count++;
            }
        }
        float c = count;
        float freq = c/A.length;
        System.out.println("Your number (" + a + ") is included in the array for " + count + " times.");
        System.out.println("Frequency = " + freq);
    }
}
