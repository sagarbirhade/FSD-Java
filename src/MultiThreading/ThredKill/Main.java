package MultiThreading.ThredKill;

import MultiThreading.FirstThread;

public class Main {
    public static void main(String[] args) {

        FirstThread ft = new FirstThread();
        Second_Thread st = new Second_Thread();

        Thread t = new Thread(ft);
        Thread t2 = new Thread(st);

        t.start();
        t.stop();
        t2.start();
    }
}
