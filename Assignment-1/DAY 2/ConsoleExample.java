import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console cs = System.console();
        System.out.println("Enter: ");
        double d = Double.parseDouble(cs.readLine());
        System.out.println("The output is " + d);
    }
}
