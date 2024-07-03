package MultiThreading.ThreadOperations;

public class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        Thread.yield();
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread T = new Thread(t1, "Final Thread");

        Thread1 t2 = new Thread1();
        Thread T2 = new Thread(t2);

        T.start();
        T2.start();

    }
}
