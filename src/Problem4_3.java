import java.util.Scanner;

public class Problem4_3 {
    public static void main(String[] args) {
        int[] A = new int[]{1, -5, 6, 4, 0, 1, -1};
        boolean flag = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the desired number: ");
        int a = scan.nextInt();
        for (int i = 0; i < A.length; i++) {
            if (A[i]==a) {
                System.out.println("Found number " + a + " in the " + (i+1) + " place");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("There is no number " + a + " in the array.");
        }
    }
}
