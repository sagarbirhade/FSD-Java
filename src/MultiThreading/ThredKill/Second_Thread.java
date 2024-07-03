package MultiThreading.ThredKill;

public class Second_Thread implements Runnable{


    Thread t2;
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Second Thread "+i);
            if(i == 5){
                break;  // killing running Thread
            }
        }

    }
}
