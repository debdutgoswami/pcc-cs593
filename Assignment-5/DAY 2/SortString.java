import java.util.Arrays;

public class SortString {
    public static String sortString(String inputString) { 
        char tempArray[] = inputString.toCharArray(); 
        Arrays.sort(tempArray);
        return new String(tempArray); 
    } 
    public static void main(String[] args) {
        String str = "STRING";
        String s = sortString(str);
        System.out.println(s);
    }
}
