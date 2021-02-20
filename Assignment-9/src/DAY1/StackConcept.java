package DAY1;

import java.util.Scanner;
import java.util.Stack;

public class StackConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        while (true) {
            System.out.print("enter a number (-1 to exit): ");
            int n = sc.nextInt();
            if (n==-1) break;
            st.push(n);
        }
        System.out.print("The numbers entered are: ");
        while (!st.empty()){
            int i = st.pop();
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
