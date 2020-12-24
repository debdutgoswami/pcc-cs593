package Threads;

class SimpleThread extends Thread {
    SimpleThread(String name){
        super(name);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        if(t.isDaemon())
            System.out.println(t.getName() + " is a daemon thread");
        else System.out.println(t.getName() + " is a user thread");
    }
}

public class DaemonThreadTest {
    public static void main(String[] args) {
        SimpleThread t1 = new SimpleThread("First");
        t1.setDaemon(true);
        SimpleThread t2 = new SimpleThread("Second");
        SimpleThread t3 = new SimpleThread("Third");
        t1.start();
        t2.start();
        t3.start();
    }
}
