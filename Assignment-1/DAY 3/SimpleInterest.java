import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInterest {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers: ");
        double p = Double.parseDouble(buf.readLine());
        double n = Double.parseDouble(buf.readLine());
        double r = Double.parseDouble(buf.readLine());
        double si = (p * n * r) / 100.0;
        System.out.println("Simple Interest: " + si);
    }
}
