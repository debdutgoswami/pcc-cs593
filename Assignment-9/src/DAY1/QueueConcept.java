package DAY1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueConcept {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        while (true) {
            System.out.print("enter a number (-1 to exit): ");
            int n = sc.nextInt();
            if (n==-1) break;
            queue.add(n);
        }
        System.out.print("The numbers entered are: ");
        for (Iterator<Integer> it = queue.iterator(); it.hasNext(); ) {
            int i = it.next();
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
