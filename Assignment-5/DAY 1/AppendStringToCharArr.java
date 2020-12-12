import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AppendStringToCharArr {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a string: ");
        String str = buf.readLine();
        char[] arr = new char[str.length() + 5];
        System.out.println("enter five elements of the array: ");
        for (int i = 0; i < 5; i++)
            arr[i] = (char) buf.readLine().charAt(0);
        for (int i = 5; i < arr.length; i++)
            arr[i] = str.charAt(i - 5);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
