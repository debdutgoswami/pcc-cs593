public class GCD {
    public static int findgcd(int a, int b) {
        if (b != 0)
            return findgcd(b, a % b);
        return a;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]);
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        System.out.println("The GCD of " + a + " and " + b + " is " + findgcd(a, b));
    }
}