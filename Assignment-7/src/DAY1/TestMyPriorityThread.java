class MyPriorityThread extends Thread {
    public MyPriorityThread(String name, int priority) {
        super(name);
        System.out.println(name + " started");
        setPriority(priority);
        start();
    }

    @Override
    public void run() {
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
public class TestMyPriorityThread {
    public static void main(String[] args) {
        MyPriorityThread pt1 = new MyPriorityThread("Priority Thread 1", Thread.MAX_PRIORITY);
        MyPriorityThread pt2 = new MyPriorityThread("Priority Thread 2", Thread.MIN_PRIORITY);
        MyPriorityThread pt3 = new MyPriorityThread("Priority Thread 3", Thread.NORM_PRIORITY);
        MyPriorityThread pt4 = new MyPriorityThread("Priority Thread 4", Thread.MAX_PRIORITY);
    }
}
