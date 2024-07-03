package MultiThreading.ThredKill;

public class Thread_Stop_Boolean implements Runnable{
    Boolean stop = false;
    @Override
    public void run(){
        System.out.println("Thread is running");
        for(int i = 0; i < 10; i++){
            System.out.println("i "+i);
            if(i == 5){
                if(stop == true){
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread_Stop_Boolean ts = new Thread_Stop_Boolean();
        Thread t = new Thread(ts);
        t.start();
        ts.stop = true;
    }
}
