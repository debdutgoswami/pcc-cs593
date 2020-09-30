public class ReturnArray {
    static int[] returnArray() {
        int[] arr = {1,2,3};
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = returnArray();
        for(int a: arr) 
            System.out.println(a);
    }
}
