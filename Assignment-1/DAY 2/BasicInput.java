import java.io.IOException;

public class BasicInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter: ");
        char ch = (char) System.in.read();
        System.out.println("Entered character: " + ch);
    }
}
