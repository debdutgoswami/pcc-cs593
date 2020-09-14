import java.lang.Math;

public class SumOfSeries {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]), x = Integer.parseInt(args[1]);
        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += Math.pow(x, i);
        System.out.println("Sum of series when n = " + n + " & x = " + x + " is " + String.format("%.2f", sum));
    }
}