import java.util.Scanner;
import java.util.Random;

public class Problem4_3 {
    public static void main(String[] args) {
        int[] arr = new int[25];
        Random rand = new Random();
        System.out.print("{ ");
        for (int i = 0; i < 25; i++) {
        	arr[i] = (rand.nextInt(101) - 50);
        	System.out.print(arr[i] + " ");
        }
        System.out.print("}\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the desired number: ");
        int a = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                System.out.println("Found number " + a + " in the " + (i + 1) + " place");
                System.exit(0);
            }
        }
        System.out.println("There is no number " + a + " in the array.");
    }
}
