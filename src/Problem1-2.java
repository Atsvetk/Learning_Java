import java.util.Scanner;

public class Problem1-2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите число: ");
		if (scan.hasNextInt()) {
			int n = scan.nextInt();
			System.out.println( (n%2==0) ? "Чётное!" : "Нечётное!");
		} else {
			System.out.println("Нужно было ввести целое число!");
		}
		scan.close();
	}
}
