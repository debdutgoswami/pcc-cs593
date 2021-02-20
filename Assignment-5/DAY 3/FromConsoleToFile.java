import java.util.Scanner;
import java.io.*;

public class FromConsoleToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("output file name: ");
        String outputName = sc.nextLine();
        try {
            FileWriter fileWriter = new FileWriter(outputName);
            System.out.println("enter the file contents:");
            while (true) {
                String line = sc.next();
                if (line == "@")
                    break;
                fileWriter.write(line + "\n");
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}