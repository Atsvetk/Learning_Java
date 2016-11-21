import java.util.Scanner;


public class QuadraticEquation {

    public static double param_input(String letter) {
        System.out.print("Please, enter " + letter + ": ");
        double value;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextDouble()) {
            value = scan.nextDouble();
        } else {
            value = 0;
            System.out.println("Oh, you can't even enter " + letter + "... Let it be 0!");
        }
        return value;
    }

    public static double linear_equation(double a, double b) {
        return -b / a;
    }

    public static void main(String[] args) {

        double a, b, c;
        String solution = "";
        System.out.println("This is Quadratic Equation(a*x^2 + b*x + c =0) solving program!\nTip for entering floats: Use ',' instead of '.'!");
        //Entering equation params
        a = param_input("a");
        b = param_input("b");
        c = param_input("c");
        //System.out.println("a = " + a);
        //System.out.println("b = " + b);
        //System.out.println("c = " + c);
        if ( (a==0) && (b==0) ) {
            if (c==0) {
                solution = "Solution: x - any real.";
            } else {
                solution = "This is not even an equation! No solution for you.";
            }
        }
        if ( (a==0)&&(b!=0) ) {
            solution = "Solution: x = " + linear_equation(b, c);
        }
        if (a!=0) {
            double D = b*b - 4*a*c;
            if (D > 0) {
                double x1 = (-b - Math.sqrt(D))/(2*a);
                double x2 = (-b + Math.sqrt(D))/(2*a);
                solution = "Solution: x1 = " + x1 +";\n\t\t  x2 = " + x2;
            } else {
                if (D==0) {
                    solution = "Solution: x1 = x2 = " + ((-b)/(2*a));
                } else {
                    solution = "Solution: x1 and x2 are complex, calculate them yourself.";
                }
            }
        }
        System.out.println("\n" + solution);
    }
}
