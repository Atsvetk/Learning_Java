import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] arr = new int[25];
        Random rand = new Random();
        System.out.print("{ ");
        for (int i = 0; i < 25; i++) {
            arr[i] = (rand.nextInt(101) - 50);
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
    }
}