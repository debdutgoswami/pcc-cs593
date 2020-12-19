class MyRunnable implements Runnable {
    Thread t;
    public MyRunnable(String name){
        this.t = new Thread(this, name);
        System.out.println(t.getName() + " started");
        this.t.start();
    }

    @Override
    public void run() {
        for (int i=0;i<3;i++) {
            System.out.println(t.getName() + " running...");
            try {
                this.t.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(t.getName() + " finished.");
    }
}

public class TestMyRunnable {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable("MyRunnable");

        System.out.println(Thread.currentThread().getName() + " started");
        for (int i=0;i<3;i++) {
            System.out.println(Thread.currentThread().getName() + " running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished.");

    }
}
