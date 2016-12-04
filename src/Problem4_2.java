import java.util.Random;

public class Problem4_2 {
    public static void main(String[] args) {
        int[] arr = new int[25];
        Random rand = new Random();
        System.out.print("{ ");
        for (int i = 0; i < 25; i++) {
        	arr[i] = (rand.nextInt(101) - 50);
        	System.out.print(arr[i] + " ");
        }
        System.out.print("}\n");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float s = sum;
        float average = s / arr.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}
