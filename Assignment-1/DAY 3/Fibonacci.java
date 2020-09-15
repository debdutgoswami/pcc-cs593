import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static int fibo(int n) {
        if (n == 0 || n == 1)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buf.readLine());
        System.out.println("Fibonacci Series upto " + n + " is");
        for (int i = 0; i < n; i++)
            System.out.print(fibo(i) + " ");
        System.out.println();
    }
}
