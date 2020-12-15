class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        System.out.println(Thread.currentThread().getName() + " started");
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
        MyThread t = new MyThread("MyThread");

        System.out.println(Thread.currentThread().getName() + " started");
        for (int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + " running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}