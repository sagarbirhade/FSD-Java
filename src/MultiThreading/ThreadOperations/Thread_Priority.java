package MultiThreading.ThreadOperations;



public class Thread_Priority implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        Thread.yield();
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        Thread_Priority t1 = new Thread_Priority();
        Thread T = new Thread(t1, "Final Thread");

        Thread_Priority t2 = new Thread_Priority();
        Thread T2 = new Thread(t2);

        T.setPriority(3);
        T2.setPriority(2);

        T.start();
        T2.start();

    }
}
