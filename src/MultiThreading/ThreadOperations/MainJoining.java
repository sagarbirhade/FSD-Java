package MultiThreading.ThreadOperations;

public class MainJoining {
    public static void main(String[] args) {
        Thread1_Join tj1 = new Thread1_Join();
        Thread t1 = new Thread(tj1);

        Thread2_Join tj2 = new Thread2_Join();
        Thread t2 = new Thread(tj2);

        t1.start();
        try{
            t1.join();
        }catch(InterruptedException e){
            e.getMessage();
        }
        t2.start();
        try{
            t2.join();
        }catch(InterruptedException e){
            e.getMessage();
        }
    }
}
