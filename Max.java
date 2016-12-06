import java.util.Random;

class Max {
    public static void main(String[] args) {
        int[] arr = new int[25];
        Random rand = new Random();
        System.out.print("{ ");
        for (int i = 0; i < 25; i++) {
            arr[i] = (rand.nextInt(101) - 50);
            System.out.print(arr[i] + " ");
        }
        System.out.print("}\n");

        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Found Maximum = " + max + " at the position " + (maxIndex + 1)); // Adding 1 to the index just for those human beings who start to count things from "One"
    }
}