package DAY2;

import java.util.Scanner;

public class ProducerConsumer {
    private static PC pc = new PC();

    public static void main(String[] args) throws InterruptedException{
        Producer prod = new Producer();
        Consumer cons = new Consumer();
        prod.join();
        cons.join();
    }

    private static class Producer extends Thread {
        Producer() {
            super("Producer");
            System.out.println(this.getName() + " started");
            start();
        }

        @Override
        public void run() {
            try{
                pc.produce();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private static class Consumer extends Thread {
        Consumer() {
            super("Consumer");
            System.out.println(this.getName() + " started");
            start();
        }

        @Override
        public void run() {
            try{
                pc.consume();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    private static class PC{
        public void produce() throws InterruptedException{
            synchronized (this){
                wait();
                System.out.println("Producer thread is producing...");
                Thread.sleep(2000);
                System.out.println("*** PRODUCED ***");
            }
        }
        public void consume() throws InterruptedException{
            synchronized (this){
                Scanner sc = new Scanner(System.in);
                System.out.println("Press Return Key to start producing...");
                sc.nextLine();
                notify();
            }
        }
    }
}
