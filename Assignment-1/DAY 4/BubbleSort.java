import java.util.Scanner;

public class BubbleSort {
    static int[] bsort(int[] arr) {
        int n = arr.length;
        boolean flag = false;
        for (int i = 0; i < n - 1 && flag == false; i++) {
            flag = true;
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false;
                }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        arr = bsort(arr);
        System.out.print("Sorted elements: ");
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }
}
