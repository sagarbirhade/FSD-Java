package MultiThreading.ThredKill;

public class Thread1 implements Runnable{

    Thread t1;
    @Override
    public void run() {
        System.out.println("Thread is running");
        int i = 0;
        while(i < 10){
            System.out.println("i "+ i);
            if(i == 5){
                t1.stop();
            }
            i++;
        }
    }

    public static void main(String[] args) {

        Thread1 th = new Thread1();
        Thread t = new Thread(th);
        t.start();
        t.stop();
        t.start();

    }
}
