import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class SumOfSeries {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buf.readLine()), x = Integer.parseInt(buf.readLine());
        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += Math.pow(x, i);
        System.out.println("Sum of series when n = " + n + " & x = " + x + " is " + String.format("%.2f", sum));
    }
}