import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneratePassword {
    public static String generatePassword(String first_name, String middle_name, String last_name, int roll_no) {
        if (middle_name.length() != 0)
            return String.valueOf(first_name.charAt(0)) + String.valueOf(middle_name.charAt(0))
                    + String.valueOf(last_name.charAt(0)) + String.valueOf(Integer.toString(roll_no % 10000));
        return String.valueOf(first_name.charAt(0)) + String.valueOf(last_name.charAt(0))
                + String.valueOf(Integer.toString(roll_no % 10000));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("First Name: ");
        String first_name = buf.readLine();
        System.out.print("Midle Name (optional): ");
        String middle_name = buf.readLine();
        System.out.print("Last Name: ");
        String last_name = buf.readLine();
        System.out.print("Roll Number: ");
        int roll_no = Integer.parseInt(buf.readLine());
        System.out.println("Password: " + generatePassword(first_name, middle_name, last_name, roll_no));
    }
}
