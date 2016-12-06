import java.util.Scanner;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[25];
        Random rand = new Random();
        System.out.print("{ ");
        for (int i = 0; i < 25; i++) {
            arr[i] = (rand.nextInt(101) - 50);
            System.out.print(arr[i] + " ");
        }
        System.out.print("}\n");
        
        //Can't stand using a flag here
        boolean change = true;
        while (change) {
            change = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    change = true;
                }
            }
        }
        System.out.print("{ ");
        for (int i = 0; i < 25; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");

    }
}

