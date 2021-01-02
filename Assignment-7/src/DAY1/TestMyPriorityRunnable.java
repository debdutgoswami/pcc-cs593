class MyPriorityRunnable implements Runnable {
    Thread t;
    public MyPriorityRunnable(String name, int priority) {
        this.t = new Thread(this, name);
        this.t.setPriority(priority);
        System.out.println(this.t.getName() + " started");
        this.t.start();
    }

    @Override
    public void run() {
        for (int i = 0;i< 5;i++) {
            System.out.println(this.t.getName() + " running...");
            try {
                this.t.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.t.getName() + " finished.");
    }
}

public class TestMyPriorityRunnable {
    public static void main(String[] args) {
        MyPriorityRunnable pr1 = new MyPriorityRunnable("My Runnable 1", Thread.MIN_PRIORITY);
        MyPriorityRunnable pr2 = new MyPriorityRunnable("My Runnable 2", Thread.MAX_PRIORITY);
        MyPriorityRunnable pr3 = new MyPriorityRunnable("My Runnable 3", Thread.NORM_PRIORITY);
        MyPriorityRunnable pr4 = new MyPriorityRunnable("My Runnable 4", Thread.MAX_PRIORITY);
    }
}
