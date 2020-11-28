import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StripLength {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string: ");
        String str = buf.readLine();
        System.out.println("Length: " + str.length());
        System.out.println("Strip Length = " + str.strip().length());
    }
}
