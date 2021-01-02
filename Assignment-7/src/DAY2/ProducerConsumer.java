package DAY2;

public class ProducerConsumer {

    public static void main(String[] args) {
        Producer prod = new Producer();
        Consumer cons = new Consumer();
    }

    private static class Producer extends Thread {
        Producer() {
            super("Producer");
            System.out.println(Thread.currentThread().getName() + " started");
            start();
        }

        @Override
        public void run() {
            super.run();
        }
    }

    private static class Consumer extends Thread {
        Consumer() {
            super("Consumer");
            System.out.println(Thread.currentThread().getName() + " started");
            start();
        }

        @Override
        public void run() {
            super.run();
        }
    }
}
