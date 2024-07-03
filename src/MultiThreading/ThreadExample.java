package MultiThreading;

public class ThreadExample extends Thread{

    static Thread t;
    @Override
    public void run() {
        System.out.println("Thread is running"); //killing the thread

        t.stop();
        System.out.println("Thread dead");
    }

    public static void main(String[] args) {
        ThreadExample te = new ThreadExample();
        t = new Thread(te);
        t.start();

    }
}
