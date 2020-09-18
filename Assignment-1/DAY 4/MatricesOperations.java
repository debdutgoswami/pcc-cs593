import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Matrix {
    // taking matix as input
    int[][] input(int n) throws IOException, Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Matrix " + n + ": ");
        System.out.print("Row: ");
        int row = Integer.parseInt(buf.readLine());
        System.out.print("Column: ");
        int col = Integer.parseInt(buf.readLine());
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            String[] row_input = buf.readLine().split(" ", 0);
            if (row_input.length != col)
                throw new Exception("Number of elements in column mismatch for matrix " + n);
            for (int j = 0; j < col; j++)
                mat[i][j] = Integer.parseInt(row_input[j].strip());
        }
        System.out.println();
        return mat;
    }

    // matrix addition
    int[][] addition(int[][] mat1, int[][] mat2) throws Exception {
        if ((mat1.length != mat2.length) || (mat1[0].length != mat2[0].length))
            throw new Exception("Matrix dimension needs to be same to perform addition");
        int[][] sum = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++)
            for (int j = 0; j < mat1[i].length; j++)
                sum[i][j] = mat1[i][j] + mat2[i][j];
        return sum;
    }

    // matrix subtraction
    int[][] subtraction(int[][] mat1, int[][] mat2) throws Exception {
        if ((mat1.length != mat2.length) || (mat1[0].length != mat2[0].length))
            throw new Exception("Matrix dimension needs to be same to perform subtraction");
        int[][] dif = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++)
            for (int j = 0; j < mat1[i].length; j++)
                dif[i][j] = mat1[i][j] - mat2[i][j];
        return dif;
    }

    // matrix multiplication
    int[][] multiplication(int[][] mat1, int[][] mat2) throws Exception {
        if ((mat1[0].length != mat2.length))
            throw new Exception("Number of columns in first matrix must be equal to number of rows in second matrix");
        int[][] mul = new int[mat1.length][mat2[0].length];

        for (int k = 0; k < mat1.length; k++)
            for (int i = 0; i < mat2[0].length; i++) {
                mul[k][i] = 0;
                for (int j = 0; j < mat2.length; j++)
                    mul[k][i] += mat1[k][j] * mat2[j][i];
            }

        return mul;
    }
}

public class MatricesOperations {
    public static void main(String[] args) throws IOException {
        System.out.println("IMPORTANT: Enter the elements as space seperated integers and press enter after each row");
        Matrix obj = new Matrix();
        int[][] mat1, mat2, resMat;
        try {
            mat1 = obj.input(1);
            mat2 = obj.input(2);
            resMat = obj.addition(mat1, mat2);
            System.out.println("Sum of two matrices are:");
            for (int i = 0; i < resMat.length; i++) {
                for (int j = 0; j < resMat[i].length; j++)
                    System.out.print(resMat[i][j] + " ");
                System.out.println();
            }
            resMat = obj.subtraction(mat1, mat2);
            System.out.println("Subtraction of two matrices are:");
            for (int i = 0; i < resMat.length; i++) {
                for (int j = 0; j < resMat[i].length; j++)
                    System.out.print(resMat[i][j] + " ");
                System.out.println();
            }
            resMat = obj.multiplication(mat1, mat2);
            System.out.println("Dot product of two matrices are:");
            for (int i = 0; i < resMat.length; i++) {
                for (int j = 0; j < resMat[i].length; j++)
                    System.out.print(resMat[i][j] + " ");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
