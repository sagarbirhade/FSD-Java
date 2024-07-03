package MultiThreading.ThredKill;

public class Thrad_Stop_Interupted implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread running");
        for(int i = 0; i < 10; i++) {
            if (i == 7) {
                if (!Thread.currentThread().isInterrupted()) {
                    System.out.println("sate : " + Thread.currentThread().isInterrupted());
                    return;
                }
            }
        }

    }
}
