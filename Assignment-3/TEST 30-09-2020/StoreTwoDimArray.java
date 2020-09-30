public class StoreTwoDimArray {
    public static void main(String[] args) {
        int[][] mat = new int[3][4];
        int c = 10;
        for (int i = 0; i <3;i++)
            for (int j = 0; j <4;j++)
                mat[i][j] = c++;

        for (int i = 0; i <3;i++){
            for (int j = 0; j <4;j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}
