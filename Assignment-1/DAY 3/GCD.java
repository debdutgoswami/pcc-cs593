import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD {
    public static int findgcd(int a, int b) {
        if (b != 0)
            return findgcd(b, a % b);
        return a;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers: ");
        int a = Integer.parseInt(buf.readLine());
        int b = Integer.parseInt(buf.readLine());
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        System.out.println("The GCD of " + a + " and " + b + " is " + findgcd(a, b));
    }
}