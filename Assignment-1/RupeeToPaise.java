public class RupeeToPaise {
    public static void main(String[] args) {
        double price = Double.parseDouble(args[0]);
        System.out.println("Price in Rupee: " + (int) (price * 100));
    }
}
