/*
* Difference: https://www.tutorialspoint.com/difference-between-thread-and-runnable-in-java
 */

package Threads;

class MyRunnable implements Runnable {
    public MyRunnable(String name) {
        Thread t = new Thread(this, name);
        System.out.println(name + " started");
        t.start();
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            System.out.println(Thread.currentThread().getName() + " is running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}

public class TestRunnable {
    public static void main(String[] args) {
        // thread-0 (MyRunnable)
        MyRunnable r = new MyRunnable("MyRunnable");

        // thread-1 (main)
        System.out.println(Thread.currentThread().getName() + " started");
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}