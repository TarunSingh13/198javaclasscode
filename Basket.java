package Com.ProducerAndConsumer;

public class Basket {
    int data;
    boolean empty = true;

    synchronized void produce (int value) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        data = value;
        empty = false;
        System.out.println("Produce: " + data);
        notify();
    }
    synchronized int Consumer () {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        empty = true;
        System.out.println("Consumed : " + data);
        return data;
        }
 }

 class Consumer extends Thread {
    Basket  b;

 }
