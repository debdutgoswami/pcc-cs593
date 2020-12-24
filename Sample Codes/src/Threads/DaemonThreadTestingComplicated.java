package Threads;

class WorkerThread extends Thread {
    boolean isDaemon;
    WorkerThread(boolean isDaemon){
        this.isDaemon = isDaemon;
        setDaemon(isDaemon);
    }

    @Override
    public void run() {
        System.out.println("I am a " + (isDaemon ? "Daemon Thread" : "User Thread (non-Daemon)"));
        for(int count=1;count<=5; count++) {
            System.out.println("\tworking from worker thread: " + count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("\tfinally executed: " + count);
            }
        }
        System.out.println("\tWorker Thread ends.");
    }
}

public class DaemonThreadTestingComplicated {
    public static void main(String[] args) {
        new WorkerThread(false).start();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread ending");
    }
}
