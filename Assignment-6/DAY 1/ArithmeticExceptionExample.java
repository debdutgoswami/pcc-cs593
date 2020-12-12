public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 7/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
