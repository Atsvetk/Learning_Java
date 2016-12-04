import java.util.Scanner;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[25];
        Random rand = new Random();
        System.out.print("{ ");
        for (int i = 0; i < 25; i++) {
        	arr[i] = (rand.nextInt(21) - 10);
        	System.out.print(arr[i] + " ");
        }
        System.out.print("}\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the desired number: ");
        int a = 0;
        if (scan.hasNextInt()) {
        	a = scan.nextInt();
        } else {
        	System.out.println("Invalid input!");
        	System.exit(0);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                count++;
            }
        }
        float c = count;
        float freq = c / arr.length;
        System.out.println("Your number (" + a + ") is included in the array for " + count + " times.");
        System.out.println("Frequency = " + freq + ".");
    }
}
