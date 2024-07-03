package MultiThreading.ThreadOperations;

public class NewThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Child thread is running");
        for(int i = 0; i < 5; i++){
            System.out.println("I: "+i);
        }
        System.out.println("Child Thread ended");
    }

    public static void main(String[] args) {
        NewThread nt = new NewThread();
        Thread T = new Thread(nt);
        T.start();

        try{
            T.join(10000); // it generally uses Main Thread
        }catch(InterruptedException e){
            e.getMessage();
        }

        NewThread mt = new NewThread();
        Thread T1 = new Thread(mt);
        T1.start();
        try{
            T1.join(10000); // it generally uses Main Thread
        }catch(InterruptedException e){
            e.getMessage();
        }

        System.out.println("main thread running");
    }
}
