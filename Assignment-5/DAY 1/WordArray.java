import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordArray {
    public static String[] wordSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence: ");
        String sentence = buf.readLine();
        String[] arr = sentence.split(" ");
        arr = wordSort(arr);
        System.out.println("Sorted sentence: ");
        for (String word : arr)
            System.out.print(word + " ");
        System.out.println();
    }
}
