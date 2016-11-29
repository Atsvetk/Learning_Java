import java.util.Scanner;

public class Problem1_6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a: ");
		int a = scan.nextInt();

		System.out.print("Input b: ");
		int b = scan.nextInt();

		System.out.print("Input c: ");
		int c = scan.nextInt();
		
		if ((b <= a) && (a <= c) || (c <= a) && (a <= b)) {
			System.out.println(a + " is in the middle.");
		} else {
			if ((a <= b) && (b <= c) || (c <= b) && (b <= a)) {
				System.out.println(b + " is in the middle.");
			} else {
				if ((a <= c) && (c <= b) || (b <= c) && (c <= a)) {
					System.out.println(c + " is in the middle.");
				}
			}
		}
		scan.close();
	}
}
