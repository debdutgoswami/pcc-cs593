import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        int n, sum = 0, arr[];
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int num : arr)
            sum += num;
        avg = (double) (sum) / n;
        System.out.println("Sum is " + sum + " and average is " + String.format("%.2f", avg));
    }
}
