public class JaggedArray {
    public static void main(String[] args) {
        // intialization
        int c = 0;
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];
        // declaring
        for (int i= 0; i <3;i++)
            for (int j = 0; j <arr[i].length; j++)
                arr[i][j] = c++;
        // printing
        for (int i= 0; i <3;i++) {
            for (int j = 0; j <arr[i].length; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        
    }
}
