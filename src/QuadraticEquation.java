import java.util.Scanner;
import java.util.Locale;


public class QuadraticEquation {

    public static double paramInput(String letter) {
        System.out.print("Please, enter " + letter + ": ");
        double value = 0;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextDouble()) {
            value = scan.nextDouble();
            scan.nextLine();
        } else {
            System.out.println("Invalid input!");
            System.exit(0);
        }
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            System.out.println("Invalid input!");
            System.exit(0);
        }
        return value;
    }

    public static double linearEquation(double a, double b) {
        return -b / a;
    }

    public static void main(String[] args) {

        String solution = "";
        System.out.println("This is Quadratic Equation(a*x^2 + b*x + c =0) solving program!");

        //setting locale to avoid floating dot/comma disaster
        Locale.setDefault(Locale.US);

        System.out.println("Tip for floats: Use dots, not commas!");

        //Entering equation params
        double a = paramInput("a");
        double b = paramInput("b");
        double c = paramInput("c");

        if (a == 0 && b == 0) {
            if (c == 0) {
                solution = "Solution: x - any real.";
            } else {
                solution = "This is not even an equation! No solution for you.";
            }
        }
        if (a == 0 && b != 0) {
            solution = "Solution: x = " + linearEquation(b, c);
        }
        if (a != 0) {
            double D = b * b - 4 * a * c;
            if (D > 0) {
                double x1 = (-b - Math.sqrt(D)) / (2 * a);
                double x2 = (-b + Math.sqrt(D)) / (2 * a);
                solution = "Solution:\nx1 = " + x1 + ";\nx2 = " + x2 + ".";
            } else {
                if (D == 0) {
                    solution = "Solution: x1 = x2 = " + (-b / (2 * a));
                } else {
                    solution = "Solution: x1 and x2 are complex, calculate them yourself.";
                }
            }
        }
        System.out.println("\n" + solution);
    }
}
