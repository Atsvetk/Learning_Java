public class problem_4_1 {
    public static void main(String[] args) {
        int[] A = new int[]{1, -5, 6, 4, 0, 1, -1};
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        System.out.println("Sum = " + sum);
    }
}
