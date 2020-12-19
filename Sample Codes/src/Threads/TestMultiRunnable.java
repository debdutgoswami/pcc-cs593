package Threads;

class CustomRunnable implements Runnable {
    Thread t;
    public CustomRunnable(String name) {
        this.t = new Thread(this, name);
        System.out.println(this.t.getName() + " started");
        this.t.start();
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            System.out.println(this.t.getName() + " is running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.t.getName() + " finished.");
    }
}

public class TestMultiRunnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");

        CustomRunnable r1 = new CustomRunnable("First");
        CustomRunnable r2 = new CustomRunnable("Second");
        CustomRunnable r3 = new CustomRunnable("Third");
        CustomRunnable r4 = new CustomRunnable("Fourth");

        System.out.println("Is Alive R1? " + r1.t.isAlive());

        try {
            r1.t.join();
            r2.t.join();
            r3.t.join();
            r4.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Is Alive R1? " + r1.t.isAlive());

        System.out.println(Thread.currentThread().getName() + " finished");
    }
}
