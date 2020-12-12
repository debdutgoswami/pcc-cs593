public class NegativeArraySizeExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[-25];
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
        }
    }
}
