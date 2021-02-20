import java.util.Scanner;
import java.io.*;

public class CopyFromToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input file name: ");
        String fname = sc.nextLine();
        System.out.print("output file name: ");
        String outputName = sc.nextLine();
        try {
            File fileObj = new File(fname);
            FileWriter fileWriter = new FileWriter(outputName);
            Scanner fileReader = new Scanner(fileObj);
            while(fileReader.hasNextLine())
                fileWriter.write(fileReader.nextLine()+"\n");
            fileReader.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}