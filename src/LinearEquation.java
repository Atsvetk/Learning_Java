import java.util.Locale;
import java.util.Scanner;

public class LinearEquation {

	private static boolean isOK(float obj, String param) {
		boolean quiteOK = false;
		if (!Float.isNaN(obj) && !Float.isInfinite(obj)) {
			quiteOK = true;
			if (param != "0" && obj == 0) {
				quiteOK = false;
			}
		}
		return quiteOK;
	}
	
    public static void main(String[] args) {
    	
    	//setting locale to avoid floating dot/comma disaster
    	Locale.setDefault(Locale.US);
    	
        Scanner scan = new Scanner(System.in);
        System.out.println("Tip for floats: Use dots, not commas!");
        
        float a = 0;
        System.out.print("Input a: ");
        if ( scan.hasNextFloat() ) {
            a = scan.nextFloat();
        } else {
        	System.out.println("Invalid input!");
            System.exit(0);
        }
        if (!isOK(a, "all")) {
        	System.out.println("Invalid input!");
            System.exit(0);
        }
        scan.nextLine();
        float b = 0;
        System.out.print("Input b: ");
        if (scan.hasNextFloat()) {
            b = scan.nextFloat();
        } else {
        	System.out.println("Invalid input!");
        	System.exit(0);
        }
        if (!isOK(b, "0")) {
        	System.out.println("Invalid input!");
            System.exit(0);
        }
        
    	float x = 0;
    	x = -b / a;
        System.out.println("x = " + x);
        
        scan.close();
    }
}
