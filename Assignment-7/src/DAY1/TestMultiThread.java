class CustomThread extends Thread {
    public CustomThread(String name) {
        super(name);
        System.out.println(name + " started");
        start();
    }

    @Override
    public void run() {
        for (int i=1;i<=5;i++) {
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

public class TestMultiThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");
        CustomThread t1 = new CustomThread("First");
        CustomThread t2 = new CustomThread("Second");
        CustomThread t3 = new CustomThread("Third");
        CustomThread t4 = new CustomThread("Fourth");
        System.out.println("Is t1 alive? " + t1.isAlive());
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Is t1 alive? " + t1.isAlive());
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}
