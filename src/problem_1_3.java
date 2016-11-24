import java.util.Scanner;
import java.util.Locale;

public class problem_1_3 {
	
	private static boolean isOK(double obj) {
		boolean quiteOK = false;
		if ( !Double.isNaN(obj) && !Double.isInfinite(obj) ) {
			quiteOK = true;
		}
		return quiteOK;
	}

	public static void main(String[] args) {
		
		//setting locale to avoid floating dot/comma disaster
    	Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("Tip for floats: Use dots, not commas!");
		System.out.print("Input a: ");
		double a = scan.nextDouble();
		System.out.print("Input b: ");
		double b = scan.nextDouble();
		if (isOK(a) && isOK(b)) {
			if ( Math.abs(10-b) < Math.abs(10-a) ) {
				System.out.println(b + " is closer to 10 than " + a + ".");
			} else {
				System.out.println(a + " is closer to 10 than " + b + ".");
			}
		} else {
			System.out.println("At least one of the entered numbers sucks.");
		}
		scan.close();
	}
}
