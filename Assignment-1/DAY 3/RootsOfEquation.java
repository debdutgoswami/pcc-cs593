import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

// custom datatype to return two values from a function
class Pair {
    double a, b;

    Pair(double a, double b) {
        this.a = a;
        this.b = b;
    }
}

class QuadraticEquation {
    int a, b, c;
    double d;

    // constructor
    QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // internal helper method
    private void discriminant() {
        this.d = Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    // determines whether roots are real or imaginary
    int typeOfRoots() {
        this.discriminant();
        if (this.d < 0)
            return -1;
        else if (this.d == 0)
            return 0;
        else
            return 1;
    }

    // returns the roots
    Pair getRoots() {
        if (this.d == 0) {
            double root = (-1 * b + Math.sqrt(this.d)) / (2 * this.a);
            return new Pair(root, root);
        }
        double root1 = (-1 * b + Math.sqrt(this.d)) / (2 * this.a);
        double root2 = (-1 * b - Math.sqrt(this.d)) / (2 * this.a);
        return new Pair(root1, root2);
    }
}

public class RootsOfEquation {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers: ");
        int a = Integer.parseInt(buf.readLine());
        int b = Integer.parseInt(buf.readLine());
        int c = Integer.parseInt(buf.readLine());
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        int type = qe.typeOfRoots();
        if (type == -1) {
            System.out.println("Roots are imaginary!!");
            System.exit(0);
        }
        if (type == 0)
            System.out.println("Roots are Real and Equal");
        else
            System.out.println("Roots are Real and Unequal");
        Pair roots = qe.getRoots();
        System.out.println("The two roots are " + roots.a + ", " + roots.b);

    }
}
