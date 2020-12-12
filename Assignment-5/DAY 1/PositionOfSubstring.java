public class PositionOfSubstring {
    public static void main(String[] args) {
        String STR = "Academy Of Technology";
        String SEARCH = "Tech";
        int pos = STR.indexOf(SEARCH);
        if (pos >= 0)
            System.out.println("Found at: " + pos);
        else
            System.out.println("Not Found!!");
    }
}
