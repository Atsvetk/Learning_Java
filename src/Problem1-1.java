import java.util.Scanner;

public class Problem1-1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите число: ");
		if (scan.hasNextInt()) {
			int n = scan.nextInt();
			if (n%2==0) {
				System.out.println("Чётное!");
			} else {
				System.out.println("Нечётное!");
			}
		} else {
			System.out.println("Нужно было ввести целое число!");
		}
		scan.close();
	}
}
