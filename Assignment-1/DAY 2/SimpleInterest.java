public class SimpleInterest {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]), n = Double.parseDouble(args[1]), r = Double.parseDouble(args[2]);
        double si = (p * n * r) / 100.0;
        System.out.println("Simple Interest: " + si);
    }
}
