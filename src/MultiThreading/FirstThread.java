package MultiThreading;

public class FirstThread extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.print(i+" ");
        }
        System.out.println("Second thread ");
    }

    public static void main(String[] args) {
        System.out.println("Main thread");
        FirstThread f1 = new FirstThread();
        f1.run();
    }
}
