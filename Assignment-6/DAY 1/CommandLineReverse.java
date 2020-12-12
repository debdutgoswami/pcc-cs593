public class CommandLineReverse {
    public static String reverse(String[] args) {
        try {
            String str = args[0];
            int low = Integer.parseInt(args[1]);
            int high = Integer.parseInt(args[2]);
            return args[0];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("run the file as java CommandLineReverse <String> <lower bound> <upper bound>");
        } finally {
            return null;
        }
    }
    public static void main(String[] args) {
        String str = reverse(args);
    }
}