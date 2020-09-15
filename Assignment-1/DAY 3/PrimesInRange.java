import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimesInRange {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter start and end: ");
        int start = Integer.parseInt(buf.readLine());
        int end = Integer.parseInt(buf.readLine());
        if (start > end)
            System.out.println("Lower limit can not be greater than higher limit!!");
        System.out.println("The prime number(s) in between " + start + " and " + end + " is/are as follows");
        for (int i = start; i <= end; i++)
            if (isPrime(i))
                System.out.print(i + " ");
        System.out.println();

    }
}
