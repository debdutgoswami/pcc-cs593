import java.util.Random;

public class StringIndexAndArrayIndexExample {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperBound = 9;
        try {
            int[] arr = {1,2,3,4,5};
            String str = "12345";

            int n = arr[rand.nextInt(upperBound)];
            char c = str.charAt(rand.nextInt(upperBound));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
