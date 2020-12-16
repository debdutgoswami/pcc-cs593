package Threads;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        System.out.println(name + " started");
        start();
    }
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
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

public class TestThread {
    public static void main(String[] args) {
        // thread-0 (MyThread)
        MyThread t = new MyThread("MyThread");
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
